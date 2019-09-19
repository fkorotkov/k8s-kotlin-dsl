# Fetching OpenAPI

Mostly following [this instruction](https://github.com/kubernetes-client/java/blob/0e36e8a88ed733713822dddbb2e629c69e994a0e/docs/generate-model-from-third-party-resources.md).

## Create local k8s cluster

Following [Kubernetes-in-Docker](https://github.com/bsycorp/kind#quickstart)

```bash
docker run -it --privileged -p 8443:8443 -p 10080:10080 bsycorp/kind:latest-1.15

# configure kubectl

mv ~/.kube/config ~/.kube/config.gcp
wget http://localhost:10080/config
mv config ~/.kube/config

# verify

kubectl get nodes
```

## Install Confluent Operator

Follow (official instructions)[https://docs.confluent.io/current/installation/operator/co-deployment.html#kubernetes-cluster]
to the point where you run:

```bash
kubectl create serviceaccount tiller -n kube-system

kubectl create clusterrolebinding tiller \
    --clusterrole=cluster-admin \
    --serviceaccount kube-system:tiller

helm init --service-account tiller

helm install \
    -f ./providers/gcp.yaml \
    --name operator \
    --namespace operator \
    --set operator.enabled=true \
    ./confluent-operator
```

**Note:** no need to configure anything extra since we don't want working Kafka we just want the schema.

## Fetch JSON CRD Definition

```bash
kubectl get crd/kafkaclusters.cluster.confluent.com -o=json
kubectl get crd/physicalstatefulclusters.operator.confluent.cloud -o=json
kubectl get crd/zookeeperclusters.cluster.confluent.com -o=json
```
package com.fkorotkov.kubernetes.client;

import com.fkorotkov.kubernetes.zookeeper.*;
import io.fabric8.kubernetes.client.*;
import io.fabric8.kubernetes.client.dsl.FunctionCallable;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.internal.ZookeeperClusterOperationsImpl;
import okhttp3.OkHttpClient;

public class DefaultZookeeperClient extends BaseClient implements NamespacedZookeeperClient {

    public DefaultZookeeperClient() {
        super();
    }

    public DefaultZookeeperClient(io.fabric8.kubernetes.client.Config configuration) {
        super(configuration);
    }

    public DefaultZookeeperClient(OkHttpClient httpClient, io.fabric8.kubernetes.client.Config configuration) {
        super(httpClient, configuration);
    }

    @Override
    public NamespacedZookeeperClient inAnyNamespace() {
        return inNamespace(null);
    }

    @Override
    public NamespacedZookeeperClient inNamespace(String namespace) {
        io.fabric8.kubernetes.client.Config updated = new io.fabric8.kubernetes.client.ConfigBuilder(getConfiguration())
                .withNamespace(namespace)
                .build();

        return new DefaultZookeeperClient(getHttpClient(), updated);
    }

    @Override
    public FunctionCallable<NamespacedZookeeperClient> withRequestConfig(RequestConfig requestConfig) {
        return new WithRequestCallable<NamespacedZookeeperClient>(this, requestConfig);
    }

    public MixedOperation<ZookeeperCluster, ZookeeperClusterList, DoneableZookeeperCluster, Resource<ZookeeperCluster, DoneableZookeeperCluster>> zookeeperClusters() {
        return new ZookeeperClusterOperationsImpl(this.getHttpClient(), this.getConfiguration());
    }
}

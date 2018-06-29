// GENERATE
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource
import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.AttachedVolume
import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.AuthProviderConfig
import io.fabric8.kubernetes.api.model.AzureDiskVolumeSource
import io.fabric8.kubernetes.api.model.AzureFilePersistentVolumeSource
import io.fabric8.kubernetes.api.model.AzureFileVolumeSource
import io.fabric8.kubernetes.api.model.BaseKubernetesList
import io.fabric8.kubernetes.api.model.Binding
import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.Capabilities
import io.fabric8.kubernetes.api.model.CephFSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.CinderVolumeSource
import io.fabric8.kubernetes.api.model.ClientIPConfig
import io.fabric8.kubernetes.api.model.Cluster
import io.fabric8.kubernetes.api.model.ComponentCondition
import io.fabric8.kubernetes.api.model.ComponentStatus
import io.fabric8.kubernetes.api.model.ComponentStatusList
import io.fabric8.kubernetes.api.model.Config
import io.fabric8.kubernetes.api.model.ConfigMap
import io.fabric8.kubernetes.api.model.ConfigMapEnvSource
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector
import io.fabric8.kubernetes.api.model.ConfigMapList
import io.fabric8.kubernetes.api.model.ConfigMapProjection
import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.ContainerImage
import io.fabric8.kubernetes.api.model.ContainerPort
import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateRunning
import io.fabric8.kubernetes.api.model.ContainerStateTerminated
import io.fabric8.kubernetes.api.model.ContainerStateWaiting
import io.fabric8.kubernetes.api.model.ContainerStatus
import io.fabric8.kubernetes.api.model.Context
import io.fabric8.kubernetes.api.model.CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.DaemonEndpoint
import io.fabric8.kubernetes.api.model.DeleteOptions
import io.fabric8.kubernetes.api.model.DownwardAPIProjection
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.EndpointAddress
import io.fabric8.kubernetes.api.model.EndpointPort
import io.fabric8.kubernetes.api.model.EndpointSubset
import io.fabric8.kubernetes.api.model.Endpoints
import io.fabric8.kubernetes.api.model.EndpointsList
import io.fabric8.kubernetes.api.model.EnvFromSource
import io.fabric8.kubernetes.api.model.EnvVar
import io.fabric8.kubernetes.api.model.EnvVarSource
import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.EventList
import io.fabric8.kubernetes.api.model.EventSeries
import io.fabric8.kubernetes.api.model.EventSource
import io.fabric8.kubernetes.api.model.ExecAction
import io.fabric8.kubernetes.api.model.FCVolumeSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource
import io.fabric8.kubernetes.api.model.FlockerVolumeSource
import io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.GitRepoVolumeSource
import io.fabric8.kubernetes.api.model.GlusterfsVolumeSource
import io.fabric8.kubernetes.api.model.HTTPGetAction
import io.fabric8.kubernetes.api.model.HTTPHeader
import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerStatus
import io.fabric8.kubernetes.api.model.HostAlias
import io.fabric8.kubernetes.api.model.HostPathVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.Initializer
import io.fabric8.kubernetes.api.model.Initializers
import io.fabric8.kubernetes.api.model.KeyToPath
import io.fabric8.kubernetes.api.model.KubernetesList
import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.LabelSelectorRequirement
import io.fabric8.kubernetes.api.model.Lifecycle
import io.fabric8.kubernetes.api.model.LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeItem
import io.fabric8.kubernetes.api.model.LimitRangeList
import io.fabric8.kubernetes.api.model.LimitRangeSpec
import io.fabric8.kubernetes.api.model.ListMeta
import io.fabric8.kubernetes.api.model.LoadBalancerIngress
import io.fabric8.kubernetes.api.model.LoadBalancerStatus
import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.kubernetes.api.model.LocalVolumeSource
import io.fabric8.kubernetes.api.model.MicroTime
import io.fabric8.kubernetes.api.model.NFSVolumeSource
import io.fabric8.kubernetes.api.model.NamedAuthInfo
import io.fabric8.kubernetes.api.model.NamedCluster
import io.fabric8.kubernetes.api.model.NamedContext
import io.fabric8.kubernetes.api.model.NamedExtension
import io.fabric8.kubernetes.api.model.Namespace
import io.fabric8.kubernetes.api.model.NamespaceList
import io.fabric8.kubernetes.api.model.NamespaceSpec
import io.fabric8.kubernetes.api.model.NamespaceStatus
import io.fabric8.kubernetes.api.model.Node
import io.fabric8.kubernetes.api.model.NodeAddress
import io.fabric8.kubernetes.api.model.NodeAffinity
import io.fabric8.kubernetes.api.model.NodeCondition
import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints
import io.fabric8.kubernetes.api.model.NodeList
import io.fabric8.kubernetes.api.model.NodeSelector
import io.fabric8.kubernetes.api.model.NodeSelectorRequirement
import io.fabric8.kubernetes.api.model.NodeSelectorTerm
import io.fabric8.kubernetes.api.model.NodeSpec
import io.fabric8.kubernetes.api.model.NodeStatus
import io.fabric8.kubernetes.api.model.NodeSystemInfo
import io.fabric8.kubernetes.api.model.ObjectFieldSelector
import io.fabric8.kubernetes.api.model.ObjectMeta
import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.kubernetes.api.model.OwnerReference
import io.fabric8.kubernetes.api.model.Patch
import io.fabric8.kubernetes.api.model.PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimCondition
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimList
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeList
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeStatus
import io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.Pod
import io.fabric8.kubernetes.api.model.PodAffinity
import io.fabric8.kubernetes.api.model.PodAffinityTerm
import io.fabric8.kubernetes.api.model.PodAntiAffinity
import io.fabric8.kubernetes.api.model.PodCondition
import io.fabric8.kubernetes.api.model.PodDNSConfig
import io.fabric8.kubernetes.api.model.PodDNSConfigOption
import io.fabric8.kubernetes.api.model.PodList
import io.fabric8.kubernetes.api.model.PodSecurityContext
import io.fabric8.kubernetes.api.model.PodSpec
import io.fabric8.kubernetes.api.model.PodStatus
import io.fabric8.kubernetes.api.model.PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateList
import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.kubernetes.api.model.PortworxVolumeSource
import io.fabric8.kubernetes.api.model.Preconditions
import io.fabric8.kubernetes.api.model.Preferences
import io.fabric8.kubernetes.api.model.PreferredSchedulingTerm
import io.fabric8.kubernetes.api.model.Probe
import io.fabric8.kubernetes.api.model.ProjectedVolumeSource
import io.fabric8.kubernetes.api.model.QuobyteVolumeSource
import io.fabric8.kubernetes.api.model.RBDPersistentVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource
import io.fabric8.kubernetes.api.model.ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerCondition
import io.fabric8.kubernetes.api.model.ReplicationControllerList
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec
import io.fabric8.kubernetes.api.model.ReplicationControllerStatus
import io.fabric8.kubernetes.api.model.ResourceFieldSelector
import io.fabric8.kubernetes.api.model.ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaList
import io.fabric8.kubernetes.api.model.ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.ResourceRequirements
import io.fabric8.kubernetes.api.model.RootPaths
import io.fabric8.kubernetes.api.model.SELinuxOptions
import io.fabric8.kubernetes.api.model.ScaleIOPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.Secret
import io.fabric8.kubernetes.api.model.SecretEnvSource
import io.fabric8.kubernetes.api.model.SecretKeySelector
import io.fabric8.kubernetes.api.model.SecretList
import io.fabric8.kubernetes.api.model.SecretProjection
import io.fabric8.kubernetes.api.model.SecretReference
import io.fabric8.kubernetes.api.model.SecretVolumeSource
import io.fabric8.kubernetes.api.model.SecurityContext
import io.fabric8.kubernetes.api.model.Service
import io.fabric8.kubernetes.api.model.ServiceAccount
import io.fabric8.kubernetes.api.model.ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceList
import io.fabric8.kubernetes.api.model.ServicePort
import io.fabric8.kubernetes.api.model.ServiceSpec
import io.fabric8.kubernetes.api.model.ServiceStatus
import io.fabric8.kubernetes.api.model.SessionAffinityConfig
import io.fabric8.kubernetes.api.model.Status
import io.fabric8.kubernetes.api.model.StatusCause
import io.fabric8.kubernetes.api.model.StatusDetails
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource
import io.fabric8.kubernetes.api.model.TCPSocketAction
import io.fabric8.kubernetes.api.model.Taint
import io.fabric8.kubernetes.api.model.Toleration
import io.fabric8.kubernetes.api.model.TypeMeta
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.VolumeDevice
import io.fabric8.kubernetes.api.model.VolumeMount
import io.fabric8.kubernetes.api.model.VolumeProjection
import io.fabric8.kubernetes.api.model.VsphereVirtualDiskVolumeSource
import io.fabric8.kubernetes.api.model.WatchEvent
import io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentation
import io.fabric8.kubernetes.api.model.apiextensions.JSON
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray
import io.fabric8.kubernetes.api.model.apps.DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetCondition
import io.fabric8.kubernetes.api.model.apps.DaemonSetList
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatus
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.apps.Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentCondition
import io.fabric8.kubernetes.api.model.apps.DeploymentList
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentStatus
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy
import io.fabric8.kubernetes.api.model.apps.ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetCondition
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatus
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategy
import io.fabric8.kubernetes.api.model.apps.StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetCondition
import io.fabric8.kubernetes.api.model.apps.StatefulSetList
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatus
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy
import io.fabric8.kubernetes.api.model.authentication.TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.batch.CronJob
import io.fabric8.kubernetes.api.model.batch.CronJobList
import io.fabric8.kubernetes.api.model.batch.CronJobSpec
import io.fabric8.kubernetes.api.model.batch.CronJobStatus
import io.fabric8.kubernetes.api.model.batch.Job
import io.fabric8.kubernetes.api.model.batch.JobCondition
import io.fabric8.kubernetes.api.model.batch.JobList
import io.fabric8.kubernetes.api.model.batch.JobSpec
import io.fabric8.kubernetes.api.model.batch.JobStatus
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec
import io.fabric8.kubernetes.api.model.extensions.AllowedFlexVolume
import io.fabric8.kubernetes.api.model.extensions.AllowedHostPath
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.extensions.HostPortRange
import io.fabric8.kubernetes.api.model.extensions.IDRange
import io.fabric8.kubernetes.api.model.extensions.Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressBackend
import io.fabric8.kubernetes.api.model.extensions.IngressList
import io.fabric8.kubernetes.api.model.extensions.IngressRule
import io.fabric8.kubernetes.api.model.extensions.IngressSpec
import io.fabric8.kubernetes.api.model.extensions.IngressStatus
import io.fabric8.kubernetes.api.model.extensions.IngressTLS
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec
import io.fabric8.kubernetes.api.model.extensions.ScaleStatus
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions
import io.fabric8.kubernetes.api.model.networking.IPBlock
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRule
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRule
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPort
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus
import io.fabric8.kubernetes.api.model.rbac.KubernetesAggregationRule
import io.fabric8.kubernetes.api.model.rbac.KubernetesPolicyRule
import io.fabric8.kubernetes.api.model.rbac.KubernetesRole
import io.fabric8.kubernetes.api.model.rbac.KubernetesRoleBinding
import io.fabric8.kubernetes.api.model.rbac.KubernetesRoleBindingList
import io.fabric8.kubernetes.api.model.rbac.KubernetesRoleList
import io.fabric8.kubernetes.api.model.rbac.KubernetesRoleRef
import io.fabric8.kubernetes.api.model.rbac.KubernetesSubject
import io.fabric8.kubernetes.api.model.runtime.RawExtension
import io.fabric8.kubernetes.api.model.storage.StorageClass
import io.fabric8.kubernetes.api.model.storage.StorageClassList
import io.fabric8.kubernetes.api.model.version.Info


fun newAWSElasticBlockStoreVolumeSource(block : AWSElasticBlockStoreVolumeSource.() -> Unit = {}): AWSElasticBlockStoreVolumeSource {
  val instance = AWSElasticBlockStoreVolumeSource()
  instance.block()
  return instance
}


fun newAffinity(block : Affinity.() -> Unit = {}): Affinity {
  val instance = Affinity()
  instance.block()
  return instance
}


fun newAttachedVolume(block : AttachedVolume.() -> Unit = {}): AttachedVolume {
  val instance = AttachedVolume()
  instance.block()
  return instance
}


fun newAuthInfo(block : AuthInfo.() -> Unit = {}): AuthInfo {
  val instance = AuthInfo()
  instance.block()
  return instance
}


fun newAuthProviderConfig(block : AuthProviderConfig.() -> Unit = {}): AuthProviderConfig {
  val instance = AuthProviderConfig()
  instance.block()
  return instance
}


fun newAzureDiskVolumeSource(block : AzureDiskVolumeSource.() -> Unit = {}): AzureDiskVolumeSource {
  val instance = AzureDiskVolumeSource()
  instance.block()
  return instance
}


fun newAzureFilePersistentVolumeSource(block : AzureFilePersistentVolumeSource.() -> Unit = {}): AzureFilePersistentVolumeSource {
  val instance = AzureFilePersistentVolumeSource()
  instance.block()
  return instance
}


fun newAzureFileVolumeSource(block : AzureFileVolumeSource.() -> Unit = {}): AzureFileVolumeSource {
  val instance = AzureFileVolumeSource()
  instance.block()
  return instance
}


fun newBaseKubernetesList(block : BaseKubernetesList.() -> Unit = {}): BaseKubernetesList {
  val instance = BaseKubernetesList()
  instance.block()
  return instance
}


fun newBinding(block : Binding.() -> Unit = {}): Binding {
  val instance = Binding()
  instance.block()
  return instance
}


fun newCSIPersistentVolumeSource(block : CSIPersistentVolumeSource.() -> Unit = {}): CSIPersistentVolumeSource {
  val instance = CSIPersistentVolumeSource()
  instance.block()
  return instance
}


fun newCapabilities(block : Capabilities.() -> Unit = {}): Capabilities {
  val instance = Capabilities()
  instance.block()
  return instance
}


fun newCephFSPersistentVolumeSource(block : CephFSPersistentVolumeSource.() -> Unit = {}): CephFSPersistentVolumeSource {
  val instance = CephFSPersistentVolumeSource()
  instance.block()
  return instance
}


fun newCephFSVolumeSource(block : CephFSVolumeSource.() -> Unit = {}): CephFSVolumeSource {
  val instance = CephFSVolumeSource()
  instance.block()
  return instance
}


fun newCinderVolumeSource(block : CinderVolumeSource.() -> Unit = {}): CinderVolumeSource {
  val instance = CinderVolumeSource()
  instance.block()
  return instance
}


fun newClientIPConfig(block : ClientIPConfig.() -> Unit = {}): ClientIPConfig {
  val instance = ClientIPConfig()
  instance.block()
  return instance
}


fun newCluster(block : Cluster.() -> Unit = {}): Cluster {
  val instance = Cluster()
  instance.block()
  return instance
}


fun newComponentCondition(block : ComponentCondition.() -> Unit = {}): ComponentCondition {
  val instance = ComponentCondition()
  instance.block()
  return instance
}


fun newComponentStatus(block : ComponentStatus.() -> Unit = {}): ComponentStatus {
  val instance = ComponentStatus()
  instance.block()
  return instance
}


fun newComponentStatusList(block : ComponentStatusList.() -> Unit = {}): ComponentStatusList {
  val instance = ComponentStatusList()
  instance.block()
  return instance
}


fun newConfig(block : Config.() -> Unit = {}): Config {
  val instance = Config()
  instance.block()
  return instance
}


fun newConfigMap(block : ConfigMap.() -> Unit = {}): ConfigMap {
  val instance = ConfigMap()
  instance.block()
  return instance
}


fun newConfigMapEnvSource(block : ConfigMapEnvSource.() -> Unit = {}): ConfigMapEnvSource {
  val instance = ConfigMapEnvSource()
  instance.block()
  return instance
}


fun newConfigMapKeySelector(block : ConfigMapKeySelector.() -> Unit = {}): ConfigMapKeySelector {
  val instance = ConfigMapKeySelector()
  instance.block()
  return instance
}


fun newConfigMapList(block : ConfigMapList.() -> Unit = {}): ConfigMapList {
  val instance = ConfigMapList()
  instance.block()
  return instance
}


fun newConfigMapProjection(block : ConfigMapProjection.() -> Unit = {}): ConfigMapProjection {
  val instance = ConfigMapProjection()
  instance.block()
  return instance
}


fun newConfigMapVolumeSource(block : ConfigMapVolumeSource.() -> Unit = {}): ConfigMapVolumeSource {
  val instance = ConfigMapVolumeSource()
  instance.block()
  return instance
}


fun newContainer(block : Container.() -> Unit = {}): Container {
  val instance = Container()
  instance.block()
  return instance
}


fun newContainerImage(block : ContainerImage.() -> Unit = {}): ContainerImage {
  val instance = ContainerImage()
  instance.block()
  return instance
}


fun newContainerPort(block : ContainerPort.() -> Unit = {}): ContainerPort {
  val instance = ContainerPort()
  instance.block()
  return instance
}


fun newContainerState(block : ContainerState.() -> Unit = {}): ContainerState {
  val instance = ContainerState()
  instance.block()
  return instance
}


fun newContainerStateRunning(block : ContainerStateRunning.() -> Unit = {}): ContainerStateRunning {
  val instance = ContainerStateRunning()
  instance.block()
  return instance
}


fun newContainerStateTerminated(block : ContainerStateTerminated.() -> Unit = {}): ContainerStateTerminated {
  val instance = ContainerStateTerminated()
  instance.block()
  return instance
}


fun newContainerStateWaiting(block : ContainerStateWaiting.() -> Unit = {}): ContainerStateWaiting {
  val instance = ContainerStateWaiting()
  instance.block()
  return instance
}


fun newContainerStatus(block : ContainerStatus.() -> Unit = {}): ContainerStatus {
  val instance = ContainerStatus()
  instance.block()
  return instance
}


fun newContext(block : Context.() -> Unit = {}): Context {
  val instance = Context()
  instance.block()
  return instance
}


fun newCrossVersionObjectReference(block : CrossVersionObjectReference.() -> Unit = {}): CrossVersionObjectReference {
  val instance = CrossVersionObjectReference()
  instance.block()
  return instance
}


fun newDaemonEndpoint(block : DaemonEndpoint.() -> Unit = {}): DaemonEndpoint {
  val instance = DaemonEndpoint()
  instance.block()
  return instance
}


fun newDeleteOptions(block : DeleteOptions.() -> Unit = {}): DeleteOptions {
  val instance = DeleteOptions()
  instance.block()
  return instance
}


fun newDownwardAPIProjection(block : DownwardAPIProjection.() -> Unit = {}): DownwardAPIProjection {
  val instance = DownwardAPIProjection()
  instance.block()
  return instance
}


fun newDownwardAPIVolumeFile(block : DownwardAPIVolumeFile.() -> Unit = {}): DownwardAPIVolumeFile {
  val instance = DownwardAPIVolumeFile()
  instance.block()
  return instance
}


fun newDownwardAPIVolumeSource(block : DownwardAPIVolumeSource.() -> Unit = {}): DownwardAPIVolumeSource {
  val instance = DownwardAPIVolumeSource()
  instance.block()
  return instance
}


fun newEmptyDirVolumeSource(block : EmptyDirVolumeSource.() -> Unit = {}): EmptyDirVolumeSource {
  val instance = EmptyDirVolumeSource()
  instance.block()
  return instance
}


fun newEndpointAddress(block : EndpointAddress.() -> Unit = {}): EndpointAddress {
  val instance = EndpointAddress()
  instance.block()
  return instance
}


fun newEndpointPort(block : EndpointPort.() -> Unit = {}): EndpointPort {
  val instance = EndpointPort()
  instance.block()
  return instance
}


fun newEndpointSubset(block : EndpointSubset.() -> Unit = {}): EndpointSubset {
  val instance = EndpointSubset()
  instance.block()
  return instance
}


fun newEndpoints(block : Endpoints.() -> Unit = {}): Endpoints {
  val instance = Endpoints()
  instance.block()
  return instance
}


fun newEndpointsList(block : EndpointsList.() -> Unit = {}): EndpointsList {
  val instance = EndpointsList()
  instance.block()
  return instance
}


fun newEnvFromSource(block : EnvFromSource.() -> Unit = {}): EnvFromSource {
  val instance = EnvFromSource()
  instance.block()
  return instance
}


fun newEnvVar(block : EnvVar.() -> Unit = {}): EnvVar {
  val instance = EnvVar()
  instance.block()
  return instance
}


fun newEnvVarSource(block : EnvVarSource.() -> Unit = {}): EnvVarSource {
  val instance = EnvVarSource()
  instance.block()
  return instance
}


fun newEvent(block : Event.() -> Unit = {}): Event {
  val instance = Event()
  instance.block()
  return instance
}


fun newEventList(block : EventList.() -> Unit = {}): EventList {
  val instance = EventList()
  instance.block()
  return instance
}


fun newEventSeries(block : EventSeries.() -> Unit = {}): EventSeries {
  val instance = EventSeries()
  instance.block()
  return instance
}


fun newEventSource(block : EventSource.() -> Unit = {}): EventSource {
  val instance = EventSource()
  instance.block()
  return instance
}


fun newExecAction(block : ExecAction.() -> Unit = {}): ExecAction {
  val instance = ExecAction()
  instance.block()
  return instance
}


fun newFCVolumeSource(block : FCVolumeSource.() -> Unit = {}): FCVolumeSource {
  val instance = FCVolumeSource()
  instance.block()
  return instance
}


fun newFlexVolumeSource(block : FlexVolumeSource.() -> Unit = {}): FlexVolumeSource {
  val instance = FlexVolumeSource()
  instance.block()
  return instance
}


fun newFlockerVolumeSource(block : FlockerVolumeSource.() -> Unit = {}): FlockerVolumeSource {
  val instance = FlockerVolumeSource()
  instance.block()
  return instance
}


fun newGCEPersistentDiskVolumeSource(block : GCEPersistentDiskVolumeSource.() -> Unit = {}): GCEPersistentDiskVolumeSource {
  val instance = GCEPersistentDiskVolumeSource()
  instance.block()
  return instance
}


fun newGitRepoVolumeSource(block : GitRepoVolumeSource.() -> Unit = {}): GitRepoVolumeSource {
  val instance = GitRepoVolumeSource()
  instance.block()
  return instance
}


fun newGlusterfsVolumeSource(block : GlusterfsVolumeSource.() -> Unit = {}): GlusterfsVolumeSource {
  val instance = GlusterfsVolumeSource()
  instance.block()
  return instance
}


fun newHTTPGetAction(block : HTTPGetAction.() -> Unit = {}): HTTPGetAction {
  val instance = HTTPGetAction()
  instance.block()
  return instance
}


fun newHTTPHeader(block : HTTPHeader.() -> Unit = {}): HTTPHeader {
  val instance = HTTPHeader()
  instance.block()
  return instance
}


fun newHandler(block : Handler.() -> Unit = {}): Handler {
  val instance = Handler()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscaler(block : HorizontalPodAutoscaler.() -> Unit = {}): HorizontalPodAutoscaler {
  val instance = HorizontalPodAutoscaler()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerList(block : HorizontalPodAutoscalerList.() -> Unit = {}): HorizontalPodAutoscalerList {
  val instance = HorizontalPodAutoscalerList()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerSpec(block : HorizontalPodAutoscalerSpec.() -> Unit = {}): HorizontalPodAutoscalerSpec {
  val instance = HorizontalPodAutoscalerSpec()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerStatus(block : HorizontalPodAutoscalerStatus.() -> Unit = {}): HorizontalPodAutoscalerStatus {
  val instance = HorizontalPodAutoscalerStatus()
  instance.block()
  return instance
}


fun newHostAlias(block : HostAlias.() -> Unit = {}): HostAlias {
  val instance = HostAlias()
  instance.block()
  return instance
}


fun newHostPathVolumeSource(block : HostPathVolumeSource.() -> Unit = {}): HostPathVolumeSource {
  val instance = HostPathVolumeSource()
  instance.block()
  return instance
}


fun newISCSIPersistentVolumeSource(block : ISCSIPersistentVolumeSource.() -> Unit = {}): ISCSIPersistentVolumeSource {
  val instance = ISCSIPersistentVolumeSource()
  instance.block()
  return instance
}


fun newISCSIVolumeSource(block : ISCSIVolumeSource.() -> Unit = {}): ISCSIVolumeSource {
  val instance = ISCSIVolumeSource()
  instance.block()
  return instance
}


fun newInitializer(block : Initializer.() -> Unit = {}): Initializer {
  val instance = Initializer()
  instance.block()
  return instance
}


fun newInitializers(block : Initializers.() -> Unit = {}): Initializers {
  val instance = Initializers()
  instance.block()
  return instance
}


fun newKeyToPath(block : KeyToPath.() -> Unit = {}): KeyToPath {
  val instance = KeyToPath()
  instance.block()
  return instance
}


fun newKubernetesList(block : KubernetesList.() -> Unit = {}): KubernetesList {
  val instance = KubernetesList()
  instance.block()
  return instance
}


fun newLabelSelector(block : LabelSelector.() -> Unit = {}): LabelSelector {
  val instance = LabelSelector()
  instance.block()
  return instance
}


fun newLabelSelectorRequirement(block : LabelSelectorRequirement.() -> Unit = {}): LabelSelectorRequirement {
  val instance = LabelSelectorRequirement()
  instance.block()
  return instance
}


fun newLifecycle(block : Lifecycle.() -> Unit = {}): Lifecycle {
  val instance = Lifecycle()
  instance.block()
  return instance
}


fun newLimitRange(block : LimitRange.() -> Unit = {}): LimitRange {
  val instance = LimitRange()
  instance.block()
  return instance
}


fun newLimitRangeItem(block : LimitRangeItem.() -> Unit = {}): LimitRangeItem {
  val instance = LimitRangeItem()
  instance.block()
  return instance
}


fun newLimitRangeList(block : LimitRangeList.() -> Unit = {}): LimitRangeList {
  val instance = LimitRangeList()
  instance.block()
  return instance
}


fun newLimitRangeSpec(block : LimitRangeSpec.() -> Unit = {}): LimitRangeSpec {
  val instance = LimitRangeSpec()
  instance.block()
  return instance
}


fun newListMeta(block : ListMeta.() -> Unit = {}): ListMeta {
  val instance = ListMeta()
  instance.block()
  return instance
}


fun newLoadBalancerIngress(block : LoadBalancerIngress.() -> Unit = {}): LoadBalancerIngress {
  val instance = LoadBalancerIngress()
  instance.block()
  return instance
}


fun newLoadBalancerStatus(block : LoadBalancerStatus.() -> Unit = {}): LoadBalancerStatus {
  val instance = LoadBalancerStatus()
  instance.block()
  return instance
}


fun newLocalObjectReference(block : LocalObjectReference.() -> Unit = {}): LocalObjectReference {
  val instance = LocalObjectReference()
  instance.block()
  return instance
}


fun newLocalVolumeSource(block : LocalVolumeSource.() -> Unit = {}): LocalVolumeSource {
  val instance = LocalVolumeSource()
  instance.block()
  return instance
}


fun newMicroTime(block : MicroTime.() -> Unit = {}): MicroTime {
  val instance = MicroTime()
  instance.block()
  return instance
}


fun newNFSVolumeSource(block : NFSVolumeSource.() -> Unit = {}): NFSVolumeSource {
  val instance = NFSVolumeSource()
  instance.block()
  return instance
}


fun newNamedAuthInfo(block : NamedAuthInfo.() -> Unit = {}): NamedAuthInfo {
  val instance = NamedAuthInfo()
  instance.block()
  return instance
}


fun newNamedCluster(block : NamedCluster.() -> Unit = {}): NamedCluster {
  val instance = NamedCluster()
  instance.block()
  return instance
}


fun newNamedContext(block : NamedContext.() -> Unit = {}): NamedContext {
  val instance = NamedContext()
  instance.block()
  return instance
}


fun newNamedExtension(block : NamedExtension.() -> Unit = {}): NamedExtension {
  val instance = NamedExtension()
  instance.block()
  return instance
}


fun newNamespace(block : Namespace.() -> Unit = {}): Namespace {
  val instance = Namespace()
  instance.block()
  return instance
}


fun newNamespaceList(block : NamespaceList.() -> Unit = {}): NamespaceList {
  val instance = NamespaceList()
  instance.block()
  return instance
}


fun newNamespaceSpec(block : NamespaceSpec.() -> Unit = {}): NamespaceSpec {
  val instance = NamespaceSpec()
  instance.block()
  return instance
}


fun newNamespaceStatus(block : NamespaceStatus.() -> Unit = {}): NamespaceStatus {
  val instance = NamespaceStatus()
  instance.block()
  return instance
}


fun newNode(block : Node.() -> Unit = {}): Node {
  val instance = Node()
  instance.block()
  return instance
}


fun newNodeAddress(block : NodeAddress.() -> Unit = {}): NodeAddress {
  val instance = NodeAddress()
  instance.block()
  return instance
}


fun newNodeAffinity(block : NodeAffinity.() -> Unit = {}): NodeAffinity {
  val instance = NodeAffinity()
  instance.block()
  return instance
}


fun newNodeCondition(block : NodeCondition.() -> Unit = {}): NodeCondition {
  val instance = NodeCondition()
  instance.block()
  return instance
}


fun newNodeConfigSource(block : NodeConfigSource.() -> Unit = {}): NodeConfigSource {
  val instance = NodeConfigSource()
  instance.block()
  return instance
}


fun newNodeDaemonEndpoints(block : NodeDaemonEndpoints.() -> Unit = {}): NodeDaemonEndpoints {
  val instance = NodeDaemonEndpoints()
  instance.block()
  return instance
}


fun newNodeList(block : NodeList.() -> Unit = {}): NodeList {
  val instance = NodeList()
  instance.block()
  return instance
}


fun newNodeSelector(block : NodeSelector.() -> Unit = {}): NodeSelector {
  val instance = NodeSelector()
  instance.block()
  return instance
}


fun newNodeSelectorRequirement(block : NodeSelectorRequirement.() -> Unit = {}): NodeSelectorRequirement {
  val instance = NodeSelectorRequirement()
  instance.block()
  return instance
}


fun newNodeSelectorTerm(block : NodeSelectorTerm.() -> Unit = {}): NodeSelectorTerm {
  val instance = NodeSelectorTerm()
  instance.block()
  return instance
}


fun newNodeSpec(block : NodeSpec.() -> Unit = {}): NodeSpec {
  val instance = NodeSpec()
  instance.block()
  return instance
}


fun newNodeStatus(block : NodeStatus.() -> Unit = {}): NodeStatus {
  val instance = NodeStatus()
  instance.block()
  return instance
}


fun newNodeSystemInfo(block : NodeSystemInfo.() -> Unit = {}): NodeSystemInfo {
  val instance = NodeSystemInfo()
  instance.block()
  return instance
}


fun newObjectFieldSelector(block : ObjectFieldSelector.() -> Unit = {}): ObjectFieldSelector {
  val instance = ObjectFieldSelector()
  instance.block()
  return instance
}


fun newObjectMeta(block : ObjectMeta.() -> Unit = {}): ObjectMeta {
  val instance = ObjectMeta()
  instance.block()
  return instance
}


fun newObjectReference(block : ObjectReference.() -> Unit = {}): ObjectReference {
  val instance = ObjectReference()
  instance.block()
  return instance
}


fun newOwnerReference(block : OwnerReference.() -> Unit = {}): OwnerReference {
  val instance = OwnerReference()
  instance.block()
  return instance
}


fun newPatch(block : Patch.() -> Unit = {}): Patch {
  val instance = Patch()
  instance.block()
  return instance
}


fun newPersistentVolume(block : PersistentVolume.() -> Unit = {}): PersistentVolume {
  val instance = PersistentVolume()
  instance.block()
  return instance
}


fun newPersistentVolumeClaim(block : PersistentVolumeClaim.() -> Unit = {}): PersistentVolumeClaim {
  val instance = PersistentVolumeClaim()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimCondition(block : PersistentVolumeClaimCondition.() -> Unit = {}): PersistentVolumeClaimCondition {
  val instance = PersistentVolumeClaimCondition()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimList(block : PersistentVolumeClaimList.() -> Unit = {}): PersistentVolumeClaimList {
  val instance = PersistentVolumeClaimList()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimSpec(block : PersistentVolumeClaimSpec.() -> Unit = {}): PersistentVolumeClaimSpec {
  val instance = PersistentVolumeClaimSpec()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimStatus(block : PersistentVolumeClaimStatus.() -> Unit = {}): PersistentVolumeClaimStatus {
  val instance = PersistentVolumeClaimStatus()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimVolumeSource(block : PersistentVolumeClaimVolumeSource.() -> Unit = {}): PersistentVolumeClaimVolumeSource {
  val instance = PersistentVolumeClaimVolumeSource()
  instance.block()
  return instance
}


fun newPersistentVolumeList(block : PersistentVolumeList.() -> Unit = {}): PersistentVolumeList {
  val instance = PersistentVolumeList()
  instance.block()
  return instance
}


fun newPersistentVolumeSpec(block : PersistentVolumeSpec.() -> Unit = {}): PersistentVolumeSpec {
  val instance = PersistentVolumeSpec()
  instance.block()
  return instance
}


fun newPersistentVolumeStatus(block : PersistentVolumeStatus.() -> Unit = {}): PersistentVolumeStatus {
  val instance = PersistentVolumeStatus()
  instance.block()
  return instance
}


fun newPhotonPersistentDiskVolumeSource(block : PhotonPersistentDiskVolumeSource.() -> Unit = {}): PhotonPersistentDiskVolumeSource {
  val instance = PhotonPersistentDiskVolumeSource()
  instance.block()
  return instance
}


fun newPod(block : Pod.() -> Unit = {}): Pod {
  val instance = Pod()
  instance.block()
  return instance
}


fun newPodAffinity(block : PodAffinity.() -> Unit = {}): PodAffinity {
  val instance = PodAffinity()
  instance.block()
  return instance
}


fun newPodAffinityTerm(block : PodAffinityTerm.() -> Unit = {}): PodAffinityTerm {
  val instance = PodAffinityTerm()
  instance.block()
  return instance
}


fun newPodAntiAffinity(block : PodAntiAffinity.() -> Unit = {}): PodAntiAffinity {
  val instance = PodAntiAffinity()
  instance.block()
  return instance
}


fun newPodCondition(block : PodCondition.() -> Unit = {}): PodCondition {
  val instance = PodCondition()
  instance.block()
  return instance
}


fun newPodDNSConfig(block : PodDNSConfig.() -> Unit = {}): PodDNSConfig {
  val instance = PodDNSConfig()
  instance.block()
  return instance
}


fun newPodDNSConfigOption(block : PodDNSConfigOption.() -> Unit = {}): PodDNSConfigOption {
  val instance = PodDNSConfigOption()
  instance.block()
  return instance
}


fun newPodList(block : PodList.() -> Unit = {}): PodList {
  val instance = PodList()
  instance.block()
  return instance
}


fun newPodSecurityContext(block : PodSecurityContext.() -> Unit = {}): PodSecurityContext {
  val instance = PodSecurityContext()
  instance.block()
  return instance
}


fun newPodSpec(block : PodSpec.() -> Unit = {}): PodSpec {
  val instance = PodSpec()
  instance.block()
  return instance
}


fun newPodStatus(block : PodStatus.() -> Unit = {}): PodStatus {
  val instance = PodStatus()
  instance.block()
  return instance
}


fun newPodTemplate(block : PodTemplate.() -> Unit = {}): PodTemplate {
  val instance = PodTemplate()
  instance.block()
  return instance
}


fun newPodTemplateList(block : PodTemplateList.() -> Unit = {}): PodTemplateList {
  val instance = PodTemplateList()
  instance.block()
  return instance
}


fun newPodTemplateSpec(block : PodTemplateSpec.() -> Unit = {}): PodTemplateSpec {
  val instance = PodTemplateSpec()
  instance.block()
  return instance
}


fun newPortworxVolumeSource(block : PortworxVolumeSource.() -> Unit = {}): PortworxVolumeSource {
  val instance = PortworxVolumeSource()
  instance.block()
  return instance
}


fun newPreconditions(block : Preconditions.() -> Unit = {}): Preconditions {
  val instance = Preconditions()
  instance.block()
  return instance
}


fun newPreferences(block : Preferences.() -> Unit = {}): Preferences {
  val instance = Preferences()
  instance.block()
  return instance
}


fun newPreferredSchedulingTerm(block : PreferredSchedulingTerm.() -> Unit = {}): PreferredSchedulingTerm {
  val instance = PreferredSchedulingTerm()
  instance.block()
  return instance
}


fun newProbe(block : Probe.() -> Unit = {}): Probe {
  val instance = Probe()
  instance.block()
  return instance
}


fun newProjectedVolumeSource(block : ProjectedVolumeSource.() -> Unit = {}): ProjectedVolumeSource {
  val instance = ProjectedVolumeSource()
  instance.block()
  return instance
}


fun newQuobyteVolumeSource(block : QuobyteVolumeSource.() -> Unit = {}): QuobyteVolumeSource {
  val instance = QuobyteVolumeSource()
  instance.block()
  return instance
}


fun newRBDPersistentVolumeSource(block : RBDPersistentVolumeSource.() -> Unit = {}): RBDPersistentVolumeSource {
  val instance = RBDPersistentVolumeSource()
  instance.block()
  return instance
}


fun newRBDVolumeSource(block : RBDVolumeSource.() -> Unit = {}): RBDVolumeSource {
  val instance = RBDVolumeSource()
  instance.block()
  return instance
}


fun newReplicationController(block : ReplicationController.() -> Unit = {}): ReplicationController {
  val instance = ReplicationController()
  instance.block()
  return instance
}


fun newReplicationControllerCondition(block : ReplicationControllerCondition.() -> Unit = {}): ReplicationControllerCondition {
  val instance = ReplicationControllerCondition()
  instance.block()
  return instance
}


fun newReplicationControllerList(block : ReplicationControllerList.() -> Unit = {}): ReplicationControllerList {
  val instance = ReplicationControllerList()
  instance.block()
  return instance
}


fun newReplicationControllerSpec(block : ReplicationControllerSpec.() -> Unit = {}): ReplicationControllerSpec {
  val instance = ReplicationControllerSpec()
  instance.block()
  return instance
}


fun newReplicationControllerStatus(block : ReplicationControllerStatus.() -> Unit = {}): ReplicationControllerStatus {
  val instance = ReplicationControllerStatus()
  instance.block()
  return instance
}


fun newResourceFieldSelector(block : ResourceFieldSelector.() -> Unit = {}): ResourceFieldSelector {
  val instance = ResourceFieldSelector()
  instance.block()
  return instance
}


fun newResourceQuota(block : ResourceQuota.() -> Unit = {}): ResourceQuota {
  val instance = ResourceQuota()
  instance.block()
  return instance
}


fun newResourceQuotaList(block : ResourceQuotaList.() -> Unit = {}): ResourceQuotaList {
  val instance = ResourceQuotaList()
  instance.block()
  return instance
}


fun newResourceQuotaSpec(block : ResourceQuotaSpec.() -> Unit = {}): ResourceQuotaSpec {
  val instance = ResourceQuotaSpec()
  instance.block()
  return instance
}


fun newResourceQuotaStatus(block : ResourceQuotaStatus.() -> Unit = {}): ResourceQuotaStatus {
  val instance = ResourceQuotaStatus()
  instance.block()
  return instance
}


fun newResourceRequirements(block : ResourceRequirements.() -> Unit = {}): ResourceRequirements {
  val instance = ResourceRequirements()
  instance.block()
  return instance
}


fun newRootPaths(block : RootPaths.() -> Unit = {}): RootPaths {
  val instance = RootPaths()
  instance.block()
  return instance
}


fun newSELinuxOptions(block : SELinuxOptions.() -> Unit = {}): SELinuxOptions {
  val instance = SELinuxOptions()
  instance.block()
  return instance
}


fun newScaleIOPersistentVolumeSource(block : ScaleIOPersistentVolumeSource.() -> Unit = {}): ScaleIOPersistentVolumeSource {
  val instance = ScaleIOPersistentVolumeSource()
  instance.block()
  return instance
}


fun newScaleIOVolumeSource(block : ScaleIOVolumeSource.() -> Unit = {}): ScaleIOVolumeSource {
  val instance = ScaleIOVolumeSource()
  instance.block()
  return instance
}


fun newSecret(block : Secret.() -> Unit = {}): Secret {
  val instance = Secret()
  instance.block()
  return instance
}


fun newSecretEnvSource(block : SecretEnvSource.() -> Unit = {}): SecretEnvSource {
  val instance = SecretEnvSource()
  instance.block()
  return instance
}


fun newSecretKeySelector(block : SecretKeySelector.() -> Unit = {}): SecretKeySelector {
  val instance = SecretKeySelector()
  instance.block()
  return instance
}


fun newSecretList(block : SecretList.() -> Unit = {}): SecretList {
  val instance = SecretList()
  instance.block()
  return instance
}


fun newSecretProjection(block : SecretProjection.() -> Unit = {}): SecretProjection {
  val instance = SecretProjection()
  instance.block()
  return instance
}


fun newSecretReference(block : SecretReference.() -> Unit = {}): SecretReference {
  val instance = SecretReference()
  instance.block()
  return instance
}


fun newSecretVolumeSource(block : SecretVolumeSource.() -> Unit = {}): SecretVolumeSource {
  val instance = SecretVolumeSource()
  instance.block()
  return instance
}


fun newSecurityContext(block : SecurityContext.() -> Unit = {}): SecurityContext {
  val instance = SecurityContext()
  instance.block()
  return instance
}


fun newService(block : Service.() -> Unit = {}): Service {
  val instance = Service()
  instance.block()
  return instance
}


fun newServiceAccount(block : ServiceAccount.() -> Unit = {}): ServiceAccount {
  val instance = ServiceAccount()
  instance.block()
  return instance
}


fun newServiceAccountList(block : ServiceAccountList.() -> Unit = {}): ServiceAccountList {
  val instance = ServiceAccountList()
  instance.block()
  return instance
}


fun newServiceList(block : ServiceList.() -> Unit = {}): ServiceList {
  val instance = ServiceList()
  instance.block()
  return instance
}


fun newServicePort(block : ServicePort.() -> Unit = {}): ServicePort {
  val instance = ServicePort()
  instance.block()
  return instance
}


fun newServiceSpec(block : ServiceSpec.() -> Unit = {}): ServiceSpec {
  val instance = ServiceSpec()
  instance.block()
  return instance
}


fun newServiceStatus(block : ServiceStatus.() -> Unit = {}): ServiceStatus {
  val instance = ServiceStatus()
  instance.block()
  return instance
}


fun newSessionAffinityConfig(block : SessionAffinityConfig.() -> Unit = {}): SessionAffinityConfig {
  val instance = SessionAffinityConfig()
  instance.block()
  return instance
}


fun newStatus(block : Status.() -> Unit = {}): Status {
  val instance = Status()
  instance.block()
  return instance
}


fun newStatusCause(block : StatusCause.() -> Unit = {}): StatusCause {
  val instance = StatusCause()
  instance.block()
  return instance
}


fun newStatusDetails(block : StatusDetails.() -> Unit = {}): StatusDetails {
  val instance = StatusDetails()
  instance.block()
  return instance
}


fun newStorageOSPersistentVolumeSource(block : StorageOSPersistentVolumeSource.() -> Unit = {}): StorageOSPersistentVolumeSource {
  val instance = StorageOSPersistentVolumeSource()
  instance.block()
  return instance
}


fun newStorageOSVolumeSource(block : StorageOSVolumeSource.() -> Unit = {}): StorageOSVolumeSource {
  val instance = StorageOSVolumeSource()
  instance.block()
  return instance
}


fun newTCPSocketAction(block : TCPSocketAction.() -> Unit = {}): TCPSocketAction {
  val instance = TCPSocketAction()
  instance.block()
  return instance
}


fun newTaint(block : Taint.() -> Unit = {}): Taint {
  val instance = Taint()
  instance.block()
  return instance
}


fun newToleration(block : Toleration.() -> Unit = {}): Toleration {
  val instance = Toleration()
  instance.block()
  return instance
}


fun newTypeMeta(block : TypeMeta.() -> Unit = {}): TypeMeta {
  val instance = TypeMeta()
  instance.block()
  return instance
}


fun newVolume(block : Volume.() -> Unit = {}): Volume {
  val instance = Volume()
  instance.block()
  return instance
}


fun newVolumeDevice(block : VolumeDevice.() -> Unit = {}): VolumeDevice {
  val instance = VolumeDevice()
  instance.block()
  return instance
}


fun newVolumeMount(block : VolumeMount.() -> Unit = {}): VolumeMount {
  val instance = VolumeMount()
  instance.block()
  return instance
}


fun newVolumeProjection(block : VolumeProjection.() -> Unit = {}): VolumeProjection {
  val instance = VolumeProjection()
  instance.block()
  return instance
}


fun newVsphereVirtualDiskVolumeSource(block : VsphereVirtualDiskVolumeSource.() -> Unit = {}): VsphereVirtualDiskVolumeSource {
  val instance = VsphereVirtualDiskVolumeSource()
  instance.block()
  return instance
}


fun newWatchEvent(block : WatchEvent.() -> Unit = {}): WatchEvent {
  val instance = WatchEvent()
  instance.block()
  return instance
}


fun newWeightedPodAffinityTerm(block : WeightedPodAffinityTerm.() -> Unit = {}): WeightedPodAffinityTerm {
  val instance = WeightedPodAffinityTerm()
  instance.block()
  return instance
}


fun newCustomResourceDefinition(block : CustomResourceDefinition.() -> Unit = {}): CustomResourceDefinition {
  val instance = CustomResourceDefinition()
  instance.block()
  return instance
}


fun newCustomResourceDefinitionCondition(block : CustomResourceDefinitionCondition.() -> Unit = {}): CustomResourceDefinitionCondition {
  val instance = CustomResourceDefinitionCondition()
  instance.block()
  return instance
}


fun newCustomResourceDefinitionList(block : CustomResourceDefinitionList.() -> Unit = {}): CustomResourceDefinitionList {
  val instance = CustomResourceDefinitionList()
  instance.block()
  return instance
}


fun newCustomResourceDefinitionNames(block : CustomResourceDefinitionNames.() -> Unit = {}): CustomResourceDefinitionNames {
  val instance = CustomResourceDefinitionNames()
  instance.block()
  return instance
}


fun newCustomResourceDefinitionSpec(block : CustomResourceDefinitionSpec.() -> Unit = {}): CustomResourceDefinitionSpec {
  val instance = CustomResourceDefinitionSpec()
  instance.block()
  return instance
}


fun newCustomResourceDefinitionStatus(block : CustomResourceDefinitionStatus.() -> Unit = {}): CustomResourceDefinitionStatus {
  val instance = CustomResourceDefinitionStatus()
  instance.block()
  return instance
}


fun newCustomResourceValidation(block : CustomResourceValidation.() -> Unit = {}): CustomResourceValidation {
  val instance = CustomResourceValidation()
  instance.block()
  return instance
}


fun newExternalDocumentation(block : ExternalDocumentation.() -> Unit = {}): ExternalDocumentation {
  val instance = ExternalDocumentation()
  instance.block()
  return instance
}


fun newJSON(block : JSON.() -> Unit = {}): JSON {
  val instance = JSON()
  instance.block()
  return instance
}


fun newJSONSchemaProps(block : JSONSchemaProps.() -> Unit = {}): JSONSchemaProps {
  val instance = JSONSchemaProps()
  instance.block()
  return instance
}


fun newJSONSchemaPropsOrArray(block : JSONSchemaPropsOrArray.() -> Unit = {}): JSONSchemaPropsOrArray {
  val instance = JSONSchemaPropsOrArray()
  instance.block()
  return instance
}


fun newJSONSchemaPropsOrBool(block : JSONSchemaPropsOrBool.() -> Unit = {}): JSONSchemaPropsOrBool {
  val instance = JSONSchemaPropsOrBool()
  instance.block()
  return instance
}


fun newJSONSchemaPropsOrStringArray(block : JSONSchemaPropsOrStringArray.() -> Unit = {}): JSONSchemaPropsOrStringArray {
  val instance = JSONSchemaPropsOrStringArray()
  instance.block()
  return instance
}


fun newDaemonSet(block : DaemonSet.() -> Unit = {}): DaemonSet {
  val instance = DaemonSet()
  instance.block()
  return instance
}


fun newDaemonSetCondition(block : DaemonSetCondition.() -> Unit = {}): DaemonSetCondition {
  val instance = DaemonSetCondition()
  instance.block()
  return instance
}


fun newDaemonSetList(block : DaemonSetList.() -> Unit = {}): DaemonSetList {
  val instance = DaemonSetList()
  instance.block()
  return instance
}


fun newDaemonSetSpec(block : DaemonSetSpec.() -> Unit = {}): DaemonSetSpec {
  val instance = DaemonSetSpec()
  instance.block()
  return instance
}


fun newDaemonSetStatus(block : DaemonSetStatus.() -> Unit = {}): DaemonSetStatus {
  val instance = DaemonSetStatus()
  instance.block()
  return instance
}


fun newDaemonSetUpdateStrategy(block : DaemonSetUpdateStrategy.() -> Unit = {}): DaemonSetUpdateStrategy {
  val instance = DaemonSetUpdateStrategy()
  instance.block()
  return instance
}


fun newDeployment(block : Deployment.() -> Unit = {}): Deployment {
  val instance = Deployment()
  instance.block()
  return instance
}


fun newDeploymentCondition(block : DeploymentCondition.() -> Unit = {}): DeploymentCondition {
  val instance = DeploymentCondition()
  instance.block()
  return instance
}


fun newDeploymentList(block : DeploymentList.() -> Unit = {}): DeploymentList {
  val instance = DeploymentList()
  instance.block()
  return instance
}


fun newDeploymentSpec(block : DeploymentSpec.() -> Unit = {}): DeploymentSpec {
  val instance = DeploymentSpec()
  instance.block()
  return instance
}


fun newDeploymentStatus(block : DeploymentStatus.() -> Unit = {}): DeploymentStatus {
  val instance = DeploymentStatus()
  instance.block()
  return instance
}


fun newDeploymentStrategy(block : DeploymentStrategy.() -> Unit = {}): DeploymentStrategy {
  val instance = DeploymentStrategy()
  instance.block()
  return instance
}


fun newReplicaSet(block : ReplicaSet.() -> Unit = {}): ReplicaSet {
  val instance = ReplicaSet()
  instance.block()
  return instance
}


fun newReplicaSetCondition(block : ReplicaSetCondition.() -> Unit = {}): ReplicaSetCondition {
  val instance = ReplicaSetCondition()
  instance.block()
  return instance
}


fun newReplicaSetList(block : ReplicaSetList.() -> Unit = {}): ReplicaSetList {
  val instance = ReplicaSetList()
  instance.block()
  return instance
}


fun newReplicaSetSpec(block : ReplicaSetSpec.() -> Unit = {}): ReplicaSetSpec {
  val instance = ReplicaSetSpec()
  instance.block()
  return instance
}


fun newReplicaSetStatus(block : ReplicaSetStatus.() -> Unit = {}): ReplicaSetStatus {
  val instance = ReplicaSetStatus()
  instance.block()
  return instance
}


fun newRollingUpdateDaemonSet(block : RollingUpdateDaemonSet.() -> Unit = {}): RollingUpdateDaemonSet {
  val instance = RollingUpdateDaemonSet()
  instance.block()
  return instance
}


fun newRollingUpdateDeployment(block : RollingUpdateDeployment.() -> Unit = {}): RollingUpdateDeployment {
  val instance = RollingUpdateDeployment()
  instance.block()
  return instance
}


fun newRollingUpdateStatefulSetStrategy(block : RollingUpdateStatefulSetStrategy.() -> Unit = {}): RollingUpdateStatefulSetStrategy {
  val instance = RollingUpdateStatefulSetStrategy()
  instance.block()
  return instance
}


fun newStatefulSet(block : StatefulSet.() -> Unit = {}): StatefulSet {
  val instance = StatefulSet()
  instance.block()
  return instance
}


fun newStatefulSetCondition(block : StatefulSetCondition.() -> Unit = {}): StatefulSetCondition {
  val instance = StatefulSetCondition()
  instance.block()
  return instance
}


fun newStatefulSetList(block : StatefulSetList.() -> Unit = {}): StatefulSetList {
  val instance = StatefulSetList()
  instance.block()
  return instance
}


fun newStatefulSetSpec(block : StatefulSetSpec.() -> Unit = {}): StatefulSetSpec {
  val instance = StatefulSetSpec()
  instance.block()
  return instance
}


fun newStatefulSetStatus(block : StatefulSetStatus.() -> Unit = {}): StatefulSetStatus {
  val instance = StatefulSetStatus()
  instance.block()
  return instance
}


fun newStatefulSetUpdateStrategy(block : StatefulSetUpdateStrategy.() -> Unit = {}): StatefulSetUpdateStrategy {
  val instance = StatefulSetUpdateStrategy()
  instance.block()
  return instance
}


fun newTokenReview(block : TokenReview.() -> Unit = {}): TokenReview {
  val instance = TokenReview()
  instance.block()
  return instance
}


fun newTokenReviewSpec(block : TokenReviewSpec.() -> Unit = {}): TokenReviewSpec {
  val instance = TokenReviewSpec()
  instance.block()
  return instance
}


fun newTokenReviewStatus(block : TokenReviewStatus.() -> Unit = {}): TokenReviewStatus {
  val instance = TokenReviewStatus()
  instance.block()
  return instance
}


fun newUserInfo(block : UserInfo.() -> Unit = {}): UserInfo {
  val instance = UserInfo()
  instance.block()
  return instance
}


fun newLocalSubjectAccessReview(block : LocalSubjectAccessReview.() -> Unit = {}): LocalSubjectAccessReview {
  val instance = LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun newNonResourceAttributes(block : NonResourceAttributes.() -> Unit = {}): NonResourceAttributes {
  val instance = NonResourceAttributes()
  instance.block()
  return instance
}


fun newResourceAttributes(block : ResourceAttributes.() -> Unit = {}): ResourceAttributes {
  val instance = ResourceAttributes()
  instance.block()
  return instance
}


fun newSubjectAccessReview(block : SubjectAccessReview.() -> Unit = {}): SubjectAccessReview {
  val instance = SubjectAccessReview()
  instance.block()
  return instance
}


fun newSubjectAccessReviewSpec(block : SubjectAccessReviewSpec.() -> Unit = {}): SubjectAccessReviewSpec {
  val instance = SubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReviewStatus(block : SubjectAccessReviewStatus.() -> Unit = {}): SubjectAccessReviewStatus {
  val instance = SubjectAccessReviewStatus()
  instance.block()
  return instance
}


fun newCronJob(block : CronJob.() -> Unit = {}): CronJob {
  val instance = CronJob()
  instance.block()
  return instance
}


fun newCronJobList(block : CronJobList.() -> Unit = {}): CronJobList {
  val instance = CronJobList()
  instance.block()
  return instance
}


fun newCronJobSpec(block : CronJobSpec.() -> Unit = {}): CronJobSpec {
  val instance = CronJobSpec()
  instance.block()
  return instance
}


fun newCronJobStatus(block : CronJobStatus.() -> Unit = {}): CronJobStatus {
  val instance = CronJobStatus()
  instance.block()
  return instance
}


fun newJob(block : Job.() -> Unit = {}): Job {
  val instance = Job()
  instance.block()
  return instance
}


fun newJobCondition(block : JobCondition.() -> Unit = {}): JobCondition {
  val instance = JobCondition()
  instance.block()
  return instance
}


fun newJobList(block : JobList.() -> Unit = {}): JobList {
  val instance = JobList()
  instance.block()
  return instance
}


fun newJobSpec(block : JobSpec.() -> Unit = {}): JobSpec {
  val instance = JobSpec()
  instance.block()
  return instance
}


fun newJobStatus(block : JobStatus.() -> Unit = {}): JobStatus {
  val instance = JobStatus()
  instance.block()
  return instance
}


fun newJobTemplateSpec(block : JobTemplateSpec.() -> Unit = {}): JobTemplateSpec {
  val instance = JobTemplateSpec()
  instance.block()
  return instance
}


fun newAllowedFlexVolume(block : AllowedFlexVolume.() -> Unit = {}): AllowedFlexVolume {
  val instance = AllowedFlexVolume()
  instance.block()
  return instance
}


fun newAllowedHostPath(block : AllowedHostPath.() -> Unit = {}): AllowedHostPath {
  val instance = AllowedHostPath()
  instance.block()
  return instance
}


fun newDeploymentRollback(block : DeploymentRollback.() -> Unit = {}): DeploymentRollback {
  val instance = DeploymentRollback()
  instance.block()
  return instance
}


fun newFSGroupStrategyOptions(block : FSGroupStrategyOptions.() -> Unit = {}): FSGroupStrategyOptions {
  val instance = FSGroupStrategyOptions()
  instance.block()
  return instance
}


fun newHTTPIngressPath(block : HTTPIngressPath.() -> Unit = {}): HTTPIngressPath {
  val instance = HTTPIngressPath()
  instance.block()
  return instance
}


fun newHTTPIngressRuleValue(block : HTTPIngressRuleValue.() -> Unit = {}): HTTPIngressRuleValue {
  val instance = HTTPIngressRuleValue()
  instance.block()
  return instance
}


fun newHostPortRange(block : HostPortRange.() -> Unit = {}): HostPortRange {
  val instance = HostPortRange()
  instance.block()
  return instance
}


fun newIDRange(block : IDRange.() -> Unit = {}): IDRange {
  val instance = IDRange()
  instance.block()
  return instance
}


fun newIngress(block : Ingress.() -> Unit = {}): Ingress {
  val instance = Ingress()
  instance.block()
  return instance
}


fun newIngressBackend(block : IngressBackend.() -> Unit = {}): IngressBackend {
  val instance = IngressBackend()
  instance.block()
  return instance
}


fun newIngressList(block : IngressList.() -> Unit = {}): IngressList {
  val instance = IngressList()
  instance.block()
  return instance
}


fun newIngressRule(block : IngressRule.() -> Unit = {}): IngressRule {
  val instance = IngressRule()
  instance.block()
  return instance
}


fun newIngressSpec(block : IngressSpec.() -> Unit = {}): IngressSpec {
  val instance = IngressSpec()
  instance.block()
  return instance
}


fun newIngressStatus(block : IngressStatus.() -> Unit = {}): IngressStatus {
  val instance = IngressStatus()
  instance.block()
  return instance
}


fun newIngressTLS(block : IngressTLS.() -> Unit = {}): IngressTLS {
  val instance = IngressTLS()
  instance.block()
  return instance
}


fun newKubernetesRunAsUserStrategyOptions(block : KubernetesRunAsUserStrategyOptions.() -> Unit = {}): KubernetesRunAsUserStrategyOptions {
  val instance = KubernetesRunAsUserStrategyOptions()
  instance.block()
  return instance
}


fun newPodSecurityPolicy(block : PodSecurityPolicy.() -> Unit = {}): PodSecurityPolicy {
  val instance = PodSecurityPolicy()
  instance.block()
  return instance
}


fun newPodSecurityPolicyList(block : PodSecurityPolicyList.() -> Unit = {}): PodSecurityPolicyList {
  val instance = PodSecurityPolicyList()
  instance.block()
  return instance
}


fun newPodSecurityPolicySpec(block : PodSecurityPolicySpec.() -> Unit = {}): PodSecurityPolicySpec {
  val instance = PodSecurityPolicySpec()
  instance.block()
  return instance
}


fun newRollbackConfig(block : RollbackConfig.() -> Unit = {}): RollbackConfig {
  val instance = RollbackConfig()
  instance.block()
  return instance
}


fun newSELinuxStrategyOptions(block : SELinuxStrategyOptions.() -> Unit = {}): SELinuxStrategyOptions {
  val instance = SELinuxStrategyOptions()
  instance.block()
  return instance
}


fun newScale(block : Scale.() -> Unit = {}): Scale {
  val instance = Scale()
  instance.block()
  return instance
}


fun newScaleSpec(block : ScaleSpec.() -> Unit = {}): ScaleSpec {
  val instance = ScaleSpec()
  instance.block()
  return instance
}


fun newScaleStatus(block : ScaleStatus.() -> Unit = {}): ScaleStatus {
  val instance = ScaleStatus()
  instance.block()
  return instance
}


fun newSupplementalGroupsStrategyOptions(block : SupplementalGroupsStrategyOptions.() -> Unit = {}): SupplementalGroupsStrategyOptions {
  val instance = SupplementalGroupsStrategyOptions()
  instance.block()
  return instance
}


fun newIPBlock(block : IPBlock.() -> Unit = {}): IPBlock {
  val instance = IPBlock()
  instance.block()
  return instance
}


fun newNetworkPolicy(block : NetworkPolicy.() -> Unit = {}): NetworkPolicy {
  val instance = NetworkPolicy()
  instance.block()
  return instance
}


fun newNetworkPolicyEgressRule(block : NetworkPolicyEgressRule.() -> Unit = {}): NetworkPolicyEgressRule {
  val instance = NetworkPolicyEgressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyIngressRule(block : NetworkPolicyIngressRule.() -> Unit = {}): NetworkPolicyIngressRule {
  val instance = NetworkPolicyIngressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyList(block : NetworkPolicyList.() -> Unit = {}): NetworkPolicyList {
  val instance = NetworkPolicyList()
  instance.block()
  return instance
}


fun newNetworkPolicyPeer(block : NetworkPolicyPeer.() -> Unit = {}): NetworkPolicyPeer {
  val instance = NetworkPolicyPeer()
  instance.block()
  return instance
}


fun newNetworkPolicyPort(block : NetworkPolicyPort.() -> Unit = {}): NetworkPolicyPort {
  val instance = NetworkPolicyPort()
  instance.block()
  return instance
}


fun newNetworkPolicySpec(block : NetworkPolicySpec.() -> Unit = {}): NetworkPolicySpec {
  val instance = NetworkPolicySpec()
  instance.block()
  return instance
}


fun newPodDisruptionBudget(block : PodDisruptionBudget.() -> Unit = {}): PodDisruptionBudget {
  val instance = PodDisruptionBudget()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetList(block : PodDisruptionBudgetList.() -> Unit = {}): PodDisruptionBudgetList {
  val instance = PodDisruptionBudgetList()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetSpec(block : PodDisruptionBudgetSpec.() -> Unit = {}): PodDisruptionBudgetSpec {
  val instance = PodDisruptionBudgetSpec()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetStatus(block : PodDisruptionBudgetStatus.() -> Unit = {}): PodDisruptionBudgetStatus {
  val instance = PodDisruptionBudgetStatus()
  instance.block()
  return instance
}


fun newKubernetesAggregationRule(block : KubernetesAggregationRule.() -> Unit = {}): KubernetesAggregationRule {
  val instance = KubernetesAggregationRule()
  instance.block()
  return instance
}


fun newKubernetesPolicyRule(block : KubernetesPolicyRule.() -> Unit = {}): KubernetesPolicyRule {
  val instance = KubernetesPolicyRule()
  instance.block()
  return instance
}


fun newKubernetesRole(block : KubernetesRole.() -> Unit = {}): KubernetesRole {
  val instance = KubernetesRole()
  instance.block()
  return instance
}


fun newKubernetesRoleBinding(block : KubernetesRoleBinding.() -> Unit = {}): KubernetesRoleBinding {
  val instance = KubernetesRoleBinding()
  instance.block()
  return instance
}


fun newKubernetesRoleBindingList(block : KubernetesRoleBindingList.() -> Unit = {}): KubernetesRoleBindingList {
  val instance = KubernetesRoleBindingList()
  instance.block()
  return instance
}


fun newKubernetesRoleList(block : KubernetesRoleList.() -> Unit = {}): KubernetesRoleList {
  val instance = KubernetesRoleList()
  instance.block()
  return instance
}


fun newKubernetesRoleRef(block : KubernetesRoleRef.() -> Unit = {}): KubernetesRoleRef {
  val instance = KubernetesRoleRef()
  instance.block()
  return instance
}


fun newKubernetesSubject(block : KubernetesSubject.() -> Unit = {}): KubernetesSubject {
  val instance = KubernetesSubject()
  instance.block()
  return instance
}


fun newRawExtension(block : RawExtension.() -> Unit = {}): RawExtension {
  val instance = RawExtension()
  instance.block()
  return instance
}


fun newStorageClass(block : StorageClass.() -> Unit = {}): StorageClass {
  val instance = StorageClass()
  instance.block()
  return instance
}


fun newStorageClassList(block : StorageClassList.() -> Unit = {}): StorageClassList {
  val instance = StorageClassList()
  instance.block()
  return instance
}


fun newInfo(block : Info.() -> Unit = {}): Info {
  val instance = Info()
  instance.block()
  return instance
}


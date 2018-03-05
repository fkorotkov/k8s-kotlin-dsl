// GENERATE
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource
import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.AttachedVolume
import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.AuthProviderConfig
import io.fabric8.kubernetes.api.model.AzureDiskVolumeSource
import io.fabric8.kubernetes.api.model.AzureFileVolumeSource
import io.fabric8.kubernetes.api.model.BaseKubernetesList
import io.fabric8.kubernetes.api.model.Binding
import io.fabric8.kubernetes.api.model.Capabilities
import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.CinderVolumeSource
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
import io.fabric8.kubernetes.api.model.CronJob
import io.fabric8.kubernetes.api.model.CronJobList
import io.fabric8.kubernetes.api.model.CronJobSpec
import io.fabric8.kubernetes.api.model.CronJobStatus
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
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.Initializer
import io.fabric8.kubernetes.api.model.Initializers
import io.fabric8.kubernetes.api.model.Job
import io.fabric8.kubernetes.api.model.JobCondition
import io.fabric8.kubernetes.api.model.JobList
import io.fabric8.kubernetes.api.model.JobSpec
import io.fabric8.kubernetes.api.model.JobStatus
import io.fabric8.kubernetes.api.model.JobTemplateSpec
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
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.Secret
import io.fabric8.kubernetes.api.model.SecretEnvSource
import io.fabric8.kubernetes.api.model.SecretKeySelector
import io.fabric8.kubernetes.api.model.SecretList
import io.fabric8.kubernetes.api.model.SecretProjection
import io.fabric8.kubernetes.api.model.SecretVolumeSource
import io.fabric8.kubernetes.api.model.SecurityContext
import io.fabric8.kubernetes.api.model.Service
import io.fabric8.kubernetes.api.model.ServiceAccount
import io.fabric8.kubernetes.api.model.ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceList
import io.fabric8.kubernetes.api.model.ServicePort
import io.fabric8.kubernetes.api.model.ServiceSpec
import io.fabric8.kubernetes.api.model.ServiceStatus
import io.fabric8.kubernetes.api.model.Status
import io.fabric8.kubernetes.api.model.StatusCause
import io.fabric8.kubernetes.api.model.StatusDetails
import io.fabric8.kubernetes.api.model.StorageClass
import io.fabric8.kubernetes.api.model.StorageClassList
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource
import io.fabric8.kubernetes.api.model.TCPSocketAction
import io.fabric8.kubernetes.api.model.Taint
import io.fabric8.kubernetes.api.model.Toleration
import io.fabric8.kubernetes.api.model.Volume
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
import io.fabric8.kubernetes.api.model.extensions.APIVersion
import io.fabric8.kubernetes.api.model.extensions.DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetList
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetStatus
import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentCondition
import io.fabric8.kubernetes.api.model.extensions.DeploymentList
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentStatus
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy
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
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicy
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyList
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetList
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetStatus
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateStatefulSetStrategy
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec
import io.fabric8.kubernetes.api.model.extensions.ScaleStatus
import io.fabric8.kubernetes.api.model.extensions.StatefulSet
import io.fabric8.kubernetes.api.model.extensions.StatefulSetList
import io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec
import io.fabric8.kubernetes.api.model.extensions.StatefulSetStatus
import io.fabric8.kubernetes.api.model.extensions.StatefulSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResourceList
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus


fun awsElasticBlockStoreVolumeSource(block : AWSElasticBlockStoreVolumeSource.() -> Unit = {}): AWSElasticBlockStoreVolumeSource {
  val instance = AWSElasticBlockStoreVolumeSource()
  instance.block()
  return instance
}


fun affinity(block : Affinity.() -> Unit = {}): Affinity {
  val instance = Affinity()
  instance.block()
  return instance
}


fun attachedVolume(block : AttachedVolume.() -> Unit = {}): AttachedVolume {
  val instance = AttachedVolume()
  instance.block()
  return instance
}


fun authInfo(block : AuthInfo.() -> Unit = {}): AuthInfo {
  val instance = AuthInfo()
  instance.block()
  return instance
}


fun authProviderConfig(block : AuthProviderConfig.() -> Unit = {}): AuthProviderConfig {
  val instance = AuthProviderConfig()
  instance.block()
  return instance
}


fun azureDiskVolumeSource(block : AzureDiskVolumeSource.() -> Unit = {}): AzureDiskVolumeSource {
  val instance = AzureDiskVolumeSource()
  instance.block()
  return instance
}


fun azureFileVolumeSource(block : AzureFileVolumeSource.() -> Unit = {}): AzureFileVolumeSource {
  val instance = AzureFileVolumeSource()
  instance.block()
  return instance
}


fun baseKubernetesList(block : BaseKubernetesList.() -> Unit = {}): BaseKubernetesList {
  val instance = BaseKubernetesList()
  instance.block()
  return instance
}


fun binding(block : Binding.() -> Unit = {}): Binding {
  val instance = Binding()
  instance.block()
  return instance
}


fun capabilities(block : Capabilities.() -> Unit = {}): Capabilities {
  val instance = Capabilities()
  instance.block()
  return instance
}


fun cephFSVolumeSource(block : CephFSVolumeSource.() -> Unit = {}): CephFSVolumeSource {
  val instance = CephFSVolumeSource()
  instance.block()
  return instance
}


fun cinderVolumeSource(block : CinderVolumeSource.() -> Unit = {}): CinderVolumeSource {
  val instance = CinderVolumeSource()
  instance.block()
  return instance
}


fun cluster(block : Cluster.() -> Unit = {}): Cluster {
  val instance = Cluster()
  instance.block()
  return instance
}


fun componentCondition(block : ComponentCondition.() -> Unit = {}): ComponentCondition {
  val instance = ComponentCondition()
  instance.block()
  return instance
}


fun componentStatus(block : ComponentStatus.() -> Unit = {}): ComponentStatus {
  val instance = ComponentStatus()
  instance.block()
  return instance
}


fun componentStatusList(block : ComponentStatusList.() -> Unit = {}): ComponentStatusList {
  val instance = ComponentStatusList()
  instance.block()
  return instance
}


fun config(block : Config.() -> Unit = {}): Config {
  val instance = Config()
  instance.block()
  return instance
}


fun configMap(block : ConfigMap.() -> Unit = {}): ConfigMap {
  val instance = ConfigMap()
  instance.block()
  return instance
}


fun configMapEnvSource(block : ConfigMapEnvSource.() -> Unit = {}): ConfigMapEnvSource {
  val instance = ConfigMapEnvSource()
  instance.block()
  return instance
}


fun configMapKeySelector(block : ConfigMapKeySelector.() -> Unit = {}): ConfigMapKeySelector {
  val instance = ConfigMapKeySelector()
  instance.block()
  return instance
}


fun configMapList(block : ConfigMapList.() -> Unit = {}): ConfigMapList {
  val instance = ConfigMapList()
  instance.block()
  return instance
}


fun configMapProjection(block : ConfigMapProjection.() -> Unit = {}): ConfigMapProjection {
  val instance = ConfigMapProjection()
  instance.block()
  return instance
}


fun configMapVolumeSource(block : ConfigMapVolumeSource.() -> Unit = {}): ConfigMapVolumeSource {
  val instance = ConfigMapVolumeSource()
  instance.block()
  return instance
}


fun container(block : Container.() -> Unit = {}): Container {
  val instance = Container()
  instance.block()
  return instance
}


fun containerImage(block : ContainerImage.() -> Unit = {}): ContainerImage {
  val instance = ContainerImage()
  instance.block()
  return instance
}


fun containerPort(block : ContainerPort.() -> Unit = {}): ContainerPort {
  val instance = ContainerPort()
  instance.block()
  return instance
}


fun containerState(block : ContainerState.() -> Unit = {}): ContainerState {
  val instance = ContainerState()
  instance.block()
  return instance
}


fun containerStateRunning(block : ContainerStateRunning.() -> Unit = {}): ContainerStateRunning {
  val instance = ContainerStateRunning()
  instance.block()
  return instance
}


fun containerStateTerminated(block : ContainerStateTerminated.() -> Unit = {}): ContainerStateTerminated {
  val instance = ContainerStateTerminated()
  instance.block()
  return instance
}


fun containerStateWaiting(block : ContainerStateWaiting.() -> Unit = {}): ContainerStateWaiting {
  val instance = ContainerStateWaiting()
  instance.block()
  return instance
}


fun containerStatus(block : ContainerStatus.() -> Unit = {}): ContainerStatus {
  val instance = ContainerStatus()
  instance.block()
  return instance
}


fun context(block : Context.() -> Unit = {}): Context {
  val instance = Context()
  instance.block()
  return instance
}


fun cronJob(block : CronJob.() -> Unit = {}): CronJob {
  val instance = CronJob()
  instance.block()
  return instance
}


fun cronJobList(block : CronJobList.() -> Unit = {}): CronJobList {
  val instance = CronJobList()
  instance.block()
  return instance
}


fun cronJobSpec(block : CronJobSpec.() -> Unit = {}): CronJobSpec {
  val instance = CronJobSpec()
  instance.block()
  return instance
}


fun cronJobStatus(block : CronJobStatus.() -> Unit = {}): CronJobStatus {
  val instance = CronJobStatus()
  instance.block()
  return instance
}


fun crossVersionObjectReference(block : CrossVersionObjectReference.() -> Unit = {}): CrossVersionObjectReference {
  val instance = CrossVersionObjectReference()
  instance.block()
  return instance
}


fun daemonEndpoint(block : DaemonEndpoint.() -> Unit = {}): DaemonEndpoint {
  val instance = DaemonEndpoint()
  instance.block()
  return instance
}


fun deleteOptions(block : DeleteOptions.() -> Unit = {}): DeleteOptions {
  val instance = DeleteOptions()
  instance.block()
  return instance
}


fun downwardAPIProjection(block : DownwardAPIProjection.() -> Unit = {}): DownwardAPIProjection {
  val instance = DownwardAPIProjection()
  instance.block()
  return instance
}


fun downwardAPIVolumeFile(block : DownwardAPIVolumeFile.() -> Unit = {}): DownwardAPIVolumeFile {
  val instance = DownwardAPIVolumeFile()
  instance.block()
  return instance
}


fun downwardAPIVolumeSource(block : DownwardAPIVolumeSource.() -> Unit = {}): DownwardAPIVolumeSource {
  val instance = DownwardAPIVolumeSource()
  instance.block()
  return instance
}


fun emptyDirVolumeSource(block : EmptyDirVolumeSource.() -> Unit = {}): EmptyDirVolumeSource {
  val instance = EmptyDirVolumeSource()
  instance.block()
  return instance
}


fun endpointAddress(block : EndpointAddress.() -> Unit = {}): EndpointAddress {
  val instance = EndpointAddress()
  instance.block()
  return instance
}


fun endpointPort(block : EndpointPort.() -> Unit = {}): EndpointPort {
  val instance = EndpointPort()
  instance.block()
  return instance
}


fun endpointSubset(block : EndpointSubset.() -> Unit = {}): EndpointSubset {
  val instance = EndpointSubset()
  instance.block()
  return instance
}


fun endpoints(block : Endpoints.() -> Unit = {}): Endpoints {
  val instance = Endpoints()
  instance.block()
  return instance
}


fun endpointsList(block : EndpointsList.() -> Unit = {}): EndpointsList {
  val instance = EndpointsList()
  instance.block()
  return instance
}


fun envFromSource(block : EnvFromSource.() -> Unit = {}): EnvFromSource {
  val instance = EnvFromSource()
  instance.block()
  return instance
}


fun envVar(block : EnvVar.() -> Unit = {}): EnvVar {
  val instance = EnvVar()
  instance.block()
  return instance
}


fun envVarSource(block : EnvVarSource.() -> Unit = {}): EnvVarSource {
  val instance = EnvVarSource()
  instance.block()
  return instance
}


fun event(block : Event.() -> Unit = {}): Event {
  val instance = Event()
  instance.block()
  return instance
}


fun eventList(block : EventList.() -> Unit = {}): EventList {
  val instance = EventList()
  instance.block()
  return instance
}


fun eventSource(block : EventSource.() -> Unit = {}): EventSource {
  val instance = EventSource()
  instance.block()
  return instance
}


fun execAction(block : ExecAction.() -> Unit = {}): ExecAction {
  val instance = ExecAction()
  instance.block()
  return instance
}


fun fcVolumeSource(block : FCVolumeSource.() -> Unit = {}): FCVolumeSource {
  val instance = FCVolumeSource()
  instance.block()
  return instance
}


fun flexVolumeSource(block : FlexVolumeSource.() -> Unit = {}): FlexVolumeSource {
  val instance = FlexVolumeSource()
  instance.block()
  return instance
}


fun flockerVolumeSource(block : FlockerVolumeSource.() -> Unit = {}): FlockerVolumeSource {
  val instance = FlockerVolumeSource()
  instance.block()
  return instance
}


fun gcePersistentDiskVolumeSource(block : GCEPersistentDiskVolumeSource.() -> Unit = {}): GCEPersistentDiskVolumeSource {
  val instance = GCEPersistentDiskVolumeSource()
  instance.block()
  return instance
}


fun gitRepoVolumeSource(block : GitRepoVolumeSource.() -> Unit = {}): GitRepoVolumeSource {
  val instance = GitRepoVolumeSource()
  instance.block()
  return instance
}


fun glusterfsVolumeSource(block : GlusterfsVolumeSource.() -> Unit = {}): GlusterfsVolumeSource {
  val instance = GlusterfsVolumeSource()
  instance.block()
  return instance
}


fun httpGetAction(block : HTTPGetAction.() -> Unit = {}): HTTPGetAction {
  val instance = HTTPGetAction()
  instance.block()
  return instance
}


fun httpHeader(block : HTTPHeader.() -> Unit = {}): HTTPHeader {
  val instance = HTTPHeader()
  instance.block()
  return instance
}


fun handler(block : Handler.() -> Unit = {}): Handler {
  val instance = Handler()
  instance.block()
  return instance
}


fun horizontalPodAutoscaler(block : HorizontalPodAutoscaler.() -> Unit = {}): HorizontalPodAutoscaler {
  val instance = HorizontalPodAutoscaler()
  instance.block()
  return instance
}


fun horizontalPodAutoscalerList(block : HorizontalPodAutoscalerList.() -> Unit = {}): HorizontalPodAutoscalerList {
  val instance = HorizontalPodAutoscalerList()
  instance.block()
  return instance
}


fun horizontalPodAutoscalerSpec(block : HorizontalPodAutoscalerSpec.() -> Unit = {}): HorizontalPodAutoscalerSpec {
  val instance = HorizontalPodAutoscalerSpec()
  instance.block()
  return instance
}


fun horizontalPodAutoscalerStatus(block : HorizontalPodAutoscalerStatus.() -> Unit = {}): HorizontalPodAutoscalerStatus {
  val instance = HorizontalPodAutoscalerStatus()
  instance.block()
  return instance
}


fun hostAlias(block : HostAlias.() -> Unit = {}): HostAlias {
  val instance = HostAlias()
  instance.block()
  return instance
}


fun hostPathVolumeSource(block : HostPathVolumeSource.() -> Unit = {}): HostPathVolumeSource {
  val instance = HostPathVolumeSource()
  instance.block()
  return instance
}


fun iscsiVolumeSource(block : ISCSIVolumeSource.() -> Unit = {}): ISCSIVolumeSource {
  val instance = ISCSIVolumeSource()
  instance.block()
  return instance
}


fun initializer(block : Initializer.() -> Unit = {}): Initializer {
  val instance = Initializer()
  instance.block()
  return instance
}


fun initializers(block : Initializers.() -> Unit = {}): Initializers {
  val instance = Initializers()
  instance.block()
  return instance
}


fun job(block : Job.() -> Unit = {}): Job {
  val instance = Job()
  instance.block()
  return instance
}


fun jobCondition(block : JobCondition.() -> Unit = {}): JobCondition {
  val instance = JobCondition()
  instance.block()
  return instance
}


fun jobList(block : JobList.() -> Unit = {}): JobList {
  val instance = JobList()
  instance.block()
  return instance
}


fun jobSpec(block : JobSpec.() -> Unit = {}): JobSpec {
  val instance = JobSpec()
  instance.block()
  return instance
}


fun jobStatus(block : JobStatus.() -> Unit = {}): JobStatus {
  val instance = JobStatus()
  instance.block()
  return instance
}


fun jobTemplateSpec(block : JobTemplateSpec.() -> Unit = {}): JobTemplateSpec {
  val instance = JobTemplateSpec()
  instance.block()
  return instance
}


fun keyToPath(block : KeyToPath.() -> Unit = {}): KeyToPath {
  val instance = KeyToPath()
  instance.block()
  return instance
}


fun kubernetesList(block : KubernetesList.() -> Unit = {}): KubernetesList {
  val instance = KubernetesList()
  instance.block()
  return instance
}


fun labelSelector(block : LabelSelector.() -> Unit = {}): LabelSelector {
  val instance = LabelSelector()
  instance.block()
  return instance
}


fun labelSelectorRequirement(block : LabelSelectorRequirement.() -> Unit = {}): LabelSelectorRequirement {
  val instance = LabelSelectorRequirement()
  instance.block()
  return instance
}


fun lifecycle(block : Lifecycle.() -> Unit = {}): Lifecycle {
  val instance = Lifecycle()
  instance.block()
  return instance
}


fun limitRange(block : LimitRange.() -> Unit = {}): LimitRange {
  val instance = LimitRange()
  instance.block()
  return instance
}


fun limitRangeItem(block : LimitRangeItem.() -> Unit = {}): LimitRangeItem {
  val instance = LimitRangeItem()
  instance.block()
  return instance
}


fun limitRangeList(block : LimitRangeList.() -> Unit = {}): LimitRangeList {
  val instance = LimitRangeList()
  instance.block()
  return instance
}


fun limitRangeSpec(block : LimitRangeSpec.() -> Unit = {}): LimitRangeSpec {
  val instance = LimitRangeSpec()
  instance.block()
  return instance
}


fun listMeta(block : ListMeta.() -> Unit = {}): ListMeta {
  val instance = ListMeta()
  instance.block()
  return instance
}


fun loadBalancerIngress(block : LoadBalancerIngress.() -> Unit = {}): LoadBalancerIngress {
  val instance = LoadBalancerIngress()
  instance.block()
  return instance
}


fun loadBalancerStatus(block : LoadBalancerStatus.() -> Unit = {}): LoadBalancerStatus {
  val instance = LoadBalancerStatus()
  instance.block()
  return instance
}


fun localObjectReference(block : LocalObjectReference.() -> Unit = {}): LocalObjectReference {
  val instance = LocalObjectReference()
  instance.block()
  return instance
}


fun localVolumeSource(block : LocalVolumeSource.() -> Unit = {}): LocalVolumeSource {
  val instance = LocalVolumeSource()
  instance.block()
  return instance
}


fun nfsVolumeSource(block : NFSVolumeSource.() -> Unit = {}): NFSVolumeSource {
  val instance = NFSVolumeSource()
  instance.block()
  return instance
}


fun namedAuthInfo(block : NamedAuthInfo.() -> Unit = {}): NamedAuthInfo {
  val instance = NamedAuthInfo()
  instance.block()
  return instance
}


fun namedCluster(block : NamedCluster.() -> Unit = {}): NamedCluster {
  val instance = NamedCluster()
  instance.block()
  return instance
}


fun namedContext(block : NamedContext.() -> Unit = {}): NamedContext {
  val instance = NamedContext()
  instance.block()
  return instance
}


fun namedExtension(block : NamedExtension.() -> Unit = {}): NamedExtension {
  val instance = NamedExtension()
  instance.block()
  return instance
}


fun namespace(block : Namespace.() -> Unit = {}): Namespace {
  val instance = Namespace()
  instance.block()
  return instance
}


fun namespaceList(block : NamespaceList.() -> Unit = {}): NamespaceList {
  val instance = NamespaceList()
  instance.block()
  return instance
}


fun namespaceSpec(block : NamespaceSpec.() -> Unit = {}): NamespaceSpec {
  val instance = NamespaceSpec()
  instance.block()
  return instance
}


fun namespaceStatus(block : NamespaceStatus.() -> Unit = {}): NamespaceStatus {
  val instance = NamespaceStatus()
  instance.block()
  return instance
}


fun node(block : Node.() -> Unit = {}): Node {
  val instance = Node()
  instance.block()
  return instance
}


fun nodeAddress(block : NodeAddress.() -> Unit = {}): NodeAddress {
  val instance = NodeAddress()
  instance.block()
  return instance
}


fun nodeAffinity(block : NodeAffinity.() -> Unit = {}): NodeAffinity {
  val instance = NodeAffinity()
  instance.block()
  return instance
}


fun nodeCondition(block : NodeCondition.() -> Unit = {}): NodeCondition {
  val instance = NodeCondition()
  instance.block()
  return instance
}


fun nodeDaemonEndpoints(block : NodeDaemonEndpoints.() -> Unit = {}): NodeDaemonEndpoints {
  val instance = NodeDaemonEndpoints()
  instance.block()
  return instance
}


fun nodeList(block : NodeList.() -> Unit = {}): NodeList {
  val instance = NodeList()
  instance.block()
  return instance
}


fun nodeSelector(block : NodeSelector.() -> Unit = {}): NodeSelector {
  val instance = NodeSelector()
  instance.block()
  return instance
}


fun nodeSelectorRequirement(block : NodeSelectorRequirement.() -> Unit = {}): NodeSelectorRequirement {
  val instance = NodeSelectorRequirement()
  instance.block()
  return instance
}


fun nodeSelectorTerm(block : NodeSelectorTerm.() -> Unit = {}): NodeSelectorTerm {
  val instance = NodeSelectorTerm()
  instance.block()
  return instance
}


fun nodeSpec(block : NodeSpec.() -> Unit = {}): NodeSpec {
  val instance = NodeSpec()
  instance.block()
  return instance
}


fun nodeStatus(block : NodeStatus.() -> Unit = {}): NodeStatus {
  val instance = NodeStatus()
  instance.block()
  return instance
}


fun nodeSystemInfo(block : NodeSystemInfo.() -> Unit = {}): NodeSystemInfo {
  val instance = NodeSystemInfo()
  instance.block()
  return instance
}


fun objectFieldSelector(block : ObjectFieldSelector.() -> Unit = {}): ObjectFieldSelector {
  val instance = ObjectFieldSelector()
  instance.block()
  return instance
}


fun objectMeta(block : ObjectMeta.() -> Unit = {}): ObjectMeta {
  val instance = ObjectMeta()
  instance.block()
  return instance
}


fun objectReference(block : ObjectReference.() -> Unit = {}): ObjectReference {
  val instance = ObjectReference()
  instance.block()
  return instance
}


fun ownerReference(block : OwnerReference.() -> Unit = {}): OwnerReference {
  val instance = OwnerReference()
  instance.block()
  return instance
}


fun patch(block : Patch.() -> Unit = {}): Patch {
  val instance = Patch()
  instance.block()
  return instance
}


fun persistentVolume(block : PersistentVolume.() -> Unit = {}): PersistentVolume {
  val instance = PersistentVolume()
  instance.block()
  return instance
}


fun persistentVolumeClaim(block : PersistentVolumeClaim.() -> Unit = {}): PersistentVolumeClaim {
  val instance = PersistentVolumeClaim()
  instance.block()
  return instance
}


fun persistentVolumeClaimList(block : PersistentVolumeClaimList.() -> Unit = {}): PersistentVolumeClaimList {
  val instance = PersistentVolumeClaimList()
  instance.block()
  return instance
}


fun persistentVolumeClaimSpec(block : PersistentVolumeClaimSpec.() -> Unit = {}): PersistentVolumeClaimSpec {
  val instance = PersistentVolumeClaimSpec()
  instance.block()
  return instance
}


fun persistentVolumeClaimStatus(block : PersistentVolumeClaimStatus.() -> Unit = {}): PersistentVolumeClaimStatus {
  val instance = PersistentVolumeClaimStatus()
  instance.block()
  return instance
}


fun persistentVolumeClaimVolumeSource(block : PersistentVolumeClaimVolumeSource.() -> Unit = {}): PersistentVolumeClaimVolumeSource {
  val instance = PersistentVolumeClaimVolumeSource()
  instance.block()
  return instance
}


fun persistentVolumeList(block : PersistentVolumeList.() -> Unit = {}): PersistentVolumeList {
  val instance = PersistentVolumeList()
  instance.block()
  return instance
}


fun persistentVolumeSpec(block : PersistentVolumeSpec.() -> Unit = {}): PersistentVolumeSpec {
  val instance = PersistentVolumeSpec()
  instance.block()
  return instance
}


fun persistentVolumeStatus(block : PersistentVolumeStatus.() -> Unit = {}): PersistentVolumeStatus {
  val instance = PersistentVolumeStatus()
  instance.block()
  return instance
}


fun photonPersistentDiskVolumeSource(block : PhotonPersistentDiskVolumeSource.() -> Unit = {}): PhotonPersistentDiskVolumeSource {
  val instance = PhotonPersistentDiskVolumeSource()
  instance.block()
  return instance
}


fun pod(block : Pod.() -> Unit = {}): Pod {
  val instance = Pod()
  instance.block()
  return instance
}


fun podAffinity(block : PodAffinity.() -> Unit = {}): PodAffinity {
  val instance = PodAffinity()
  instance.block()
  return instance
}


fun podAffinityTerm(block : PodAffinityTerm.() -> Unit = {}): PodAffinityTerm {
  val instance = PodAffinityTerm()
  instance.block()
  return instance
}


fun podAntiAffinity(block : PodAntiAffinity.() -> Unit = {}): PodAntiAffinity {
  val instance = PodAntiAffinity()
  instance.block()
  return instance
}


fun podCondition(block : PodCondition.() -> Unit = {}): PodCondition {
  val instance = PodCondition()
  instance.block()
  return instance
}


fun podList(block : PodList.() -> Unit = {}): PodList {
  val instance = PodList()
  instance.block()
  return instance
}


fun podSecurityContext(block : PodSecurityContext.() -> Unit = {}): PodSecurityContext {
  val instance = PodSecurityContext()
  instance.block()
  return instance
}


fun podSpec(block : PodSpec.() -> Unit = {}): PodSpec {
  val instance = PodSpec()
  instance.block()
  return instance
}


fun podStatus(block : PodStatus.() -> Unit = {}): PodStatus {
  val instance = PodStatus()
  instance.block()
  return instance
}


fun podTemplate(block : PodTemplate.() -> Unit = {}): PodTemplate {
  val instance = PodTemplate()
  instance.block()
  return instance
}


fun podTemplateList(block : PodTemplateList.() -> Unit = {}): PodTemplateList {
  val instance = PodTemplateList()
  instance.block()
  return instance
}


fun podTemplateSpec(block : PodTemplateSpec.() -> Unit = {}): PodTemplateSpec {
  val instance = PodTemplateSpec()
  instance.block()
  return instance
}


fun portworxVolumeSource(block : PortworxVolumeSource.() -> Unit = {}): PortworxVolumeSource {
  val instance = PortworxVolumeSource()
  instance.block()
  return instance
}


fun preconditions(block : Preconditions.() -> Unit = {}): Preconditions {
  val instance = Preconditions()
  instance.block()
  return instance
}


fun preferences(block : Preferences.() -> Unit = {}): Preferences {
  val instance = Preferences()
  instance.block()
  return instance
}


fun preferredSchedulingTerm(block : PreferredSchedulingTerm.() -> Unit = {}): PreferredSchedulingTerm {
  val instance = PreferredSchedulingTerm()
  instance.block()
  return instance
}


fun probe(block : Probe.() -> Unit = {}): Probe {
  val instance = Probe()
  instance.block()
  return instance
}


fun projectedVolumeSource(block : ProjectedVolumeSource.() -> Unit = {}): ProjectedVolumeSource {
  val instance = ProjectedVolumeSource()
  instance.block()
  return instance
}


fun quobyteVolumeSource(block : QuobyteVolumeSource.() -> Unit = {}): QuobyteVolumeSource {
  val instance = QuobyteVolumeSource()
  instance.block()
  return instance
}


fun rbdVolumeSource(block : RBDVolumeSource.() -> Unit = {}): RBDVolumeSource {
  val instance = RBDVolumeSource()
  instance.block()
  return instance
}


fun replicationController(block : ReplicationController.() -> Unit = {}): ReplicationController {
  val instance = ReplicationController()
  instance.block()
  return instance
}


fun replicationControllerCondition(block : ReplicationControllerCondition.() -> Unit = {}): ReplicationControllerCondition {
  val instance = ReplicationControllerCondition()
  instance.block()
  return instance
}


fun replicationControllerList(block : ReplicationControllerList.() -> Unit = {}): ReplicationControllerList {
  val instance = ReplicationControllerList()
  instance.block()
  return instance
}


fun replicationControllerSpec(block : ReplicationControllerSpec.() -> Unit = {}): ReplicationControllerSpec {
  val instance = ReplicationControllerSpec()
  instance.block()
  return instance
}


fun replicationControllerStatus(block : ReplicationControllerStatus.() -> Unit = {}): ReplicationControllerStatus {
  val instance = ReplicationControllerStatus()
  instance.block()
  return instance
}


fun resourceFieldSelector(block : ResourceFieldSelector.() -> Unit = {}): ResourceFieldSelector {
  val instance = ResourceFieldSelector()
  instance.block()
  return instance
}


fun resourceQuota(block : ResourceQuota.() -> Unit = {}): ResourceQuota {
  val instance = ResourceQuota()
  instance.block()
  return instance
}


fun resourceQuotaList(block : ResourceQuotaList.() -> Unit = {}): ResourceQuotaList {
  val instance = ResourceQuotaList()
  instance.block()
  return instance
}


fun resourceQuotaSpec(block : ResourceQuotaSpec.() -> Unit = {}): ResourceQuotaSpec {
  val instance = ResourceQuotaSpec()
  instance.block()
  return instance
}


fun resourceQuotaStatus(block : ResourceQuotaStatus.() -> Unit = {}): ResourceQuotaStatus {
  val instance = ResourceQuotaStatus()
  instance.block()
  return instance
}


fun resourceRequirements(block : ResourceRequirements.() -> Unit = {}): ResourceRequirements {
  val instance = ResourceRequirements()
  instance.block()
  return instance
}


fun rootPaths(block : RootPaths.() -> Unit = {}): RootPaths {
  val instance = RootPaths()
  instance.block()
  return instance
}


fun seLinuxOptions(block : SELinuxOptions.() -> Unit = {}): SELinuxOptions {
  val instance = SELinuxOptions()
  instance.block()
  return instance
}


fun scaleIOVolumeSource(block : ScaleIOVolumeSource.() -> Unit = {}): ScaleIOVolumeSource {
  val instance = ScaleIOVolumeSource()
  instance.block()
  return instance
}


fun secret(block : Secret.() -> Unit = {}): Secret {
  val instance = Secret()
  instance.block()
  return instance
}


fun secretEnvSource(block : SecretEnvSource.() -> Unit = {}): SecretEnvSource {
  val instance = SecretEnvSource()
  instance.block()
  return instance
}


fun secretKeySelector(block : SecretKeySelector.() -> Unit = {}): SecretKeySelector {
  val instance = SecretKeySelector()
  instance.block()
  return instance
}


fun secretList(block : SecretList.() -> Unit = {}): SecretList {
  val instance = SecretList()
  instance.block()
  return instance
}


fun secretProjection(block : SecretProjection.() -> Unit = {}): SecretProjection {
  val instance = SecretProjection()
  instance.block()
  return instance
}


fun secretVolumeSource(block : SecretVolumeSource.() -> Unit = {}): SecretVolumeSource {
  val instance = SecretVolumeSource()
  instance.block()
  return instance
}


fun securityContext(block : SecurityContext.() -> Unit = {}): SecurityContext {
  val instance = SecurityContext()
  instance.block()
  return instance
}


fun service(block : Service.() -> Unit = {}): Service {
  val instance = Service()
  instance.block()
  return instance
}


fun serviceAccount(block : ServiceAccount.() -> Unit = {}): ServiceAccount {
  val instance = ServiceAccount()
  instance.block()
  return instance
}


fun serviceAccountList(block : ServiceAccountList.() -> Unit = {}): ServiceAccountList {
  val instance = ServiceAccountList()
  instance.block()
  return instance
}


fun serviceList(block : ServiceList.() -> Unit = {}): ServiceList {
  val instance = ServiceList()
  instance.block()
  return instance
}


fun servicePort(block : ServicePort.() -> Unit = {}): ServicePort {
  val instance = ServicePort()
  instance.block()
  return instance
}


fun serviceSpec(block : ServiceSpec.() -> Unit = {}): ServiceSpec {
  val instance = ServiceSpec()
  instance.block()
  return instance
}


fun serviceStatus(block : ServiceStatus.() -> Unit = {}): ServiceStatus {
  val instance = ServiceStatus()
  instance.block()
  return instance
}


fun status(block : Status.() -> Unit = {}): Status {
  val instance = Status()
  instance.block()
  return instance
}


fun statusCause(block : StatusCause.() -> Unit = {}): StatusCause {
  val instance = StatusCause()
  instance.block()
  return instance
}


fun statusDetails(block : StatusDetails.() -> Unit = {}): StatusDetails {
  val instance = StatusDetails()
  instance.block()
  return instance
}


fun storageClass(block : StorageClass.() -> Unit = {}): StorageClass {
  val instance = StorageClass()
  instance.block()
  return instance
}


fun storageClassList(block : StorageClassList.() -> Unit = {}): StorageClassList {
  val instance = StorageClassList()
  instance.block()
  return instance
}


fun storageOSPersistentVolumeSource(block : StorageOSPersistentVolumeSource.() -> Unit = {}): StorageOSPersistentVolumeSource {
  val instance = StorageOSPersistentVolumeSource()
  instance.block()
  return instance
}


fun storageOSVolumeSource(block : StorageOSVolumeSource.() -> Unit = {}): StorageOSVolumeSource {
  val instance = StorageOSVolumeSource()
  instance.block()
  return instance
}


fun tcpSocketAction(block : TCPSocketAction.() -> Unit = {}): TCPSocketAction {
  val instance = TCPSocketAction()
  instance.block()
  return instance
}


fun taint(block : Taint.() -> Unit = {}): Taint {
  val instance = Taint()
  instance.block()
  return instance
}


fun toleration(block : Toleration.() -> Unit = {}): Toleration {
  val instance = Toleration()
  instance.block()
  return instance
}


fun volume(block : Volume.() -> Unit = {}): Volume {
  val instance = Volume()
  instance.block()
  return instance
}


fun volumeMount(block : VolumeMount.() -> Unit = {}): VolumeMount {
  val instance = VolumeMount()
  instance.block()
  return instance
}


fun volumeProjection(block : VolumeProjection.() -> Unit = {}): VolumeProjection {
  val instance = VolumeProjection()
  instance.block()
  return instance
}


fun vsphereVirtualDiskVolumeSource(block : VsphereVirtualDiskVolumeSource.() -> Unit = {}): VsphereVirtualDiskVolumeSource {
  val instance = VsphereVirtualDiskVolumeSource()
  instance.block()
  return instance
}


fun watchEvent(block : WatchEvent.() -> Unit = {}): WatchEvent {
  val instance = WatchEvent()
  instance.block()
  return instance
}


fun weightedPodAffinityTerm(block : WeightedPodAffinityTerm.() -> Unit = {}): WeightedPodAffinityTerm {
  val instance = WeightedPodAffinityTerm()
  instance.block()
  return instance
}


fun customResourceDefinition(block : CustomResourceDefinition.() -> Unit = {}): CustomResourceDefinition {
  val instance = CustomResourceDefinition()
  instance.block()
  return instance
}


fun customResourceDefinitionCondition(block : CustomResourceDefinitionCondition.() -> Unit = {}): CustomResourceDefinitionCondition {
  val instance = CustomResourceDefinitionCondition()
  instance.block()
  return instance
}


fun customResourceDefinitionList(block : CustomResourceDefinitionList.() -> Unit = {}): CustomResourceDefinitionList {
  val instance = CustomResourceDefinitionList()
  instance.block()
  return instance
}


fun customResourceDefinitionNames(block : CustomResourceDefinitionNames.() -> Unit = {}): CustomResourceDefinitionNames {
  val instance = CustomResourceDefinitionNames()
  instance.block()
  return instance
}


fun customResourceDefinitionSpec(block : CustomResourceDefinitionSpec.() -> Unit = {}): CustomResourceDefinitionSpec {
  val instance = CustomResourceDefinitionSpec()
  instance.block()
  return instance
}


fun customResourceDefinitionStatus(block : CustomResourceDefinitionStatus.() -> Unit = {}): CustomResourceDefinitionStatus {
  val instance = CustomResourceDefinitionStatus()
  instance.block()
  return instance
}


fun tokenReview(block : TokenReview.() -> Unit = {}): TokenReview {
  val instance = TokenReview()
  instance.block()
  return instance
}


fun tokenReviewSpec(block : TokenReviewSpec.() -> Unit = {}): TokenReviewSpec {
  val instance = TokenReviewSpec()
  instance.block()
  return instance
}


fun tokenReviewStatus(block : TokenReviewStatus.() -> Unit = {}): TokenReviewStatus {
  val instance = TokenReviewStatus()
  instance.block()
  return instance
}


fun userInfo(block : UserInfo.() -> Unit = {}): UserInfo {
  val instance = UserInfo()
  instance.block()
  return instance
}


fun localSubjectAccessReview(block : LocalSubjectAccessReview.() -> Unit = {}): LocalSubjectAccessReview {
  val instance = LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun nonResourceAttributes(block : NonResourceAttributes.() -> Unit = {}): NonResourceAttributes {
  val instance = NonResourceAttributes()
  instance.block()
  return instance
}


fun resourceAttributes(block : ResourceAttributes.() -> Unit = {}): ResourceAttributes {
  val instance = ResourceAttributes()
  instance.block()
  return instance
}


fun subjectAccessReview(block : SubjectAccessReview.() -> Unit = {}): SubjectAccessReview {
  val instance = SubjectAccessReview()
  instance.block()
  return instance
}


fun subjectAccessReviewSpec(block : SubjectAccessReviewSpec.() -> Unit = {}): SubjectAccessReviewSpec {
  val instance = SubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun subjectAccessReviewStatus(block : SubjectAccessReviewStatus.() -> Unit = {}): SubjectAccessReviewStatus {
  val instance = SubjectAccessReviewStatus()
  instance.block()
  return instance
}


fun apiVersion(block : APIVersion.() -> Unit = {}): APIVersion {
  val instance = APIVersion()
  instance.block()
  return instance
}


fun daemonSet(block : DaemonSet.() -> Unit = {}): DaemonSet {
  val instance = DaemonSet()
  instance.block()
  return instance
}


fun daemonSetList(block : DaemonSetList.() -> Unit = {}): DaemonSetList {
  val instance = DaemonSetList()
  instance.block()
  return instance
}


fun daemonSetSpec(block : DaemonSetSpec.() -> Unit = {}): DaemonSetSpec {
  val instance = DaemonSetSpec()
  instance.block()
  return instance
}


fun daemonSetStatus(block : DaemonSetStatus.() -> Unit = {}): DaemonSetStatus {
  val instance = DaemonSetStatus()
  instance.block()
  return instance
}


fun daemonSetUpdateStrategy(block : DaemonSetUpdateStrategy.() -> Unit = {}): DaemonSetUpdateStrategy {
  val instance = DaemonSetUpdateStrategy()
  instance.block()
  return instance
}


fun deployment(block : Deployment.() -> Unit = {}): Deployment {
  val instance = Deployment()
  instance.block()
  return instance
}


fun deploymentCondition(block : DeploymentCondition.() -> Unit = {}): DeploymentCondition {
  val instance = DeploymentCondition()
  instance.block()
  return instance
}


fun deploymentList(block : DeploymentList.() -> Unit = {}): DeploymentList {
  val instance = DeploymentList()
  instance.block()
  return instance
}


fun deploymentRollback(block : DeploymentRollback.() -> Unit = {}): DeploymentRollback {
  val instance = DeploymentRollback()
  instance.block()
  return instance
}


fun deploymentSpec(block : DeploymentSpec.() -> Unit = {}): DeploymentSpec {
  val instance = DeploymentSpec()
  instance.block()
  return instance
}


fun deploymentStatus(block : DeploymentStatus.() -> Unit = {}): DeploymentStatus {
  val instance = DeploymentStatus()
  instance.block()
  return instance
}


fun deploymentStrategy(block : DeploymentStrategy.() -> Unit = {}): DeploymentStrategy {
  val instance = DeploymentStrategy()
  instance.block()
  return instance
}


fun fsGroupStrategyOptions(block : FSGroupStrategyOptions.() -> Unit = {}): FSGroupStrategyOptions {
  val instance = FSGroupStrategyOptions()
  instance.block()
  return instance
}


fun httpIngressPath(block : HTTPIngressPath.() -> Unit = {}): HTTPIngressPath {
  val instance = HTTPIngressPath()
  instance.block()
  return instance
}


fun httpIngressRuleValue(block : HTTPIngressRuleValue.() -> Unit = {}): HTTPIngressRuleValue {
  val instance = HTTPIngressRuleValue()
  instance.block()
  return instance
}


fun hostPortRange(block : HostPortRange.() -> Unit = {}): HostPortRange {
  val instance = HostPortRange()
  instance.block()
  return instance
}


fun idRange(block : IDRange.() -> Unit = {}): IDRange {
  val instance = IDRange()
  instance.block()
  return instance
}


fun ingress(block : Ingress.() -> Unit = {}): Ingress {
  val instance = Ingress()
  instance.block()
  return instance
}


fun ingressBackend(block : IngressBackend.() -> Unit = {}): IngressBackend {
  val instance = IngressBackend()
  instance.block()
  return instance
}


fun ingressList(block : IngressList.() -> Unit = {}): IngressList {
  val instance = IngressList()
  instance.block()
  return instance
}


fun ingressRule(block : IngressRule.() -> Unit = {}): IngressRule {
  val instance = IngressRule()
  instance.block()
  return instance
}


fun ingressSpec(block : IngressSpec.() -> Unit = {}): IngressSpec {
  val instance = IngressSpec()
  instance.block()
  return instance
}


fun ingressStatus(block : IngressStatus.() -> Unit = {}): IngressStatus {
  val instance = IngressStatus()
  instance.block()
  return instance
}


fun ingressTLS(block : IngressTLS.() -> Unit = {}): IngressTLS {
  val instance = IngressTLS()
  instance.block()
  return instance
}


fun kubernetesRunAsUserStrategyOptions(block : KubernetesRunAsUserStrategyOptions.() -> Unit = {}): KubernetesRunAsUserStrategyOptions {
  val instance = KubernetesRunAsUserStrategyOptions()
  instance.block()
  return instance
}


fun networkPolicy(block : NetworkPolicy.() -> Unit = {}): NetworkPolicy {
  val instance = NetworkPolicy()
  instance.block()
  return instance
}


fun networkPolicyIngressRule(block : NetworkPolicyIngressRule.() -> Unit = {}): NetworkPolicyIngressRule {
  val instance = NetworkPolicyIngressRule()
  instance.block()
  return instance
}


fun networkPolicyList(block : NetworkPolicyList.() -> Unit = {}): NetworkPolicyList {
  val instance = NetworkPolicyList()
  instance.block()
  return instance
}


fun networkPolicyPeer(block : NetworkPolicyPeer.() -> Unit = {}): NetworkPolicyPeer {
  val instance = NetworkPolicyPeer()
  instance.block()
  return instance
}


fun networkPolicyPort(block : NetworkPolicyPort.() -> Unit = {}): NetworkPolicyPort {
  val instance = NetworkPolicyPort()
  instance.block()
  return instance
}


fun networkPolicySpec(block : NetworkPolicySpec.() -> Unit = {}): NetworkPolicySpec {
  val instance = NetworkPolicySpec()
  instance.block()
  return instance
}


fun podSecurityPolicy(block : PodSecurityPolicy.() -> Unit = {}): PodSecurityPolicy {
  val instance = PodSecurityPolicy()
  instance.block()
  return instance
}


fun podSecurityPolicyList(block : PodSecurityPolicyList.() -> Unit = {}): PodSecurityPolicyList {
  val instance = PodSecurityPolicyList()
  instance.block()
  return instance
}


fun podSecurityPolicySpec(block : PodSecurityPolicySpec.() -> Unit = {}): PodSecurityPolicySpec {
  val instance = PodSecurityPolicySpec()
  instance.block()
  return instance
}


fun replicaSet(block : ReplicaSet.() -> Unit = {}): ReplicaSet {
  val instance = ReplicaSet()
  instance.block()
  return instance
}


fun replicaSetCondition(block : ReplicaSetCondition.() -> Unit = {}): ReplicaSetCondition {
  val instance = ReplicaSetCondition()
  instance.block()
  return instance
}


fun replicaSetList(block : ReplicaSetList.() -> Unit = {}): ReplicaSetList {
  val instance = ReplicaSetList()
  instance.block()
  return instance
}


fun replicaSetSpec(block : ReplicaSetSpec.() -> Unit = {}): ReplicaSetSpec {
  val instance = ReplicaSetSpec()
  instance.block()
  return instance
}


fun replicaSetStatus(block : ReplicaSetStatus.() -> Unit = {}): ReplicaSetStatus {
  val instance = ReplicaSetStatus()
  instance.block()
  return instance
}


fun rollbackConfig(block : RollbackConfig.() -> Unit = {}): RollbackConfig {
  val instance = RollbackConfig()
  instance.block()
  return instance
}


fun rollingUpdateDaemonSet(block : RollingUpdateDaemonSet.() -> Unit = {}): RollingUpdateDaemonSet {
  val instance = RollingUpdateDaemonSet()
  instance.block()
  return instance
}


fun rollingUpdateDeployment(block : RollingUpdateDeployment.() -> Unit = {}): RollingUpdateDeployment {
  val instance = RollingUpdateDeployment()
  instance.block()
  return instance
}


fun rollingUpdateStatefulSetStrategy(block : RollingUpdateStatefulSetStrategy.() -> Unit = {}): RollingUpdateStatefulSetStrategy {
  val instance = RollingUpdateStatefulSetStrategy()
  instance.block()
  return instance
}


fun seLinuxStrategyOptions(block : SELinuxStrategyOptions.() -> Unit = {}): SELinuxStrategyOptions {
  val instance = SELinuxStrategyOptions()
  instance.block()
  return instance
}


fun scale(block : Scale.() -> Unit = {}): Scale {
  val instance = Scale()
  instance.block()
  return instance
}


fun scaleSpec(block : ScaleSpec.() -> Unit = {}): ScaleSpec {
  val instance = ScaleSpec()
  instance.block()
  return instance
}


fun scaleStatus(block : ScaleStatus.() -> Unit = {}): ScaleStatus {
  val instance = ScaleStatus()
  instance.block()
  return instance
}


fun statefulSet(block : StatefulSet.() -> Unit = {}): StatefulSet {
  val instance = StatefulSet()
  instance.block()
  return instance
}


fun statefulSetList(block : StatefulSetList.() -> Unit = {}): StatefulSetList {
  val instance = StatefulSetList()
  instance.block()
  return instance
}


fun statefulSetSpec(block : StatefulSetSpec.() -> Unit = {}): StatefulSetSpec {
  val instance = StatefulSetSpec()
  instance.block()
  return instance
}


fun statefulSetStatus(block : StatefulSetStatus.() -> Unit = {}): StatefulSetStatus {
  val instance = StatefulSetStatus()
  instance.block()
  return instance
}


fun statefulSetUpdateStrategy(block : StatefulSetUpdateStrategy.() -> Unit = {}): StatefulSetUpdateStrategy {
  val instance = StatefulSetUpdateStrategy()
  instance.block()
  return instance
}


fun supplementalGroupsStrategyOptions(block : SupplementalGroupsStrategyOptions.() -> Unit = {}): SupplementalGroupsStrategyOptions {
  val instance = SupplementalGroupsStrategyOptions()
  instance.block()
  return instance
}


fun thirdPartyResource(block : ThirdPartyResource.() -> Unit = {}): ThirdPartyResource {
  val instance = ThirdPartyResource()
  instance.block()
  return instance
}


fun thirdPartyResourceList(block : ThirdPartyResourceList.() -> Unit = {}): ThirdPartyResourceList {
  val instance = ThirdPartyResourceList()
  instance.block()
  return instance
}


fun podDisruptionBudget(block : PodDisruptionBudget.() -> Unit = {}): PodDisruptionBudget {
  val instance = PodDisruptionBudget()
  instance.block()
  return instance
}


fun podDisruptionBudgetList(block : PodDisruptionBudgetList.() -> Unit = {}): PodDisruptionBudgetList {
  val instance = PodDisruptionBudgetList()
  instance.block()
  return instance
}


fun podDisruptionBudgetSpec(block : PodDisruptionBudgetSpec.() -> Unit = {}): PodDisruptionBudgetSpec {
  val instance = PodDisruptionBudgetSpec()
  instance.block()
  return instance
}


fun podDisruptionBudgetStatus(block : PodDisruptionBudgetStatus.() -> Unit = {}): PodDisruptionBudgetStatus {
  val instance = PodDisruptionBudgetStatus()
  instance.block()
  return instance
}


// GENERATE
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.BaseKubernetesList
import io.fabric8.kubernetes.api.model.Binding
import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.ComponentStatus
import io.fabric8.kubernetes.api.model.ComponentStatusList
import io.fabric8.kubernetes.api.model.Config
import io.fabric8.kubernetes.api.model.ConfigMap
import io.fabric8.kubernetes.api.model.ConfigMapList
import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus
import io.fabric8.kubernetes.api.model.CronJob
import io.fabric8.kubernetes.api.model.CronJobList
import io.fabric8.kubernetes.api.model.CronJobSpec
import io.fabric8.kubernetes.api.model.DeleteOptions
import io.fabric8.kubernetes.api.model.DeprecatedDownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.EndpointAddress
import io.fabric8.kubernetes.api.model.Endpoints
import io.fabric8.kubernetes.api.model.EndpointsList
import io.fabric8.kubernetes.api.model.EnvVar
import io.fabric8.kubernetes.api.model.EnvVarSource
import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.EventList
import io.fabric8.kubernetes.api.model.FlexVolumeSource
import io.fabric8.kubernetes.api.model.HTTPGetAction
import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Job
import io.fabric8.kubernetes.api.model.JobList
import io.fabric8.kubernetes.api.model.JobSpec
import io.fabric8.kubernetes.api.model.JobTemplateSpec
import io.fabric8.kubernetes.api.model.Lifecycle
import io.fabric8.kubernetes.api.model.LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeList
import io.fabric8.kubernetes.api.model.NamedAuthInfo
import io.fabric8.kubernetes.api.model.NamedCluster
import io.fabric8.kubernetes.api.model.NamedContext
import io.fabric8.kubernetes.api.model.NamedExtension
import io.fabric8.kubernetes.api.model.Namespace
import io.fabric8.kubernetes.api.model.NamespaceList
import io.fabric8.kubernetes.api.model.Node
import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints
import io.fabric8.kubernetes.api.model.NodeList
import io.fabric8.kubernetes.api.model.NodeStatus
import io.fabric8.kubernetes.api.model.PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimList
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeList
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Pod
import io.fabric8.kubernetes.api.model.PodList
import io.fabric8.kubernetes.api.model.PodSecurityContext
import io.fabric8.kubernetes.api.model.PodSpec
import io.fabric8.kubernetes.api.model.PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateList
import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.kubernetes.api.model.Probe
import io.fabric8.kubernetes.api.model.RBDVolumeSource
import io.fabric8.kubernetes.api.model.ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerList
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec
import io.fabric8.kubernetes.api.model.ResourceFieldSelector
import io.fabric8.kubernetes.api.model.ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaList
import io.fabric8.kubernetes.api.model.SELinuxContextStrategyOptions
import io.fabric8.kubernetes.api.model.Secret
import io.fabric8.kubernetes.api.model.SecretList
import io.fabric8.kubernetes.api.model.SecurityContext
import io.fabric8.kubernetes.api.model.SecurityContextConstraints
import io.fabric8.kubernetes.api.model.SecurityContextConstraintsList
import io.fabric8.kubernetes.api.model.Service
import io.fabric8.kubernetes.api.model.ServiceAccount
import io.fabric8.kubernetes.api.model.ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceList
import io.fabric8.kubernetes.api.model.ServicePort
import io.fabric8.kubernetes.api.model.ServiceStatus
import io.fabric8.kubernetes.api.model.Status
import io.fabric8.kubernetes.api.model.TCPSocketAction
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.WatchEvent
import io.fabric8.kubernetes.api.model.extensions.DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetList
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentList
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.extensions.Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressBackend
import io.fabric8.kubernetes.api.model.extensions.IngressList
import io.fabric8.kubernetes.api.model.extensions.IngressRule
import io.fabric8.kubernetes.api.model.extensions.IngressSpec
import io.fabric8.kubernetes.api.model.extensions.IngressStatus
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetList
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.StatefulSet
import io.fabric8.kubernetes.api.model.extensions.StatefulSetList
import io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResourceList


fun authInfo(block : AuthInfo.() -> Unit = {}): AuthInfo {
  val instance = AuthInfo()
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


fun cephFSVolumeSource(block : CephFSVolumeSource.() -> Unit = {}): CephFSVolumeSource {
  val instance = CephFSVolumeSource()
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


fun configMapList(block : ConfigMapList.() -> Unit = {}): ConfigMapList {
  val instance = ConfigMapList()
  instance.block()
  return instance
}


fun container(block : Container.() -> Unit = {}): Container {
  val instance = Container()
  instance.block()
  return instance
}


fun containerState(block : ContainerState.() -> Unit = {}): ContainerState {
  val instance = ContainerState()
  instance.block()
  return instance
}


fun containerStatus(block : ContainerStatus.() -> Unit = {}): ContainerStatus {
  val instance = ContainerStatus()
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


fun deleteOptions(block : DeleteOptions.() -> Unit = {}): DeleteOptions {
  val instance = DeleteOptions()
  instance.block()
  return instance
}


fun deprecatedDownwardAPIVolumeFile(block : DeprecatedDownwardAPIVolumeFile.() -> Unit = {}): DeprecatedDownwardAPIVolumeFile {
  val instance = DeprecatedDownwardAPIVolumeFile()
  instance.block()
  return instance
}


fun downwardAPIVolumeFile(block : DownwardAPIVolumeFile.() -> Unit = {}): DownwardAPIVolumeFile {
  val instance = DownwardAPIVolumeFile()
  instance.block()
  return instance
}


fun endpointAddress(block : EndpointAddress.() -> Unit = {}): EndpointAddress {
  val instance = EndpointAddress()
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


fun flexVolumeSource(block : FlexVolumeSource.() -> Unit = {}): FlexVolumeSource {
  val instance = FlexVolumeSource()
  instance.block()
  return instance
}


fun hTTPGetAction(block : HTTPGetAction.() -> Unit = {}): HTTPGetAction {
  val instance = HTTPGetAction()
  instance.block()
  return instance
}


fun handler(block : Handler.() -> Unit = {}): Handler {
  val instance = Handler()
  instance.block()
  return instance
}


fun job(block : Job.() -> Unit = {}): Job {
  val instance = Job()
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


fun jobTemplateSpec(block : JobTemplateSpec.() -> Unit = {}): JobTemplateSpec {
  val instance = JobTemplateSpec()
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


fun limitRangeList(block : LimitRangeList.() -> Unit = {}): LimitRangeList {
  val instance = LimitRangeList()
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


fun node(block : Node.() -> Unit = {}): Node {
  val instance = Node()
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


fun nodeStatus(block : NodeStatus.() -> Unit = {}): NodeStatus {
  val instance = NodeStatus()
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


fun pod(block : Pod.() -> Unit = {}): Pod {
  val instance = Pod()
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


fun probe(block : Probe.() -> Unit = {}): Probe {
  val instance = Probe()
  instance.block()
  return instance
}


fun rBDVolumeSource(block : RBDVolumeSource.() -> Unit = {}): RBDVolumeSource {
  val instance = RBDVolumeSource()
  instance.block()
  return instance
}


fun replicationController(block : ReplicationController.() -> Unit = {}): ReplicationController {
  val instance = ReplicationController()
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


fun sELinuxContextStrategyOptions(block : SELinuxContextStrategyOptions.() -> Unit = {}): SELinuxContextStrategyOptions {
  val instance = SELinuxContextStrategyOptions()
  instance.block()
  return instance
}


fun secret(block : Secret.() -> Unit = {}): Secret {
  val instance = Secret()
  instance.block()
  return instance
}


fun secretList(block : SecretList.() -> Unit = {}): SecretList {
  val instance = SecretList()
  instance.block()
  return instance
}


fun securityContext(block : SecurityContext.() -> Unit = {}): SecurityContext {
  val instance = SecurityContext()
  instance.block()
  return instance
}


fun securityContextConstraints(block : SecurityContextConstraints.() -> Unit = {}): SecurityContextConstraints {
  val instance = SecurityContextConstraints()
  instance.block()
  return instance
}


fun securityContextConstraintsList(block : SecurityContextConstraintsList.() -> Unit = {}): SecurityContextConstraintsList {
  val instance = SecurityContextConstraintsList()
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


fun tCPSocketAction(block : TCPSocketAction.() -> Unit = {}): TCPSocketAction {
  val instance = TCPSocketAction()
  instance.block()
  return instance
}


fun volume(block : Volume.() -> Unit = {}): Volume {
  val instance = Volume()
  instance.block()
  return instance
}


fun watchEvent(block : WatchEvent.() -> Unit = {}): WatchEvent {
  val instance = WatchEvent()
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


fun deployment(block : Deployment.() -> Unit = {}): Deployment {
  val instance = Deployment()
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


fun deploymentStrategy(block : DeploymentStrategy.() -> Unit = {}): DeploymentStrategy {
  val instance = DeploymentStrategy()
  instance.block()
  return instance
}


fun hTTPIngressPath(block : HTTPIngressPath.() -> Unit = {}): HTTPIngressPath {
  val instance = HTTPIngressPath()
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


fun replicaSet(block : ReplicaSet.() -> Unit = {}): ReplicaSet {
  val instance = ReplicaSet()
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


fun rollingUpdateDeployment(block : RollingUpdateDeployment.() -> Unit = {}): RollingUpdateDeployment {
  val instance = RollingUpdateDeployment()
  instance.block()
  return instance
}


fun scale(block : Scale.() -> Unit = {}): Scale {
  val instance = Scale()
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


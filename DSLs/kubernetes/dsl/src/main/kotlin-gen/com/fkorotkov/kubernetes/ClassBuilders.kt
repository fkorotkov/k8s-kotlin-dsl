// GENERATE
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.APIGroup as model_APIGroup
import io.fabric8.kubernetes.api.model.APIGroupList as model_APIGroupList
import io.fabric8.kubernetes.api.model.APIResource as model_APIResource
import io.fabric8.kubernetes.api.model.APIResourceList as model_APIResourceList
import io.fabric8.kubernetes.api.model.APIService as model_APIService
import io.fabric8.kubernetes.api.model.APIServiceCondition as model_APIServiceCondition
import io.fabric8.kubernetes.api.model.APIServiceList as model_APIServiceList
import io.fabric8.kubernetes.api.model.APIServiceSpec as model_APIServiceSpec
import io.fabric8.kubernetes.api.model.APIServiceStatus as model_APIServiceStatus
import io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource as model_AWSElasticBlockStoreVolumeSource
import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.AttachedVolume as model_AttachedVolume
import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.AuthProviderConfig as model_AuthProviderConfig
import io.fabric8.kubernetes.api.model.AzureDiskVolumeSource as model_AzureDiskVolumeSource
import io.fabric8.kubernetes.api.model.AzureFilePersistentVolumeSource as model_AzureFilePersistentVolumeSource
import io.fabric8.kubernetes.api.model.AzureFileVolumeSource as model_AzureFileVolumeSource
import io.fabric8.kubernetes.api.model.BaseKubernetesList as model_BaseKubernetesList
import io.fabric8.kubernetes.api.model.Binding as model_Binding
import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CSIVolumeSource as model_CSIVolumeSource
import io.fabric8.kubernetes.api.model.Capabilities as model_Capabilities
import io.fabric8.kubernetes.api.model.CephFSPersistentVolumeSource as model_CephFSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CephFSVolumeSource as model_CephFSVolumeSource
import io.fabric8.kubernetes.api.model.CinderPersistentVolumeSource as model_CinderPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CinderVolumeSource as model_CinderVolumeSource
import io.fabric8.kubernetes.api.model.ClientIPConfig as model_ClientIPConfig
import io.fabric8.kubernetes.api.model.Cluster as model_Cluster
import io.fabric8.kubernetes.api.model.ComponentCondition as model_ComponentCondition
import io.fabric8.kubernetes.api.model.ComponentStatus as model_ComponentStatus
import io.fabric8.kubernetes.api.model.ComponentStatusList as model_ComponentStatusList
import io.fabric8.kubernetes.api.model.Condition as model_Condition
import io.fabric8.kubernetes.api.model.Config as model_Config
import io.fabric8.kubernetes.api.model.ConfigMap as model_ConfigMap
import io.fabric8.kubernetes.api.model.ConfigMapEnvSource as model_ConfigMapEnvSource
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector as model_ConfigMapKeySelector
import io.fabric8.kubernetes.api.model.ConfigMapList as model_ConfigMapList
import io.fabric8.kubernetes.api.model.ConfigMapNodeConfigSource as model_ConfigMapNodeConfigSource
import io.fabric8.kubernetes.api.model.ConfigMapProjection as model_ConfigMapProjection
import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource as model_ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.ContainerImage as model_ContainerImage
import io.fabric8.kubernetes.api.model.ContainerPort as model_ContainerPort
import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateRunning as model_ContainerStateRunning
import io.fabric8.kubernetes.api.model.ContainerStateTerminated as model_ContainerStateTerminated
import io.fabric8.kubernetes.api.model.ContainerStateWaiting as model_ContainerStateWaiting
import io.fabric8.kubernetes.api.model.ContainerStatus as model_ContainerStatus
import io.fabric8.kubernetes.api.model.Context as model_Context
import io.fabric8.kubernetes.api.model.CreateOptions as model_CreateOptions
import io.fabric8.kubernetes.api.model.DaemonEndpoint as model_DaemonEndpoint
import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.DownwardAPIProjection as model_DownwardAPIProjection
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile as model_DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource as model_DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.Duration as model_Duration
import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource as model_EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.EndpointAddress as model_EndpointAddress
import io.fabric8.kubernetes.api.model.EndpointPort as model_EndpointPort
import io.fabric8.kubernetes.api.model.EndpointSubset as model_EndpointSubset
import io.fabric8.kubernetes.api.model.Endpoints as model_Endpoints
import io.fabric8.kubernetes.api.model.EndpointsList as model_EndpointsList
import io.fabric8.kubernetes.api.model.EnvFromSource as model_EnvFromSource
import io.fabric8.kubernetes.api.model.EnvVar as model_EnvVar
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.EphemeralVolumeSource as model_EphemeralVolumeSource
import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventList as model_EventList
import io.fabric8.kubernetes.api.model.EventSeries as model_EventSeries
import io.fabric8.kubernetes.api.model.EventSource as model_EventSource
import io.fabric8.kubernetes.api.model.ExecAction as model_ExecAction
import io.fabric8.kubernetes.api.model.ExecConfig as model_ExecConfig
import io.fabric8.kubernetes.api.model.ExecEnvVar as model_ExecEnvVar
import io.fabric8.kubernetes.api.model.FCVolumeSource as model_FCVolumeSource
import io.fabric8.kubernetes.api.model.FieldsV1 as model_FieldsV1
import io.fabric8.kubernetes.api.model.FlexPersistentVolumeSource as model_FlexPersistentVolumeSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource as model_FlexVolumeSource
import io.fabric8.kubernetes.api.model.FlockerVolumeSource as model_FlockerVolumeSource
import io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource as model_GCEPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.GRPCAction as model_GRPCAction
import io.fabric8.kubernetes.api.model.GenericKubernetesResource as model_GenericKubernetesResource
import io.fabric8.kubernetes.api.model.GenericKubernetesResourceList as model_GenericKubernetesResourceList
import io.fabric8.kubernetes.api.model.GetOptions as model_GetOptions
import io.fabric8.kubernetes.api.model.GitRepoVolumeSource as model_GitRepoVolumeSource
import io.fabric8.kubernetes.api.model.GlusterfsPersistentVolumeSource as model_GlusterfsPersistentVolumeSource
import io.fabric8.kubernetes.api.model.GlusterfsVolumeSource as model_GlusterfsVolumeSource
import io.fabric8.kubernetes.api.model.GroupKind as model_GroupKind
import io.fabric8.kubernetes.api.model.GroupVersionForDiscovery as model_GroupVersionForDiscovery
import io.fabric8.kubernetes.api.model.GroupVersionKind as model_GroupVersionKind
import io.fabric8.kubernetes.api.model.GroupVersionResource as model_GroupVersionResource
import io.fabric8.kubernetes.api.model.HTTPGetAction as model_HTTPGetAction
import io.fabric8.kubernetes.api.model.HTTPHeader as model_HTTPHeader
import io.fabric8.kubernetes.api.model.HostAlias as model_HostAlias
import io.fabric8.kubernetes.api.model.HostPathVolumeSource as model_HostPathVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIPersistentVolumeSource as model_ISCSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource as model_ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.KeyToPath as model_KeyToPath
import io.fabric8.kubernetes.api.model.KubernetesList as model_KubernetesList
import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.LabelSelectorRequirement as model_LabelSelectorRequirement
import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.LimitRange as model_LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeItem as model_LimitRangeItem
import io.fabric8.kubernetes.api.model.LimitRangeList as model_LimitRangeList
import io.fabric8.kubernetes.api.model.LimitRangeSpec as model_LimitRangeSpec
import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ListOptions as model_ListOptions
import io.fabric8.kubernetes.api.model.LoadBalancerIngress as model_LoadBalancerIngress
import io.fabric8.kubernetes.api.model.LoadBalancerStatus as model_LoadBalancerStatus
import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.kubernetes.api.model.LocalVolumeSource as model_LocalVolumeSource
import io.fabric8.kubernetes.api.model.ManagedFieldsEntry as model_ManagedFieldsEntry
import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.NFSVolumeSource as model_NFSVolumeSource
import io.fabric8.kubernetes.api.model.NamedAuthInfo as model_NamedAuthInfo
import io.fabric8.kubernetes.api.model.NamedCluster as model_NamedCluster
import io.fabric8.kubernetes.api.model.NamedContext as model_NamedContext
import io.fabric8.kubernetes.api.model.NamedExtension as model_NamedExtension
import io.fabric8.kubernetes.api.model.Namespace as model_Namespace
import io.fabric8.kubernetes.api.model.NamespaceCondition as model_NamespaceCondition
import io.fabric8.kubernetes.api.model.NamespaceList as model_NamespaceList
import io.fabric8.kubernetes.api.model.NamespaceSpec as model_NamespaceSpec
import io.fabric8.kubernetes.api.model.NamespaceStatus as model_NamespaceStatus
import io.fabric8.kubernetes.api.model.Node as model_Node
import io.fabric8.kubernetes.api.model.NodeAddress as model_NodeAddress
import io.fabric8.kubernetes.api.model.NodeAffinity as model_NodeAffinity
import io.fabric8.kubernetes.api.model.NodeCondition as model_NodeCondition
import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus
import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints as model_NodeDaemonEndpoints
import io.fabric8.kubernetes.api.model.NodeList as model_NodeList
import io.fabric8.kubernetes.api.model.NodeSelector as model_NodeSelector
import io.fabric8.kubernetes.api.model.NodeSelectorRequirement as model_NodeSelectorRequirement
import io.fabric8.kubernetes.api.model.NodeSelectorTerm as model_NodeSelectorTerm
import io.fabric8.kubernetes.api.model.NodeSpec as model_NodeSpec
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus
import io.fabric8.kubernetes.api.model.NodeSystemInfo as model_NodeSystemInfo
import io.fabric8.kubernetes.api.model.ObjectFieldSelector as model_ObjectFieldSelector
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.OwnerReference as model_OwnerReference
import io.fabric8.kubernetes.api.model.Patch as model_Patch
import io.fabric8.kubernetes.api.model.PatchOptions as model_PatchOptions
import io.fabric8.kubernetes.api.model.PersistentVolume as model_PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim as model_PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimCondition as model_PersistentVolumeClaimCondition
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimList as model_PersistentVolumeClaimList
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus as model_PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimTemplate as model_PersistentVolumeClaimTemplate
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource as model_PersistentVolumeClaimVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeList as model_PersistentVolumeList
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeStatus as model_PersistentVolumeStatus
import io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource as model_PhotonPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.Pod as model_Pod
import io.fabric8.kubernetes.api.model.PodAffinity as model_PodAffinity
import io.fabric8.kubernetes.api.model.PodAffinityTerm as model_PodAffinityTerm
import io.fabric8.kubernetes.api.model.PodAntiAffinity as model_PodAntiAffinity
import io.fabric8.kubernetes.api.model.PodCondition as model_PodCondition
import io.fabric8.kubernetes.api.model.PodDNSConfig as model_PodDNSConfig
import io.fabric8.kubernetes.api.model.PodDNSConfigOption as model_PodDNSConfigOption
import io.fabric8.kubernetes.api.model.PodExecOptions as model_PodExecOptions
import io.fabric8.kubernetes.api.model.PodIP as model_PodIP
import io.fabric8.kubernetes.api.model.PodList as model_PodList
import io.fabric8.kubernetes.api.model.PodOS as model_PodOS
import io.fabric8.kubernetes.api.model.PodReadinessGate as model_PodReadinessGate
import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec
import io.fabric8.kubernetes.api.model.PodStatus as model_PodStatus
import io.fabric8.kubernetes.api.model.PodTemplate as model_PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateList as model_PodTemplateList
import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.PortStatus as model_PortStatus
import io.fabric8.kubernetes.api.model.PortworxVolumeSource as model_PortworxVolumeSource
import io.fabric8.kubernetes.api.model.Preconditions as model_Preconditions
import io.fabric8.kubernetes.api.model.Preferences as model_Preferences
import io.fabric8.kubernetes.api.model.PreferredSchedulingTerm as model_PreferredSchedulingTerm
import io.fabric8.kubernetes.api.model.Probe as model_Probe
import io.fabric8.kubernetes.api.model.ProjectedVolumeSource as model_ProjectedVolumeSource
import io.fabric8.kubernetes.api.model.QuobyteVolumeSource as model_QuobyteVolumeSource
import io.fabric8.kubernetes.api.model.RBDPersistentVolumeSource as model_RBDPersistentVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource as model_RBDVolumeSource
import io.fabric8.kubernetes.api.model.ReplicationController as model_ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerCondition as model_ReplicationControllerCondition
import io.fabric8.kubernetes.api.model.ReplicationControllerList as model_ReplicationControllerList
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec as model_ReplicationControllerSpec
import io.fabric8.kubernetes.api.model.ReplicationControllerStatus as model_ReplicationControllerStatus
import io.fabric8.kubernetes.api.model.ResourceFieldSelector as model_ResourceFieldSelector
import io.fabric8.kubernetes.api.model.ResourceQuota as model_ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaList as model_ResourceQuotaList
import io.fabric8.kubernetes.api.model.ResourceQuotaSpec as model_ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.ResourceQuotaStatus as model_ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.ResourceRequirements as model_ResourceRequirements
import io.fabric8.kubernetes.api.model.RootPaths as model_RootPaths
import io.fabric8.kubernetes.api.model.SELinuxOptions as model_SELinuxOptions
import io.fabric8.kubernetes.api.model.ScaleIOPersistentVolumeSource as model_ScaleIOPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource as model_ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.ScopeSelector as model_ScopeSelector
import io.fabric8.kubernetes.api.model.ScopedResourceSelectorRequirement as model_ScopedResourceSelectorRequirement
import io.fabric8.kubernetes.api.model.SeccompProfile as model_SeccompProfile
import io.fabric8.kubernetes.api.model.Secret as model_Secret
import io.fabric8.kubernetes.api.model.SecretEnvSource as model_SecretEnvSource
import io.fabric8.kubernetes.api.model.SecretKeySelector as model_SecretKeySelector
import io.fabric8.kubernetes.api.model.SecretList as model_SecretList
import io.fabric8.kubernetes.api.model.SecretProjection as model_SecretProjection
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference
import io.fabric8.kubernetes.api.model.SecretVolumeSource as model_SecretVolumeSource
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext
import io.fabric8.kubernetes.api.model.ServerAddressByClientCIDR as model_ServerAddressByClientCIDR
import io.fabric8.kubernetes.api.model.Service as model_Service
import io.fabric8.kubernetes.api.model.ServiceAccount as model_ServiceAccount
import io.fabric8.kubernetes.api.model.ServiceAccountList as model_ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceAccountTokenProjection as model_ServiceAccountTokenProjection
import io.fabric8.kubernetes.api.model.ServiceList as model_ServiceList
import io.fabric8.kubernetes.api.model.ServicePort as model_ServicePort
import io.fabric8.kubernetes.api.model.ServiceReference as model_ServiceReference
import io.fabric8.kubernetes.api.model.ServiceSpec as model_ServiceSpec
import io.fabric8.kubernetes.api.model.ServiceStatus as model_ServiceStatus
import io.fabric8.kubernetes.api.model.SessionAffinityConfig as model_SessionAffinityConfig
import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.StatusCause as model_StatusCause
import io.fabric8.kubernetes.api.model.StatusDetails as model_StatusDetails
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource as model_StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource as model_StorageOSVolumeSource
import io.fabric8.kubernetes.api.model.Sysctl as model_Sysctl
import io.fabric8.kubernetes.api.model.TCPSocketAction as model_TCPSocketAction
import io.fabric8.kubernetes.api.model.Taint as model_Taint
import io.fabric8.kubernetes.api.model.Toleration as model_Toleration
import io.fabric8.kubernetes.api.model.TopologySelectorLabelRequirement as model_TopologySelectorLabelRequirement
import io.fabric8.kubernetes.api.model.TopologySelectorTerm as model_TopologySelectorTerm
import io.fabric8.kubernetes.api.model.TopologySpreadConstraint as model_TopologySpreadConstraint
import io.fabric8.kubernetes.api.model.TypeMeta as model_TypeMeta
import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference
import io.fabric8.kubernetes.api.model.UpdateOptions as model_UpdateOptions
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VolumeDevice as model_VolumeDevice
import io.fabric8.kubernetes.api.model.VolumeMount as model_VolumeMount
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity as model_VolumeNodeAffinity
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection
import io.fabric8.kubernetes.api.model.VsphereVirtualDiskVolumeSource as model_VsphereVirtualDiskVolumeSource
import io.fabric8.kubernetes.api.model.WatchEvent as model_WatchEvent
import io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm as model_WeightedPodAffinityTerm
import io.fabric8.kubernetes.api.model.WindowsSecurityContextOptions as model_WindowsSecurityContextOptions


fun newAPIGroup(block : model_APIGroup.() -> Unit = {}): model_APIGroup {
  val instance = model_APIGroup()
  instance.block()
  return instance
}


fun newAPIGroupList(block : model_APIGroupList.() -> Unit = {}): model_APIGroupList {
  val instance = model_APIGroupList()
  instance.block()
  return instance
}


fun newAPIResource(block : model_APIResource.() -> Unit = {}): model_APIResource {
  val instance = model_APIResource()
  instance.block()
  return instance
}


fun newAPIResourceList(block : model_APIResourceList.() -> Unit = {}): model_APIResourceList {
  val instance = model_APIResourceList()
  instance.block()
  return instance
}


fun newAPIService(block : model_APIService.() -> Unit = {}): model_APIService {
  val instance = model_APIService()
  instance.block()
  return instance
}


fun newAPIServiceCondition(block : model_APIServiceCondition.() -> Unit = {}): model_APIServiceCondition {
  val instance = model_APIServiceCondition()
  instance.block()
  return instance
}


fun newAPIServiceList(block : model_APIServiceList.() -> Unit = {}): model_APIServiceList {
  val instance = model_APIServiceList()
  instance.block()
  return instance
}


fun newAPIServiceSpec(block : model_APIServiceSpec.() -> Unit = {}): model_APIServiceSpec {
  val instance = model_APIServiceSpec()
  instance.block()
  return instance
}


fun newAPIServiceStatus(block : model_APIServiceStatus.() -> Unit = {}): model_APIServiceStatus {
  val instance = model_APIServiceStatus()
  instance.block()
  return instance
}


fun newAWSElasticBlockStoreVolumeSource(block : model_AWSElasticBlockStoreVolumeSource.() -> Unit = {}): model_AWSElasticBlockStoreVolumeSource {
  val instance = model_AWSElasticBlockStoreVolumeSource()
  instance.block()
  return instance
}


fun newAffinity(block : model_Affinity.() -> Unit = {}): model_Affinity {
  val instance = model_Affinity()
  instance.block()
  return instance
}


fun newAttachedVolume(block : model_AttachedVolume.() -> Unit = {}): model_AttachedVolume {
  val instance = model_AttachedVolume()
  instance.block()
  return instance
}


fun newAuthInfo(block : model_AuthInfo.() -> Unit = {}): model_AuthInfo {
  val instance = model_AuthInfo()
  instance.block()
  return instance
}


fun newAuthProviderConfig(block : model_AuthProviderConfig.() -> Unit = {}): model_AuthProviderConfig {
  val instance = model_AuthProviderConfig()
  instance.block()
  return instance
}


fun newAzureDiskVolumeSource(block : model_AzureDiskVolumeSource.() -> Unit = {}): model_AzureDiskVolumeSource {
  val instance = model_AzureDiskVolumeSource()
  instance.block()
  return instance
}


fun newAzureFilePersistentVolumeSource(block : model_AzureFilePersistentVolumeSource.() -> Unit = {}): model_AzureFilePersistentVolumeSource {
  val instance = model_AzureFilePersistentVolumeSource()
  instance.block()
  return instance
}


fun newAzureFileVolumeSource(block : model_AzureFileVolumeSource.() -> Unit = {}): model_AzureFileVolumeSource {
  val instance = model_AzureFileVolumeSource()
  instance.block()
  return instance
}


fun newBaseKubernetesList(block : model_BaseKubernetesList.() -> Unit = {}): model_BaseKubernetesList {
  val instance = model_BaseKubernetesList()
  instance.block()
  return instance
}


fun newBinding(block : model_Binding.() -> Unit = {}): model_Binding {
  val instance = model_Binding()
  instance.block()
  return instance
}


fun newCSIPersistentVolumeSource(block : model_CSIPersistentVolumeSource.() -> Unit = {}): model_CSIPersistentVolumeSource {
  val instance = model_CSIPersistentVolumeSource()
  instance.block()
  return instance
}


fun newCSIVolumeSource(block : model_CSIVolumeSource.() -> Unit = {}): model_CSIVolumeSource {
  val instance = model_CSIVolumeSource()
  instance.block()
  return instance
}


fun newCapabilities(block : model_Capabilities.() -> Unit = {}): model_Capabilities {
  val instance = model_Capabilities()
  instance.block()
  return instance
}


fun newCephFSPersistentVolumeSource(block : model_CephFSPersistentVolumeSource.() -> Unit = {}): model_CephFSPersistentVolumeSource {
  val instance = model_CephFSPersistentVolumeSource()
  instance.block()
  return instance
}


fun newCephFSVolumeSource(block : model_CephFSVolumeSource.() -> Unit = {}): model_CephFSVolumeSource {
  val instance = model_CephFSVolumeSource()
  instance.block()
  return instance
}


fun newCinderPersistentVolumeSource(block : model_CinderPersistentVolumeSource.() -> Unit = {}): model_CinderPersistentVolumeSource {
  val instance = model_CinderPersistentVolumeSource()
  instance.block()
  return instance
}


fun newCinderVolumeSource(block : model_CinderVolumeSource.() -> Unit = {}): model_CinderVolumeSource {
  val instance = model_CinderVolumeSource()
  instance.block()
  return instance
}


fun newClientIPConfig(block : model_ClientIPConfig.() -> Unit = {}): model_ClientIPConfig {
  val instance = model_ClientIPConfig()
  instance.block()
  return instance
}


fun newCluster(block : model_Cluster.() -> Unit = {}): model_Cluster {
  val instance = model_Cluster()
  instance.block()
  return instance
}


fun newComponentCondition(block : model_ComponentCondition.() -> Unit = {}): model_ComponentCondition {
  val instance = model_ComponentCondition()
  instance.block()
  return instance
}


fun newComponentStatus(block : model_ComponentStatus.() -> Unit = {}): model_ComponentStatus {
  val instance = model_ComponentStatus()
  instance.block()
  return instance
}


fun newComponentStatusList(block : model_ComponentStatusList.() -> Unit = {}): model_ComponentStatusList {
  val instance = model_ComponentStatusList()
  instance.block()
  return instance
}


fun newCondition(block : model_Condition.() -> Unit = {}): model_Condition {
  val instance = model_Condition()
  instance.block()
  return instance
}


fun newConfig(block : model_Config.() -> Unit = {}): model_Config {
  val instance = model_Config()
  instance.block()
  return instance
}


fun newConfigMap(block : model_ConfigMap.() -> Unit = {}): model_ConfigMap {
  val instance = model_ConfigMap()
  instance.block()
  return instance
}


fun newConfigMapEnvSource(block : model_ConfigMapEnvSource.() -> Unit = {}): model_ConfigMapEnvSource {
  val instance = model_ConfigMapEnvSource()
  instance.block()
  return instance
}


fun newConfigMapKeySelector(block : model_ConfigMapKeySelector.() -> Unit = {}): model_ConfigMapKeySelector {
  val instance = model_ConfigMapKeySelector()
  instance.block()
  return instance
}


fun newConfigMapList(block : model_ConfigMapList.() -> Unit = {}): model_ConfigMapList {
  val instance = model_ConfigMapList()
  instance.block()
  return instance
}


fun newConfigMapNodeConfigSource(block : model_ConfigMapNodeConfigSource.() -> Unit = {}): model_ConfigMapNodeConfigSource {
  val instance = model_ConfigMapNodeConfigSource()
  instance.block()
  return instance
}


fun newConfigMapProjection(block : model_ConfigMapProjection.() -> Unit = {}): model_ConfigMapProjection {
  val instance = model_ConfigMapProjection()
  instance.block()
  return instance
}


fun newConfigMapVolumeSource(block : model_ConfigMapVolumeSource.() -> Unit = {}): model_ConfigMapVolumeSource {
  val instance = model_ConfigMapVolumeSource()
  instance.block()
  return instance
}


fun newContainer(block : model_Container.() -> Unit = {}): model_Container {
  val instance = model_Container()
  instance.block()
  return instance
}


fun newContainerImage(block : model_ContainerImage.() -> Unit = {}): model_ContainerImage {
  val instance = model_ContainerImage()
  instance.block()
  return instance
}


fun newContainerPort(block : model_ContainerPort.() -> Unit = {}): model_ContainerPort {
  val instance = model_ContainerPort()
  instance.block()
  return instance
}


fun newContainerState(block : model_ContainerState.() -> Unit = {}): model_ContainerState {
  val instance = model_ContainerState()
  instance.block()
  return instance
}


fun newContainerStateRunning(block : model_ContainerStateRunning.() -> Unit = {}): model_ContainerStateRunning {
  val instance = model_ContainerStateRunning()
  instance.block()
  return instance
}


fun newContainerStateTerminated(block : model_ContainerStateTerminated.() -> Unit = {}): model_ContainerStateTerminated {
  val instance = model_ContainerStateTerminated()
  instance.block()
  return instance
}


fun newContainerStateWaiting(block : model_ContainerStateWaiting.() -> Unit = {}): model_ContainerStateWaiting {
  val instance = model_ContainerStateWaiting()
  instance.block()
  return instance
}


fun newContainerStatus(block : model_ContainerStatus.() -> Unit = {}): model_ContainerStatus {
  val instance = model_ContainerStatus()
  instance.block()
  return instance
}


fun newContext(block : model_Context.() -> Unit = {}): model_Context {
  val instance = model_Context()
  instance.block()
  return instance
}


fun newCreateOptions(block : model_CreateOptions.() -> Unit = {}): model_CreateOptions {
  val instance = model_CreateOptions()
  instance.block()
  return instance
}


fun newDaemonEndpoint(block : model_DaemonEndpoint.() -> Unit = {}): model_DaemonEndpoint {
  val instance = model_DaemonEndpoint()
  instance.block()
  return instance
}


fun newDeleteOptions(block : model_DeleteOptions.() -> Unit = {}): model_DeleteOptions {
  val instance = model_DeleteOptions()
  instance.block()
  return instance
}


fun newDownwardAPIProjection(block : model_DownwardAPIProjection.() -> Unit = {}): model_DownwardAPIProjection {
  val instance = model_DownwardAPIProjection()
  instance.block()
  return instance
}


fun newDownwardAPIVolumeFile(block : model_DownwardAPIVolumeFile.() -> Unit = {}): model_DownwardAPIVolumeFile {
  val instance = model_DownwardAPIVolumeFile()
  instance.block()
  return instance
}


fun newDownwardAPIVolumeSource(block : model_DownwardAPIVolumeSource.() -> Unit = {}): model_DownwardAPIVolumeSource {
  val instance = model_DownwardAPIVolumeSource()
  instance.block()
  return instance
}


fun newDuration(block : model_Duration.() -> Unit = {}): model_Duration {
  val instance = model_Duration()
  instance.block()
  return instance
}


fun newEmptyDirVolumeSource(block : model_EmptyDirVolumeSource.() -> Unit = {}): model_EmptyDirVolumeSource {
  val instance = model_EmptyDirVolumeSource()
  instance.block()
  return instance
}


fun newEndpointAddress(block : model_EndpointAddress.() -> Unit = {}): model_EndpointAddress {
  val instance = model_EndpointAddress()
  instance.block()
  return instance
}


fun newEndpointPort(block : model_EndpointPort.() -> Unit = {}): model_EndpointPort {
  val instance = model_EndpointPort()
  instance.block()
  return instance
}


fun newEndpointSubset(block : model_EndpointSubset.() -> Unit = {}): model_EndpointSubset {
  val instance = model_EndpointSubset()
  instance.block()
  return instance
}


fun newEndpoints(block : model_Endpoints.() -> Unit = {}): model_Endpoints {
  val instance = model_Endpoints()
  instance.block()
  return instance
}


fun newEndpointsList(block : model_EndpointsList.() -> Unit = {}): model_EndpointsList {
  val instance = model_EndpointsList()
  instance.block()
  return instance
}


fun newEnvFromSource(block : model_EnvFromSource.() -> Unit = {}): model_EnvFromSource {
  val instance = model_EnvFromSource()
  instance.block()
  return instance
}


fun newEnvVar(block : model_EnvVar.() -> Unit = {}): model_EnvVar {
  val instance = model_EnvVar()
  instance.block()
  return instance
}


fun newEnvVarSource(block : model_EnvVarSource.() -> Unit = {}): model_EnvVarSource {
  val instance = model_EnvVarSource()
  instance.block()
  return instance
}


fun newEphemeralContainer(block : model_EphemeralContainer.() -> Unit = {}): model_EphemeralContainer {
  val instance = model_EphemeralContainer()
  instance.block()
  return instance
}


fun newEphemeralVolumeSource(block : model_EphemeralVolumeSource.() -> Unit = {}): model_EphemeralVolumeSource {
  val instance = model_EphemeralVolumeSource()
  instance.block()
  return instance
}


fun newEvent(block : model_Event.() -> Unit = {}): model_Event {
  val instance = model_Event()
  instance.block()
  return instance
}


fun newEventList(block : model_EventList.() -> Unit = {}): model_EventList {
  val instance = model_EventList()
  instance.block()
  return instance
}


fun newEventSeries(block : model_EventSeries.() -> Unit = {}): model_EventSeries {
  val instance = model_EventSeries()
  instance.block()
  return instance
}


fun newEventSource(block : model_EventSource.() -> Unit = {}): model_EventSource {
  val instance = model_EventSource()
  instance.block()
  return instance
}


fun newExecAction(block : model_ExecAction.() -> Unit = {}): model_ExecAction {
  val instance = model_ExecAction()
  instance.block()
  return instance
}


fun newExecConfig(block : model_ExecConfig.() -> Unit = {}): model_ExecConfig {
  val instance = model_ExecConfig()
  instance.block()
  return instance
}


fun newExecEnvVar(block : model_ExecEnvVar.() -> Unit = {}): model_ExecEnvVar {
  val instance = model_ExecEnvVar()
  instance.block()
  return instance
}


fun newFCVolumeSource(block : model_FCVolumeSource.() -> Unit = {}): model_FCVolumeSource {
  val instance = model_FCVolumeSource()
  instance.block()
  return instance
}


fun newFieldsV1(block : model_FieldsV1.() -> Unit = {}): model_FieldsV1 {
  val instance = model_FieldsV1()
  instance.block()
  return instance
}


fun newFlexPersistentVolumeSource(block : model_FlexPersistentVolumeSource.() -> Unit = {}): model_FlexPersistentVolumeSource {
  val instance = model_FlexPersistentVolumeSource()
  instance.block()
  return instance
}


fun newFlexVolumeSource(block : model_FlexVolumeSource.() -> Unit = {}): model_FlexVolumeSource {
  val instance = model_FlexVolumeSource()
  instance.block()
  return instance
}


fun newFlockerVolumeSource(block : model_FlockerVolumeSource.() -> Unit = {}): model_FlockerVolumeSource {
  val instance = model_FlockerVolumeSource()
  instance.block()
  return instance
}


fun newGCEPersistentDiskVolumeSource(block : model_GCEPersistentDiskVolumeSource.() -> Unit = {}): model_GCEPersistentDiskVolumeSource {
  val instance = model_GCEPersistentDiskVolumeSource()
  instance.block()
  return instance
}


fun newGRPCAction(block : model_GRPCAction.() -> Unit = {}): model_GRPCAction {
  val instance = model_GRPCAction()
  instance.block()
  return instance
}


fun newGenericKubernetesResource(block : model_GenericKubernetesResource.() -> Unit = {}): model_GenericKubernetesResource {
  val instance = model_GenericKubernetesResource()
  instance.block()
  return instance
}


fun newGenericKubernetesResourceList(block : model_GenericKubernetesResourceList.() -> Unit = {}): model_GenericKubernetesResourceList {
  val instance = model_GenericKubernetesResourceList()
  instance.block()
  return instance
}


fun newGetOptions(block : model_GetOptions.() -> Unit = {}): model_GetOptions {
  val instance = model_GetOptions()
  instance.block()
  return instance
}


fun newGitRepoVolumeSource(block : model_GitRepoVolumeSource.() -> Unit = {}): model_GitRepoVolumeSource {
  val instance = model_GitRepoVolumeSource()
  instance.block()
  return instance
}


fun newGlusterfsPersistentVolumeSource(block : model_GlusterfsPersistentVolumeSource.() -> Unit = {}): model_GlusterfsPersistentVolumeSource {
  val instance = model_GlusterfsPersistentVolumeSource()
  instance.block()
  return instance
}


fun newGlusterfsVolumeSource(block : model_GlusterfsVolumeSource.() -> Unit = {}): model_GlusterfsVolumeSource {
  val instance = model_GlusterfsVolumeSource()
  instance.block()
  return instance
}


fun newGroupKind(block : model_GroupKind.() -> Unit = {}): model_GroupKind {
  val instance = model_GroupKind()
  instance.block()
  return instance
}


fun newGroupVersionForDiscovery(block : model_GroupVersionForDiscovery.() -> Unit = {}): model_GroupVersionForDiscovery {
  val instance = model_GroupVersionForDiscovery()
  instance.block()
  return instance
}


fun newGroupVersionKind(block : model_GroupVersionKind.() -> Unit = {}): model_GroupVersionKind {
  val instance = model_GroupVersionKind()
  instance.block()
  return instance
}


fun newGroupVersionResource(block : model_GroupVersionResource.() -> Unit = {}): model_GroupVersionResource {
  val instance = model_GroupVersionResource()
  instance.block()
  return instance
}


fun newHTTPGetAction(block : model_HTTPGetAction.() -> Unit = {}): model_HTTPGetAction {
  val instance = model_HTTPGetAction()
  instance.block()
  return instance
}


fun newHTTPHeader(block : model_HTTPHeader.() -> Unit = {}): model_HTTPHeader {
  val instance = model_HTTPHeader()
  instance.block()
  return instance
}


fun newHostAlias(block : model_HostAlias.() -> Unit = {}): model_HostAlias {
  val instance = model_HostAlias()
  instance.block()
  return instance
}


fun newHostPathVolumeSource(block : model_HostPathVolumeSource.() -> Unit = {}): model_HostPathVolumeSource {
  val instance = model_HostPathVolumeSource()
  instance.block()
  return instance
}


fun newISCSIPersistentVolumeSource(block : model_ISCSIPersistentVolumeSource.() -> Unit = {}): model_ISCSIPersistentVolumeSource {
  val instance = model_ISCSIPersistentVolumeSource()
  instance.block()
  return instance
}


fun newISCSIVolumeSource(block : model_ISCSIVolumeSource.() -> Unit = {}): model_ISCSIVolumeSource {
  val instance = model_ISCSIVolumeSource()
  instance.block()
  return instance
}


fun newKeyToPath(block : model_KeyToPath.() -> Unit = {}): model_KeyToPath {
  val instance = model_KeyToPath()
  instance.block()
  return instance
}


fun newKubernetesList(block : model_KubernetesList.() -> Unit = {}): model_KubernetesList {
  val instance = model_KubernetesList()
  instance.block()
  return instance
}


fun newLabelSelector(block : model_LabelSelector.() -> Unit = {}): model_LabelSelector {
  val instance = model_LabelSelector()
  instance.block()
  return instance
}


fun newLabelSelectorRequirement(block : model_LabelSelectorRequirement.() -> Unit = {}): model_LabelSelectorRequirement {
  val instance = model_LabelSelectorRequirement()
  instance.block()
  return instance
}


fun newLifecycle(block : model_Lifecycle.() -> Unit = {}): model_Lifecycle {
  val instance = model_Lifecycle()
  instance.block()
  return instance
}


fun newLifecycleHandler(block : model_LifecycleHandler.() -> Unit = {}): model_LifecycleHandler {
  val instance = model_LifecycleHandler()
  instance.block()
  return instance
}


fun newLimitRange(block : model_LimitRange.() -> Unit = {}): model_LimitRange {
  val instance = model_LimitRange()
  instance.block()
  return instance
}


fun newLimitRangeItem(block : model_LimitRangeItem.() -> Unit = {}): model_LimitRangeItem {
  val instance = model_LimitRangeItem()
  instance.block()
  return instance
}


fun newLimitRangeList(block : model_LimitRangeList.() -> Unit = {}): model_LimitRangeList {
  val instance = model_LimitRangeList()
  instance.block()
  return instance
}


fun newLimitRangeSpec(block : model_LimitRangeSpec.() -> Unit = {}): model_LimitRangeSpec {
  val instance = model_LimitRangeSpec()
  instance.block()
  return instance
}


fun newListMeta(block : model_ListMeta.() -> Unit = {}): model_ListMeta {
  val instance = model_ListMeta()
  instance.block()
  return instance
}


fun newListOptions(block : model_ListOptions.() -> Unit = {}): model_ListOptions {
  val instance = model_ListOptions()
  instance.block()
  return instance
}


fun newLoadBalancerIngress(block : model_LoadBalancerIngress.() -> Unit = {}): model_LoadBalancerIngress {
  val instance = model_LoadBalancerIngress()
  instance.block()
  return instance
}


fun newLoadBalancerStatus(block : model_LoadBalancerStatus.() -> Unit = {}): model_LoadBalancerStatus {
  val instance = model_LoadBalancerStatus()
  instance.block()
  return instance
}


fun newLocalObjectReference(block : model_LocalObjectReference.() -> Unit = {}): model_LocalObjectReference {
  val instance = model_LocalObjectReference()
  instance.block()
  return instance
}


fun newLocalVolumeSource(block : model_LocalVolumeSource.() -> Unit = {}): model_LocalVolumeSource {
  val instance = model_LocalVolumeSource()
  instance.block()
  return instance
}


fun newManagedFieldsEntry(block : model_ManagedFieldsEntry.() -> Unit = {}): model_ManagedFieldsEntry {
  val instance = model_ManagedFieldsEntry()
  instance.block()
  return instance
}


fun newMicroTime(block : model_MicroTime.() -> Unit = {}): model_MicroTime {
  val instance = model_MicroTime()
  instance.block()
  return instance
}


fun newNFSVolumeSource(block : model_NFSVolumeSource.() -> Unit = {}): model_NFSVolumeSource {
  val instance = model_NFSVolumeSource()
  instance.block()
  return instance
}


fun newNamedAuthInfo(block : model_NamedAuthInfo.() -> Unit = {}): model_NamedAuthInfo {
  val instance = model_NamedAuthInfo()
  instance.block()
  return instance
}


fun newNamedCluster(block : model_NamedCluster.() -> Unit = {}): model_NamedCluster {
  val instance = model_NamedCluster()
  instance.block()
  return instance
}


fun newNamedContext(block : model_NamedContext.() -> Unit = {}): model_NamedContext {
  val instance = model_NamedContext()
  instance.block()
  return instance
}


fun newNamedExtension(block : model_NamedExtension.() -> Unit = {}): model_NamedExtension {
  val instance = model_NamedExtension()
  instance.block()
  return instance
}


fun newNamespace(block : model_Namespace.() -> Unit = {}): model_Namespace {
  val instance = model_Namespace()
  instance.block()
  return instance
}


fun newNamespaceCondition(block : model_NamespaceCondition.() -> Unit = {}): model_NamespaceCondition {
  val instance = model_NamespaceCondition()
  instance.block()
  return instance
}


fun newNamespaceList(block : model_NamespaceList.() -> Unit = {}): model_NamespaceList {
  val instance = model_NamespaceList()
  instance.block()
  return instance
}


fun newNamespaceSpec(block : model_NamespaceSpec.() -> Unit = {}): model_NamespaceSpec {
  val instance = model_NamespaceSpec()
  instance.block()
  return instance
}


fun newNamespaceStatus(block : model_NamespaceStatus.() -> Unit = {}): model_NamespaceStatus {
  val instance = model_NamespaceStatus()
  instance.block()
  return instance
}


fun newNode(block : model_Node.() -> Unit = {}): model_Node {
  val instance = model_Node()
  instance.block()
  return instance
}


fun newNodeAddress(block : model_NodeAddress.() -> Unit = {}): model_NodeAddress {
  val instance = model_NodeAddress()
  instance.block()
  return instance
}


fun newNodeAffinity(block : model_NodeAffinity.() -> Unit = {}): model_NodeAffinity {
  val instance = model_NodeAffinity()
  instance.block()
  return instance
}


fun newNodeCondition(block : model_NodeCondition.() -> Unit = {}): model_NodeCondition {
  val instance = model_NodeCondition()
  instance.block()
  return instance
}


fun newNodeConfigSource(block : model_NodeConfigSource.() -> Unit = {}): model_NodeConfigSource {
  val instance = model_NodeConfigSource()
  instance.block()
  return instance
}


fun newNodeConfigStatus(block : model_NodeConfigStatus.() -> Unit = {}): model_NodeConfigStatus {
  val instance = model_NodeConfigStatus()
  instance.block()
  return instance
}


fun newNodeDaemonEndpoints(block : model_NodeDaemonEndpoints.() -> Unit = {}): model_NodeDaemonEndpoints {
  val instance = model_NodeDaemonEndpoints()
  instance.block()
  return instance
}


fun newNodeList(block : model_NodeList.() -> Unit = {}): model_NodeList {
  val instance = model_NodeList()
  instance.block()
  return instance
}


fun newNodeSelector(block : model_NodeSelector.() -> Unit = {}): model_NodeSelector {
  val instance = model_NodeSelector()
  instance.block()
  return instance
}


fun newNodeSelectorRequirement(block : model_NodeSelectorRequirement.() -> Unit = {}): model_NodeSelectorRequirement {
  val instance = model_NodeSelectorRequirement()
  instance.block()
  return instance
}


fun newNodeSelectorTerm(block : model_NodeSelectorTerm.() -> Unit = {}): model_NodeSelectorTerm {
  val instance = model_NodeSelectorTerm()
  instance.block()
  return instance
}


fun newNodeSpec(block : model_NodeSpec.() -> Unit = {}): model_NodeSpec {
  val instance = model_NodeSpec()
  instance.block()
  return instance
}


fun newNodeStatus(block : model_NodeStatus.() -> Unit = {}): model_NodeStatus {
  val instance = model_NodeStatus()
  instance.block()
  return instance
}


fun newNodeSystemInfo(block : model_NodeSystemInfo.() -> Unit = {}): model_NodeSystemInfo {
  val instance = model_NodeSystemInfo()
  instance.block()
  return instance
}


fun newObjectFieldSelector(block : model_ObjectFieldSelector.() -> Unit = {}): model_ObjectFieldSelector {
  val instance = model_ObjectFieldSelector()
  instance.block()
  return instance
}


fun newObjectMeta(block : model_ObjectMeta.() -> Unit = {}): model_ObjectMeta {
  val instance = model_ObjectMeta()
  instance.block()
  return instance
}


fun newObjectReference(block : model_ObjectReference.() -> Unit = {}): model_ObjectReference {
  val instance = model_ObjectReference()
  instance.block()
  return instance
}


fun newOwnerReference(block : model_OwnerReference.() -> Unit = {}): model_OwnerReference {
  val instance = model_OwnerReference()
  instance.block()
  return instance
}


fun newPatch(block : model_Patch.() -> Unit = {}): model_Patch {
  val instance = model_Patch()
  instance.block()
  return instance
}


fun newPatchOptions(block : model_PatchOptions.() -> Unit = {}): model_PatchOptions {
  val instance = model_PatchOptions()
  instance.block()
  return instance
}


fun newPersistentVolume(block : model_PersistentVolume.() -> Unit = {}): model_PersistentVolume {
  val instance = model_PersistentVolume()
  instance.block()
  return instance
}


fun newPersistentVolumeClaim(block : model_PersistentVolumeClaim.() -> Unit = {}): model_PersistentVolumeClaim {
  val instance = model_PersistentVolumeClaim()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimCondition(block : model_PersistentVolumeClaimCondition.() -> Unit = {}): model_PersistentVolumeClaimCondition {
  val instance = model_PersistentVolumeClaimCondition()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimList(block : model_PersistentVolumeClaimList.() -> Unit = {}): model_PersistentVolumeClaimList {
  val instance = model_PersistentVolumeClaimList()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimSpec(block : model_PersistentVolumeClaimSpec.() -> Unit = {}): model_PersistentVolumeClaimSpec {
  val instance = model_PersistentVolumeClaimSpec()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimStatus(block : model_PersistentVolumeClaimStatus.() -> Unit = {}): model_PersistentVolumeClaimStatus {
  val instance = model_PersistentVolumeClaimStatus()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimTemplate(block : model_PersistentVolumeClaimTemplate.() -> Unit = {}): model_PersistentVolumeClaimTemplate {
  val instance = model_PersistentVolumeClaimTemplate()
  instance.block()
  return instance
}


fun newPersistentVolumeClaimVolumeSource(block : model_PersistentVolumeClaimVolumeSource.() -> Unit = {}): model_PersistentVolumeClaimVolumeSource {
  val instance = model_PersistentVolumeClaimVolumeSource()
  instance.block()
  return instance
}


fun newPersistentVolumeList(block : model_PersistentVolumeList.() -> Unit = {}): model_PersistentVolumeList {
  val instance = model_PersistentVolumeList()
  instance.block()
  return instance
}


fun newPersistentVolumeSpec(block : model_PersistentVolumeSpec.() -> Unit = {}): model_PersistentVolumeSpec {
  val instance = model_PersistentVolumeSpec()
  instance.block()
  return instance
}


fun newPersistentVolumeStatus(block : model_PersistentVolumeStatus.() -> Unit = {}): model_PersistentVolumeStatus {
  val instance = model_PersistentVolumeStatus()
  instance.block()
  return instance
}


fun newPhotonPersistentDiskVolumeSource(block : model_PhotonPersistentDiskVolumeSource.() -> Unit = {}): model_PhotonPersistentDiskVolumeSource {
  val instance = model_PhotonPersistentDiskVolumeSource()
  instance.block()
  return instance
}


fun newPod(block : model_Pod.() -> Unit = {}): model_Pod {
  val instance = model_Pod()
  instance.block()
  return instance
}


fun newPodAffinity(block : model_PodAffinity.() -> Unit = {}): model_PodAffinity {
  val instance = model_PodAffinity()
  instance.block()
  return instance
}


fun newPodAffinityTerm(block : model_PodAffinityTerm.() -> Unit = {}): model_PodAffinityTerm {
  val instance = model_PodAffinityTerm()
  instance.block()
  return instance
}


fun newPodAntiAffinity(block : model_PodAntiAffinity.() -> Unit = {}): model_PodAntiAffinity {
  val instance = model_PodAntiAffinity()
  instance.block()
  return instance
}


fun newPodCondition(block : model_PodCondition.() -> Unit = {}): model_PodCondition {
  val instance = model_PodCondition()
  instance.block()
  return instance
}


fun newPodDNSConfig(block : model_PodDNSConfig.() -> Unit = {}): model_PodDNSConfig {
  val instance = model_PodDNSConfig()
  instance.block()
  return instance
}


fun newPodDNSConfigOption(block : model_PodDNSConfigOption.() -> Unit = {}): model_PodDNSConfigOption {
  val instance = model_PodDNSConfigOption()
  instance.block()
  return instance
}


fun newPodExecOptions(block : model_PodExecOptions.() -> Unit = {}): model_PodExecOptions {
  val instance = model_PodExecOptions()
  instance.block()
  return instance
}


fun newPodIP(block : model_PodIP.() -> Unit = {}): model_PodIP {
  val instance = model_PodIP()
  instance.block()
  return instance
}


fun newPodList(block : model_PodList.() -> Unit = {}): model_PodList {
  val instance = model_PodList()
  instance.block()
  return instance
}


fun newPodOS(block : model_PodOS.() -> Unit = {}): model_PodOS {
  val instance = model_PodOS()
  instance.block()
  return instance
}


fun newPodReadinessGate(block : model_PodReadinessGate.() -> Unit = {}): model_PodReadinessGate {
  val instance = model_PodReadinessGate()
  instance.block()
  return instance
}


fun newPodSecurityContext(block : model_PodSecurityContext.() -> Unit = {}): model_PodSecurityContext {
  val instance = model_PodSecurityContext()
  instance.block()
  return instance
}


fun newPodSpec(block : model_PodSpec.() -> Unit = {}): model_PodSpec {
  val instance = model_PodSpec()
  instance.block()
  return instance
}


fun newPodStatus(block : model_PodStatus.() -> Unit = {}): model_PodStatus {
  val instance = model_PodStatus()
  instance.block()
  return instance
}


fun newPodTemplate(block : model_PodTemplate.() -> Unit = {}): model_PodTemplate {
  val instance = model_PodTemplate()
  instance.block()
  return instance
}


fun newPodTemplateList(block : model_PodTemplateList.() -> Unit = {}): model_PodTemplateList {
  val instance = model_PodTemplateList()
  instance.block()
  return instance
}


fun newPodTemplateSpec(block : model_PodTemplateSpec.() -> Unit = {}): model_PodTemplateSpec {
  val instance = model_PodTemplateSpec()
  instance.block()
  return instance
}


fun newPortStatus(block : model_PortStatus.() -> Unit = {}): model_PortStatus {
  val instance = model_PortStatus()
  instance.block()
  return instance
}


fun newPortworxVolumeSource(block : model_PortworxVolumeSource.() -> Unit = {}): model_PortworxVolumeSource {
  val instance = model_PortworxVolumeSource()
  instance.block()
  return instance
}


fun newPreconditions(block : model_Preconditions.() -> Unit = {}): model_Preconditions {
  val instance = model_Preconditions()
  instance.block()
  return instance
}


fun newPreferences(block : model_Preferences.() -> Unit = {}): model_Preferences {
  val instance = model_Preferences()
  instance.block()
  return instance
}


fun newPreferredSchedulingTerm(block : model_PreferredSchedulingTerm.() -> Unit = {}): model_PreferredSchedulingTerm {
  val instance = model_PreferredSchedulingTerm()
  instance.block()
  return instance
}


fun newProbe(block : model_Probe.() -> Unit = {}): model_Probe {
  val instance = model_Probe()
  instance.block()
  return instance
}


fun newProjectedVolumeSource(block : model_ProjectedVolumeSource.() -> Unit = {}): model_ProjectedVolumeSource {
  val instance = model_ProjectedVolumeSource()
  instance.block()
  return instance
}


fun newQuobyteVolumeSource(block : model_QuobyteVolumeSource.() -> Unit = {}): model_QuobyteVolumeSource {
  val instance = model_QuobyteVolumeSource()
  instance.block()
  return instance
}


fun newRBDPersistentVolumeSource(block : model_RBDPersistentVolumeSource.() -> Unit = {}): model_RBDPersistentVolumeSource {
  val instance = model_RBDPersistentVolumeSource()
  instance.block()
  return instance
}


fun newRBDVolumeSource(block : model_RBDVolumeSource.() -> Unit = {}): model_RBDVolumeSource {
  val instance = model_RBDVolumeSource()
  instance.block()
  return instance
}


fun newReplicationController(block : model_ReplicationController.() -> Unit = {}): model_ReplicationController {
  val instance = model_ReplicationController()
  instance.block()
  return instance
}


fun newReplicationControllerCondition(block : model_ReplicationControllerCondition.() -> Unit = {}): model_ReplicationControllerCondition {
  val instance = model_ReplicationControllerCondition()
  instance.block()
  return instance
}


fun newReplicationControllerList(block : model_ReplicationControllerList.() -> Unit = {}): model_ReplicationControllerList {
  val instance = model_ReplicationControllerList()
  instance.block()
  return instance
}


fun newReplicationControllerSpec(block : model_ReplicationControllerSpec.() -> Unit = {}): model_ReplicationControllerSpec {
  val instance = model_ReplicationControllerSpec()
  instance.block()
  return instance
}


fun newReplicationControllerStatus(block : model_ReplicationControllerStatus.() -> Unit = {}): model_ReplicationControllerStatus {
  val instance = model_ReplicationControllerStatus()
  instance.block()
  return instance
}


fun newResourceFieldSelector(block : model_ResourceFieldSelector.() -> Unit = {}): model_ResourceFieldSelector {
  val instance = model_ResourceFieldSelector()
  instance.block()
  return instance
}


fun newResourceQuota(block : model_ResourceQuota.() -> Unit = {}): model_ResourceQuota {
  val instance = model_ResourceQuota()
  instance.block()
  return instance
}


fun newResourceQuotaList(block : model_ResourceQuotaList.() -> Unit = {}): model_ResourceQuotaList {
  val instance = model_ResourceQuotaList()
  instance.block()
  return instance
}


fun newResourceQuotaSpec(block : model_ResourceQuotaSpec.() -> Unit = {}): model_ResourceQuotaSpec {
  val instance = model_ResourceQuotaSpec()
  instance.block()
  return instance
}


fun newResourceQuotaStatus(block : model_ResourceQuotaStatus.() -> Unit = {}): model_ResourceQuotaStatus {
  val instance = model_ResourceQuotaStatus()
  instance.block()
  return instance
}


fun newResourceRequirements(block : model_ResourceRequirements.() -> Unit = {}): model_ResourceRequirements {
  val instance = model_ResourceRequirements()
  instance.block()
  return instance
}


fun newRootPaths(block : model_RootPaths.() -> Unit = {}): model_RootPaths {
  val instance = model_RootPaths()
  instance.block()
  return instance
}


fun newSELinuxOptions(block : model_SELinuxOptions.() -> Unit = {}): model_SELinuxOptions {
  val instance = model_SELinuxOptions()
  instance.block()
  return instance
}


fun newScaleIOPersistentVolumeSource(block : model_ScaleIOPersistentVolumeSource.() -> Unit = {}): model_ScaleIOPersistentVolumeSource {
  val instance = model_ScaleIOPersistentVolumeSource()
  instance.block()
  return instance
}


fun newScaleIOVolumeSource(block : model_ScaleIOVolumeSource.() -> Unit = {}): model_ScaleIOVolumeSource {
  val instance = model_ScaleIOVolumeSource()
  instance.block()
  return instance
}


fun newScopeSelector(block : model_ScopeSelector.() -> Unit = {}): model_ScopeSelector {
  val instance = model_ScopeSelector()
  instance.block()
  return instance
}


fun newScopedResourceSelectorRequirement(block : model_ScopedResourceSelectorRequirement.() -> Unit = {}): model_ScopedResourceSelectorRequirement {
  val instance = model_ScopedResourceSelectorRequirement()
  instance.block()
  return instance
}


fun newSeccompProfile(block : model_SeccompProfile.() -> Unit = {}): model_SeccompProfile {
  val instance = model_SeccompProfile()
  instance.block()
  return instance
}


fun newSecret(block : model_Secret.() -> Unit = {}): model_Secret {
  val instance = model_Secret()
  instance.block()
  return instance
}


fun newSecretEnvSource(block : model_SecretEnvSource.() -> Unit = {}): model_SecretEnvSource {
  val instance = model_SecretEnvSource()
  instance.block()
  return instance
}


fun newSecretKeySelector(block : model_SecretKeySelector.() -> Unit = {}): model_SecretKeySelector {
  val instance = model_SecretKeySelector()
  instance.block()
  return instance
}


fun newSecretList(block : model_SecretList.() -> Unit = {}): model_SecretList {
  val instance = model_SecretList()
  instance.block()
  return instance
}


fun newSecretProjection(block : model_SecretProjection.() -> Unit = {}): model_SecretProjection {
  val instance = model_SecretProjection()
  instance.block()
  return instance
}


fun newSecretReference(block : model_SecretReference.() -> Unit = {}): model_SecretReference {
  val instance = model_SecretReference()
  instance.block()
  return instance
}


fun newSecretVolumeSource(block : model_SecretVolumeSource.() -> Unit = {}): model_SecretVolumeSource {
  val instance = model_SecretVolumeSource()
  instance.block()
  return instance
}


fun newSecurityContext(block : model_SecurityContext.() -> Unit = {}): model_SecurityContext {
  val instance = model_SecurityContext()
  instance.block()
  return instance
}


fun newServerAddressByClientCIDR(block : model_ServerAddressByClientCIDR.() -> Unit = {}): model_ServerAddressByClientCIDR {
  val instance = model_ServerAddressByClientCIDR()
  instance.block()
  return instance
}


fun newService(block : model_Service.() -> Unit = {}): model_Service {
  val instance = model_Service()
  instance.block()
  return instance
}


fun newServiceAccount(block : model_ServiceAccount.() -> Unit = {}): model_ServiceAccount {
  val instance = model_ServiceAccount()
  instance.block()
  return instance
}


fun newServiceAccountList(block : model_ServiceAccountList.() -> Unit = {}): model_ServiceAccountList {
  val instance = model_ServiceAccountList()
  instance.block()
  return instance
}


fun newServiceAccountTokenProjection(block : model_ServiceAccountTokenProjection.() -> Unit = {}): model_ServiceAccountTokenProjection {
  val instance = model_ServiceAccountTokenProjection()
  instance.block()
  return instance
}


fun newServiceList(block : model_ServiceList.() -> Unit = {}): model_ServiceList {
  val instance = model_ServiceList()
  instance.block()
  return instance
}


fun newServicePort(block : model_ServicePort.() -> Unit = {}): model_ServicePort {
  val instance = model_ServicePort()
  instance.block()
  return instance
}


fun newServiceReference(block : model_ServiceReference.() -> Unit = {}): model_ServiceReference {
  val instance = model_ServiceReference()
  instance.block()
  return instance
}


fun newServiceSpec(block : model_ServiceSpec.() -> Unit = {}): model_ServiceSpec {
  val instance = model_ServiceSpec()
  instance.block()
  return instance
}


fun newServiceStatus(block : model_ServiceStatus.() -> Unit = {}): model_ServiceStatus {
  val instance = model_ServiceStatus()
  instance.block()
  return instance
}


fun newSessionAffinityConfig(block : model_SessionAffinityConfig.() -> Unit = {}): model_SessionAffinityConfig {
  val instance = model_SessionAffinityConfig()
  instance.block()
  return instance
}


fun newStatus(block : model_Status.() -> Unit = {}): model_Status {
  val instance = model_Status()
  instance.block()
  return instance
}


fun newStatusCause(block : model_StatusCause.() -> Unit = {}): model_StatusCause {
  val instance = model_StatusCause()
  instance.block()
  return instance
}


fun newStatusDetails(block : model_StatusDetails.() -> Unit = {}): model_StatusDetails {
  val instance = model_StatusDetails()
  instance.block()
  return instance
}


fun newStorageOSPersistentVolumeSource(block : model_StorageOSPersistentVolumeSource.() -> Unit = {}): model_StorageOSPersistentVolumeSource {
  val instance = model_StorageOSPersistentVolumeSource()
  instance.block()
  return instance
}


fun newStorageOSVolumeSource(block : model_StorageOSVolumeSource.() -> Unit = {}): model_StorageOSVolumeSource {
  val instance = model_StorageOSVolumeSource()
  instance.block()
  return instance
}


fun newSysctl(block : model_Sysctl.() -> Unit = {}): model_Sysctl {
  val instance = model_Sysctl()
  instance.block()
  return instance
}


fun newTCPSocketAction(block : model_TCPSocketAction.() -> Unit = {}): model_TCPSocketAction {
  val instance = model_TCPSocketAction()
  instance.block()
  return instance
}


fun newTaint(block : model_Taint.() -> Unit = {}): model_Taint {
  val instance = model_Taint()
  instance.block()
  return instance
}


fun newToleration(block : model_Toleration.() -> Unit = {}): model_Toleration {
  val instance = model_Toleration()
  instance.block()
  return instance
}


fun newTopologySelectorLabelRequirement(block : model_TopologySelectorLabelRequirement.() -> Unit = {}): model_TopologySelectorLabelRequirement {
  val instance = model_TopologySelectorLabelRequirement()
  instance.block()
  return instance
}


fun newTopologySelectorTerm(block : model_TopologySelectorTerm.() -> Unit = {}): model_TopologySelectorTerm {
  val instance = model_TopologySelectorTerm()
  instance.block()
  return instance
}


fun newTopologySpreadConstraint(block : model_TopologySpreadConstraint.() -> Unit = {}): model_TopologySpreadConstraint {
  val instance = model_TopologySpreadConstraint()
  instance.block()
  return instance
}


fun newTypeMeta(block : model_TypeMeta.() -> Unit = {}): model_TypeMeta {
  val instance = model_TypeMeta()
  instance.block()
  return instance
}


fun newTypedLocalObjectReference(block : model_TypedLocalObjectReference.() -> Unit = {}): model_TypedLocalObjectReference {
  val instance = model_TypedLocalObjectReference()
  instance.block()
  return instance
}


fun newUpdateOptions(block : model_UpdateOptions.() -> Unit = {}): model_UpdateOptions {
  val instance = model_UpdateOptions()
  instance.block()
  return instance
}


fun newVolume(block : model_Volume.() -> Unit = {}): model_Volume {
  val instance = model_Volume()
  instance.block()
  return instance
}


fun newVolumeDevice(block : model_VolumeDevice.() -> Unit = {}): model_VolumeDevice {
  val instance = model_VolumeDevice()
  instance.block()
  return instance
}


fun newVolumeMount(block : model_VolumeMount.() -> Unit = {}): model_VolumeMount {
  val instance = model_VolumeMount()
  instance.block()
  return instance
}


fun newVolumeNodeAffinity(block : model_VolumeNodeAffinity.() -> Unit = {}): model_VolumeNodeAffinity {
  val instance = model_VolumeNodeAffinity()
  instance.block()
  return instance
}


fun newVolumeProjection(block : model_VolumeProjection.() -> Unit = {}): model_VolumeProjection {
  val instance = model_VolumeProjection()
  instance.block()
  return instance
}


fun newVsphereVirtualDiskVolumeSource(block : model_VsphereVirtualDiskVolumeSource.() -> Unit = {}): model_VsphereVirtualDiskVolumeSource {
  val instance = model_VsphereVirtualDiskVolumeSource()
  instance.block()
  return instance
}


fun newWatchEvent(block : model_WatchEvent.() -> Unit = {}): model_WatchEvent {
  val instance = model_WatchEvent()
  instance.block()
  return instance
}


fun newWeightedPodAffinityTerm(block : model_WeightedPodAffinityTerm.() -> Unit = {}): model_WeightedPodAffinityTerm {
  val instance = model_WeightedPodAffinityTerm()
  instance.block()
  return instance
}


fun newWindowsSecurityContextOptions(block : model_WindowsSecurityContextOptions.() -> Unit = {}): model_WindowsSecurityContextOptions {
  val instance = model_WindowsSecurityContextOptions()
  instance.block()
  return instance
}


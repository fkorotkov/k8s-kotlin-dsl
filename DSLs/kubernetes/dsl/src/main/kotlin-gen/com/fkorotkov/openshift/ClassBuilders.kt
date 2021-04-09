// GENERATE
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServer as model_APIServer
import io.fabric8.openshift.api.model.APIServerEncryption as model_APIServerEncryption
import io.fabric8.openshift.api.model.APIServerList as model_APIServerList
import io.fabric8.openshift.api.model.APIServerNamedServingCert as model_APIServerNamedServingCert
import io.fabric8.openshift.api.model.APIServerServingCerts as model_APIServerServingCerts
import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec
import io.fabric8.openshift.api.model.APIServerStatus as model_APIServerStatus
import io.fabric8.openshift.api.model.AWSPlatformSpec as model_AWSPlatformSpec
import io.fabric8.openshift.api.model.AWSPlatformStatus as model_AWSPlatformStatus
import io.fabric8.openshift.api.model.AWSServiceEndpoint as model_AWSServiceEndpoint
import io.fabric8.openshift.api.model.AllowedFlexVolume as model_AllowedFlexVolume
import io.fabric8.openshift.api.model.AppliedClusterResourceQuota as model_AppliedClusterResourceQuota
import io.fabric8.openshift.api.model.AppliedClusterResourceQuotaList as model_AppliedClusterResourceQuotaList
import io.fabric8.openshift.api.model.Audit as model_Audit
import io.fabric8.openshift.api.model.AzurePlatformSpec as model_AzurePlatformSpec
import io.fabric8.openshift.api.model.AzurePlatformStatus as model_AzurePlatformStatus
import io.fabric8.openshift.api.model.BareMetalPlatformSpec as model_BareMetalPlatformSpec
import io.fabric8.openshift.api.model.BareMetalPlatformStatus as model_BareMetalPlatformStatus
import io.fabric8.openshift.api.model.BasicAuthIdentityProvider as model_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.BinaryBuildSource as model_BinaryBuildSource
import io.fabric8.openshift.api.model.BitbucketWebHookCause as model_BitbucketWebHookCause
import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildCondition as model_BuildCondition
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigList as model_BuildConfigList
import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildConfigStatus as model_BuildConfigStatus
import io.fabric8.openshift.api.model.BuildList as model_BuildList
import io.fabric8.openshift.api.model.BuildOutput as model_BuildOutput
import io.fabric8.openshift.api.model.BuildPostCommitSpec as model_BuildPostCommitSpec
import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.BuildSource as model_BuildSource
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.BuildStatus as model_BuildStatus
import io.fabric8.openshift.api.model.BuildStatusOutput as model_BuildStatusOutput
import io.fabric8.openshift.api.model.BuildStatusOutputTo as model_BuildStatusOutputTo
import io.fabric8.openshift.api.model.BuildStrategy as model_BuildStrategy
import io.fabric8.openshift.api.model.BuildTriggerCause as model_BuildTriggerCause
import io.fabric8.openshift.api.model.BuildTriggerPolicy as model_BuildTriggerPolicy
import io.fabric8.openshift.api.model.ClusterNetwork as model_ClusterNetwork
import io.fabric8.openshift.api.model.ClusterNetworkEntry as model_ClusterNetworkEntry
import io.fabric8.openshift.api.model.ClusterNetworkList as model_ClusterNetworkList
import io.fabric8.openshift.api.model.ClusterOperator as model_ClusterOperator
import io.fabric8.openshift.api.model.ClusterOperatorList as model_ClusterOperatorList
import io.fabric8.openshift.api.model.ClusterOperatorSpec as model_ClusterOperatorSpec
import io.fabric8.openshift.api.model.ClusterOperatorStatus as model_ClusterOperatorStatus
import io.fabric8.openshift.api.model.ClusterOperatorStatusCondition as model_ClusterOperatorStatusCondition
import io.fabric8.openshift.api.model.ClusterResourceQuota as model_ClusterResourceQuota
import io.fabric8.openshift.api.model.ClusterResourceQuotaList as model_ClusterResourceQuotaList
import io.fabric8.openshift.api.model.ClusterResourceQuotaSelector as model_ClusterResourceQuotaSelector
import io.fabric8.openshift.api.model.ClusterResourceQuotaSpec as model_ClusterResourceQuotaSpec
import io.fabric8.openshift.api.model.ClusterResourceQuotaStatus as model_ClusterResourceQuotaStatus
import io.fabric8.openshift.api.model.ClusterRole as model_ClusterRole
import io.fabric8.openshift.api.model.ClusterRoleBinding as model_ClusterRoleBinding
import io.fabric8.openshift.api.model.ClusterRoleBindingList as model_ClusterRoleBindingList
import io.fabric8.openshift.api.model.ClusterRoleList as model_ClusterRoleList
import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction as model_ClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ClusterVersion as model_ClusterVersion
import io.fabric8.openshift.api.model.ClusterVersionList as model_ClusterVersionList
import io.fabric8.openshift.api.model.ClusterVersionSpec as model_ClusterVersionSpec
import io.fabric8.openshift.api.model.ClusterVersionStatus as model_ClusterVersionStatus
import io.fabric8.openshift.api.model.ComponentOverride as model_ComponentOverride
import io.fabric8.openshift.api.model.ConfigMapBuildSource as model_ConfigMapBuildSource
import io.fabric8.openshift.api.model.ConfigMapFileReference as model_ConfigMapFileReference
import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference
import io.fabric8.openshift.api.model.CustomBuildStrategy as model_CustomBuildStrategy
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams as model_CustomDeploymentStrategyParams
import io.fabric8.openshift.api.model.CustomFeatureGates as model_CustomFeatureGates
import io.fabric8.openshift.api.model.CustomTLSProfile as model_CustomTLSProfile
import io.fabric8.openshift.api.model.DNSZone as model_DNSZone
import io.fabric8.openshift.api.model.DeploymentCause as model_DeploymentCause
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger as model_DeploymentCauseImageTrigger
import io.fabric8.openshift.api.model.DeploymentCondition as model_DeploymentCondition
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigList as model_DeploymentConfigList
import io.fabric8.openshift.api.model.DeploymentConfigSpec as model_DeploymentConfigSpec
import io.fabric8.openshift.api.model.DeploymentConfigStatus as model_DeploymentConfigStatus
import io.fabric8.openshift.api.model.DeploymentDetails as model_DeploymentDetails
import io.fabric8.openshift.api.model.DeploymentStrategy as model_DeploymentStrategy
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams as model_DeploymentTriggerImageChangeParams
import io.fabric8.openshift.api.model.DeploymentTriggerPolicy as model_DeploymentTriggerPolicy
import io.fabric8.openshift.api.model.DockerBuildStrategy as model_DockerBuildStrategy
import io.fabric8.openshift.api.model.DockerStrategyOptions as model_DockerStrategyOptions
import io.fabric8.openshift.api.model.EgressNetworkPolicy as model_EgressNetworkPolicy
import io.fabric8.openshift.api.model.EgressNetworkPolicyList as model_EgressNetworkPolicyList
import io.fabric8.openshift.api.model.EgressNetworkPolicyPeer as model_EgressNetworkPolicyPeer
import io.fabric8.openshift.api.model.EgressNetworkPolicyRule as model_EgressNetworkPolicyRule
import io.fabric8.openshift.api.model.EgressNetworkPolicySpec as model_EgressNetworkPolicySpec
import io.fabric8.openshift.api.model.ExecNewPodHook as model_ExecNewPodHook
import io.fabric8.openshift.api.model.FSGroupStrategyOptions as model_FSGroupStrategyOptions
import io.fabric8.openshift.api.model.FeatureGate as model_FeatureGate
import io.fabric8.openshift.api.model.FeatureGateList as model_FeatureGateList
import io.fabric8.openshift.api.model.FeatureGateSpec as model_FeatureGateSpec
import io.fabric8.openshift.api.model.FeatureGateStatus as model_FeatureGateStatus
import io.fabric8.openshift.api.model.GCPPlatformSpec as model_GCPPlatformSpec
import io.fabric8.openshift.api.model.GCPPlatformStatus as model_GCPPlatformStatus
import io.fabric8.openshift.api.model.GenericWebHookCause as model_GenericWebHookCause
import io.fabric8.openshift.api.model.GitBuildSource as model_GitBuildSource
import io.fabric8.openshift.api.model.GitHubIdentityProvider as model_GitHubIdentityProvider
import io.fabric8.openshift.api.model.GitHubWebHookCause as model_GitHubWebHookCause
import io.fabric8.openshift.api.model.GitLabIdentityProvider as model_GitLabIdentityProvider
import io.fabric8.openshift.api.model.GitLabWebHookCause as model_GitLabWebHookCause
import io.fabric8.openshift.api.model.GitSourceRevision as model_GitSourceRevision
import io.fabric8.openshift.api.model.GoogleIdentityProvider as model_GoogleIdentityProvider
import io.fabric8.openshift.api.model.Group as model_Group
import io.fabric8.openshift.api.model.GroupList as model_GroupList
import io.fabric8.openshift.api.model.GroupRestriction as model_GroupRestriction
import io.fabric8.openshift.api.model.HTPasswdIdentityProvider as model_HTPasswdIdentityProvider
import io.fabric8.openshift.api.model.HubSource as model_HubSource
import io.fabric8.openshift.api.model.HubSourceStatus as model_HubSourceStatus
import io.fabric8.openshift.api.model.IBMCloudPlatformSpec as model_IBMCloudPlatformSpec
import io.fabric8.openshift.api.model.IBMCloudPlatformStatus as model_IBMCloudPlatformStatus
import io.fabric8.openshift.api.model.IDRange as model_IDRange
import io.fabric8.openshift.api.model.Identity as model_Identity
import io.fabric8.openshift.api.model.IdentityList as model_IdentityList
import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.Image as model_Image
import io.fabric8.openshift.api.model.ImageChangeCause as model_ImageChangeCause
import io.fabric8.openshift.api.model.ImageChangeTrigger as model_ImageChangeTrigger
import io.fabric8.openshift.api.model.ImageImportSpec as model_ImageImportSpec
import io.fabric8.openshift.api.model.ImageImportStatus as model_ImageImportStatus
import io.fabric8.openshift.api.model.ImageLabel as model_ImageLabel
import io.fabric8.openshift.api.model.ImageLayer as model_ImageLayer
import io.fabric8.openshift.api.model.ImageList as model_ImageList
import io.fabric8.openshift.api.model.ImageLookupPolicy as model_ImageLookupPolicy
import io.fabric8.openshift.api.model.ImageSignature as model_ImageSignature
import io.fabric8.openshift.api.model.ImageSource as model_ImageSource
import io.fabric8.openshift.api.model.ImageSourcePath as model_ImageSourcePath
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImage as model_ImageStreamImage
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportSpec as model_ImageStreamImportSpec
import io.fabric8.openshift.api.model.ImageStreamImportStatus as model_ImageStreamImportStatus
import io.fabric8.openshift.api.model.ImageStreamList as model_ImageStreamList
import io.fabric8.openshift.api.model.ImageStreamMapping as model_ImageStreamMapping
import io.fabric8.openshift.api.model.ImageStreamSpec as model_ImageStreamSpec
import io.fabric8.openshift.api.model.ImageStreamStatus as model_ImageStreamStatus
import io.fabric8.openshift.api.model.ImageStreamTag as model_ImageStreamTag
import io.fabric8.openshift.api.model.ImageStreamTagList as model_ImageStreamTagList
import io.fabric8.openshift.api.model.ImageTag as model_ImageTag
import io.fabric8.openshift.api.model.ImageTagList as model_ImageTagList
import io.fabric8.openshift.api.model.Infrastructure as model_Infrastructure
import io.fabric8.openshift.api.model.InfrastructureList as model_InfrastructureList
import io.fabric8.openshift.api.model.InfrastructureSpec as model_InfrastructureSpec
import io.fabric8.openshift.api.model.InfrastructureStatus as model_InfrastructureStatus
import io.fabric8.openshift.api.model.Ingress as model_Ingress
import io.fabric8.openshift.api.model.IngressList as model_IngressList
import io.fabric8.openshift.api.model.IngressSpec as model_IngressSpec
import io.fabric8.openshift.api.model.IngressStatus as model_IngressStatus
import io.fabric8.openshift.api.model.IntermediateTLSProfile as model_IntermediateTLSProfile
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy as model_JenkinsPipelineBuildStrategy
import io.fabric8.openshift.api.model.KeystoneIdentityProvider as model_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.LDAPAttributeMapping as model_LDAPAttributeMapping
import io.fabric8.openshift.api.model.LDAPIdentityProvider as model_LDAPIdentityProvider
import io.fabric8.openshift.api.model.LifecycleHook as model_LifecycleHook
import io.fabric8.openshift.api.model.LocalResourceAccessReview as model_LocalResourceAccessReview
import io.fabric8.openshift.api.model.LocalSubjectAccessReview as model_LocalSubjectAccessReview
import io.fabric8.openshift.api.model.ModernTLSProfile as model_ModernTLSProfile
import io.fabric8.openshift.api.model.NamedTagEventList as model_NamedTagEventList
import io.fabric8.openshift.api.model.NetNamespace as model_NetNamespace
import io.fabric8.openshift.api.model.NetNamespaceList as model_NetNamespaceList
import io.fabric8.openshift.api.model.OAuth as model_OAuth
import io.fabric8.openshift.api.model.OAuthAccessToken as model_OAuthAccessToken
import io.fabric8.openshift.api.model.OAuthAccessTokenList as model_OAuthAccessTokenList
import io.fabric8.openshift.api.model.OAuthAuthorizeToken as model_OAuthAuthorizeToken
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList as model_OAuthAuthorizeTokenList
import io.fabric8.openshift.api.model.OAuthClient as model_OAuthClient
import io.fabric8.openshift.api.model.OAuthClientAuthorization as model_OAuthClientAuthorization
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList as model_OAuthClientAuthorizationList
import io.fabric8.openshift.api.model.OAuthClientList as model_OAuthClientList
import io.fabric8.openshift.api.model.OAuthList as model_OAuthList
import io.fabric8.openshift.api.model.OAuthSpec as model_OAuthSpec
import io.fabric8.openshift.api.model.OAuthStatus as model_OAuthStatus
import io.fabric8.openshift.api.model.OAuthTemplates as model_OAuthTemplates
import io.fabric8.openshift.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.OldTLSProfile as model_OldTLSProfile
import io.fabric8.openshift.api.model.OpenIDClaims as model_OpenIDClaims
import io.fabric8.openshift.api.model.OpenIDIdentityProvider as model_OpenIDIdentityProvider
import io.fabric8.openshift.api.model.OpenStackPlatformSpec as model_OpenStackPlatformSpec
import io.fabric8.openshift.api.model.OpenStackPlatformStatus as model_OpenStackPlatformStatus
import io.fabric8.openshift.api.model.OperandVersion as model_OperandVersion
import io.fabric8.openshift.api.model.OperatorHub as model_OperatorHub
import io.fabric8.openshift.api.model.OperatorHubList as model_OperatorHubList
import io.fabric8.openshift.api.model.OperatorHubSpec as model_OperatorHubSpec
import io.fabric8.openshift.api.model.OperatorHubStatus as model_OperatorHubStatus
import io.fabric8.openshift.api.model.OvirtPlatformSpec as model_OvirtPlatformSpec
import io.fabric8.openshift.api.model.OvirtPlatformStatus as model_OvirtPlatformStatus
import io.fabric8.openshift.api.model.Parameter as model_Parameter
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus
import io.fabric8.openshift.api.model.PodSecurityPolicyReview as model_PodSecurityPolicyReview
import io.fabric8.openshift.api.model.PodSecurityPolicyReviewSpec as model_PodSecurityPolicyReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicyReviewStatus as model_PodSecurityPolicyReviewStatus
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReview as model_PodSecurityPolicySelfSubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReviewSpec as model_PodSecurityPolicySelfSubjectReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReview as model_PodSecurityPolicySubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewSpec as model_PodSecurityPolicySubjectReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewStatus as model_PodSecurityPolicySubjectReviewStatus
import io.fabric8.openshift.api.model.PolicyRule as model_PolicyRule
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectList as model_ProjectList
import io.fabric8.openshift.api.model.ProjectRequest as model_ProjectRequest
import io.fabric8.openshift.api.model.ProjectSpec as model_ProjectSpec
import io.fabric8.openshift.api.model.ProjectStatus as model_ProjectStatus
import io.fabric8.openshift.api.model.Proxy as model_Proxy
import io.fabric8.openshift.api.model.ProxyList as model_ProxyList
import io.fabric8.openshift.api.model.ProxySpec as model_ProxySpec
import io.fabric8.openshift.api.model.ProxyStatus as model_ProxyStatus
import io.fabric8.openshift.api.model.RangeAllocation as model_RangeAllocation
import io.fabric8.openshift.api.model.RangeAllocationList as model_RangeAllocationList
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams as model_RecreateDeploymentStrategyParams
import io.fabric8.openshift.api.model.Release as model_Release
import io.fabric8.openshift.api.model.RepositoryImportSpec as model_RepositoryImportSpec
import io.fabric8.openshift.api.model.RepositoryImportStatus as model_RepositoryImportStatus
import io.fabric8.openshift.api.model.RequestHeaderIdentityProvider as model_RequestHeaderIdentityProvider
import io.fabric8.openshift.api.model.ResourceAccessReview as model_ResourceAccessReview
import io.fabric8.openshift.api.model.ResourceQuotaStatusByNamespace as model_ResourceQuotaStatusByNamespace
import io.fabric8.openshift.api.model.Role as model_Role
import io.fabric8.openshift.api.model.RoleBinding as model_RoleBinding
import io.fabric8.openshift.api.model.RoleBindingList as model_RoleBindingList
import io.fabric8.openshift.api.model.RoleBindingRestriction as model_RoleBindingRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec as model_RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.RoleList as model_RoleList
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams as model_RollingDeploymentStrategyParams
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteIngress as model_RouteIngress
import io.fabric8.openshift.api.model.RouteIngressCondition as model_RouteIngressCondition
import io.fabric8.openshift.api.model.RouteList as model_RouteList
import io.fabric8.openshift.api.model.RoutePort as model_RoutePort
import io.fabric8.openshift.api.model.RouteSpec as model_RouteSpec
import io.fabric8.openshift.api.model.RouteStatus as model_RouteStatus
import io.fabric8.openshift.api.model.RouteTargetReference as model_RouteTargetReference
import io.fabric8.openshift.api.model.RunAsUserStrategyOptions as model_RunAsUserStrategyOptions
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions as model_SELinuxContextStrategyOptions
import io.fabric8.openshift.api.model.Scheduler as model_Scheduler
import io.fabric8.openshift.api.model.SchedulerList as model_SchedulerList
import io.fabric8.openshift.api.model.SchedulerSpec as model_SchedulerSpec
import io.fabric8.openshift.api.model.SchedulerStatus as model_SchedulerStatus
import io.fabric8.openshift.api.model.ScopeRestriction as model_ScopeRestriction
import io.fabric8.openshift.api.model.SecretBuildSource as model_SecretBuildSource
import io.fabric8.openshift.api.model.SecretLocalReference as model_SecretLocalReference
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference
import io.fabric8.openshift.api.model.SecretSpec as model_SecretSpec
import io.fabric8.openshift.api.model.SecurityContextConstraints as model_SecurityContextConstraints
import io.fabric8.openshift.api.model.SecurityContextConstraintsList as model_SecurityContextConstraintsList
import io.fabric8.openshift.api.model.SelfSubjectRulesReview as model_SelfSubjectRulesReview
import io.fabric8.openshift.api.model.SelfSubjectRulesReviewSpec as model_SelfSubjectRulesReviewSpec
import io.fabric8.openshift.api.model.ServiceAccountPodSecurityPolicyReviewStatus as model_ServiceAccountPodSecurityPolicyReviewStatus
import io.fabric8.openshift.api.model.ServiceAccountReference as model_ServiceAccountReference
import io.fabric8.openshift.api.model.ServiceAccountRestriction as model_ServiceAccountRestriction
import io.fabric8.openshift.api.model.SignatureCondition as model_SignatureCondition
import io.fabric8.openshift.api.model.SignatureIssuer as model_SignatureIssuer
import io.fabric8.openshift.api.model.SignatureSubject as model_SignatureSubject
import io.fabric8.openshift.api.model.SourceBuildStrategy as model_SourceBuildStrategy
import io.fabric8.openshift.api.model.SourceControlUser as model_SourceControlUser
import io.fabric8.openshift.api.model.SourceRevision as model_SourceRevision
import io.fabric8.openshift.api.model.SourceStrategyOptions as model_SourceStrategyOptions
import io.fabric8.openshift.api.model.StageInfo as model_StageInfo
import io.fabric8.openshift.api.model.StepInfo as model_StepInfo
import io.fabric8.openshift.api.model.SubjectAccessReview as model_SubjectAccessReview
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse as model_SubjectAccessReviewResponse
import io.fabric8.openshift.api.model.SubjectRulesReview as model_SubjectRulesReview
import io.fabric8.openshift.api.model.SubjectRulesReviewSpec as model_SubjectRulesReviewSpec
import io.fabric8.openshift.api.model.SubjectRulesReviewStatus as model_SubjectRulesReviewStatus
import io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions as model_SupplementalGroupsStrategyOptions
import io.fabric8.openshift.api.model.TLSConfig as model_TLSConfig
import io.fabric8.openshift.api.model.TLSProfileSpec as model_TLSProfileSpec
import io.fabric8.openshift.api.model.TLSSecurityProfile as model_TLSSecurityProfile
import io.fabric8.openshift.api.model.TagEvent as model_TagEvent
import io.fabric8.openshift.api.model.TagEventCondition as model_TagEventCondition
import io.fabric8.openshift.api.model.TagImageHook as model_TagImageHook
import io.fabric8.openshift.api.model.TagImportPolicy as model_TagImportPolicy
import io.fabric8.openshift.api.model.TagReference as model_TagReference
import io.fabric8.openshift.api.model.TagReferencePolicy as model_TagReferencePolicy
import io.fabric8.openshift.api.model.Template as model_Template
import io.fabric8.openshift.api.model.TemplateList as model_TemplateList
import io.fabric8.openshift.api.model.TokenConfig as model_TokenConfig
import io.fabric8.openshift.api.model.Update as model_Update
import io.fabric8.openshift.api.model.UpdateHistory as model_UpdateHistory
import io.fabric8.openshift.api.model.User as model_User
import io.fabric8.openshift.api.model.UserList as model_UserList
import io.fabric8.openshift.api.model.UserRestriction as model_UserRestriction
import io.fabric8.openshift.api.model.VSpherePlatformSpec as model_VSpherePlatformSpec
import io.fabric8.openshift.api.model.VSpherePlatformStatus as model_VSpherePlatformStatus
import io.fabric8.openshift.api.model.WebHookTrigger as model_WebHookTrigger


fun newAPIServer(block : model_APIServer.() -> Unit = {}): model_APIServer {
  val instance = model_APIServer()
  instance.block()
  return instance
}


fun newAPIServerEncryption(block : model_APIServerEncryption.() -> Unit = {}): model_APIServerEncryption {
  val instance = model_APIServerEncryption()
  instance.block()
  return instance
}


fun newAPIServerList(block : model_APIServerList.() -> Unit = {}): model_APIServerList {
  val instance = model_APIServerList()
  instance.block()
  return instance
}


fun newAPIServerNamedServingCert(block : model_APIServerNamedServingCert.() -> Unit = {}): model_APIServerNamedServingCert {
  val instance = model_APIServerNamedServingCert()
  instance.block()
  return instance
}


fun newAPIServerServingCerts(block : model_APIServerServingCerts.() -> Unit = {}): model_APIServerServingCerts {
  val instance = model_APIServerServingCerts()
  instance.block()
  return instance
}


fun newAPIServerSpec(block : model_APIServerSpec.() -> Unit = {}): model_APIServerSpec {
  val instance = model_APIServerSpec()
  instance.block()
  return instance
}


fun newAPIServerStatus(block : model_APIServerStatus.() -> Unit = {}): model_APIServerStatus {
  val instance = model_APIServerStatus()
  instance.block()
  return instance
}


fun newAWSPlatformSpec(block : model_AWSPlatformSpec.() -> Unit = {}): model_AWSPlatformSpec {
  val instance = model_AWSPlatformSpec()
  instance.block()
  return instance
}


fun newAWSPlatformStatus(block : model_AWSPlatformStatus.() -> Unit = {}): model_AWSPlatformStatus {
  val instance = model_AWSPlatformStatus()
  instance.block()
  return instance
}


fun newAWSServiceEndpoint(block : model_AWSServiceEndpoint.() -> Unit = {}): model_AWSServiceEndpoint {
  val instance = model_AWSServiceEndpoint()
  instance.block()
  return instance
}


fun newAllowedFlexVolume(block : model_AllowedFlexVolume.() -> Unit = {}): model_AllowedFlexVolume {
  val instance = model_AllowedFlexVolume()
  instance.block()
  return instance
}


fun newAppliedClusterResourceQuota(block : model_AppliedClusterResourceQuota.() -> Unit = {}): model_AppliedClusterResourceQuota {
  val instance = model_AppliedClusterResourceQuota()
  instance.block()
  return instance
}


fun newAppliedClusterResourceQuotaList(block : model_AppliedClusterResourceQuotaList.() -> Unit = {}): model_AppliedClusterResourceQuotaList {
  val instance = model_AppliedClusterResourceQuotaList()
  instance.block()
  return instance
}


fun newAudit(block : model_Audit.() -> Unit = {}): model_Audit {
  val instance = model_Audit()
  instance.block()
  return instance
}


fun newAzurePlatformSpec(block : model_AzurePlatformSpec.() -> Unit = {}): model_AzurePlatformSpec {
  val instance = model_AzurePlatformSpec()
  instance.block()
  return instance
}


fun newAzurePlatformStatus(block : model_AzurePlatformStatus.() -> Unit = {}): model_AzurePlatformStatus {
  val instance = model_AzurePlatformStatus()
  instance.block()
  return instance
}


fun newBareMetalPlatformSpec(block : model_BareMetalPlatformSpec.() -> Unit = {}): model_BareMetalPlatformSpec {
  val instance = model_BareMetalPlatformSpec()
  instance.block()
  return instance
}


fun newBareMetalPlatformStatus(block : model_BareMetalPlatformStatus.() -> Unit = {}): model_BareMetalPlatformStatus {
  val instance = model_BareMetalPlatformStatus()
  instance.block()
  return instance
}


fun newBasicAuthIdentityProvider(block : model_BasicAuthIdentityProvider.() -> Unit = {}): model_BasicAuthIdentityProvider {
  val instance = model_BasicAuthIdentityProvider()
  instance.block()
  return instance
}


fun newBinaryBuildSource(block : model_BinaryBuildSource.() -> Unit = {}): model_BinaryBuildSource {
  val instance = model_BinaryBuildSource()
  instance.block()
  return instance
}


fun newBitbucketWebHookCause(block : model_BitbucketWebHookCause.() -> Unit = {}): model_BitbucketWebHookCause {
  val instance = model_BitbucketWebHookCause()
  instance.block()
  return instance
}


fun newBuild(block : model_Build.() -> Unit = {}): model_Build {
  val instance = model_Build()
  instance.block()
  return instance
}


fun newBuildCondition(block : model_BuildCondition.() -> Unit = {}): model_BuildCondition {
  val instance = model_BuildCondition()
  instance.block()
  return instance
}


fun newBuildConfig(block : model_BuildConfig.() -> Unit = {}): model_BuildConfig {
  val instance = model_BuildConfig()
  instance.block()
  return instance
}


fun newBuildConfigList(block : model_BuildConfigList.() -> Unit = {}): model_BuildConfigList {
  val instance = model_BuildConfigList()
  instance.block()
  return instance
}


fun newBuildConfigSpec(block : model_BuildConfigSpec.() -> Unit = {}): model_BuildConfigSpec {
  val instance = model_BuildConfigSpec()
  instance.block()
  return instance
}


fun newBuildConfigStatus(block : model_BuildConfigStatus.() -> Unit = {}): model_BuildConfigStatus {
  val instance = model_BuildConfigStatus()
  instance.block()
  return instance
}


fun newBuildList(block : model_BuildList.() -> Unit = {}): model_BuildList {
  val instance = model_BuildList()
  instance.block()
  return instance
}


fun newBuildOutput(block : model_BuildOutput.() -> Unit = {}): model_BuildOutput {
  val instance = model_BuildOutput()
  instance.block()
  return instance
}


fun newBuildPostCommitSpec(block : model_BuildPostCommitSpec.() -> Unit = {}): model_BuildPostCommitSpec {
  val instance = model_BuildPostCommitSpec()
  instance.block()
  return instance
}


fun newBuildRequest(block : model_BuildRequest.() -> Unit = {}): model_BuildRequest {
  val instance = model_BuildRequest()
  instance.block()
  return instance
}


fun newBuildSource(block : model_BuildSource.() -> Unit = {}): model_BuildSource {
  val instance = model_BuildSource()
  instance.block()
  return instance
}


fun newBuildSpec(block : model_BuildSpec.() -> Unit = {}): model_BuildSpec {
  val instance = model_BuildSpec()
  instance.block()
  return instance
}


fun newBuildStatus(block : model_BuildStatus.() -> Unit = {}): model_BuildStatus {
  val instance = model_BuildStatus()
  instance.block()
  return instance
}


fun newBuildStatusOutput(block : model_BuildStatusOutput.() -> Unit = {}): model_BuildStatusOutput {
  val instance = model_BuildStatusOutput()
  instance.block()
  return instance
}


fun newBuildStatusOutputTo(block : model_BuildStatusOutputTo.() -> Unit = {}): model_BuildStatusOutputTo {
  val instance = model_BuildStatusOutputTo()
  instance.block()
  return instance
}


fun newBuildStrategy(block : model_BuildStrategy.() -> Unit = {}): model_BuildStrategy {
  val instance = model_BuildStrategy()
  instance.block()
  return instance
}


fun newBuildTriggerCause(block : model_BuildTriggerCause.() -> Unit = {}): model_BuildTriggerCause {
  val instance = model_BuildTriggerCause()
  instance.block()
  return instance
}


fun newBuildTriggerPolicy(block : model_BuildTriggerPolicy.() -> Unit = {}): model_BuildTriggerPolicy {
  val instance = model_BuildTriggerPolicy()
  instance.block()
  return instance
}


fun newClusterNetwork(block : model_ClusterNetwork.() -> Unit = {}): model_ClusterNetwork {
  val instance = model_ClusterNetwork()
  instance.block()
  return instance
}


fun newClusterNetworkEntry(block : model_ClusterNetworkEntry.() -> Unit = {}): model_ClusterNetworkEntry {
  val instance = model_ClusterNetworkEntry()
  instance.block()
  return instance
}


fun newClusterNetworkList(block : model_ClusterNetworkList.() -> Unit = {}): model_ClusterNetworkList {
  val instance = model_ClusterNetworkList()
  instance.block()
  return instance
}


fun newClusterOperator(block : model_ClusterOperator.() -> Unit = {}): model_ClusterOperator {
  val instance = model_ClusterOperator()
  instance.block()
  return instance
}


fun newClusterOperatorList(block : model_ClusterOperatorList.() -> Unit = {}): model_ClusterOperatorList {
  val instance = model_ClusterOperatorList()
  instance.block()
  return instance
}


fun newClusterOperatorSpec(block : model_ClusterOperatorSpec.() -> Unit = {}): model_ClusterOperatorSpec {
  val instance = model_ClusterOperatorSpec()
  instance.block()
  return instance
}


fun newClusterOperatorStatus(block : model_ClusterOperatorStatus.() -> Unit = {}): model_ClusterOperatorStatus {
  val instance = model_ClusterOperatorStatus()
  instance.block()
  return instance
}


fun newClusterOperatorStatusCondition(block : model_ClusterOperatorStatusCondition.() -> Unit = {}): model_ClusterOperatorStatusCondition {
  val instance = model_ClusterOperatorStatusCondition()
  instance.block()
  return instance
}


fun newClusterResourceQuota(block : model_ClusterResourceQuota.() -> Unit = {}): model_ClusterResourceQuota {
  val instance = model_ClusterResourceQuota()
  instance.block()
  return instance
}


fun newClusterResourceQuotaList(block : model_ClusterResourceQuotaList.() -> Unit = {}): model_ClusterResourceQuotaList {
  val instance = model_ClusterResourceQuotaList()
  instance.block()
  return instance
}


fun newClusterResourceQuotaSelector(block : model_ClusterResourceQuotaSelector.() -> Unit = {}): model_ClusterResourceQuotaSelector {
  val instance = model_ClusterResourceQuotaSelector()
  instance.block()
  return instance
}


fun newClusterResourceQuotaSpec(block : model_ClusterResourceQuotaSpec.() -> Unit = {}): model_ClusterResourceQuotaSpec {
  val instance = model_ClusterResourceQuotaSpec()
  instance.block()
  return instance
}


fun newClusterResourceQuotaStatus(block : model_ClusterResourceQuotaStatus.() -> Unit = {}): model_ClusterResourceQuotaStatus {
  val instance = model_ClusterResourceQuotaStatus()
  instance.block()
  return instance
}


fun newClusterRole(block : model_ClusterRole.() -> Unit = {}): model_ClusterRole {
  val instance = model_ClusterRole()
  instance.block()
  return instance
}


fun newClusterRoleBinding(block : model_ClusterRoleBinding.() -> Unit = {}): model_ClusterRoleBinding {
  val instance = model_ClusterRoleBinding()
  instance.block()
  return instance
}


fun newClusterRoleBindingList(block : model_ClusterRoleBindingList.() -> Unit = {}): model_ClusterRoleBindingList {
  val instance = model_ClusterRoleBindingList()
  instance.block()
  return instance
}


fun newClusterRoleList(block : model_ClusterRoleList.() -> Unit = {}): model_ClusterRoleList {
  val instance = model_ClusterRoleList()
  instance.block()
  return instance
}


fun newClusterRoleScopeRestriction(block : model_ClusterRoleScopeRestriction.() -> Unit = {}): model_ClusterRoleScopeRestriction {
  val instance = model_ClusterRoleScopeRestriction()
  instance.block()
  return instance
}


fun newClusterVersion(block : model_ClusterVersion.() -> Unit = {}): model_ClusterVersion {
  val instance = model_ClusterVersion()
  instance.block()
  return instance
}


fun newClusterVersionList(block : model_ClusterVersionList.() -> Unit = {}): model_ClusterVersionList {
  val instance = model_ClusterVersionList()
  instance.block()
  return instance
}


fun newClusterVersionSpec(block : model_ClusterVersionSpec.() -> Unit = {}): model_ClusterVersionSpec {
  val instance = model_ClusterVersionSpec()
  instance.block()
  return instance
}


fun newClusterVersionStatus(block : model_ClusterVersionStatus.() -> Unit = {}): model_ClusterVersionStatus {
  val instance = model_ClusterVersionStatus()
  instance.block()
  return instance
}


fun newComponentOverride(block : model_ComponentOverride.() -> Unit = {}): model_ComponentOverride {
  val instance = model_ComponentOverride()
  instance.block()
  return instance
}


fun newConfigMapBuildSource(block : model_ConfigMapBuildSource.() -> Unit = {}): model_ConfigMapBuildSource {
  val instance = model_ConfigMapBuildSource()
  instance.block()
  return instance
}


fun newConfigMapFileReference(block : model_ConfigMapFileReference.() -> Unit = {}): model_ConfigMapFileReference {
  val instance = model_ConfigMapFileReference()
  instance.block()
  return instance
}


fun newConfigMapNameReference(block : model_ConfigMapNameReference.() -> Unit = {}): model_ConfigMapNameReference {
  val instance = model_ConfigMapNameReference()
  instance.block()
  return instance
}


fun newCustomBuildStrategy(block : model_CustomBuildStrategy.() -> Unit = {}): model_CustomBuildStrategy {
  val instance = model_CustomBuildStrategy()
  instance.block()
  return instance
}


fun newCustomDeploymentStrategyParams(block : model_CustomDeploymentStrategyParams.() -> Unit = {}): model_CustomDeploymentStrategyParams {
  val instance = model_CustomDeploymentStrategyParams()
  instance.block()
  return instance
}


fun newCustomFeatureGates(block : model_CustomFeatureGates.() -> Unit = {}): model_CustomFeatureGates {
  val instance = model_CustomFeatureGates()
  instance.block()
  return instance
}


fun newCustomTLSProfile(block : model_CustomTLSProfile.() -> Unit = {}): model_CustomTLSProfile {
  val instance = model_CustomTLSProfile()
  instance.block()
  return instance
}


fun newDNSZone(block : model_DNSZone.() -> Unit = {}): model_DNSZone {
  val instance = model_DNSZone()
  instance.block()
  return instance
}


fun newDeploymentCause(block : model_DeploymentCause.() -> Unit = {}): model_DeploymentCause {
  val instance = model_DeploymentCause()
  instance.block()
  return instance
}


fun newDeploymentCauseImageTrigger(block : model_DeploymentCauseImageTrigger.() -> Unit = {}): model_DeploymentCauseImageTrigger {
  val instance = model_DeploymentCauseImageTrigger()
  instance.block()
  return instance
}


fun newDeploymentCondition(block : model_DeploymentCondition.() -> Unit = {}): model_DeploymentCondition {
  val instance = model_DeploymentCondition()
  instance.block()
  return instance
}


fun newDeploymentConfig(block : model_DeploymentConfig.() -> Unit = {}): model_DeploymentConfig {
  val instance = model_DeploymentConfig()
  instance.block()
  return instance
}


fun newDeploymentConfigList(block : model_DeploymentConfigList.() -> Unit = {}): model_DeploymentConfigList {
  val instance = model_DeploymentConfigList()
  instance.block()
  return instance
}


fun newDeploymentConfigSpec(block : model_DeploymentConfigSpec.() -> Unit = {}): model_DeploymentConfigSpec {
  val instance = model_DeploymentConfigSpec()
  instance.block()
  return instance
}


fun newDeploymentConfigStatus(block : model_DeploymentConfigStatus.() -> Unit = {}): model_DeploymentConfigStatus {
  val instance = model_DeploymentConfigStatus()
  instance.block()
  return instance
}


fun newDeploymentDetails(block : model_DeploymentDetails.() -> Unit = {}): model_DeploymentDetails {
  val instance = model_DeploymentDetails()
  instance.block()
  return instance
}


fun newDeploymentStrategy(block : model_DeploymentStrategy.() -> Unit = {}): model_DeploymentStrategy {
  val instance = model_DeploymentStrategy()
  instance.block()
  return instance
}


fun newDeploymentTriggerImageChangeParams(block : model_DeploymentTriggerImageChangeParams.() -> Unit = {}): model_DeploymentTriggerImageChangeParams {
  val instance = model_DeploymentTriggerImageChangeParams()
  instance.block()
  return instance
}


fun newDeploymentTriggerPolicy(block : model_DeploymentTriggerPolicy.() -> Unit = {}): model_DeploymentTriggerPolicy {
  val instance = model_DeploymentTriggerPolicy()
  instance.block()
  return instance
}


fun newDockerBuildStrategy(block : model_DockerBuildStrategy.() -> Unit = {}): model_DockerBuildStrategy {
  val instance = model_DockerBuildStrategy()
  instance.block()
  return instance
}


fun newDockerStrategyOptions(block : model_DockerStrategyOptions.() -> Unit = {}): model_DockerStrategyOptions {
  val instance = model_DockerStrategyOptions()
  instance.block()
  return instance
}


fun newEgressNetworkPolicy(block : model_EgressNetworkPolicy.() -> Unit = {}): model_EgressNetworkPolicy {
  val instance = model_EgressNetworkPolicy()
  instance.block()
  return instance
}


fun newEgressNetworkPolicyList(block : model_EgressNetworkPolicyList.() -> Unit = {}): model_EgressNetworkPolicyList {
  val instance = model_EgressNetworkPolicyList()
  instance.block()
  return instance
}


fun newEgressNetworkPolicyPeer(block : model_EgressNetworkPolicyPeer.() -> Unit = {}): model_EgressNetworkPolicyPeer {
  val instance = model_EgressNetworkPolicyPeer()
  instance.block()
  return instance
}


fun newEgressNetworkPolicyRule(block : model_EgressNetworkPolicyRule.() -> Unit = {}): model_EgressNetworkPolicyRule {
  val instance = model_EgressNetworkPolicyRule()
  instance.block()
  return instance
}


fun newEgressNetworkPolicySpec(block : model_EgressNetworkPolicySpec.() -> Unit = {}): model_EgressNetworkPolicySpec {
  val instance = model_EgressNetworkPolicySpec()
  instance.block()
  return instance
}


fun newExecNewPodHook(block : model_ExecNewPodHook.() -> Unit = {}): model_ExecNewPodHook {
  val instance = model_ExecNewPodHook()
  instance.block()
  return instance
}


fun newFSGroupStrategyOptions(block : model_FSGroupStrategyOptions.() -> Unit = {}): model_FSGroupStrategyOptions {
  val instance = model_FSGroupStrategyOptions()
  instance.block()
  return instance
}


fun newFeatureGate(block : model_FeatureGate.() -> Unit = {}): model_FeatureGate {
  val instance = model_FeatureGate()
  instance.block()
  return instance
}


fun newFeatureGateList(block : model_FeatureGateList.() -> Unit = {}): model_FeatureGateList {
  val instance = model_FeatureGateList()
  instance.block()
  return instance
}


fun newFeatureGateSpec(block : model_FeatureGateSpec.() -> Unit = {}): model_FeatureGateSpec {
  val instance = model_FeatureGateSpec()
  instance.block()
  return instance
}


fun newFeatureGateStatus(block : model_FeatureGateStatus.() -> Unit = {}): model_FeatureGateStatus {
  val instance = model_FeatureGateStatus()
  instance.block()
  return instance
}


fun newGCPPlatformSpec(block : model_GCPPlatformSpec.() -> Unit = {}): model_GCPPlatformSpec {
  val instance = model_GCPPlatformSpec()
  instance.block()
  return instance
}


fun newGCPPlatformStatus(block : model_GCPPlatformStatus.() -> Unit = {}): model_GCPPlatformStatus {
  val instance = model_GCPPlatformStatus()
  instance.block()
  return instance
}


fun newGenericWebHookCause(block : model_GenericWebHookCause.() -> Unit = {}): model_GenericWebHookCause {
  val instance = model_GenericWebHookCause()
  instance.block()
  return instance
}


fun newGitBuildSource(block : model_GitBuildSource.() -> Unit = {}): model_GitBuildSource {
  val instance = model_GitBuildSource()
  instance.block()
  return instance
}


fun newGitHubIdentityProvider(block : model_GitHubIdentityProvider.() -> Unit = {}): model_GitHubIdentityProvider {
  val instance = model_GitHubIdentityProvider()
  instance.block()
  return instance
}


fun newGitHubWebHookCause(block : model_GitHubWebHookCause.() -> Unit = {}): model_GitHubWebHookCause {
  val instance = model_GitHubWebHookCause()
  instance.block()
  return instance
}


fun newGitLabIdentityProvider(block : model_GitLabIdentityProvider.() -> Unit = {}): model_GitLabIdentityProvider {
  val instance = model_GitLabIdentityProvider()
  instance.block()
  return instance
}


fun newGitLabWebHookCause(block : model_GitLabWebHookCause.() -> Unit = {}): model_GitLabWebHookCause {
  val instance = model_GitLabWebHookCause()
  instance.block()
  return instance
}


fun newGitSourceRevision(block : model_GitSourceRevision.() -> Unit = {}): model_GitSourceRevision {
  val instance = model_GitSourceRevision()
  instance.block()
  return instance
}


fun newGoogleIdentityProvider(block : model_GoogleIdentityProvider.() -> Unit = {}): model_GoogleIdentityProvider {
  val instance = model_GoogleIdentityProvider()
  instance.block()
  return instance
}


fun newGroup(block : model_Group.() -> Unit = {}): model_Group {
  val instance = model_Group()
  instance.block()
  return instance
}


fun newGroupList(block : model_GroupList.() -> Unit = {}): model_GroupList {
  val instance = model_GroupList()
  instance.block()
  return instance
}


fun newGroupRestriction(block : model_GroupRestriction.() -> Unit = {}): model_GroupRestriction {
  val instance = model_GroupRestriction()
  instance.block()
  return instance
}


fun newHTPasswdIdentityProvider(block : model_HTPasswdIdentityProvider.() -> Unit = {}): model_HTPasswdIdentityProvider {
  val instance = model_HTPasswdIdentityProvider()
  instance.block()
  return instance
}


fun newHubSource(block : model_HubSource.() -> Unit = {}): model_HubSource {
  val instance = model_HubSource()
  instance.block()
  return instance
}


fun newHubSourceStatus(block : model_HubSourceStatus.() -> Unit = {}): model_HubSourceStatus {
  val instance = model_HubSourceStatus()
  instance.block()
  return instance
}


fun newIBMCloudPlatformSpec(block : model_IBMCloudPlatformSpec.() -> Unit = {}): model_IBMCloudPlatformSpec {
  val instance = model_IBMCloudPlatformSpec()
  instance.block()
  return instance
}


fun newIBMCloudPlatformStatus(block : model_IBMCloudPlatformStatus.() -> Unit = {}): model_IBMCloudPlatformStatus {
  val instance = model_IBMCloudPlatformStatus()
  instance.block()
  return instance
}


fun newIDRange(block : model_IDRange.() -> Unit = {}): model_IDRange {
  val instance = model_IDRange()
  instance.block()
  return instance
}


fun newIdentity(block : model_Identity.() -> Unit = {}): model_Identity {
  val instance = model_Identity()
  instance.block()
  return instance
}


fun newIdentityList(block : model_IdentityList.() -> Unit = {}): model_IdentityList {
  val instance = model_IdentityList()
  instance.block()
  return instance
}


fun newIdentityProvider(block : model_IdentityProvider.() -> Unit = {}): model_IdentityProvider {
  val instance = model_IdentityProvider()
  instance.block()
  return instance
}


fun newImage(block : model_Image.() -> Unit = {}): model_Image {
  val instance = model_Image()
  instance.block()
  return instance
}


fun newImageChangeCause(block : model_ImageChangeCause.() -> Unit = {}): model_ImageChangeCause {
  val instance = model_ImageChangeCause()
  instance.block()
  return instance
}


fun newImageChangeTrigger(block : model_ImageChangeTrigger.() -> Unit = {}): model_ImageChangeTrigger {
  val instance = model_ImageChangeTrigger()
  instance.block()
  return instance
}


fun newImageImportSpec(block : model_ImageImportSpec.() -> Unit = {}): model_ImageImportSpec {
  val instance = model_ImageImportSpec()
  instance.block()
  return instance
}


fun newImageImportStatus(block : model_ImageImportStatus.() -> Unit = {}): model_ImageImportStatus {
  val instance = model_ImageImportStatus()
  instance.block()
  return instance
}


fun newImageLabel(block : model_ImageLabel.() -> Unit = {}): model_ImageLabel {
  val instance = model_ImageLabel()
  instance.block()
  return instance
}


fun newImageLayer(block : model_ImageLayer.() -> Unit = {}): model_ImageLayer {
  val instance = model_ImageLayer()
  instance.block()
  return instance
}


fun newImageList(block : model_ImageList.() -> Unit = {}): model_ImageList {
  val instance = model_ImageList()
  instance.block()
  return instance
}


fun newImageLookupPolicy(block : model_ImageLookupPolicy.() -> Unit = {}): model_ImageLookupPolicy {
  val instance = model_ImageLookupPolicy()
  instance.block()
  return instance
}


fun newImageSignature(block : model_ImageSignature.() -> Unit = {}): model_ImageSignature {
  val instance = model_ImageSignature()
  instance.block()
  return instance
}


fun newImageSource(block : model_ImageSource.() -> Unit = {}): model_ImageSource {
  val instance = model_ImageSource()
  instance.block()
  return instance
}


fun newImageSourcePath(block : model_ImageSourcePath.() -> Unit = {}): model_ImageSourcePath {
  val instance = model_ImageSourcePath()
  instance.block()
  return instance
}


fun newImageStream(block : model_ImageStream.() -> Unit = {}): model_ImageStream {
  val instance = model_ImageStream()
  instance.block()
  return instance
}


fun newImageStreamImage(block : model_ImageStreamImage.() -> Unit = {}): model_ImageStreamImage {
  val instance = model_ImageStreamImage()
  instance.block()
  return instance
}


fun newImageStreamImport(block : model_ImageStreamImport.() -> Unit = {}): model_ImageStreamImport {
  val instance = model_ImageStreamImport()
  instance.block()
  return instance
}


fun newImageStreamImportSpec(block : model_ImageStreamImportSpec.() -> Unit = {}): model_ImageStreamImportSpec {
  val instance = model_ImageStreamImportSpec()
  instance.block()
  return instance
}


fun newImageStreamImportStatus(block : model_ImageStreamImportStatus.() -> Unit = {}): model_ImageStreamImportStatus {
  val instance = model_ImageStreamImportStatus()
  instance.block()
  return instance
}


fun newImageStreamList(block : model_ImageStreamList.() -> Unit = {}): model_ImageStreamList {
  val instance = model_ImageStreamList()
  instance.block()
  return instance
}


fun newImageStreamMapping(block : model_ImageStreamMapping.() -> Unit = {}): model_ImageStreamMapping {
  val instance = model_ImageStreamMapping()
  instance.block()
  return instance
}


fun newImageStreamSpec(block : model_ImageStreamSpec.() -> Unit = {}): model_ImageStreamSpec {
  val instance = model_ImageStreamSpec()
  instance.block()
  return instance
}


fun newImageStreamStatus(block : model_ImageStreamStatus.() -> Unit = {}): model_ImageStreamStatus {
  val instance = model_ImageStreamStatus()
  instance.block()
  return instance
}


fun newImageStreamTag(block : model_ImageStreamTag.() -> Unit = {}): model_ImageStreamTag {
  val instance = model_ImageStreamTag()
  instance.block()
  return instance
}


fun newImageStreamTagList(block : model_ImageStreamTagList.() -> Unit = {}): model_ImageStreamTagList {
  val instance = model_ImageStreamTagList()
  instance.block()
  return instance
}


fun newImageTag(block : model_ImageTag.() -> Unit = {}): model_ImageTag {
  val instance = model_ImageTag()
  instance.block()
  return instance
}


fun newImageTagList(block : model_ImageTagList.() -> Unit = {}): model_ImageTagList {
  val instance = model_ImageTagList()
  instance.block()
  return instance
}


fun newInfrastructure(block : model_Infrastructure.() -> Unit = {}): model_Infrastructure {
  val instance = model_Infrastructure()
  instance.block()
  return instance
}


fun newInfrastructureList(block : model_InfrastructureList.() -> Unit = {}): model_InfrastructureList {
  val instance = model_InfrastructureList()
  instance.block()
  return instance
}


fun newInfrastructureSpec(block : model_InfrastructureSpec.() -> Unit = {}): model_InfrastructureSpec {
  val instance = model_InfrastructureSpec()
  instance.block()
  return instance
}


fun newInfrastructureStatus(block : model_InfrastructureStatus.() -> Unit = {}): model_InfrastructureStatus {
  val instance = model_InfrastructureStatus()
  instance.block()
  return instance
}


fun newIngress(block : model_Ingress.() -> Unit = {}): model_Ingress {
  val instance = model_Ingress()
  instance.block()
  return instance
}


fun newIngressList(block : model_IngressList.() -> Unit = {}): model_IngressList {
  val instance = model_IngressList()
  instance.block()
  return instance
}


fun newIngressSpec(block : model_IngressSpec.() -> Unit = {}): model_IngressSpec {
  val instance = model_IngressSpec()
  instance.block()
  return instance
}


fun newIngressStatus(block : model_IngressStatus.() -> Unit = {}): model_IngressStatus {
  val instance = model_IngressStatus()
  instance.block()
  return instance
}


fun newIntermediateTLSProfile(block : model_IntermediateTLSProfile.() -> Unit = {}): model_IntermediateTLSProfile {
  val instance = model_IntermediateTLSProfile()
  instance.block()
  return instance
}


fun newJenkinsPipelineBuildStrategy(block : model_JenkinsPipelineBuildStrategy.() -> Unit = {}): model_JenkinsPipelineBuildStrategy {
  val instance = model_JenkinsPipelineBuildStrategy()
  instance.block()
  return instance
}


fun newKeystoneIdentityProvider(block : model_KeystoneIdentityProvider.() -> Unit = {}): model_KeystoneIdentityProvider {
  val instance = model_KeystoneIdentityProvider()
  instance.block()
  return instance
}


fun newLDAPAttributeMapping(block : model_LDAPAttributeMapping.() -> Unit = {}): model_LDAPAttributeMapping {
  val instance = model_LDAPAttributeMapping()
  instance.block()
  return instance
}


fun newLDAPIdentityProvider(block : model_LDAPIdentityProvider.() -> Unit = {}): model_LDAPIdentityProvider {
  val instance = model_LDAPIdentityProvider()
  instance.block()
  return instance
}


fun newLifecycleHook(block : model_LifecycleHook.() -> Unit = {}): model_LifecycleHook {
  val instance = model_LifecycleHook()
  instance.block()
  return instance
}


fun newLocalResourceAccessReview(block : model_LocalResourceAccessReview.() -> Unit = {}): model_LocalResourceAccessReview {
  val instance = model_LocalResourceAccessReview()
  instance.block()
  return instance
}


fun newLocalSubjectAccessReview(block : model_LocalSubjectAccessReview.() -> Unit = {}): model_LocalSubjectAccessReview {
  val instance = model_LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun newModernTLSProfile(block : model_ModernTLSProfile.() -> Unit = {}): model_ModernTLSProfile {
  val instance = model_ModernTLSProfile()
  instance.block()
  return instance
}


fun newNamedTagEventList(block : model_NamedTagEventList.() -> Unit = {}): model_NamedTagEventList {
  val instance = model_NamedTagEventList()
  instance.block()
  return instance
}


fun newNetNamespace(block : model_NetNamespace.() -> Unit = {}): model_NetNamespace {
  val instance = model_NetNamespace()
  instance.block()
  return instance
}


fun newNetNamespaceList(block : model_NetNamespaceList.() -> Unit = {}): model_NetNamespaceList {
  val instance = model_NetNamespaceList()
  instance.block()
  return instance
}


fun newOAuth(block : model_OAuth.() -> Unit = {}): model_OAuth {
  val instance = model_OAuth()
  instance.block()
  return instance
}


fun newOAuthAccessToken(block : model_OAuthAccessToken.() -> Unit = {}): model_OAuthAccessToken {
  val instance = model_OAuthAccessToken()
  instance.block()
  return instance
}


fun newOAuthAccessTokenList(block : model_OAuthAccessTokenList.() -> Unit = {}): model_OAuthAccessTokenList {
  val instance = model_OAuthAccessTokenList()
  instance.block()
  return instance
}


fun newOAuthAuthorizeToken(block : model_OAuthAuthorizeToken.() -> Unit = {}): model_OAuthAuthorizeToken {
  val instance = model_OAuthAuthorizeToken()
  instance.block()
  return instance
}


fun newOAuthAuthorizeTokenList(block : model_OAuthAuthorizeTokenList.() -> Unit = {}): model_OAuthAuthorizeTokenList {
  val instance = model_OAuthAuthorizeTokenList()
  instance.block()
  return instance
}


fun newOAuthClient(block : model_OAuthClient.() -> Unit = {}): model_OAuthClient {
  val instance = model_OAuthClient()
  instance.block()
  return instance
}


fun newOAuthClientAuthorization(block : model_OAuthClientAuthorization.() -> Unit = {}): model_OAuthClientAuthorization {
  val instance = model_OAuthClientAuthorization()
  instance.block()
  return instance
}


fun newOAuthClientAuthorizationList(block : model_OAuthClientAuthorizationList.() -> Unit = {}): model_OAuthClientAuthorizationList {
  val instance = model_OAuthClientAuthorizationList()
  instance.block()
  return instance
}


fun newOAuthClientList(block : model_OAuthClientList.() -> Unit = {}): model_OAuthClientList {
  val instance = model_OAuthClientList()
  instance.block()
  return instance
}


fun newOAuthList(block : model_OAuthList.() -> Unit = {}): model_OAuthList {
  val instance = model_OAuthList()
  instance.block()
  return instance
}


fun newOAuthSpec(block : model_OAuthSpec.() -> Unit = {}): model_OAuthSpec {
  val instance = model_OAuthSpec()
  instance.block()
  return instance
}


fun newOAuthStatus(block : model_OAuthStatus.() -> Unit = {}): model_OAuthStatus {
  val instance = model_OAuthStatus()
  instance.block()
  return instance
}


fun newOAuthTemplates(block : model_OAuthTemplates.() -> Unit = {}): model_OAuthTemplates {
  val instance = model_OAuthTemplates()
  instance.block()
  return instance
}


fun newObjectReference(block : model_ObjectReference.() -> Unit = {}): model_ObjectReference {
  val instance = model_ObjectReference()
  instance.block()
  return instance
}


fun newOldTLSProfile(block : model_OldTLSProfile.() -> Unit = {}): model_OldTLSProfile {
  val instance = model_OldTLSProfile()
  instance.block()
  return instance
}


fun newOpenIDClaims(block : model_OpenIDClaims.() -> Unit = {}): model_OpenIDClaims {
  val instance = model_OpenIDClaims()
  instance.block()
  return instance
}


fun newOpenIDIdentityProvider(block : model_OpenIDIdentityProvider.() -> Unit = {}): model_OpenIDIdentityProvider {
  val instance = model_OpenIDIdentityProvider()
  instance.block()
  return instance
}


fun newOpenStackPlatformSpec(block : model_OpenStackPlatformSpec.() -> Unit = {}): model_OpenStackPlatformSpec {
  val instance = model_OpenStackPlatformSpec()
  instance.block()
  return instance
}


fun newOpenStackPlatformStatus(block : model_OpenStackPlatformStatus.() -> Unit = {}): model_OpenStackPlatformStatus {
  val instance = model_OpenStackPlatformStatus()
  instance.block()
  return instance
}


fun newOperandVersion(block : model_OperandVersion.() -> Unit = {}): model_OperandVersion {
  val instance = model_OperandVersion()
  instance.block()
  return instance
}


fun newOperatorHub(block : model_OperatorHub.() -> Unit = {}): model_OperatorHub {
  val instance = model_OperatorHub()
  instance.block()
  return instance
}


fun newOperatorHubList(block : model_OperatorHubList.() -> Unit = {}): model_OperatorHubList {
  val instance = model_OperatorHubList()
  instance.block()
  return instance
}


fun newOperatorHubSpec(block : model_OperatorHubSpec.() -> Unit = {}): model_OperatorHubSpec {
  val instance = model_OperatorHubSpec()
  instance.block()
  return instance
}


fun newOperatorHubStatus(block : model_OperatorHubStatus.() -> Unit = {}): model_OperatorHubStatus {
  val instance = model_OperatorHubStatus()
  instance.block()
  return instance
}


fun newOvirtPlatformSpec(block : model_OvirtPlatformSpec.() -> Unit = {}): model_OvirtPlatformSpec {
  val instance = model_OvirtPlatformSpec()
  instance.block()
  return instance
}


fun newOvirtPlatformStatus(block : model_OvirtPlatformStatus.() -> Unit = {}): model_OvirtPlatformStatus {
  val instance = model_OvirtPlatformStatus()
  instance.block()
  return instance
}


fun newParameter(block : model_Parameter.() -> Unit = {}): model_Parameter {
  val instance = model_Parameter()
  instance.block()
  return instance
}


fun newPlatformSpec(block : model_PlatformSpec.() -> Unit = {}): model_PlatformSpec {
  val instance = model_PlatformSpec()
  instance.block()
  return instance
}


fun newPlatformStatus(block : model_PlatformStatus.() -> Unit = {}): model_PlatformStatus {
  val instance = model_PlatformStatus()
  instance.block()
  return instance
}


fun newPodSecurityPolicyReview(block : model_PodSecurityPolicyReview.() -> Unit = {}): model_PodSecurityPolicyReview {
  val instance = model_PodSecurityPolicyReview()
  instance.block()
  return instance
}


fun newPodSecurityPolicyReviewSpec(block : model_PodSecurityPolicyReviewSpec.() -> Unit = {}): model_PodSecurityPolicyReviewSpec {
  val instance = model_PodSecurityPolicyReviewSpec()
  instance.block()
  return instance
}


fun newPodSecurityPolicyReviewStatus(block : model_PodSecurityPolicyReviewStatus.() -> Unit = {}): model_PodSecurityPolicyReviewStatus {
  val instance = model_PodSecurityPolicyReviewStatus()
  instance.block()
  return instance
}


fun newPodSecurityPolicySelfSubjectReview(block : model_PodSecurityPolicySelfSubjectReview.() -> Unit = {}): model_PodSecurityPolicySelfSubjectReview {
  val instance = model_PodSecurityPolicySelfSubjectReview()
  instance.block()
  return instance
}


fun newPodSecurityPolicySelfSubjectReviewSpec(block : model_PodSecurityPolicySelfSubjectReviewSpec.() -> Unit = {}): model_PodSecurityPolicySelfSubjectReviewSpec {
  val instance = model_PodSecurityPolicySelfSubjectReviewSpec()
  instance.block()
  return instance
}


fun newPodSecurityPolicySubjectReview(block : model_PodSecurityPolicySubjectReview.() -> Unit = {}): model_PodSecurityPolicySubjectReview {
  val instance = model_PodSecurityPolicySubjectReview()
  instance.block()
  return instance
}


fun newPodSecurityPolicySubjectReviewSpec(block : model_PodSecurityPolicySubjectReviewSpec.() -> Unit = {}): model_PodSecurityPolicySubjectReviewSpec {
  val instance = model_PodSecurityPolicySubjectReviewSpec()
  instance.block()
  return instance
}


fun newPodSecurityPolicySubjectReviewStatus(block : model_PodSecurityPolicySubjectReviewStatus.() -> Unit = {}): model_PodSecurityPolicySubjectReviewStatus {
  val instance = model_PodSecurityPolicySubjectReviewStatus()
  instance.block()
  return instance
}


fun newPolicyRule(block : model_PolicyRule.() -> Unit = {}): model_PolicyRule {
  val instance = model_PolicyRule()
  instance.block()
  return instance
}


fun newProject(block : model_Project.() -> Unit = {}): model_Project {
  val instance = model_Project()
  instance.block()
  return instance
}


fun newProjectList(block : model_ProjectList.() -> Unit = {}): model_ProjectList {
  val instance = model_ProjectList()
  instance.block()
  return instance
}


fun newProjectRequest(block : model_ProjectRequest.() -> Unit = {}): model_ProjectRequest {
  val instance = model_ProjectRequest()
  instance.block()
  return instance
}


fun newProjectSpec(block : model_ProjectSpec.() -> Unit = {}): model_ProjectSpec {
  val instance = model_ProjectSpec()
  instance.block()
  return instance
}


fun newProjectStatus(block : model_ProjectStatus.() -> Unit = {}): model_ProjectStatus {
  val instance = model_ProjectStatus()
  instance.block()
  return instance
}


fun newProxy(block : model_Proxy.() -> Unit = {}): model_Proxy {
  val instance = model_Proxy()
  instance.block()
  return instance
}


fun newProxyList(block : model_ProxyList.() -> Unit = {}): model_ProxyList {
  val instance = model_ProxyList()
  instance.block()
  return instance
}


fun newProxySpec(block : model_ProxySpec.() -> Unit = {}): model_ProxySpec {
  val instance = model_ProxySpec()
  instance.block()
  return instance
}


fun newProxyStatus(block : model_ProxyStatus.() -> Unit = {}): model_ProxyStatus {
  val instance = model_ProxyStatus()
  instance.block()
  return instance
}


fun newRangeAllocation(block : model_RangeAllocation.() -> Unit = {}): model_RangeAllocation {
  val instance = model_RangeAllocation()
  instance.block()
  return instance
}


fun newRangeAllocationList(block : model_RangeAllocationList.() -> Unit = {}): model_RangeAllocationList {
  val instance = model_RangeAllocationList()
  instance.block()
  return instance
}


fun newRecreateDeploymentStrategyParams(block : model_RecreateDeploymentStrategyParams.() -> Unit = {}): model_RecreateDeploymentStrategyParams {
  val instance = model_RecreateDeploymentStrategyParams()
  instance.block()
  return instance
}


fun newRelease(block : model_Release.() -> Unit = {}): model_Release {
  val instance = model_Release()
  instance.block()
  return instance
}


fun newRepositoryImportSpec(block : model_RepositoryImportSpec.() -> Unit = {}): model_RepositoryImportSpec {
  val instance = model_RepositoryImportSpec()
  instance.block()
  return instance
}


fun newRepositoryImportStatus(block : model_RepositoryImportStatus.() -> Unit = {}): model_RepositoryImportStatus {
  val instance = model_RepositoryImportStatus()
  instance.block()
  return instance
}


fun newRequestHeaderIdentityProvider(block : model_RequestHeaderIdentityProvider.() -> Unit = {}): model_RequestHeaderIdentityProvider {
  val instance = model_RequestHeaderIdentityProvider()
  instance.block()
  return instance
}


fun newResourceAccessReview(block : model_ResourceAccessReview.() -> Unit = {}): model_ResourceAccessReview {
  val instance = model_ResourceAccessReview()
  instance.block()
  return instance
}


fun newResourceQuotaStatusByNamespace(block : model_ResourceQuotaStatusByNamespace.() -> Unit = {}): model_ResourceQuotaStatusByNamespace {
  val instance = model_ResourceQuotaStatusByNamespace()
  instance.block()
  return instance
}


fun newRole(block : model_Role.() -> Unit = {}): model_Role {
  val instance = model_Role()
  instance.block()
  return instance
}


fun newRoleBinding(block : model_RoleBinding.() -> Unit = {}): model_RoleBinding {
  val instance = model_RoleBinding()
  instance.block()
  return instance
}


fun newRoleBindingList(block : model_RoleBindingList.() -> Unit = {}): model_RoleBindingList {
  val instance = model_RoleBindingList()
  instance.block()
  return instance
}


fun newRoleBindingRestriction(block : model_RoleBindingRestriction.() -> Unit = {}): model_RoleBindingRestriction {
  val instance = model_RoleBindingRestriction()
  instance.block()
  return instance
}


fun newRoleBindingRestrictionSpec(block : model_RoleBindingRestrictionSpec.() -> Unit = {}): model_RoleBindingRestrictionSpec {
  val instance = model_RoleBindingRestrictionSpec()
  instance.block()
  return instance
}


fun newRoleList(block : model_RoleList.() -> Unit = {}): model_RoleList {
  val instance = model_RoleList()
  instance.block()
  return instance
}


fun newRollingDeploymentStrategyParams(block : model_RollingDeploymentStrategyParams.() -> Unit = {}): model_RollingDeploymentStrategyParams {
  val instance = model_RollingDeploymentStrategyParams()
  instance.block()
  return instance
}


fun newRoute(block : model_Route.() -> Unit = {}): model_Route {
  val instance = model_Route()
  instance.block()
  return instance
}


fun newRouteIngress(block : model_RouteIngress.() -> Unit = {}): model_RouteIngress {
  val instance = model_RouteIngress()
  instance.block()
  return instance
}


fun newRouteIngressCondition(block : model_RouteIngressCondition.() -> Unit = {}): model_RouteIngressCondition {
  val instance = model_RouteIngressCondition()
  instance.block()
  return instance
}


fun newRouteList(block : model_RouteList.() -> Unit = {}): model_RouteList {
  val instance = model_RouteList()
  instance.block()
  return instance
}


fun newRoutePort(block : model_RoutePort.() -> Unit = {}): model_RoutePort {
  val instance = model_RoutePort()
  instance.block()
  return instance
}


fun newRouteSpec(block : model_RouteSpec.() -> Unit = {}): model_RouteSpec {
  val instance = model_RouteSpec()
  instance.block()
  return instance
}


fun newRouteStatus(block : model_RouteStatus.() -> Unit = {}): model_RouteStatus {
  val instance = model_RouteStatus()
  instance.block()
  return instance
}


fun newRouteTargetReference(block : model_RouteTargetReference.() -> Unit = {}): model_RouteTargetReference {
  val instance = model_RouteTargetReference()
  instance.block()
  return instance
}


fun newRunAsUserStrategyOptions(block : model_RunAsUserStrategyOptions.() -> Unit = {}): model_RunAsUserStrategyOptions {
  val instance = model_RunAsUserStrategyOptions()
  instance.block()
  return instance
}


fun newSELinuxContextStrategyOptions(block : model_SELinuxContextStrategyOptions.() -> Unit = {}): model_SELinuxContextStrategyOptions {
  val instance = model_SELinuxContextStrategyOptions()
  instance.block()
  return instance
}


fun newScheduler(block : model_Scheduler.() -> Unit = {}): model_Scheduler {
  val instance = model_Scheduler()
  instance.block()
  return instance
}


fun newSchedulerList(block : model_SchedulerList.() -> Unit = {}): model_SchedulerList {
  val instance = model_SchedulerList()
  instance.block()
  return instance
}


fun newSchedulerSpec(block : model_SchedulerSpec.() -> Unit = {}): model_SchedulerSpec {
  val instance = model_SchedulerSpec()
  instance.block()
  return instance
}


fun newSchedulerStatus(block : model_SchedulerStatus.() -> Unit = {}): model_SchedulerStatus {
  val instance = model_SchedulerStatus()
  instance.block()
  return instance
}


fun newScopeRestriction(block : model_ScopeRestriction.() -> Unit = {}): model_ScopeRestriction {
  val instance = model_ScopeRestriction()
  instance.block()
  return instance
}


fun newSecretBuildSource(block : model_SecretBuildSource.() -> Unit = {}): model_SecretBuildSource {
  val instance = model_SecretBuildSource()
  instance.block()
  return instance
}


fun newSecretLocalReference(block : model_SecretLocalReference.() -> Unit = {}): model_SecretLocalReference {
  val instance = model_SecretLocalReference()
  instance.block()
  return instance
}


fun newSecretNameReference(block : model_SecretNameReference.() -> Unit = {}): model_SecretNameReference {
  val instance = model_SecretNameReference()
  instance.block()
  return instance
}


fun newSecretSpec(block : model_SecretSpec.() -> Unit = {}): model_SecretSpec {
  val instance = model_SecretSpec()
  instance.block()
  return instance
}


fun newSecurityContextConstraints(block : model_SecurityContextConstraints.() -> Unit = {}): model_SecurityContextConstraints {
  val instance = model_SecurityContextConstraints()
  instance.block()
  return instance
}


fun newSecurityContextConstraintsList(block : model_SecurityContextConstraintsList.() -> Unit = {}): model_SecurityContextConstraintsList {
  val instance = model_SecurityContextConstraintsList()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReview(block : model_SelfSubjectRulesReview.() -> Unit = {}): model_SelfSubjectRulesReview {
  val instance = model_SelfSubjectRulesReview()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReviewSpec(block : model_SelfSubjectRulesReviewSpec.() -> Unit = {}): model_SelfSubjectRulesReviewSpec {
  val instance = model_SelfSubjectRulesReviewSpec()
  instance.block()
  return instance
}


fun newServiceAccountPodSecurityPolicyReviewStatus(block : model_ServiceAccountPodSecurityPolicyReviewStatus.() -> Unit = {}): model_ServiceAccountPodSecurityPolicyReviewStatus {
  val instance = model_ServiceAccountPodSecurityPolicyReviewStatus()
  instance.block()
  return instance
}


fun newServiceAccountReference(block : model_ServiceAccountReference.() -> Unit = {}): model_ServiceAccountReference {
  val instance = model_ServiceAccountReference()
  instance.block()
  return instance
}


fun newServiceAccountRestriction(block : model_ServiceAccountRestriction.() -> Unit = {}): model_ServiceAccountRestriction {
  val instance = model_ServiceAccountRestriction()
  instance.block()
  return instance
}


fun newSignatureCondition(block : model_SignatureCondition.() -> Unit = {}): model_SignatureCondition {
  val instance = model_SignatureCondition()
  instance.block()
  return instance
}


fun newSignatureIssuer(block : model_SignatureIssuer.() -> Unit = {}): model_SignatureIssuer {
  val instance = model_SignatureIssuer()
  instance.block()
  return instance
}


fun newSignatureSubject(block : model_SignatureSubject.() -> Unit = {}): model_SignatureSubject {
  val instance = model_SignatureSubject()
  instance.block()
  return instance
}


fun newSourceBuildStrategy(block : model_SourceBuildStrategy.() -> Unit = {}): model_SourceBuildStrategy {
  val instance = model_SourceBuildStrategy()
  instance.block()
  return instance
}


fun newSourceControlUser(block : model_SourceControlUser.() -> Unit = {}): model_SourceControlUser {
  val instance = model_SourceControlUser()
  instance.block()
  return instance
}


fun newSourceRevision(block : model_SourceRevision.() -> Unit = {}): model_SourceRevision {
  val instance = model_SourceRevision()
  instance.block()
  return instance
}


fun newSourceStrategyOptions(block : model_SourceStrategyOptions.() -> Unit = {}): model_SourceStrategyOptions {
  val instance = model_SourceStrategyOptions()
  instance.block()
  return instance
}


fun newStageInfo(block : model_StageInfo.() -> Unit = {}): model_StageInfo {
  val instance = model_StageInfo()
  instance.block()
  return instance
}


fun newStepInfo(block : model_StepInfo.() -> Unit = {}): model_StepInfo {
  val instance = model_StepInfo()
  instance.block()
  return instance
}


fun newSubjectAccessReview(block : model_SubjectAccessReview.() -> Unit = {}): model_SubjectAccessReview {
  val instance = model_SubjectAccessReview()
  instance.block()
  return instance
}


fun newSubjectAccessReviewResponse(block : model_SubjectAccessReviewResponse.() -> Unit = {}): model_SubjectAccessReviewResponse {
  val instance = model_SubjectAccessReviewResponse()
  instance.block()
  return instance
}


fun newSubjectRulesReview(block : model_SubjectRulesReview.() -> Unit = {}): model_SubjectRulesReview {
  val instance = model_SubjectRulesReview()
  instance.block()
  return instance
}


fun newSubjectRulesReviewSpec(block : model_SubjectRulesReviewSpec.() -> Unit = {}): model_SubjectRulesReviewSpec {
  val instance = model_SubjectRulesReviewSpec()
  instance.block()
  return instance
}


fun newSubjectRulesReviewStatus(block : model_SubjectRulesReviewStatus.() -> Unit = {}): model_SubjectRulesReviewStatus {
  val instance = model_SubjectRulesReviewStatus()
  instance.block()
  return instance
}


fun newSupplementalGroupsStrategyOptions(block : model_SupplementalGroupsStrategyOptions.() -> Unit = {}): model_SupplementalGroupsStrategyOptions {
  val instance = model_SupplementalGroupsStrategyOptions()
  instance.block()
  return instance
}


fun newTLSConfig(block : model_TLSConfig.() -> Unit = {}): model_TLSConfig {
  val instance = model_TLSConfig()
  instance.block()
  return instance
}


fun newTLSProfileSpec(block : model_TLSProfileSpec.() -> Unit = {}): model_TLSProfileSpec {
  val instance = model_TLSProfileSpec()
  instance.block()
  return instance
}


fun newTLSSecurityProfile(block : model_TLSSecurityProfile.() -> Unit = {}): model_TLSSecurityProfile {
  val instance = model_TLSSecurityProfile()
  instance.block()
  return instance
}


fun newTagEvent(block : model_TagEvent.() -> Unit = {}): model_TagEvent {
  val instance = model_TagEvent()
  instance.block()
  return instance
}


fun newTagEventCondition(block : model_TagEventCondition.() -> Unit = {}): model_TagEventCondition {
  val instance = model_TagEventCondition()
  instance.block()
  return instance
}


fun newTagImageHook(block : model_TagImageHook.() -> Unit = {}): model_TagImageHook {
  val instance = model_TagImageHook()
  instance.block()
  return instance
}


fun newTagImportPolicy(block : model_TagImportPolicy.() -> Unit = {}): model_TagImportPolicy {
  val instance = model_TagImportPolicy()
  instance.block()
  return instance
}


fun newTagReference(block : model_TagReference.() -> Unit = {}): model_TagReference {
  val instance = model_TagReference()
  instance.block()
  return instance
}


fun newTagReferencePolicy(block : model_TagReferencePolicy.() -> Unit = {}): model_TagReferencePolicy {
  val instance = model_TagReferencePolicy()
  instance.block()
  return instance
}


fun newTemplate(block : model_Template.() -> Unit = {}): model_Template {
  val instance = model_Template()
  instance.block()
  return instance
}


fun newTemplateList(block : model_TemplateList.() -> Unit = {}): model_TemplateList {
  val instance = model_TemplateList()
  instance.block()
  return instance
}


fun newTokenConfig(block : model_TokenConfig.() -> Unit = {}): model_TokenConfig {
  val instance = model_TokenConfig()
  instance.block()
  return instance
}


fun newUpdate(block : model_Update.() -> Unit = {}): model_Update {
  val instance = model_Update()
  instance.block()
  return instance
}


fun newUpdateHistory(block : model_UpdateHistory.() -> Unit = {}): model_UpdateHistory {
  val instance = model_UpdateHistory()
  instance.block()
  return instance
}


fun newUser(block : model_User.() -> Unit = {}): model_User {
  val instance = model_User()
  instance.block()
  return instance
}


fun newUserList(block : model_UserList.() -> Unit = {}): model_UserList {
  val instance = model_UserList()
  instance.block()
  return instance
}


fun newUserRestriction(block : model_UserRestriction.() -> Unit = {}): model_UserRestriction {
  val instance = model_UserRestriction()
  instance.block()
  return instance
}


fun newVSpherePlatformSpec(block : model_VSpherePlatformSpec.() -> Unit = {}): model_VSpherePlatformSpec {
  val instance = model_VSpherePlatformSpec()
  instance.block()
  return instance
}


fun newVSpherePlatformStatus(block : model_VSpherePlatformStatus.() -> Unit = {}): model_VSpherePlatformStatus {
  val instance = model_VSpherePlatformStatus()
  instance.block()
  return instance
}


fun newWebHookTrigger(block : model_WebHookTrigger.() -> Unit = {}): model_WebHookTrigger {
  val instance = model_WebHookTrigger()
  instance.block()
  return instance
}


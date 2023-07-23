// GENERATE
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServer as v1_APIServer
import io.fabric8.openshift.api.model.config.v1.APIServerEncryption as v1_APIServerEncryption
import io.fabric8.openshift.api.model.config.v1.APIServerList as v1_APIServerList
import io.fabric8.openshift.api.model.config.v1.APIServerNamedServingCert as v1_APIServerNamedServingCert
import io.fabric8.openshift.api.model.config.v1.APIServerServingCerts as v1_APIServerServingCerts
import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec
import io.fabric8.openshift.api.model.config.v1.APIServerStatus as v1_APIServerStatus
import io.fabric8.openshift.api.model.config.v1.AWSPlatformSpec as v1_AWSPlatformSpec
import io.fabric8.openshift.api.model.config.v1.AWSPlatformStatus as v1_AWSPlatformStatus
import io.fabric8.openshift.api.model.config.v1.AWSResourceTag as v1_AWSResourceTag
import io.fabric8.openshift.api.model.config.v1.AWSServiceEndpoint as v1_AWSServiceEndpoint
import io.fabric8.openshift.api.model.config.v1.AlibabaCloudPlatformSpec as v1_AlibabaCloudPlatformSpec
import io.fabric8.openshift.api.model.config.v1.AlibabaCloudPlatformStatus as v1_AlibabaCloudPlatformStatus
import io.fabric8.openshift.api.model.config.v1.AlibabaCloudResourceTag as v1_AlibabaCloudResourceTag
import io.fabric8.openshift.api.model.config.v1.Audit as v1_Audit
import io.fabric8.openshift.api.model.config.v1.AuditCustomRule as v1_AuditCustomRule
import io.fabric8.openshift.api.model.config.v1.Authentication as v1_Authentication
import io.fabric8.openshift.api.model.config.v1.AuthenticationList as v1_AuthenticationList
import io.fabric8.openshift.api.model.config.v1.AuthenticationSpec as v1_AuthenticationSpec
import io.fabric8.openshift.api.model.config.v1.AuthenticationStatus as v1_AuthenticationStatus
import io.fabric8.openshift.api.model.config.v1.AzurePlatformSpec as v1_AzurePlatformSpec
import io.fabric8.openshift.api.model.config.v1.AzurePlatformStatus as v1_AzurePlatformStatus
import io.fabric8.openshift.api.model.config.v1.BareMetalPlatformSpec as v1_BareMetalPlatformSpec
import io.fabric8.openshift.api.model.config.v1.BareMetalPlatformStatus as v1_BareMetalPlatformStatus
import io.fabric8.openshift.api.model.config.v1.BasicAuthIdentityProvider as v1_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.config.v1.Build as v1_Build
import io.fabric8.openshift.api.model.config.v1.BuildDefaults as v1_BuildDefaults
import io.fabric8.openshift.api.model.config.v1.BuildList as v1_BuildList
import io.fabric8.openshift.api.model.config.v1.BuildOverrides as v1_BuildOverrides
import io.fabric8.openshift.api.model.config.v1.BuildSpec as v1_BuildSpec
import io.fabric8.openshift.api.model.config.v1.ClusterCondition as v1_ClusterCondition
import io.fabric8.openshift.api.model.config.v1.ClusterNetworkEntry as v1_ClusterNetworkEntry
import io.fabric8.openshift.api.model.config.v1.ClusterOperator as v1_ClusterOperator
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorList as v1_ClusterOperatorList
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorSpec as v1_ClusterOperatorSpec
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorStatus as v1_ClusterOperatorStatus
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorStatusCondition as v1_ClusterOperatorStatusCondition
import io.fabric8.openshift.api.model.config.v1.ClusterVersion as v1_ClusterVersion
import io.fabric8.openshift.api.model.config.v1.ClusterVersionList as v1_ClusterVersionList
import io.fabric8.openshift.api.model.config.v1.ClusterVersionSpec as v1_ClusterVersionSpec
import io.fabric8.openshift.api.model.config.v1.ClusterVersionStatus as v1_ClusterVersionStatus
import io.fabric8.openshift.api.model.config.v1.ComponentOverride as v1_ComponentOverride
import io.fabric8.openshift.api.model.config.v1.ComponentRouteSpec as v1_ComponentRouteSpec
import io.fabric8.openshift.api.model.config.v1.ComponentRouteStatus as v1_ComponentRouteStatus
import io.fabric8.openshift.api.model.config.v1.ConditionalUpdate as v1_ConditionalUpdate
import io.fabric8.openshift.api.model.config.v1.ConditionalUpdateRisk as v1_ConditionalUpdateRisk
import io.fabric8.openshift.api.model.config.v1.ConfigMapFileReference as v1_ConfigMapFileReference
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference
import io.fabric8.openshift.api.model.config.v1.Console as v1_Console
import io.fabric8.openshift.api.model.config.v1.ConsoleAuthentication as v1_ConsoleAuthentication
import io.fabric8.openshift.api.model.config.v1.ConsoleList as v1_ConsoleList
import io.fabric8.openshift.api.model.config.v1.ConsoleSpec as v1_ConsoleSpec
import io.fabric8.openshift.api.model.config.v1.ConsoleStatus as v1_ConsoleStatus
import io.fabric8.openshift.api.model.config.v1.CustomFeatureGates as v1_CustomFeatureGates
import io.fabric8.openshift.api.model.config.v1.CustomTLSProfile as v1_CustomTLSProfile
import io.fabric8.openshift.api.model.config.v1.DNS as v1_DNS
import io.fabric8.openshift.api.model.config.v1.DNSList as v1_DNSList
import io.fabric8.openshift.api.model.config.v1.DNSSpec as v1_DNSSpec
import io.fabric8.openshift.api.model.config.v1.DNSStatus as v1_DNSStatus
import io.fabric8.openshift.api.model.config.v1.DNSZone as v1_DNSZone
import io.fabric8.openshift.api.model.config.v1.DeprecatedWebhookTokenAuthenticator as v1_DeprecatedWebhookTokenAuthenticator
import io.fabric8.openshift.api.model.config.v1.EquinixMetalPlatformSpec as v1_EquinixMetalPlatformSpec
import io.fabric8.openshift.api.model.config.v1.EquinixMetalPlatformStatus as v1_EquinixMetalPlatformStatus
import io.fabric8.openshift.api.model.config.v1.ExternalIPConfig as v1_ExternalIPConfig
import io.fabric8.openshift.api.model.config.v1.ExternalIPPolicy as v1_ExternalIPPolicy
import io.fabric8.openshift.api.model.config.v1.FeatureGate as v1_FeatureGate
import io.fabric8.openshift.api.model.config.v1.FeatureGateList as v1_FeatureGateList
import io.fabric8.openshift.api.model.config.v1.FeatureGateSpec as v1_FeatureGateSpec
import io.fabric8.openshift.api.model.config.v1.FeatureGateStatus as v1_FeatureGateStatus
import io.fabric8.openshift.api.model.config.v1.GCPPlatformSpec as v1_GCPPlatformSpec
import io.fabric8.openshift.api.model.config.v1.GCPPlatformStatus as v1_GCPPlatformStatus
import io.fabric8.openshift.api.model.config.v1.GitHubIdentityProvider as v1_GitHubIdentityProvider
import io.fabric8.openshift.api.model.config.v1.GitLabIdentityProvider as v1_GitLabIdentityProvider
import io.fabric8.openshift.api.model.config.v1.GoogleIdentityProvider as v1_GoogleIdentityProvider
import io.fabric8.openshift.api.model.config.v1.HTPasswdIdentityProvider as v1_HTPasswdIdentityProvider
import io.fabric8.openshift.api.model.config.v1.HubSource as v1_HubSource
import io.fabric8.openshift.api.model.config.v1.HubSourceStatus as v1_HubSourceStatus
import io.fabric8.openshift.api.model.config.v1.IBMCloudPlatformSpec as v1_IBMCloudPlatformSpec
import io.fabric8.openshift.api.model.config.v1.IBMCloudPlatformStatus as v1_IBMCloudPlatformStatus
import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider
import io.fabric8.openshift.api.model.config.v1.Image as v1_Image
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicy as v1_ImageContentPolicy
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicyList as v1_ImageContentPolicyList
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicySpec as v1_ImageContentPolicySpec
import io.fabric8.openshift.api.model.config.v1.ImageLabel as v1_ImageLabel
import io.fabric8.openshift.api.model.config.v1.ImageList as v1_ImageList
import io.fabric8.openshift.api.model.config.v1.ImageSpec as v1_ImageSpec
import io.fabric8.openshift.api.model.config.v1.ImageStatus as v1_ImageStatus
import io.fabric8.openshift.api.model.config.v1.Infrastructure as v1_Infrastructure
import io.fabric8.openshift.api.model.config.v1.InfrastructureList as v1_InfrastructureList
import io.fabric8.openshift.api.model.config.v1.InfrastructureSpec as v1_InfrastructureSpec
import io.fabric8.openshift.api.model.config.v1.InfrastructureStatus as v1_InfrastructureStatus
import io.fabric8.openshift.api.model.config.v1.Ingress as v1_Ingress
import io.fabric8.openshift.api.model.config.v1.IngressList as v1_IngressList
import io.fabric8.openshift.api.model.config.v1.IngressSpec as v1_IngressSpec
import io.fabric8.openshift.api.model.config.v1.IngressStatus as v1_IngressStatus
import io.fabric8.openshift.api.model.config.v1.IntermediateTLSProfile as v1_IntermediateTLSProfile
import io.fabric8.openshift.api.model.config.v1.KeystoneIdentityProvider as v1_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.config.v1.KubevirtPlatformSpec as v1_KubevirtPlatformSpec
import io.fabric8.openshift.api.model.config.v1.KubevirtPlatformStatus as v1_KubevirtPlatformStatus
import io.fabric8.openshift.api.model.config.v1.LDAPAttributeMapping as v1_LDAPAttributeMapping
import io.fabric8.openshift.api.model.config.v1.LDAPIdentityProvider as v1_LDAPIdentityProvider
import io.fabric8.openshift.api.model.config.v1.MaxAgePolicy as v1_MaxAgePolicy
import io.fabric8.openshift.api.model.config.v1.ModernTLSProfile as v1_ModernTLSProfile
import io.fabric8.openshift.api.model.config.v1.Network as v1_Network
import io.fabric8.openshift.api.model.config.v1.NetworkList as v1_NetworkList
import io.fabric8.openshift.api.model.config.v1.NetworkMigration as v1_NetworkMigration
import io.fabric8.openshift.api.model.config.v1.NetworkSpec as v1_NetworkSpec
import io.fabric8.openshift.api.model.config.v1.NetworkStatus as v1_NetworkStatus
import io.fabric8.openshift.api.model.config.v1.OAuth as v1_OAuth
import io.fabric8.openshift.api.model.config.v1.OAuthList as v1_OAuthList
import io.fabric8.openshift.api.model.config.v1.OAuthSpec as v1_OAuthSpec
import io.fabric8.openshift.api.model.config.v1.OAuthStatus as v1_OAuthStatus
import io.fabric8.openshift.api.model.config.v1.OAuthTemplates as v1_OAuthTemplates
import io.fabric8.openshift.api.model.config.v1.ObjectReference as v1_ObjectReference
import io.fabric8.openshift.api.model.config.v1.OldTLSProfile as v1_OldTLSProfile
import io.fabric8.openshift.api.model.config.v1.OpenIDClaims as v1_OpenIDClaims
import io.fabric8.openshift.api.model.config.v1.OpenIDIdentityProvider as v1_OpenIDIdentityProvider
import io.fabric8.openshift.api.model.config.v1.OpenStackPlatformSpec as v1_OpenStackPlatformSpec
import io.fabric8.openshift.api.model.config.v1.OpenStackPlatformStatus as v1_OpenStackPlatformStatus
import io.fabric8.openshift.api.model.config.v1.OperandVersion as v1_OperandVersion
import io.fabric8.openshift.api.model.config.v1.OperatorHub as v1_OperatorHub
import io.fabric8.openshift.api.model.config.v1.OperatorHubList as v1_OperatorHubList
import io.fabric8.openshift.api.model.config.v1.OperatorHubSpec as v1_OperatorHubSpec
import io.fabric8.openshift.api.model.config.v1.OperatorHubStatus as v1_OperatorHubStatus
import io.fabric8.openshift.api.model.config.v1.OvirtPlatformSpec as v1_OvirtPlatformSpec
import io.fabric8.openshift.api.model.config.v1.OvirtPlatformStatus as v1_OvirtPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus
import io.fabric8.openshift.api.model.config.v1.PowerVSPlatformSpec as v1_PowerVSPlatformSpec
import io.fabric8.openshift.api.model.config.v1.PowerVSPlatformStatus as v1_PowerVSPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PowerVSServiceEndpoint as v1_PowerVSServiceEndpoint
import io.fabric8.openshift.api.model.config.v1.Project as v1_Project
import io.fabric8.openshift.api.model.config.v1.ProjectList as v1_ProjectList
import io.fabric8.openshift.api.model.config.v1.ProjectSpec as v1_ProjectSpec
import io.fabric8.openshift.api.model.config.v1.ProjectStatus as v1_ProjectStatus
import io.fabric8.openshift.api.model.config.v1.PromQLClusterCondition as v1_PromQLClusterCondition
import io.fabric8.openshift.api.model.config.v1.Proxy as v1_Proxy
import io.fabric8.openshift.api.model.config.v1.ProxyList as v1_ProxyList
import io.fabric8.openshift.api.model.config.v1.ProxySpec as v1_ProxySpec
import io.fabric8.openshift.api.model.config.v1.ProxyStatus as v1_ProxyStatus
import io.fabric8.openshift.api.model.config.v1.RegistryLocation as v1_RegistryLocation
import io.fabric8.openshift.api.model.config.v1.RegistrySources as v1_RegistrySources
import io.fabric8.openshift.api.model.config.v1.Release as v1_Release
import io.fabric8.openshift.api.model.config.v1.RepositoryDigestMirrors as v1_RepositoryDigestMirrors
import io.fabric8.openshift.api.model.config.v1.RequestHeaderIdentityProvider as v1_RequestHeaderIdentityProvider
import io.fabric8.openshift.api.model.config.v1.RequiredHSTSPolicy as v1_RequiredHSTSPolicy
import io.fabric8.openshift.api.model.config.v1.Scheduler as v1_Scheduler
import io.fabric8.openshift.api.model.config.v1.SchedulerList as v1_SchedulerList
import io.fabric8.openshift.api.model.config.v1.SchedulerSpec as v1_SchedulerSpec
import io.fabric8.openshift.api.model.config.v1.SchedulerStatus as v1_SchedulerStatus
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference
import io.fabric8.openshift.api.model.config.v1.TLSProfileSpec as v1_TLSProfileSpec
import io.fabric8.openshift.api.model.config.v1.TLSSecurityProfile as v1_TLSSecurityProfile
import io.fabric8.openshift.api.model.config.v1.TemplateReference as v1_TemplateReference
import io.fabric8.openshift.api.model.config.v1.TokenConfig as v1_TokenConfig
import io.fabric8.openshift.api.model.config.v1.Update as v1_Update
import io.fabric8.openshift.api.model.config.v1.UpdateHistory as v1_UpdateHistory
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformSpec as v1_VSpherePlatformSpec
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformStatus as v1_VSpherePlatformStatus
import io.fabric8.openshift.api.model.config.v1.WebhookTokenAuthenticator as v1_WebhookTokenAuthenticator


fun newAPIServer(block : v1_APIServer.() -> Unit = {}): v1_APIServer {
  val instance = v1_APIServer()
  instance.block()
  return instance
}


fun newAPIServerEncryption(block : v1_APIServerEncryption.() -> Unit = {}): v1_APIServerEncryption {
  val instance = v1_APIServerEncryption()
  instance.block()
  return instance
}


fun newAPIServerList(block : v1_APIServerList.() -> Unit = {}): v1_APIServerList {
  val instance = v1_APIServerList()
  instance.block()
  return instance
}


fun newAPIServerNamedServingCert(block : v1_APIServerNamedServingCert.() -> Unit = {}): v1_APIServerNamedServingCert {
  val instance = v1_APIServerNamedServingCert()
  instance.block()
  return instance
}


fun newAPIServerServingCerts(block : v1_APIServerServingCerts.() -> Unit = {}): v1_APIServerServingCerts {
  val instance = v1_APIServerServingCerts()
  instance.block()
  return instance
}


fun newAPIServerSpec(block : v1_APIServerSpec.() -> Unit = {}): v1_APIServerSpec {
  val instance = v1_APIServerSpec()
  instance.block()
  return instance
}


fun newAPIServerStatus(block : v1_APIServerStatus.() -> Unit = {}): v1_APIServerStatus {
  val instance = v1_APIServerStatus()
  instance.block()
  return instance
}


fun newAWSPlatformSpec(block : v1_AWSPlatformSpec.() -> Unit = {}): v1_AWSPlatformSpec {
  val instance = v1_AWSPlatformSpec()
  instance.block()
  return instance
}


fun newAWSPlatformStatus(block : v1_AWSPlatformStatus.() -> Unit = {}): v1_AWSPlatformStatus {
  val instance = v1_AWSPlatformStatus()
  instance.block()
  return instance
}


fun newAWSResourceTag(block : v1_AWSResourceTag.() -> Unit = {}): v1_AWSResourceTag {
  val instance = v1_AWSResourceTag()
  instance.block()
  return instance
}


fun newAWSServiceEndpoint(block : v1_AWSServiceEndpoint.() -> Unit = {}): v1_AWSServiceEndpoint {
  val instance = v1_AWSServiceEndpoint()
  instance.block()
  return instance
}


fun newAlibabaCloudPlatformSpec(block : v1_AlibabaCloudPlatformSpec.() -> Unit = {}): v1_AlibabaCloudPlatformSpec {
  val instance = v1_AlibabaCloudPlatformSpec()
  instance.block()
  return instance
}


fun newAlibabaCloudPlatformStatus(block : v1_AlibabaCloudPlatformStatus.() -> Unit = {}): v1_AlibabaCloudPlatformStatus {
  val instance = v1_AlibabaCloudPlatformStatus()
  instance.block()
  return instance
}


fun newAlibabaCloudResourceTag(block : v1_AlibabaCloudResourceTag.() -> Unit = {}): v1_AlibabaCloudResourceTag {
  val instance = v1_AlibabaCloudResourceTag()
  instance.block()
  return instance
}


fun newAudit(block : v1_Audit.() -> Unit = {}): v1_Audit {
  val instance = v1_Audit()
  instance.block()
  return instance
}


fun newAuditCustomRule(block : v1_AuditCustomRule.() -> Unit = {}): v1_AuditCustomRule {
  val instance = v1_AuditCustomRule()
  instance.block()
  return instance
}


fun newAuthentication(block : v1_Authentication.() -> Unit = {}): v1_Authentication {
  val instance = v1_Authentication()
  instance.block()
  return instance
}


fun newAuthenticationList(block : v1_AuthenticationList.() -> Unit = {}): v1_AuthenticationList {
  val instance = v1_AuthenticationList()
  instance.block()
  return instance
}


fun newAuthenticationSpec(block : v1_AuthenticationSpec.() -> Unit = {}): v1_AuthenticationSpec {
  val instance = v1_AuthenticationSpec()
  instance.block()
  return instance
}


fun newAuthenticationStatus(block : v1_AuthenticationStatus.() -> Unit = {}): v1_AuthenticationStatus {
  val instance = v1_AuthenticationStatus()
  instance.block()
  return instance
}


fun newAzurePlatformSpec(block : v1_AzurePlatformSpec.() -> Unit = {}): v1_AzurePlatformSpec {
  val instance = v1_AzurePlatformSpec()
  instance.block()
  return instance
}


fun newAzurePlatformStatus(block : v1_AzurePlatformStatus.() -> Unit = {}): v1_AzurePlatformStatus {
  val instance = v1_AzurePlatformStatus()
  instance.block()
  return instance
}


fun newBareMetalPlatformSpec(block : v1_BareMetalPlatformSpec.() -> Unit = {}): v1_BareMetalPlatformSpec {
  val instance = v1_BareMetalPlatformSpec()
  instance.block()
  return instance
}


fun newBareMetalPlatformStatus(block : v1_BareMetalPlatformStatus.() -> Unit = {}): v1_BareMetalPlatformStatus {
  val instance = v1_BareMetalPlatformStatus()
  instance.block()
  return instance
}


fun newBasicAuthIdentityProvider(block : v1_BasicAuthIdentityProvider.() -> Unit = {}): v1_BasicAuthIdentityProvider {
  val instance = v1_BasicAuthIdentityProvider()
  instance.block()
  return instance
}


fun newBuild(block : v1_Build.() -> Unit = {}): v1_Build {
  val instance = v1_Build()
  instance.block()
  return instance
}


fun newBuildDefaults(block : v1_BuildDefaults.() -> Unit = {}): v1_BuildDefaults {
  val instance = v1_BuildDefaults()
  instance.block()
  return instance
}


fun newBuildList(block : v1_BuildList.() -> Unit = {}): v1_BuildList {
  val instance = v1_BuildList()
  instance.block()
  return instance
}


fun newBuildOverrides(block : v1_BuildOverrides.() -> Unit = {}): v1_BuildOverrides {
  val instance = v1_BuildOverrides()
  instance.block()
  return instance
}


fun newBuildSpec(block : v1_BuildSpec.() -> Unit = {}): v1_BuildSpec {
  val instance = v1_BuildSpec()
  instance.block()
  return instance
}


fun newClusterCondition(block : v1_ClusterCondition.() -> Unit = {}): v1_ClusterCondition {
  val instance = v1_ClusterCondition()
  instance.block()
  return instance
}


fun newClusterNetworkEntry(block : v1_ClusterNetworkEntry.() -> Unit = {}): v1_ClusterNetworkEntry {
  val instance = v1_ClusterNetworkEntry()
  instance.block()
  return instance
}


fun newClusterOperator(block : v1_ClusterOperator.() -> Unit = {}): v1_ClusterOperator {
  val instance = v1_ClusterOperator()
  instance.block()
  return instance
}


fun newClusterOperatorList(block : v1_ClusterOperatorList.() -> Unit = {}): v1_ClusterOperatorList {
  val instance = v1_ClusterOperatorList()
  instance.block()
  return instance
}


fun newClusterOperatorSpec(block : v1_ClusterOperatorSpec.() -> Unit = {}): v1_ClusterOperatorSpec {
  val instance = v1_ClusterOperatorSpec()
  instance.block()
  return instance
}


fun newClusterOperatorStatus(block : v1_ClusterOperatorStatus.() -> Unit = {}): v1_ClusterOperatorStatus {
  val instance = v1_ClusterOperatorStatus()
  instance.block()
  return instance
}


fun newClusterOperatorStatusCondition(block : v1_ClusterOperatorStatusCondition.() -> Unit = {}): v1_ClusterOperatorStatusCondition {
  val instance = v1_ClusterOperatorStatusCondition()
  instance.block()
  return instance
}


fun newClusterVersion(block : v1_ClusterVersion.() -> Unit = {}): v1_ClusterVersion {
  val instance = v1_ClusterVersion()
  instance.block()
  return instance
}


fun newClusterVersionList(block : v1_ClusterVersionList.() -> Unit = {}): v1_ClusterVersionList {
  val instance = v1_ClusterVersionList()
  instance.block()
  return instance
}


fun newClusterVersionSpec(block : v1_ClusterVersionSpec.() -> Unit = {}): v1_ClusterVersionSpec {
  val instance = v1_ClusterVersionSpec()
  instance.block()
  return instance
}


fun newClusterVersionStatus(block : v1_ClusterVersionStatus.() -> Unit = {}): v1_ClusterVersionStatus {
  val instance = v1_ClusterVersionStatus()
  instance.block()
  return instance
}


fun newComponentOverride(block : v1_ComponentOverride.() -> Unit = {}): v1_ComponentOverride {
  val instance = v1_ComponentOverride()
  instance.block()
  return instance
}


fun newComponentRouteSpec(block : v1_ComponentRouteSpec.() -> Unit = {}): v1_ComponentRouteSpec {
  val instance = v1_ComponentRouteSpec()
  instance.block()
  return instance
}


fun newComponentRouteStatus(block : v1_ComponentRouteStatus.() -> Unit = {}): v1_ComponentRouteStatus {
  val instance = v1_ComponentRouteStatus()
  instance.block()
  return instance
}


fun newConditionalUpdate(block : v1_ConditionalUpdate.() -> Unit = {}): v1_ConditionalUpdate {
  val instance = v1_ConditionalUpdate()
  instance.block()
  return instance
}


fun newConditionalUpdateRisk(block : v1_ConditionalUpdateRisk.() -> Unit = {}): v1_ConditionalUpdateRisk {
  val instance = v1_ConditionalUpdateRisk()
  instance.block()
  return instance
}


fun newConfigMapFileReference(block : v1_ConfigMapFileReference.() -> Unit = {}): v1_ConfigMapFileReference {
  val instance = v1_ConfigMapFileReference()
  instance.block()
  return instance
}


fun newConfigMapNameReference(block : v1_ConfigMapNameReference.() -> Unit = {}): v1_ConfigMapNameReference {
  val instance = v1_ConfigMapNameReference()
  instance.block()
  return instance
}


fun newConsole(block : v1_Console.() -> Unit = {}): v1_Console {
  val instance = v1_Console()
  instance.block()
  return instance
}


fun newConsoleAuthentication(block : v1_ConsoleAuthentication.() -> Unit = {}): v1_ConsoleAuthentication {
  val instance = v1_ConsoleAuthentication()
  instance.block()
  return instance
}


fun newConsoleList(block : v1_ConsoleList.() -> Unit = {}): v1_ConsoleList {
  val instance = v1_ConsoleList()
  instance.block()
  return instance
}


fun newConsoleSpec(block : v1_ConsoleSpec.() -> Unit = {}): v1_ConsoleSpec {
  val instance = v1_ConsoleSpec()
  instance.block()
  return instance
}


fun newConsoleStatus(block : v1_ConsoleStatus.() -> Unit = {}): v1_ConsoleStatus {
  val instance = v1_ConsoleStatus()
  instance.block()
  return instance
}


fun newCustomFeatureGates(block : v1_CustomFeatureGates.() -> Unit = {}): v1_CustomFeatureGates {
  val instance = v1_CustomFeatureGates()
  instance.block()
  return instance
}


fun newCustomTLSProfile(block : v1_CustomTLSProfile.() -> Unit = {}): v1_CustomTLSProfile {
  val instance = v1_CustomTLSProfile()
  instance.block()
  return instance
}


fun newDNS(block : v1_DNS.() -> Unit = {}): v1_DNS {
  val instance = v1_DNS()
  instance.block()
  return instance
}


fun newDNSList(block : v1_DNSList.() -> Unit = {}): v1_DNSList {
  val instance = v1_DNSList()
  instance.block()
  return instance
}


fun newDNSSpec(block : v1_DNSSpec.() -> Unit = {}): v1_DNSSpec {
  val instance = v1_DNSSpec()
  instance.block()
  return instance
}


fun newDNSStatus(block : v1_DNSStatus.() -> Unit = {}): v1_DNSStatus {
  val instance = v1_DNSStatus()
  instance.block()
  return instance
}


fun newDNSZone(block : v1_DNSZone.() -> Unit = {}): v1_DNSZone {
  val instance = v1_DNSZone()
  instance.block()
  return instance
}


fun newDeprecatedWebhookTokenAuthenticator(block : v1_DeprecatedWebhookTokenAuthenticator.() -> Unit = {}): v1_DeprecatedWebhookTokenAuthenticator {
  val instance = v1_DeprecatedWebhookTokenAuthenticator()
  instance.block()
  return instance
}


fun newEquinixMetalPlatformSpec(block : v1_EquinixMetalPlatformSpec.() -> Unit = {}): v1_EquinixMetalPlatformSpec {
  val instance = v1_EquinixMetalPlatformSpec()
  instance.block()
  return instance
}


fun newEquinixMetalPlatformStatus(block : v1_EquinixMetalPlatformStatus.() -> Unit = {}): v1_EquinixMetalPlatformStatus {
  val instance = v1_EquinixMetalPlatformStatus()
  instance.block()
  return instance
}


fun newExternalIPConfig(block : v1_ExternalIPConfig.() -> Unit = {}): v1_ExternalIPConfig {
  val instance = v1_ExternalIPConfig()
  instance.block()
  return instance
}


fun newExternalIPPolicy(block : v1_ExternalIPPolicy.() -> Unit = {}): v1_ExternalIPPolicy {
  val instance = v1_ExternalIPPolicy()
  instance.block()
  return instance
}


fun newFeatureGate(block : v1_FeatureGate.() -> Unit = {}): v1_FeatureGate {
  val instance = v1_FeatureGate()
  instance.block()
  return instance
}


fun newFeatureGateList(block : v1_FeatureGateList.() -> Unit = {}): v1_FeatureGateList {
  val instance = v1_FeatureGateList()
  instance.block()
  return instance
}


fun newFeatureGateSpec(block : v1_FeatureGateSpec.() -> Unit = {}): v1_FeatureGateSpec {
  val instance = v1_FeatureGateSpec()
  instance.block()
  return instance
}


fun newFeatureGateStatus(block : v1_FeatureGateStatus.() -> Unit = {}): v1_FeatureGateStatus {
  val instance = v1_FeatureGateStatus()
  instance.block()
  return instance
}


fun newGCPPlatformSpec(block : v1_GCPPlatformSpec.() -> Unit = {}): v1_GCPPlatformSpec {
  val instance = v1_GCPPlatformSpec()
  instance.block()
  return instance
}


fun newGCPPlatformStatus(block : v1_GCPPlatformStatus.() -> Unit = {}): v1_GCPPlatformStatus {
  val instance = v1_GCPPlatformStatus()
  instance.block()
  return instance
}


fun newGitHubIdentityProvider(block : v1_GitHubIdentityProvider.() -> Unit = {}): v1_GitHubIdentityProvider {
  val instance = v1_GitHubIdentityProvider()
  instance.block()
  return instance
}


fun newGitLabIdentityProvider(block : v1_GitLabIdentityProvider.() -> Unit = {}): v1_GitLabIdentityProvider {
  val instance = v1_GitLabIdentityProvider()
  instance.block()
  return instance
}


fun newGoogleIdentityProvider(block : v1_GoogleIdentityProvider.() -> Unit = {}): v1_GoogleIdentityProvider {
  val instance = v1_GoogleIdentityProvider()
  instance.block()
  return instance
}


fun newHTPasswdIdentityProvider(block : v1_HTPasswdIdentityProvider.() -> Unit = {}): v1_HTPasswdIdentityProvider {
  val instance = v1_HTPasswdIdentityProvider()
  instance.block()
  return instance
}


fun newHubSource(block : v1_HubSource.() -> Unit = {}): v1_HubSource {
  val instance = v1_HubSource()
  instance.block()
  return instance
}


fun newHubSourceStatus(block : v1_HubSourceStatus.() -> Unit = {}): v1_HubSourceStatus {
  val instance = v1_HubSourceStatus()
  instance.block()
  return instance
}


fun newIBMCloudPlatformSpec(block : v1_IBMCloudPlatformSpec.() -> Unit = {}): v1_IBMCloudPlatformSpec {
  val instance = v1_IBMCloudPlatformSpec()
  instance.block()
  return instance
}


fun newIBMCloudPlatformStatus(block : v1_IBMCloudPlatformStatus.() -> Unit = {}): v1_IBMCloudPlatformStatus {
  val instance = v1_IBMCloudPlatformStatus()
  instance.block()
  return instance
}


fun newIdentityProvider(block : v1_IdentityProvider.() -> Unit = {}): v1_IdentityProvider {
  val instance = v1_IdentityProvider()
  instance.block()
  return instance
}


fun newImage(block : v1_Image.() -> Unit = {}): v1_Image {
  val instance = v1_Image()
  instance.block()
  return instance
}


fun newImageContentPolicy(block : v1_ImageContentPolicy.() -> Unit = {}): v1_ImageContentPolicy {
  val instance = v1_ImageContentPolicy()
  instance.block()
  return instance
}


fun newImageContentPolicyList(block : v1_ImageContentPolicyList.() -> Unit = {}): v1_ImageContentPolicyList {
  val instance = v1_ImageContentPolicyList()
  instance.block()
  return instance
}


fun newImageContentPolicySpec(block : v1_ImageContentPolicySpec.() -> Unit = {}): v1_ImageContentPolicySpec {
  val instance = v1_ImageContentPolicySpec()
  instance.block()
  return instance
}


fun newImageLabel(block : v1_ImageLabel.() -> Unit = {}): v1_ImageLabel {
  val instance = v1_ImageLabel()
  instance.block()
  return instance
}


fun newImageList(block : v1_ImageList.() -> Unit = {}): v1_ImageList {
  val instance = v1_ImageList()
  instance.block()
  return instance
}


fun newImageSpec(block : v1_ImageSpec.() -> Unit = {}): v1_ImageSpec {
  val instance = v1_ImageSpec()
  instance.block()
  return instance
}


fun newImageStatus(block : v1_ImageStatus.() -> Unit = {}): v1_ImageStatus {
  val instance = v1_ImageStatus()
  instance.block()
  return instance
}


fun newInfrastructure(block : v1_Infrastructure.() -> Unit = {}): v1_Infrastructure {
  val instance = v1_Infrastructure()
  instance.block()
  return instance
}


fun newInfrastructureList(block : v1_InfrastructureList.() -> Unit = {}): v1_InfrastructureList {
  val instance = v1_InfrastructureList()
  instance.block()
  return instance
}


fun newInfrastructureSpec(block : v1_InfrastructureSpec.() -> Unit = {}): v1_InfrastructureSpec {
  val instance = v1_InfrastructureSpec()
  instance.block()
  return instance
}


fun newInfrastructureStatus(block : v1_InfrastructureStatus.() -> Unit = {}): v1_InfrastructureStatus {
  val instance = v1_InfrastructureStatus()
  instance.block()
  return instance
}


fun newIngress(block : v1_Ingress.() -> Unit = {}): v1_Ingress {
  val instance = v1_Ingress()
  instance.block()
  return instance
}


fun newIngressList(block : v1_IngressList.() -> Unit = {}): v1_IngressList {
  val instance = v1_IngressList()
  instance.block()
  return instance
}


fun newIngressSpec(block : v1_IngressSpec.() -> Unit = {}): v1_IngressSpec {
  val instance = v1_IngressSpec()
  instance.block()
  return instance
}


fun newIngressStatus(block : v1_IngressStatus.() -> Unit = {}): v1_IngressStatus {
  val instance = v1_IngressStatus()
  instance.block()
  return instance
}


fun newIntermediateTLSProfile(block : v1_IntermediateTLSProfile.() -> Unit = {}): v1_IntermediateTLSProfile {
  val instance = v1_IntermediateTLSProfile()
  instance.block()
  return instance
}


fun newKeystoneIdentityProvider(block : v1_KeystoneIdentityProvider.() -> Unit = {}): v1_KeystoneIdentityProvider {
  val instance = v1_KeystoneIdentityProvider()
  instance.block()
  return instance
}


fun newKubevirtPlatformSpec(block : v1_KubevirtPlatformSpec.() -> Unit = {}): v1_KubevirtPlatformSpec {
  val instance = v1_KubevirtPlatformSpec()
  instance.block()
  return instance
}


fun newKubevirtPlatformStatus(block : v1_KubevirtPlatformStatus.() -> Unit = {}): v1_KubevirtPlatformStatus {
  val instance = v1_KubevirtPlatformStatus()
  instance.block()
  return instance
}


fun newLDAPAttributeMapping(block : v1_LDAPAttributeMapping.() -> Unit = {}): v1_LDAPAttributeMapping {
  val instance = v1_LDAPAttributeMapping()
  instance.block()
  return instance
}


fun newLDAPIdentityProvider(block : v1_LDAPIdentityProvider.() -> Unit = {}): v1_LDAPIdentityProvider {
  val instance = v1_LDAPIdentityProvider()
  instance.block()
  return instance
}


fun newMaxAgePolicy(block : v1_MaxAgePolicy.() -> Unit = {}): v1_MaxAgePolicy {
  val instance = v1_MaxAgePolicy()
  instance.block()
  return instance
}


fun newModernTLSProfile(block : v1_ModernTLSProfile.() -> Unit = {}): v1_ModernTLSProfile {
  val instance = v1_ModernTLSProfile()
  instance.block()
  return instance
}


fun newNetwork(block : v1_Network.() -> Unit = {}): v1_Network {
  val instance = v1_Network()
  instance.block()
  return instance
}


fun newNetworkList(block : v1_NetworkList.() -> Unit = {}): v1_NetworkList {
  val instance = v1_NetworkList()
  instance.block()
  return instance
}


fun newNetworkMigration(block : v1_NetworkMigration.() -> Unit = {}): v1_NetworkMigration {
  val instance = v1_NetworkMigration()
  instance.block()
  return instance
}


fun newNetworkSpec(block : v1_NetworkSpec.() -> Unit = {}): v1_NetworkSpec {
  val instance = v1_NetworkSpec()
  instance.block()
  return instance
}


fun newNetworkStatus(block : v1_NetworkStatus.() -> Unit = {}): v1_NetworkStatus {
  val instance = v1_NetworkStatus()
  instance.block()
  return instance
}


fun newOAuth(block : v1_OAuth.() -> Unit = {}): v1_OAuth {
  val instance = v1_OAuth()
  instance.block()
  return instance
}


fun newOAuthList(block : v1_OAuthList.() -> Unit = {}): v1_OAuthList {
  val instance = v1_OAuthList()
  instance.block()
  return instance
}


fun newOAuthSpec(block : v1_OAuthSpec.() -> Unit = {}): v1_OAuthSpec {
  val instance = v1_OAuthSpec()
  instance.block()
  return instance
}


fun newOAuthStatus(block : v1_OAuthStatus.() -> Unit = {}): v1_OAuthStatus {
  val instance = v1_OAuthStatus()
  instance.block()
  return instance
}


fun newOAuthTemplates(block : v1_OAuthTemplates.() -> Unit = {}): v1_OAuthTemplates {
  val instance = v1_OAuthTemplates()
  instance.block()
  return instance
}


fun newObjectReference(block : v1_ObjectReference.() -> Unit = {}): v1_ObjectReference {
  val instance = v1_ObjectReference()
  instance.block()
  return instance
}


fun newOldTLSProfile(block : v1_OldTLSProfile.() -> Unit = {}): v1_OldTLSProfile {
  val instance = v1_OldTLSProfile()
  instance.block()
  return instance
}


fun newOpenIDClaims(block : v1_OpenIDClaims.() -> Unit = {}): v1_OpenIDClaims {
  val instance = v1_OpenIDClaims()
  instance.block()
  return instance
}


fun newOpenIDIdentityProvider(block : v1_OpenIDIdentityProvider.() -> Unit = {}): v1_OpenIDIdentityProvider {
  val instance = v1_OpenIDIdentityProvider()
  instance.block()
  return instance
}


fun newOpenStackPlatformSpec(block : v1_OpenStackPlatformSpec.() -> Unit = {}): v1_OpenStackPlatformSpec {
  val instance = v1_OpenStackPlatformSpec()
  instance.block()
  return instance
}


fun newOpenStackPlatformStatus(block : v1_OpenStackPlatformStatus.() -> Unit = {}): v1_OpenStackPlatformStatus {
  val instance = v1_OpenStackPlatformStatus()
  instance.block()
  return instance
}


fun newOperandVersion(block : v1_OperandVersion.() -> Unit = {}): v1_OperandVersion {
  val instance = v1_OperandVersion()
  instance.block()
  return instance
}


fun newOperatorHub(block : v1_OperatorHub.() -> Unit = {}): v1_OperatorHub {
  val instance = v1_OperatorHub()
  instance.block()
  return instance
}


fun newOperatorHubList(block : v1_OperatorHubList.() -> Unit = {}): v1_OperatorHubList {
  val instance = v1_OperatorHubList()
  instance.block()
  return instance
}


fun newOperatorHubSpec(block : v1_OperatorHubSpec.() -> Unit = {}): v1_OperatorHubSpec {
  val instance = v1_OperatorHubSpec()
  instance.block()
  return instance
}


fun newOperatorHubStatus(block : v1_OperatorHubStatus.() -> Unit = {}): v1_OperatorHubStatus {
  val instance = v1_OperatorHubStatus()
  instance.block()
  return instance
}


fun newOvirtPlatformSpec(block : v1_OvirtPlatformSpec.() -> Unit = {}): v1_OvirtPlatformSpec {
  val instance = v1_OvirtPlatformSpec()
  instance.block()
  return instance
}


fun newOvirtPlatformStatus(block : v1_OvirtPlatformStatus.() -> Unit = {}): v1_OvirtPlatformStatus {
  val instance = v1_OvirtPlatformStatus()
  instance.block()
  return instance
}


fun newPlatformSpec(block : v1_PlatformSpec.() -> Unit = {}): v1_PlatformSpec {
  val instance = v1_PlatformSpec()
  instance.block()
  return instance
}


fun newPlatformStatus(block : v1_PlatformStatus.() -> Unit = {}): v1_PlatformStatus {
  val instance = v1_PlatformStatus()
  instance.block()
  return instance
}


fun newPowerVSPlatformSpec(block : v1_PowerVSPlatformSpec.() -> Unit = {}): v1_PowerVSPlatformSpec {
  val instance = v1_PowerVSPlatformSpec()
  instance.block()
  return instance
}


fun newPowerVSPlatformStatus(block : v1_PowerVSPlatformStatus.() -> Unit = {}): v1_PowerVSPlatformStatus {
  val instance = v1_PowerVSPlatformStatus()
  instance.block()
  return instance
}


fun newPowerVSServiceEndpoint(block : v1_PowerVSServiceEndpoint.() -> Unit = {}): v1_PowerVSServiceEndpoint {
  val instance = v1_PowerVSServiceEndpoint()
  instance.block()
  return instance
}


fun newProject(block : v1_Project.() -> Unit = {}): v1_Project {
  val instance = v1_Project()
  instance.block()
  return instance
}


fun newProjectList(block : v1_ProjectList.() -> Unit = {}): v1_ProjectList {
  val instance = v1_ProjectList()
  instance.block()
  return instance
}


fun newProjectSpec(block : v1_ProjectSpec.() -> Unit = {}): v1_ProjectSpec {
  val instance = v1_ProjectSpec()
  instance.block()
  return instance
}


fun newProjectStatus(block : v1_ProjectStatus.() -> Unit = {}): v1_ProjectStatus {
  val instance = v1_ProjectStatus()
  instance.block()
  return instance
}


fun newPromQLClusterCondition(block : v1_PromQLClusterCondition.() -> Unit = {}): v1_PromQLClusterCondition {
  val instance = v1_PromQLClusterCondition()
  instance.block()
  return instance
}


fun newProxy(block : v1_Proxy.() -> Unit = {}): v1_Proxy {
  val instance = v1_Proxy()
  instance.block()
  return instance
}


fun newProxyList(block : v1_ProxyList.() -> Unit = {}): v1_ProxyList {
  val instance = v1_ProxyList()
  instance.block()
  return instance
}


fun newProxySpec(block : v1_ProxySpec.() -> Unit = {}): v1_ProxySpec {
  val instance = v1_ProxySpec()
  instance.block()
  return instance
}


fun newProxyStatus(block : v1_ProxyStatus.() -> Unit = {}): v1_ProxyStatus {
  val instance = v1_ProxyStatus()
  instance.block()
  return instance
}


fun newRegistryLocation(block : v1_RegistryLocation.() -> Unit = {}): v1_RegistryLocation {
  val instance = v1_RegistryLocation()
  instance.block()
  return instance
}


fun newRegistrySources(block : v1_RegistrySources.() -> Unit = {}): v1_RegistrySources {
  val instance = v1_RegistrySources()
  instance.block()
  return instance
}


fun newRelease(block : v1_Release.() -> Unit = {}): v1_Release {
  val instance = v1_Release()
  instance.block()
  return instance
}


fun newRepositoryDigestMirrors(block : v1_RepositoryDigestMirrors.() -> Unit = {}): v1_RepositoryDigestMirrors {
  val instance = v1_RepositoryDigestMirrors()
  instance.block()
  return instance
}


fun newRequestHeaderIdentityProvider(block : v1_RequestHeaderIdentityProvider.() -> Unit = {}): v1_RequestHeaderIdentityProvider {
  val instance = v1_RequestHeaderIdentityProvider()
  instance.block()
  return instance
}


fun newRequiredHSTSPolicy(block : v1_RequiredHSTSPolicy.() -> Unit = {}): v1_RequiredHSTSPolicy {
  val instance = v1_RequiredHSTSPolicy()
  instance.block()
  return instance
}


fun newScheduler(block : v1_Scheduler.() -> Unit = {}): v1_Scheduler {
  val instance = v1_Scheduler()
  instance.block()
  return instance
}


fun newSchedulerList(block : v1_SchedulerList.() -> Unit = {}): v1_SchedulerList {
  val instance = v1_SchedulerList()
  instance.block()
  return instance
}


fun newSchedulerSpec(block : v1_SchedulerSpec.() -> Unit = {}): v1_SchedulerSpec {
  val instance = v1_SchedulerSpec()
  instance.block()
  return instance
}


fun newSchedulerStatus(block : v1_SchedulerStatus.() -> Unit = {}): v1_SchedulerStatus {
  val instance = v1_SchedulerStatus()
  instance.block()
  return instance
}


fun newSecretNameReference(block : v1_SecretNameReference.() -> Unit = {}): v1_SecretNameReference {
  val instance = v1_SecretNameReference()
  instance.block()
  return instance
}


fun newTLSProfileSpec(block : v1_TLSProfileSpec.() -> Unit = {}): v1_TLSProfileSpec {
  val instance = v1_TLSProfileSpec()
  instance.block()
  return instance
}


fun newTLSSecurityProfile(block : v1_TLSSecurityProfile.() -> Unit = {}): v1_TLSSecurityProfile {
  val instance = v1_TLSSecurityProfile()
  instance.block()
  return instance
}


fun newTemplateReference(block : v1_TemplateReference.() -> Unit = {}): v1_TemplateReference {
  val instance = v1_TemplateReference()
  instance.block()
  return instance
}


fun newTokenConfig(block : v1_TokenConfig.() -> Unit = {}): v1_TokenConfig {
  val instance = v1_TokenConfig()
  instance.block()
  return instance
}


fun newUpdate(block : v1_Update.() -> Unit = {}): v1_Update {
  val instance = v1_Update()
  instance.block()
  return instance
}


fun newUpdateHistory(block : v1_UpdateHistory.() -> Unit = {}): v1_UpdateHistory {
  val instance = v1_UpdateHistory()
  instance.block()
  return instance
}


fun newVSpherePlatformSpec(block : v1_VSpherePlatformSpec.() -> Unit = {}): v1_VSpherePlatformSpec {
  val instance = v1_VSpherePlatformSpec()
  instance.block()
  return instance
}


fun newVSpherePlatformStatus(block : v1_VSpherePlatformStatus.() -> Unit = {}): v1_VSpherePlatformStatus {
  val instance = v1_VSpherePlatformStatus()
  instance.block()
  return instance
}


fun newWebhookTokenAuthenticator(block : v1_WebhookTokenAuthenticator.() -> Unit = {}): v1_WebhookTokenAuthenticator {
  val instance = v1_WebhookTokenAuthenticator()
  instance.block()
  return instance
}


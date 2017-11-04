// GENERATE
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BinaryBuildSource
import io.fabric8.openshift.api.model.BitbucketWebHookCause
import io.fabric8.openshift.api.model.Build
import io.fabric8.openshift.api.model.BuildConfig
import io.fabric8.openshift.api.model.BuildConfigList
import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildConfigStatus
import io.fabric8.openshift.api.model.BuildList
import io.fabric8.openshift.api.model.BuildOutput
import io.fabric8.openshift.api.model.BuildPostCommitSpec
import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.BuildSource
import io.fabric8.openshift.api.model.BuildSpec
import io.fabric8.openshift.api.model.BuildStatus
import io.fabric8.openshift.api.model.BuildStatusOutput
import io.fabric8.openshift.api.model.BuildStatusOutputTo
import io.fabric8.openshift.api.model.BuildStrategy
import io.fabric8.openshift.api.model.BuildTriggerCause
import io.fabric8.openshift.api.model.BuildTriggerPolicy
import io.fabric8.openshift.api.model.ClusterPolicy
import io.fabric8.openshift.api.model.ClusterPolicyBinding
import io.fabric8.openshift.api.model.ClusterPolicyBindingList
import io.fabric8.openshift.api.model.ClusterPolicyList
import io.fabric8.openshift.api.model.ClusterRole
import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.ClusterRoleBindingList
import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.CustomBuildStrategy
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams
import io.fabric8.openshift.api.model.DeploymentCause
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger
import io.fabric8.openshift.api.model.DeploymentCondition
import io.fabric8.openshift.api.model.DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigList
import io.fabric8.openshift.api.model.DeploymentConfigSpec
import io.fabric8.openshift.api.model.DeploymentConfigStatus
import io.fabric8.openshift.api.model.DeploymentDetails
import io.fabric8.openshift.api.model.DeploymentStrategy
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams
import io.fabric8.openshift.api.model.DeploymentTriggerPolicy
import io.fabric8.openshift.api.model.DockerBuildStrategy
import io.fabric8.openshift.api.model.DockerStrategyOptions
import io.fabric8.openshift.api.model.ExecNewPodHook
import io.fabric8.openshift.api.model.FSGroupStrategyOptions
import io.fabric8.openshift.api.model.GenericWebHookCause
import io.fabric8.openshift.api.model.GitBuildSource
import io.fabric8.openshift.api.model.GitHubWebHookCause
import io.fabric8.openshift.api.model.GitLabWebHookCause
import io.fabric8.openshift.api.model.GitSourceRevision
import io.fabric8.openshift.api.model.Group
import io.fabric8.openshift.api.model.GroupList
import io.fabric8.openshift.api.model.GroupRestriction
import io.fabric8.openshift.api.model.IDRange
import io.fabric8.openshift.api.model.Identity
import io.fabric8.openshift.api.model.IdentityList
import io.fabric8.openshift.api.model.Image
import io.fabric8.openshift.api.model.ImageChangeCause
import io.fabric8.openshift.api.model.ImageChangeTrigger
import io.fabric8.openshift.api.model.ImageLabel
import io.fabric8.openshift.api.model.ImageLayer
import io.fabric8.openshift.api.model.ImageList
import io.fabric8.openshift.api.model.ImageLookupPolicy
import io.fabric8.openshift.api.model.ImageSignature
import io.fabric8.openshift.api.model.ImageSource
import io.fabric8.openshift.api.model.ImageSourcePath
import io.fabric8.openshift.api.model.ImageStream
import io.fabric8.openshift.api.model.ImageStreamList
import io.fabric8.openshift.api.model.ImageStreamSpec
import io.fabric8.openshift.api.model.ImageStreamStatus
import io.fabric8.openshift.api.model.ImageStreamTag
import io.fabric8.openshift.api.model.ImageStreamTagList
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy
import io.fabric8.openshift.api.model.LifecycleHook
import io.fabric8.openshift.api.model.LocalSubjectAccessReview
import io.fabric8.openshift.api.model.NamedClusterRole
import io.fabric8.openshift.api.model.NamedClusterRoleBinding
import io.fabric8.openshift.api.model.NamedRole
import io.fabric8.openshift.api.model.NamedRoleBinding
import io.fabric8.openshift.api.model.NamedTagEventList
import io.fabric8.openshift.api.model.OAuthAccessToken
import io.fabric8.openshift.api.model.OAuthAccessTokenList
import io.fabric8.openshift.api.model.OAuthAuthorizeToken
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList
import io.fabric8.openshift.api.model.OAuthClient
import io.fabric8.openshift.api.model.OAuthClientAuthorization
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList
import io.fabric8.openshift.api.model.OAuthClientList
import io.fabric8.openshift.api.model.Parameter
import io.fabric8.openshift.api.model.Policy
import io.fabric8.openshift.api.model.PolicyBinding
import io.fabric8.openshift.api.model.PolicyBindingList
import io.fabric8.openshift.api.model.PolicyList
import io.fabric8.openshift.api.model.PolicyRule
import io.fabric8.openshift.api.model.Project
import io.fabric8.openshift.api.model.ProjectList
import io.fabric8.openshift.api.model.ProjectRequest
import io.fabric8.openshift.api.model.ProjectSpec
import io.fabric8.openshift.api.model.ProjectStatus
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams
import io.fabric8.openshift.api.model.Role
import io.fabric8.openshift.api.model.RoleBinding
import io.fabric8.openshift.api.model.RoleBindingList
import io.fabric8.openshift.api.model.RoleBindingRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.RoleList
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams
import io.fabric8.openshift.api.model.Route
import io.fabric8.openshift.api.model.RouteIngress
import io.fabric8.openshift.api.model.RouteIngressCondition
import io.fabric8.openshift.api.model.RouteList
import io.fabric8.openshift.api.model.RoutePort
import io.fabric8.openshift.api.model.RouteSpec
import io.fabric8.openshift.api.model.RouteStatus
import io.fabric8.openshift.api.model.RouteTargetReference
import io.fabric8.openshift.api.model.RunAsUserStrategyOptions
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions
import io.fabric8.openshift.api.model.ScopeRestriction
import io.fabric8.openshift.api.model.SecretBuildSource
import io.fabric8.openshift.api.model.SecretSpec
import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.SecurityContextConstraintsList
import io.fabric8.openshift.api.model.ServiceAccountReference
import io.fabric8.openshift.api.model.ServiceAccountRestriction
import io.fabric8.openshift.api.model.SignatureCondition
import io.fabric8.openshift.api.model.SignatureIssuer
import io.fabric8.openshift.api.model.SignatureSubject
import io.fabric8.openshift.api.model.SourceBuildStrategy
import io.fabric8.openshift.api.model.SourceControlUser
import io.fabric8.openshift.api.model.SourceRevision
import io.fabric8.openshift.api.model.StageInfo
import io.fabric8.openshift.api.model.StepInfo
import io.fabric8.openshift.api.model.SubjectAccessReview
import io.fabric8.openshift.api.model.SubjectAccessReviewResponse
import io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions
import io.fabric8.openshift.api.model.TLSConfig
import io.fabric8.openshift.api.model.TagEvent
import io.fabric8.openshift.api.model.TagEventCondition
import io.fabric8.openshift.api.model.TagImageHook
import io.fabric8.openshift.api.model.TagImportPolicy
import io.fabric8.openshift.api.model.TagReference
import io.fabric8.openshift.api.model.TagReferencePolicy
import io.fabric8.openshift.api.model.Template
import io.fabric8.openshift.api.model.TemplateList
import io.fabric8.openshift.api.model.User
import io.fabric8.openshift.api.model.UserList
import io.fabric8.openshift.api.model.UserRestriction
import io.fabric8.openshift.api.model.WebHookTrigger


fun binaryBuildSource(block : BinaryBuildSource.() -> Unit = {}): BinaryBuildSource {
  val instance = BinaryBuildSource()
  instance.block()
  return instance
}


fun bitbucketWebHookCause(block : BitbucketWebHookCause.() -> Unit = {}): BitbucketWebHookCause {
  val instance = BitbucketWebHookCause()
  instance.block()
  return instance
}


fun build(block : Build.() -> Unit = {}): Build {
  val instance = Build()
  instance.block()
  return instance
}


fun buildConfig(block : BuildConfig.() -> Unit = {}): BuildConfig {
  val instance = BuildConfig()
  instance.block()
  return instance
}


fun buildConfigList(block : BuildConfigList.() -> Unit = {}): BuildConfigList {
  val instance = BuildConfigList()
  instance.block()
  return instance
}


fun buildConfigSpec(block : BuildConfigSpec.() -> Unit = {}): BuildConfigSpec {
  val instance = BuildConfigSpec()
  instance.block()
  return instance
}


fun buildConfigStatus(block : BuildConfigStatus.() -> Unit = {}): BuildConfigStatus {
  val instance = BuildConfigStatus()
  instance.block()
  return instance
}


fun buildList(block : BuildList.() -> Unit = {}): BuildList {
  val instance = BuildList()
  instance.block()
  return instance
}


fun buildOutput(block : BuildOutput.() -> Unit = {}): BuildOutput {
  val instance = BuildOutput()
  instance.block()
  return instance
}


fun buildPostCommitSpec(block : BuildPostCommitSpec.() -> Unit = {}): BuildPostCommitSpec {
  val instance = BuildPostCommitSpec()
  instance.block()
  return instance
}


fun buildRequest(block : BuildRequest.() -> Unit = {}): BuildRequest {
  val instance = BuildRequest()
  instance.block()
  return instance
}


fun buildSource(block : BuildSource.() -> Unit = {}): BuildSource {
  val instance = BuildSource()
  instance.block()
  return instance
}


fun buildSpec(block : BuildSpec.() -> Unit = {}): BuildSpec {
  val instance = BuildSpec()
  instance.block()
  return instance
}


fun buildStatus(block : BuildStatus.() -> Unit = {}): BuildStatus {
  val instance = BuildStatus()
  instance.block()
  return instance
}


fun buildStatusOutput(block : BuildStatusOutput.() -> Unit = {}): BuildStatusOutput {
  val instance = BuildStatusOutput()
  instance.block()
  return instance
}


fun buildStatusOutputTo(block : BuildStatusOutputTo.() -> Unit = {}): BuildStatusOutputTo {
  val instance = BuildStatusOutputTo()
  instance.block()
  return instance
}


fun buildStrategy(block : BuildStrategy.() -> Unit = {}): BuildStrategy {
  val instance = BuildStrategy()
  instance.block()
  return instance
}


fun buildTriggerCause(block : BuildTriggerCause.() -> Unit = {}): BuildTriggerCause {
  val instance = BuildTriggerCause()
  instance.block()
  return instance
}


fun buildTriggerPolicy(block : BuildTriggerPolicy.() -> Unit = {}): BuildTriggerPolicy {
  val instance = BuildTriggerPolicy()
  instance.block()
  return instance
}


fun clusterPolicy(block : ClusterPolicy.() -> Unit = {}): ClusterPolicy {
  val instance = ClusterPolicy()
  instance.block()
  return instance
}


fun clusterPolicyBinding(block : ClusterPolicyBinding.() -> Unit = {}): ClusterPolicyBinding {
  val instance = ClusterPolicyBinding()
  instance.block()
  return instance
}


fun clusterPolicyBindingList(block : ClusterPolicyBindingList.() -> Unit = {}): ClusterPolicyBindingList {
  val instance = ClusterPolicyBindingList()
  instance.block()
  return instance
}


fun clusterPolicyList(block : ClusterPolicyList.() -> Unit = {}): ClusterPolicyList {
  val instance = ClusterPolicyList()
  instance.block()
  return instance
}


fun clusterRole(block : ClusterRole.() -> Unit = {}): ClusterRole {
  val instance = ClusterRole()
  instance.block()
  return instance
}


fun clusterRoleBinding(block : ClusterRoleBinding.() -> Unit = {}): ClusterRoleBinding {
  val instance = ClusterRoleBinding()
  instance.block()
  return instance
}


fun clusterRoleBindingList(block : ClusterRoleBindingList.() -> Unit = {}): ClusterRoleBindingList {
  val instance = ClusterRoleBindingList()
  instance.block()
  return instance
}


fun clusterRoleScopeRestriction(block : ClusterRoleScopeRestriction.() -> Unit = {}): ClusterRoleScopeRestriction {
  val instance = ClusterRoleScopeRestriction()
  instance.block()
  return instance
}


fun customBuildStrategy(block : CustomBuildStrategy.() -> Unit = {}): CustomBuildStrategy {
  val instance = CustomBuildStrategy()
  instance.block()
  return instance
}


fun customDeploymentStrategyParams(block : CustomDeploymentStrategyParams.() -> Unit = {}): CustomDeploymentStrategyParams {
  val instance = CustomDeploymentStrategyParams()
  instance.block()
  return instance
}


fun deploymentCause(block : DeploymentCause.() -> Unit = {}): DeploymentCause {
  val instance = DeploymentCause()
  instance.block()
  return instance
}


fun deploymentCauseImageTrigger(block : DeploymentCauseImageTrigger.() -> Unit = {}): DeploymentCauseImageTrigger {
  val instance = DeploymentCauseImageTrigger()
  instance.block()
  return instance
}


fun deploymentCondition(block : DeploymentCondition.() -> Unit = {}): DeploymentCondition {
  val instance = DeploymentCondition()
  instance.block()
  return instance
}


fun deploymentConfig(block : DeploymentConfig.() -> Unit = {}): DeploymentConfig {
  val instance = DeploymentConfig()
  instance.block()
  return instance
}


fun deploymentConfigList(block : DeploymentConfigList.() -> Unit = {}): DeploymentConfigList {
  val instance = DeploymentConfigList()
  instance.block()
  return instance
}


fun deploymentConfigSpec(block : DeploymentConfigSpec.() -> Unit = {}): DeploymentConfigSpec {
  val instance = DeploymentConfigSpec()
  instance.block()
  return instance
}


fun deploymentConfigStatus(block : DeploymentConfigStatus.() -> Unit = {}): DeploymentConfigStatus {
  val instance = DeploymentConfigStatus()
  instance.block()
  return instance
}


fun deploymentDetails(block : DeploymentDetails.() -> Unit = {}): DeploymentDetails {
  val instance = DeploymentDetails()
  instance.block()
  return instance
}


fun deploymentStrategy(block : DeploymentStrategy.() -> Unit = {}): DeploymentStrategy {
  val instance = DeploymentStrategy()
  instance.block()
  return instance
}


fun deploymentTriggerImageChangeParams(block : DeploymentTriggerImageChangeParams.() -> Unit = {}): DeploymentTriggerImageChangeParams {
  val instance = DeploymentTriggerImageChangeParams()
  instance.block()
  return instance
}


fun deploymentTriggerPolicy(block : DeploymentTriggerPolicy.() -> Unit = {}): DeploymentTriggerPolicy {
  val instance = DeploymentTriggerPolicy()
  instance.block()
  return instance
}


fun dockerBuildStrategy(block : DockerBuildStrategy.() -> Unit = {}): DockerBuildStrategy {
  val instance = DockerBuildStrategy()
  instance.block()
  return instance
}


fun dockerStrategyOptions(block : DockerStrategyOptions.() -> Unit = {}): DockerStrategyOptions {
  val instance = DockerStrategyOptions()
  instance.block()
  return instance
}


fun execNewPodHook(block : ExecNewPodHook.() -> Unit = {}): ExecNewPodHook {
  val instance = ExecNewPodHook()
  instance.block()
  return instance
}


fun fsGroupStrategyOptions(block : FSGroupStrategyOptions.() -> Unit = {}): FSGroupStrategyOptions {
  val instance = FSGroupStrategyOptions()
  instance.block()
  return instance
}


fun genericWebHookCause(block : GenericWebHookCause.() -> Unit = {}): GenericWebHookCause {
  val instance = GenericWebHookCause()
  instance.block()
  return instance
}


fun gitBuildSource(block : GitBuildSource.() -> Unit = {}): GitBuildSource {
  val instance = GitBuildSource()
  instance.block()
  return instance
}


fun gitHubWebHookCause(block : GitHubWebHookCause.() -> Unit = {}): GitHubWebHookCause {
  val instance = GitHubWebHookCause()
  instance.block()
  return instance
}


fun gitLabWebHookCause(block : GitLabWebHookCause.() -> Unit = {}): GitLabWebHookCause {
  val instance = GitLabWebHookCause()
  instance.block()
  return instance
}


fun gitSourceRevision(block : GitSourceRevision.() -> Unit = {}): GitSourceRevision {
  val instance = GitSourceRevision()
  instance.block()
  return instance
}


fun group(block : Group.() -> Unit = {}): Group {
  val instance = Group()
  instance.block()
  return instance
}


fun groupList(block : GroupList.() -> Unit = {}): GroupList {
  val instance = GroupList()
  instance.block()
  return instance
}


fun groupRestriction(block : GroupRestriction.() -> Unit = {}): GroupRestriction {
  val instance = GroupRestriction()
  instance.block()
  return instance
}


fun idRange(block : IDRange.() -> Unit = {}): IDRange {
  val instance = IDRange()
  instance.block()
  return instance
}


fun identity(block : Identity.() -> Unit = {}): Identity {
  val instance = Identity()
  instance.block()
  return instance
}


fun identityList(block : IdentityList.() -> Unit = {}): IdentityList {
  val instance = IdentityList()
  instance.block()
  return instance
}


fun image(block : Image.() -> Unit = {}): Image {
  val instance = Image()
  instance.block()
  return instance
}


fun imageChangeCause(block : ImageChangeCause.() -> Unit = {}): ImageChangeCause {
  val instance = ImageChangeCause()
  instance.block()
  return instance
}


fun imageChangeTrigger(block : ImageChangeTrigger.() -> Unit = {}): ImageChangeTrigger {
  val instance = ImageChangeTrigger()
  instance.block()
  return instance
}


fun imageLabel(block : ImageLabel.() -> Unit = {}): ImageLabel {
  val instance = ImageLabel()
  instance.block()
  return instance
}


fun imageLayer(block : ImageLayer.() -> Unit = {}): ImageLayer {
  val instance = ImageLayer()
  instance.block()
  return instance
}


fun imageList(block : ImageList.() -> Unit = {}): ImageList {
  val instance = ImageList()
  instance.block()
  return instance
}


fun imageLookupPolicy(block : ImageLookupPolicy.() -> Unit = {}): ImageLookupPolicy {
  val instance = ImageLookupPolicy()
  instance.block()
  return instance
}


fun imageSignature(block : ImageSignature.() -> Unit = {}): ImageSignature {
  val instance = ImageSignature()
  instance.block()
  return instance
}


fun imageSource(block : ImageSource.() -> Unit = {}): ImageSource {
  val instance = ImageSource()
  instance.block()
  return instance
}


fun imageSourcePath(block : ImageSourcePath.() -> Unit = {}): ImageSourcePath {
  val instance = ImageSourcePath()
  instance.block()
  return instance
}


fun imageStream(block : ImageStream.() -> Unit = {}): ImageStream {
  val instance = ImageStream()
  instance.block()
  return instance
}


fun imageStreamList(block : ImageStreamList.() -> Unit = {}): ImageStreamList {
  val instance = ImageStreamList()
  instance.block()
  return instance
}


fun imageStreamSpec(block : ImageStreamSpec.() -> Unit = {}): ImageStreamSpec {
  val instance = ImageStreamSpec()
  instance.block()
  return instance
}


fun imageStreamStatus(block : ImageStreamStatus.() -> Unit = {}): ImageStreamStatus {
  val instance = ImageStreamStatus()
  instance.block()
  return instance
}


fun imageStreamTag(block : ImageStreamTag.() -> Unit = {}): ImageStreamTag {
  val instance = ImageStreamTag()
  instance.block()
  return instance
}


fun imageStreamTagList(block : ImageStreamTagList.() -> Unit = {}): ImageStreamTagList {
  val instance = ImageStreamTagList()
  instance.block()
  return instance
}


fun jenkinsPipelineBuildStrategy(block : JenkinsPipelineBuildStrategy.() -> Unit = {}): JenkinsPipelineBuildStrategy {
  val instance = JenkinsPipelineBuildStrategy()
  instance.block()
  return instance
}


fun lifecycleHook(block : LifecycleHook.() -> Unit = {}): LifecycleHook {
  val instance = LifecycleHook()
  instance.block()
  return instance
}


fun localSubjectAccessReview(block : LocalSubjectAccessReview.() -> Unit = {}): LocalSubjectAccessReview {
  val instance = LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun namedClusterRole(block : NamedClusterRole.() -> Unit = {}): NamedClusterRole {
  val instance = NamedClusterRole()
  instance.block()
  return instance
}


fun namedClusterRoleBinding(block : NamedClusterRoleBinding.() -> Unit = {}): NamedClusterRoleBinding {
  val instance = NamedClusterRoleBinding()
  instance.block()
  return instance
}


fun namedRole(block : NamedRole.() -> Unit = {}): NamedRole {
  val instance = NamedRole()
  instance.block()
  return instance
}


fun namedRoleBinding(block : NamedRoleBinding.() -> Unit = {}): NamedRoleBinding {
  val instance = NamedRoleBinding()
  instance.block()
  return instance
}


fun namedTagEventList(block : NamedTagEventList.() -> Unit = {}): NamedTagEventList {
  val instance = NamedTagEventList()
  instance.block()
  return instance
}


fun oAuthAccessToken(block : OAuthAccessToken.() -> Unit = {}): OAuthAccessToken {
  val instance = OAuthAccessToken()
  instance.block()
  return instance
}


fun oAuthAccessTokenList(block : OAuthAccessTokenList.() -> Unit = {}): OAuthAccessTokenList {
  val instance = OAuthAccessTokenList()
  instance.block()
  return instance
}


fun oAuthAuthorizeToken(block : OAuthAuthorizeToken.() -> Unit = {}): OAuthAuthorizeToken {
  val instance = OAuthAuthorizeToken()
  instance.block()
  return instance
}


fun oAuthAuthorizeTokenList(block : OAuthAuthorizeTokenList.() -> Unit = {}): OAuthAuthorizeTokenList {
  val instance = OAuthAuthorizeTokenList()
  instance.block()
  return instance
}


fun oAuthClient(block : OAuthClient.() -> Unit = {}): OAuthClient {
  val instance = OAuthClient()
  instance.block()
  return instance
}


fun oAuthClientAuthorization(block : OAuthClientAuthorization.() -> Unit = {}): OAuthClientAuthorization {
  val instance = OAuthClientAuthorization()
  instance.block()
  return instance
}


fun oAuthClientAuthorizationList(block : OAuthClientAuthorizationList.() -> Unit = {}): OAuthClientAuthorizationList {
  val instance = OAuthClientAuthorizationList()
  instance.block()
  return instance
}


fun oAuthClientList(block : OAuthClientList.() -> Unit = {}): OAuthClientList {
  val instance = OAuthClientList()
  instance.block()
  return instance
}


fun parameter(block : Parameter.() -> Unit = {}): Parameter {
  val instance = Parameter()
  instance.block()
  return instance
}


fun policy(block : Policy.() -> Unit = {}): Policy {
  val instance = Policy()
  instance.block()
  return instance
}


fun policyBinding(block : PolicyBinding.() -> Unit = {}): PolicyBinding {
  val instance = PolicyBinding()
  instance.block()
  return instance
}


fun policyBindingList(block : PolicyBindingList.() -> Unit = {}): PolicyBindingList {
  val instance = PolicyBindingList()
  instance.block()
  return instance
}


fun policyList(block : PolicyList.() -> Unit = {}): PolicyList {
  val instance = PolicyList()
  instance.block()
  return instance
}


fun policyRule(block : PolicyRule.() -> Unit = {}): PolicyRule {
  val instance = PolicyRule()
  instance.block()
  return instance
}


fun project(block : Project.() -> Unit = {}): Project {
  val instance = Project()
  instance.block()
  return instance
}


fun projectList(block : ProjectList.() -> Unit = {}): ProjectList {
  val instance = ProjectList()
  instance.block()
  return instance
}


fun projectRequest(block : ProjectRequest.() -> Unit = {}): ProjectRequest {
  val instance = ProjectRequest()
  instance.block()
  return instance
}


fun projectSpec(block : ProjectSpec.() -> Unit = {}): ProjectSpec {
  val instance = ProjectSpec()
  instance.block()
  return instance
}


fun projectStatus(block : ProjectStatus.() -> Unit = {}): ProjectStatus {
  val instance = ProjectStatus()
  instance.block()
  return instance
}


fun recreateDeploymentStrategyParams(block : RecreateDeploymentStrategyParams.() -> Unit = {}): RecreateDeploymentStrategyParams {
  val instance = RecreateDeploymentStrategyParams()
  instance.block()
  return instance
}


fun role(block : Role.() -> Unit = {}): Role {
  val instance = Role()
  instance.block()
  return instance
}


fun roleBinding(block : RoleBinding.() -> Unit = {}): RoleBinding {
  val instance = RoleBinding()
  instance.block()
  return instance
}


fun roleBindingList(block : RoleBindingList.() -> Unit = {}): RoleBindingList {
  val instance = RoleBindingList()
  instance.block()
  return instance
}


fun roleBindingRestriction(block : RoleBindingRestriction.() -> Unit = {}): RoleBindingRestriction {
  val instance = RoleBindingRestriction()
  instance.block()
  return instance
}


fun roleBindingRestrictionSpec(block : RoleBindingRestrictionSpec.() -> Unit = {}): RoleBindingRestrictionSpec {
  val instance = RoleBindingRestrictionSpec()
  instance.block()
  return instance
}


fun roleList(block : RoleList.() -> Unit = {}): RoleList {
  val instance = RoleList()
  instance.block()
  return instance
}


fun rollingDeploymentStrategyParams(block : RollingDeploymentStrategyParams.() -> Unit = {}): RollingDeploymentStrategyParams {
  val instance = RollingDeploymentStrategyParams()
  instance.block()
  return instance
}


fun route(block : Route.() -> Unit = {}): Route {
  val instance = Route()
  instance.block()
  return instance
}


fun routeIngress(block : RouteIngress.() -> Unit = {}): RouteIngress {
  val instance = RouteIngress()
  instance.block()
  return instance
}


fun routeIngressCondition(block : RouteIngressCondition.() -> Unit = {}): RouteIngressCondition {
  val instance = RouteIngressCondition()
  instance.block()
  return instance
}


fun routeList(block : RouteList.() -> Unit = {}): RouteList {
  val instance = RouteList()
  instance.block()
  return instance
}


fun routePort(block : RoutePort.() -> Unit = {}): RoutePort {
  val instance = RoutePort()
  instance.block()
  return instance
}


fun routeSpec(block : RouteSpec.() -> Unit = {}): RouteSpec {
  val instance = RouteSpec()
  instance.block()
  return instance
}


fun routeStatus(block : RouteStatus.() -> Unit = {}): RouteStatus {
  val instance = RouteStatus()
  instance.block()
  return instance
}


fun routeTargetReference(block : RouteTargetReference.() -> Unit = {}): RouteTargetReference {
  val instance = RouteTargetReference()
  instance.block()
  return instance
}


fun runAsUserStrategyOptions(block : RunAsUserStrategyOptions.() -> Unit = {}): RunAsUserStrategyOptions {
  val instance = RunAsUserStrategyOptions()
  instance.block()
  return instance
}


fun seLinuxContextStrategyOptions(block : SELinuxContextStrategyOptions.() -> Unit = {}): SELinuxContextStrategyOptions {
  val instance = SELinuxContextStrategyOptions()
  instance.block()
  return instance
}


fun scopeRestriction(block : ScopeRestriction.() -> Unit = {}): ScopeRestriction {
  val instance = ScopeRestriction()
  instance.block()
  return instance
}


fun secretBuildSource(block : SecretBuildSource.() -> Unit = {}): SecretBuildSource {
  val instance = SecretBuildSource()
  instance.block()
  return instance
}


fun secretSpec(block : SecretSpec.() -> Unit = {}): SecretSpec {
  val instance = SecretSpec()
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


fun serviceAccountReference(block : ServiceAccountReference.() -> Unit = {}): ServiceAccountReference {
  val instance = ServiceAccountReference()
  instance.block()
  return instance
}


fun serviceAccountRestriction(block : ServiceAccountRestriction.() -> Unit = {}): ServiceAccountRestriction {
  val instance = ServiceAccountRestriction()
  instance.block()
  return instance
}


fun signatureCondition(block : SignatureCondition.() -> Unit = {}): SignatureCondition {
  val instance = SignatureCondition()
  instance.block()
  return instance
}


fun signatureIssuer(block : SignatureIssuer.() -> Unit = {}): SignatureIssuer {
  val instance = SignatureIssuer()
  instance.block()
  return instance
}


fun signatureSubject(block : SignatureSubject.() -> Unit = {}): SignatureSubject {
  val instance = SignatureSubject()
  instance.block()
  return instance
}


fun sourceBuildStrategy(block : SourceBuildStrategy.() -> Unit = {}): SourceBuildStrategy {
  val instance = SourceBuildStrategy()
  instance.block()
  return instance
}


fun sourceControlUser(block : SourceControlUser.() -> Unit = {}): SourceControlUser {
  val instance = SourceControlUser()
  instance.block()
  return instance
}


fun sourceRevision(block : SourceRevision.() -> Unit = {}): SourceRevision {
  val instance = SourceRevision()
  instance.block()
  return instance
}


fun stageInfo(block : StageInfo.() -> Unit = {}): StageInfo {
  val instance = StageInfo()
  instance.block()
  return instance
}


fun stepInfo(block : StepInfo.() -> Unit = {}): StepInfo {
  val instance = StepInfo()
  instance.block()
  return instance
}


fun subjectAccessReview(block : SubjectAccessReview.() -> Unit = {}): SubjectAccessReview {
  val instance = SubjectAccessReview()
  instance.block()
  return instance
}


fun subjectAccessReviewResponse(block : SubjectAccessReviewResponse.() -> Unit = {}): SubjectAccessReviewResponse {
  val instance = SubjectAccessReviewResponse()
  instance.block()
  return instance
}


fun supplementalGroupsStrategyOptions(block : SupplementalGroupsStrategyOptions.() -> Unit = {}): SupplementalGroupsStrategyOptions {
  val instance = SupplementalGroupsStrategyOptions()
  instance.block()
  return instance
}


fun tlsConfig(block : TLSConfig.() -> Unit = {}): TLSConfig {
  val instance = TLSConfig()
  instance.block()
  return instance
}


fun tagEvent(block : TagEvent.() -> Unit = {}): TagEvent {
  val instance = TagEvent()
  instance.block()
  return instance
}


fun tagEventCondition(block : TagEventCondition.() -> Unit = {}): TagEventCondition {
  val instance = TagEventCondition()
  instance.block()
  return instance
}


fun tagImageHook(block : TagImageHook.() -> Unit = {}): TagImageHook {
  val instance = TagImageHook()
  instance.block()
  return instance
}


fun tagImportPolicy(block : TagImportPolicy.() -> Unit = {}): TagImportPolicy {
  val instance = TagImportPolicy()
  instance.block()
  return instance
}


fun tagReference(block : TagReference.() -> Unit = {}): TagReference {
  val instance = TagReference()
  instance.block()
  return instance
}


fun tagReferencePolicy(block : TagReferencePolicy.() -> Unit = {}): TagReferencePolicy {
  val instance = TagReferencePolicy()
  instance.block()
  return instance
}


fun template(block : Template.() -> Unit = {}): Template {
  val instance = Template()
  instance.block()
  return instance
}


fun templateList(block : TemplateList.() -> Unit = {}): TemplateList {
  val instance = TemplateList()
  instance.block()
  return instance
}


fun user(block : User.() -> Unit = {}): User {
  val instance = User()
  instance.block()
  return instance
}


fun userList(block : UserList.() -> Unit = {}): UserList {
  val instance = UserList()
  instance.block()
  return instance
}


fun userRestriction(block : UserRestriction.() -> Unit = {}): UserRestriction {
  val instance = UserRestriction()
  instance.block()
  return instance
}


fun webHookTrigger(block : WebHookTrigger.() -> Unit = {}): WebHookTrigger {
  val instance = WebHookTrigger()
  instance.block()
  return instance
}


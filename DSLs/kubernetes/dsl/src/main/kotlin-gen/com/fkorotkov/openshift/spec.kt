// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServer as model_APIServer
import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec
import io.fabric8.openshift.api.model.AppliedClusterResourceQuota as model_AppliedClusterResourceQuota
import io.fabric8.openshift.api.model.Authentication as model_Authentication
import io.fabric8.openshift.api.model.AuthenticationSpec as model_AuthenticationSpec
import io.fabric8.openshift.api.model.BrokerTemplateInstance as model_BrokerTemplateInstance
import io.fabric8.openshift.api.model.BrokerTemplateInstanceSpec as model_BrokerTemplateInstanceSpec
import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.ClusterOperator as model_ClusterOperator
import io.fabric8.openshift.api.model.ClusterOperatorSpec as model_ClusterOperatorSpec
import io.fabric8.openshift.api.model.ClusterResourceQuota as model_ClusterResourceQuota
import io.fabric8.openshift.api.model.ClusterResourceQuotaSpec as model_ClusterResourceQuotaSpec
import io.fabric8.openshift.api.model.ClusterVersion as model_ClusterVersion
import io.fabric8.openshift.api.model.ClusterVersionSpec as model_ClusterVersionSpec
import io.fabric8.openshift.api.model.Console as model_Console
import io.fabric8.openshift.api.model.ConsoleSpec as model_ConsoleSpec
import io.fabric8.openshift.api.model.DNS as model_DNS
import io.fabric8.openshift.api.model.DNSSpec as model_DNSSpec
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigSpec as model_DeploymentConfigSpec
import io.fabric8.openshift.api.model.EgressNetworkPolicy as model_EgressNetworkPolicy
import io.fabric8.openshift.api.model.EgressNetworkPolicySpec as model_EgressNetworkPolicySpec
import io.fabric8.openshift.api.model.FeatureGate as model_FeatureGate
import io.fabric8.openshift.api.model.FeatureGateSpec as model_FeatureGateSpec
import io.fabric8.openshift.api.model.HelmChartRepository as model_HelmChartRepository
import io.fabric8.openshift.api.model.HelmChartRepositorySpec as model_HelmChartRepositorySpec
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportSpec as model_ImageStreamImportSpec
import io.fabric8.openshift.api.model.ImageStreamSpec as model_ImageStreamSpec
import io.fabric8.openshift.api.model.ImageTag as model_ImageTag
import io.fabric8.openshift.api.model.Infrastructure as model_Infrastructure
import io.fabric8.openshift.api.model.InfrastructureSpec as model_InfrastructureSpec
import io.fabric8.openshift.api.model.Ingress as model_Ingress
import io.fabric8.openshift.api.model.IngressSpec as model_IngressSpec
import io.fabric8.openshift.api.model.Network as model_Network
import io.fabric8.openshift.api.model.NetworkSpec as model_NetworkSpec
import io.fabric8.openshift.api.model.OAuth as model_OAuth
import io.fabric8.openshift.api.model.OAuthSpec as model_OAuthSpec
import io.fabric8.openshift.api.model.OperatorHub as model_OperatorHub
import io.fabric8.openshift.api.model.OperatorHubSpec as model_OperatorHubSpec
import io.fabric8.openshift.api.model.PodSecurityPolicyReview as model_PodSecurityPolicyReview
import io.fabric8.openshift.api.model.PodSecurityPolicyReviewSpec as model_PodSecurityPolicyReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReview as model_PodSecurityPolicySelfSubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReviewSpec as model_PodSecurityPolicySelfSubjectReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReview as model_PodSecurityPolicySubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewSpec as model_PodSecurityPolicySubjectReviewSpec
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectSpec as model_ProjectSpec
import io.fabric8.openshift.api.model.Proxy as model_Proxy
import io.fabric8.openshift.api.model.ProxySpec as model_ProxySpec
import io.fabric8.openshift.api.model.RoleBindingRestriction as model_RoleBindingRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec as model_RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteSpec as model_RouteSpec
import io.fabric8.openshift.api.model.Scheduler as model_Scheduler
import io.fabric8.openshift.api.model.SchedulerSpec as model_SchedulerSpec
import io.fabric8.openshift.api.model.SelfSubjectRulesReview as model_SelfSubjectRulesReview
import io.fabric8.openshift.api.model.SelfSubjectRulesReviewSpec as model_SelfSubjectRulesReviewSpec
import io.fabric8.openshift.api.model.SubjectRulesReview as model_SubjectRulesReview
import io.fabric8.openshift.api.model.SubjectRulesReviewSpec as model_SubjectRulesReviewSpec
import io.fabric8.openshift.api.model.TagReference as model_TagReference
import io.fabric8.openshift.api.model.TemplateInstance as model_TemplateInstance
import io.fabric8.openshift.api.model.TemplateInstanceSpec as model_TemplateInstanceSpec


fun  model_APIServer.`spec`(block: model_APIServerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_APIServerSpec()
  }

  this.`spec`.block()
}


fun  model_AppliedClusterResourceQuota.`spec`(block: model_ClusterResourceQuotaSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ClusterResourceQuotaSpec()
  }

  this.`spec`.block()
}


fun  model_Authentication.`spec`(block: model_AuthenticationSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_AuthenticationSpec()
  }

  this.`spec`.block()
}


fun  model_BrokerTemplateInstance.`spec`(block: model_BrokerTemplateInstanceSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_BrokerTemplateInstanceSpec()
  }

  this.`spec`.block()
}


fun  model_Build.`spec`(block: model_BuildSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_BuildSpec()
  }

  this.`spec`.block()
}


fun  model_BuildConfig.`spec`(block: model_BuildConfigSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_BuildConfigSpec()
  }

  this.`spec`.block()
}


fun  model_ClusterOperator.`spec`(block: model_ClusterOperatorSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ClusterOperatorSpec()
  }

  this.`spec`.block()
}


fun  model_ClusterResourceQuota.`spec`(block: model_ClusterResourceQuotaSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ClusterResourceQuotaSpec()
  }

  this.`spec`.block()
}


fun  model_ClusterVersion.`spec`(block: model_ClusterVersionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ClusterVersionSpec()
  }

  this.`spec`.block()
}


fun  model_Console.`spec`(block: model_ConsoleSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ConsoleSpec()
  }

  this.`spec`.block()
}


fun  model_DNS.`spec`(block: model_DNSSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_DNSSpec()
  }

  this.`spec`.block()
}


fun  model_DeploymentConfig.`spec`(block: model_DeploymentConfigSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_DeploymentConfigSpec()
  }

  this.`spec`.block()
}


fun  model_EgressNetworkPolicy.`spec`(block: model_EgressNetworkPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_EgressNetworkPolicySpec()
  }

  this.`spec`.block()
}


fun  model_FeatureGate.`spec`(block: model_FeatureGateSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_FeatureGateSpec()
  }

  this.`spec`.block()
}


fun  model_HelmChartRepository.`spec`(block: model_HelmChartRepositorySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_HelmChartRepositorySpec()
  }

  this.`spec`.block()
}


fun  model_ImageStream.`spec`(block: model_ImageStreamSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ImageStreamSpec()
  }

  this.`spec`.block()
}


fun  model_ImageStreamImport.`spec`(block: model_ImageStreamImportSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ImageStreamImportSpec()
  }

  this.`spec`.block()
}


fun  model_ImageTag.`spec`(block: model_TagReference.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_TagReference()
  }

  this.`spec`.block()
}


fun  model_Infrastructure.`spec`(block: model_InfrastructureSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_InfrastructureSpec()
  }

  this.`spec`.block()
}


fun  model_Ingress.`spec`(block: model_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_IngressSpec()
  }

  this.`spec`.block()
}


fun  model_Network.`spec`(block: model_NetworkSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_NetworkSpec()
  }

  this.`spec`.block()
}


fun  model_OAuth.`spec`(block: model_OAuthSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_OAuthSpec()
  }

  this.`spec`.block()
}


fun  model_OperatorHub.`spec`(block: model_OperatorHubSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_OperatorHubSpec()
  }

  this.`spec`.block()
}


fun  model_PodSecurityPolicyReview.`spec`(block: model_PodSecurityPolicyReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_PodSecurityPolicyReviewSpec()
  }

  this.`spec`.block()
}


fun  model_PodSecurityPolicySelfSubjectReview.`spec`(block: model_PodSecurityPolicySelfSubjectReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_PodSecurityPolicySelfSubjectReviewSpec()
  }

  this.`spec`.block()
}


fun  model_PodSecurityPolicySubjectReview.`spec`(block: model_PodSecurityPolicySubjectReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_PodSecurityPolicySubjectReviewSpec()
  }

  this.`spec`.block()
}


fun  model_Project.`spec`(block: model_ProjectSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ProjectSpec()
  }

  this.`spec`.block()
}


fun  model_Proxy.`spec`(block: model_ProxySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ProxySpec()
  }

  this.`spec`.block()
}


fun  model_RoleBindingRestriction.`spec`(block: model_RoleBindingRestrictionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_RoleBindingRestrictionSpec()
  }

  this.`spec`.block()
}


fun  model_Route.`spec`(block: model_RouteSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_RouteSpec()
  }

  this.`spec`.block()
}


fun  model_Scheduler.`spec`(block: model_SchedulerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_SchedulerSpec()
  }

  this.`spec`.block()
}


fun  model_SelfSubjectRulesReview.`spec`(block: model_SelfSubjectRulesReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_SelfSubjectRulesReviewSpec()
  }

  this.`spec`.block()
}


fun  model_SubjectRulesReview.`spec`(block: model_SubjectRulesReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_SubjectRulesReviewSpec()
  }

  this.`spec`.block()
}


fun  model_TemplateInstance.`spec`(block: model_TemplateInstanceSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_TemplateInstanceSpec()
  }

  this.`spec`.block()
}


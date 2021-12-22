// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ResourceQuotaStatus as model_ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.openshift.api.model.APIServer as model_APIServer
import io.fabric8.openshift.api.model.APIServerStatus as model_APIServerStatus
import io.fabric8.openshift.api.model.AppliedClusterResourceQuota as model_AppliedClusterResourceQuota
import io.fabric8.openshift.api.model.Authentication as model_Authentication
import io.fabric8.openshift.api.model.AuthenticationStatus as model_AuthenticationStatus
import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigStatus as model_BuildConfigStatus
import io.fabric8.openshift.api.model.BuildStatus as model_BuildStatus
import io.fabric8.openshift.api.model.ClusterOperator as model_ClusterOperator
import io.fabric8.openshift.api.model.ClusterOperatorStatus as model_ClusterOperatorStatus
import io.fabric8.openshift.api.model.ClusterResourceQuota as model_ClusterResourceQuota
import io.fabric8.openshift.api.model.ClusterResourceQuotaStatus as model_ClusterResourceQuotaStatus
import io.fabric8.openshift.api.model.ClusterVersion as model_ClusterVersion
import io.fabric8.openshift.api.model.ClusterVersionStatus as model_ClusterVersionStatus
import io.fabric8.openshift.api.model.Console as model_Console
import io.fabric8.openshift.api.model.ConsoleStatus as model_ConsoleStatus
import io.fabric8.openshift.api.model.DNS as model_DNS
import io.fabric8.openshift.api.model.DNSStatus as model_DNSStatus
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigStatus as model_DeploymentConfigStatus
import io.fabric8.openshift.api.model.FeatureGate as model_FeatureGate
import io.fabric8.openshift.api.model.FeatureGateStatus as model_FeatureGateStatus
import io.fabric8.openshift.api.model.HelmChartRepository as model_HelmChartRepository
import io.fabric8.openshift.api.model.HelmChartRepositoryStatus as model_HelmChartRepositoryStatus
import io.fabric8.openshift.api.model.ImageImportStatus as model_ImageImportStatus
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportStatus as model_ImageStreamImportStatus
import io.fabric8.openshift.api.model.ImageStreamStatus as model_ImageStreamStatus
import io.fabric8.openshift.api.model.ImageTag as model_ImageTag
import io.fabric8.openshift.api.model.Infrastructure as model_Infrastructure
import io.fabric8.openshift.api.model.InfrastructureStatus as model_InfrastructureStatus
import io.fabric8.openshift.api.model.Ingress as model_Ingress
import io.fabric8.openshift.api.model.IngressStatus as model_IngressStatus
import io.fabric8.openshift.api.model.NamedTagEventList as model_NamedTagEventList
import io.fabric8.openshift.api.model.Network as model_Network
import io.fabric8.openshift.api.model.NetworkStatus as model_NetworkStatus
import io.fabric8.openshift.api.model.OAuth as model_OAuth
import io.fabric8.openshift.api.model.OAuthStatus as model_OAuthStatus
import io.fabric8.openshift.api.model.OperatorHub as model_OperatorHub
import io.fabric8.openshift.api.model.OperatorHubStatus as model_OperatorHubStatus
import io.fabric8.openshift.api.model.PodSecurityPolicyReview as model_PodSecurityPolicyReview
import io.fabric8.openshift.api.model.PodSecurityPolicyReviewStatus as model_PodSecurityPolicyReviewStatus
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReview as model_PodSecurityPolicySelfSubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReview as model_PodSecurityPolicySubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewStatus as model_PodSecurityPolicySubjectReviewStatus
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectStatus as model_ProjectStatus
import io.fabric8.openshift.api.model.Proxy as model_Proxy
import io.fabric8.openshift.api.model.ProxyStatus as model_ProxyStatus
import io.fabric8.openshift.api.model.RepositoryImportStatus as model_RepositoryImportStatus
import io.fabric8.openshift.api.model.ResourceQuotaStatusByNamespace as model_ResourceQuotaStatusByNamespace
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteStatus as model_RouteStatus
import io.fabric8.openshift.api.model.Scheduler as model_Scheduler
import io.fabric8.openshift.api.model.SchedulerStatus as model_SchedulerStatus
import io.fabric8.openshift.api.model.SelfSubjectRulesReview as model_SelfSubjectRulesReview
import io.fabric8.openshift.api.model.SubjectRulesReview as model_SubjectRulesReview
import io.fabric8.openshift.api.model.SubjectRulesReviewStatus as model_SubjectRulesReviewStatus
import io.fabric8.openshift.api.model.TemplateInstance as model_TemplateInstance
import io.fabric8.openshift.api.model.TemplateInstanceStatus as model_TemplateInstanceStatus


fun  model_APIServer.`status`(block: model_APIServerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_APIServerStatus()
  }

  this.`status`.block()
}


fun  model_AppliedClusterResourceQuota.`status`(block: model_ClusterResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterResourceQuotaStatus()
  }

  this.`status`.block()
}


fun  model_Authentication.`status`(block: model_AuthenticationStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_AuthenticationStatus()
  }

  this.`status`.block()
}


fun  model_Build.`status`(block: model_BuildStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_BuildStatus()
  }

  this.`status`.block()
}


fun  model_BuildConfig.`status`(block: model_BuildConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_BuildConfigStatus()
  }

  this.`status`.block()
}


fun  model_ClusterOperator.`status`(block: model_ClusterOperatorStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterOperatorStatus()
  }

  this.`status`.block()
}


fun  model_ClusterResourceQuota.`status`(block: model_ClusterResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterResourceQuotaStatus()
  }

  this.`status`.block()
}


fun  model_ClusterVersion.`status`(block: model_ClusterVersionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterVersionStatus()
  }

  this.`status`.block()
}


fun  model_Console.`status`(block: model_ConsoleStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ConsoleStatus()
  }

  this.`status`.block()
}


fun  model_DNS.`status`(block: model_DNSStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_DNSStatus()
  }

  this.`status`.block()
}


fun  model_DeploymentConfig.`status`(block: model_DeploymentConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_DeploymentConfigStatus()
  }

  this.`status`.block()
}


fun  model_FeatureGate.`status`(block: model_FeatureGateStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_FeatureGateStatus()
  }

  this.`status`.block()
}


fun  model_HelmChartRepository.`status`(block: model_HelmChartRepositoryStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_HelmChartRepositoryStatus()
  }

  this.`status`.block()
}


fun  model_ImageImportStatus.`status`(block: model_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_Status()
  }

  this.`status`.block()
}


fun  model_ImageStream.`status`(block: model_ImageStreamStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ImageStreamStatus()
  }

  this.`status`.block()
}


fun  model_ImageStreamImport.`status`(block: model_ImageStreamImportStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ImageStreamImportStatus()
  }

  this.`status`.block()
}


fun  model_ImageTag.`status`(block: model_NamedTagEventList.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_NamedTagEventList()
  }

  this.`status`.block()
}


fun  model_Infrastructure.`status`(block: model_InfrastructureStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_InfrastructureStatus()
  }

  this.`status`.block()
}


fun  model_Ingress.`status`(block: model_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_IngressStatus()
  }

  this.`status`.block()
}


fun  model_Network.`status`(block: model_NetworkStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_NetworkStatus()
  }

  this.`status`.block()
}


fun  model_OAuth.`status`(block: model_OAuthStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_OAuthStatus()
  }

  this.`status`.block()
}


fun  model_OperatorHub.`status`(block: model_OperatorHubStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_OperatorHubStatus()
  }

  this.`status`.block()
}


fun  model_PodSecurityPolicyReview.`status`(block: model_PodSecurityPolicyReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_PodSecurityPolicyReviewStatus()
  }

  this.`status`.block()
}


fun  model_PodSecurityPolicySelfSubjectReview.`status`(block: model_PodSecurityPolicySubjectReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_PodSecurityPolicySubjectReviewStatus()
  }

  this.`status`.block()
}


fun  model_PodSecurityPolicySubjectReview.`status`(block: model_PodSecurityPolicySubjectReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_PodSecurityPolicySubjectReviewStatus()
  }

  this.`status`.block()
}


fun  model_Project.`status`(block: model_ProjectStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ProjectStatus()
  }

  this.`status`.block()
}


fun  model_Proxy.`status`(block: model_ProxyStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ProxyStatus()
  }

  this.`status`.block()
}


fun  model_RepositoryImportStatus.`status`(block: model_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_Status()
  }

  this.`status`.block()
}


fun  model_ResourceQuotaStatusByNamespace.`status`(block: model_ResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ResourceQuotaStatus()
  }

  this.`status`.block()
}


fun  model_Route.`status`(block: model_RouteStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_RouteStatus()
  }

  this.`status`.block()
}


fun  model_Scheduler.`status`(block: model_SchedulerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_SchedulerStatus()
  }

  this.`status`.block()
}


fun  model_SelfSubjectRulesReview.`status`(block: model_SubjectRulesReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_SubjectRulesReviewStatus()
  }

  this.`status`.block()
}


fun  model_SubjectRulesReview.`status`(block: model_SubjectRulesReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_SubjectRulesReviewStatus()
  }

  this.`status`.block()
}


fun  model_TemplateInstance.`status`(block: model_TemplateInstanceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_TemplateInstanceStatus()
  }

  this.`status`.block()
}


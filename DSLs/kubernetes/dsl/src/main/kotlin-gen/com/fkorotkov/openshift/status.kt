// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ResourceQuotaStatus as model_ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.openshift.api.model.AppliedClusterResourceQuota as model_AppliedClusterResourceQuota
import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigStatus as model_BuildConfigStatus
import io.fabric8.openshift.api.model.BuildStatus as model_BuildStatus
import io.fabric8.openshift.api.model.ClusterResourceQuota as model_ClusterResourceQuota
import io.fabric8.openshift.api.model.ClusterResourceQuotaStatus as model_ClusterResourceQuotaStatus
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigStatus as model_DeploymentConfigStatus
import io.fabric8.openshift.api.model.HelmChartRepository as model_HelmChartRepository
import io.fabric8.openshift.api.model.HelmChartRepositoryStatus as model_HelmChartRepositoryStatus
import io.fabric8.openshift.api.model.ImageImportStatus as model_ImageImportStatus
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportStatus as model_ImageStreamImportStatus
import io.fabric8.openshift.api.model.ImageStreamStatus as model_ImageStreamStatus
import io.fabric8.openshift.api.model.ImageTag as model_ImageTag
import io.fabric8.openshift.api.model.NamedTagEventList as model_NamedTagEventList
import io.fabric8.openshift.api.model.PodSecurityPolicyReview as model_PodSecurityPolicyReview
import io.fabric8.openshift.api.model.PodSecurityPolicyReviewStatus as model_PodSecurityPolicyReviewStatus
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReview as model_PodSecurityPolicySelfSubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReview as model_PodSecurityPolicySubjectReview
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewStatus as model_PodSecurityPolicySubjectReviewStatus
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectStatus as model_ProjectStatus
import io.fabric8.openshift.api.model.RepositoryImportStatus as model_RepositoryImportStatus
import io.fabric8.openshift.api.model.ResourceQuotaStatusByNamespace as model_ResourceQuotaStatusByNamespace
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteStatus as model_RouteStatus
import io.fabric8.openshift.api.model.SelfSubjectRulesReview as model_SelfSubjectRulesReview
import io.fabric8.openshift.api.model.SubjectRulesReview as model_SubjectRulesReview
import io.fabric8.openshift.api.model.SubjectRulesReviewStatus as model_SubjectRulesReviewStatus
import io.fabric8.openshift.api.model.TemplateInstance as model_TemplateInstance
import io.fabric8.openshift.api.model.TemplateInstanceStatus as model_TemplateInstanceStatus


fun  model_AppliedClusterResourceQuota.`status`(block: model_ClusterResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterResourceQuotaStatus()
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


fun  model_ClusterResourceQuota.`status`(block: model_ClusterResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterResourceQuotaStatus()
  }

  this.`status`.block()
}


fun  model_DeploymentConfig.`status`(block: model_DeploymentConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_DeploymentConfigStatus()
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


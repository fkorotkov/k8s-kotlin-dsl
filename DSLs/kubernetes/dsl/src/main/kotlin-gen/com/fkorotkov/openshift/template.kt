// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.openshift.api.model.DeploymentConfigSpec as model_DeploymentConfigSpec
import io.fabric8.openshift.api.model.PodSecurityPolicyReviewSpec as model_PodSecurityPolicyReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySelfSubjectReviewSpec as model_PodSecurityPolicySelfSubjectReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewSpec as model_PodSecurityPolicySubjectReviewSpec
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewStatus as model_PodSecurityPolicySubjectReviewStatus
import io.fabric8.openshift.api.model.ServiceAccountPodSecurityPolicyReviewStatus as model_ServiceAccountPodSecurityPolicyReviewStatus
import io.fabric8.openshift.api.model.Template as model_Template
import io.fabric8.openshift.api.model.TemplateInstanceSpec as model_TemplateInstanceSpec


fun  model_DeploymentConfigSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_PodSecurityPolicyReviewSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_PodSecurityPolicySelfSubjectReviewSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_PodSecurityPolicySubjectReviewSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_PodSecurityPolicySubjectReviewStatus.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_ServiceAccountPodSecurityPolicyReviewStatus.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_TemplateInstanceSpec.`template`(block: model_Template.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_Template()
  }

  this.`template`.block()
}


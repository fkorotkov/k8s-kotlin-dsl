// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.PodSecurityPolicySubjectReviewStatus as model_PodSecurityPolicySubjectReviewStatus
import io.fabric8.openshift.api.model.ServiceAccountPodSecurityPolicyReviewStatus as model_ServiceAccountPodSecurityPolicyReviewStatus


fun  model_PodSecurityPolicySubjectReviewStatus.`allowedBy`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`allowedBy` == null) {
    this.`allowedBy` = model_ObjectReference()
  }

  this.`allowedBy`.block()
}


fun  model_ServiceAccountPodSecurityPolicyReviewStatus.`allowedBy`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`allowedBy` == null) {
    this.`allowedBy` = model_ObjectReference()
  }

  this.`allowedBy`.block()
}


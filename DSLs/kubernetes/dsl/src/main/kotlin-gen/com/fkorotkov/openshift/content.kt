// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.KubernetesResource as model_KubernetesResource
import io.fabric8.openshift.api.model.LocalResourceAccessReview as model_LocalResourceAccessReview
import io.fabric8.openshift.api.model.LocalSubjectAccessReview as model_LocalSubjectAccessReview
import io.fabric8.openshift.api.model.ResourceAccessReview as model_ResourceAccessReview
import io.fabric8.openshift.api.model.SubjectAccessReview as model_SubjectAccessReview


fun  model_LocalResourceAccessReview.`content`(block: model_KubernetesResource.() -> Unit = {}) {
  this.`content`.block()
}


fun  model_LocalSubjectAccessReview.`content`(block: model_KubernetesResource.() -> Unit = {}) {
  this.`content`.block()
}


fun  model_ResourceAccessReview.`content`(block: model_KubernetesResource.() -> Unit = {}) {
  this.`content`.block()
}


fun  model_SubjectAccessReview.`content`(block: model_KubernetesResource.() -> Unit = {}) {
  this.`content`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources


fun  v1alpha1_MatchResources.`objectSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`objectSelector` == null) {
    this.`objectSelector` = model_LabelSelector()
  }

  this.`objectSelector`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhook as v1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhook as v1_ValidatingWebhook


fun  v1_MutatingWebhook.`objectSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`objectSelector` == null) {
    this.`objectSelector` = model_LabelSelector()
  }

  this.`objectSelector`.block()
}


fun  v1_ValidatingWebhook.`objectSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`objectSelector` == null) {
    this.`objectSelector` = model_LabelSelector()
  }

  this.`objectSelector`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhook as admissionregistration_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhook as admissionregistration_ValidatingWebhook


fun  admissionregistration_MutatingWebhook.`objectSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`objectSelector` == null) {
    this.`objectSelector` = model_LabelSelector()
  }

  this.`objectSelector`.block()
}


fun  admissionregistration_ValidatingWebhook.`objectSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`objectSelector` == null) {
    this.`objectSelector` = model_LabelSelector()
  }

  this.`objectSelector`.block()
}


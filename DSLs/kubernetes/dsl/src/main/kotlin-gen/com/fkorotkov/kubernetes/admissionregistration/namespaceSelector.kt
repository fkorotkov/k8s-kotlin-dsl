// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhook as admissionregistration_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhook as admissionregistration_ValidatingWebhook


fun  admissionregistration_MutatingWebhook.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


fun  admissionregistration_ValidatingWebhook.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


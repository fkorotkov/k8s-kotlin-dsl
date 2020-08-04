// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhook as v1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhook as v1_ValidatingWebhook


fun  v1_MutatingWebhook.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


fun  v1_ValidatingWebhook.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


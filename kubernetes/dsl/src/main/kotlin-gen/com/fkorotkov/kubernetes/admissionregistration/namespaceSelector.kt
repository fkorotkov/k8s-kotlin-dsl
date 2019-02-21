// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook as admissionregistration_Webhook


fun  admissionregistration_Webhook.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


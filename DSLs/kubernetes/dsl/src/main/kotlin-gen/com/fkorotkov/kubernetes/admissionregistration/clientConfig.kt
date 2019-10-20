// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhook as admissionregistration_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhook as admissionregistration_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig as admissionregistration_WebhookClientConfig


fun  admissionregistration_MutatingWebhook.`clientConfig`(block: admissionregistration_WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = admissionregistration_WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


fun  admissionregistration_ValidatingWebhook.`clientConfig`(block: admissionregistration_WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = admissionregistration_WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


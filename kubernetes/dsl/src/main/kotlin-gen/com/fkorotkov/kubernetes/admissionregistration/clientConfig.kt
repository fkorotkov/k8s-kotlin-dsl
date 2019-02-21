// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.admissionregistration.Webhook as admissionregistration_Webhook
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig as admissionregistration_WebhookClientConfig


fun  admissionregistration_Webhook.`clientConfig`(block: admissionregistration_WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = admissionregistration_WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


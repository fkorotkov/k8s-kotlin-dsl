// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.admissionregistration.Webhook
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig


fun  Webhook.`clientConfig`(block: WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


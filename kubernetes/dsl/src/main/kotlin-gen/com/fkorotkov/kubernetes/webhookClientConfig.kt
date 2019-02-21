// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig


fun  CustomResourceConversion.`webhookClientConfig`(block: WebhookClientConfig.() -> Unit = {}) {
  if(this.`webhookClientConfig` == null) {
    this.`webhookClientConfig` = WebhookClientConfig()
  }

  this.`webhookClientConfig`.block()
}


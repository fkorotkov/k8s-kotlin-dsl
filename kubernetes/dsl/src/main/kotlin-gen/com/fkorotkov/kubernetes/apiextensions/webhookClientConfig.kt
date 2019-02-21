// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversion as apiextensions_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig as apiextensions_WebhookClientConfig


fun  apiextensions_CustomResourceConversion.`webhookClientConfig`(block: apiextensions_WebhookClientConfig.() -> Unit = {}) {
  if(this.`webhookClientConfig` == null) {
    this.`webhookClientConfig` = apiextensions_WebhookClientConfig()
  }

  this.`webhookClientConfig`.block()
}


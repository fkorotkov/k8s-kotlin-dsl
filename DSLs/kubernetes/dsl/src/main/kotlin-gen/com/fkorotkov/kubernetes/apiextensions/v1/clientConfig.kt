// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.WebhookClientConfig as v1_WebhookClientConfig
import io.fabric8.kubernetes.api.model.apiextensions.v1.WebhookConversion as v1_WebhookConversion


fun  v1_WebhookConversion.`clientConfig`(block: v1_WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = v1_WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


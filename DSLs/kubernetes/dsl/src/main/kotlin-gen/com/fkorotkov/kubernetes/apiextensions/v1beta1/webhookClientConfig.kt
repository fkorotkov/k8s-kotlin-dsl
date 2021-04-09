// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceConversion as v1beta1_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.WebhookClientConfig as v1beta1_WebhookClientConfig


fun  v1beta1_CustomResourceConversion.`webhookClientConfig`(block: v1beta1_WebhookClientConfig.() -> Unit = {}) {
  if(this.`webhookClientConfig` == null) {
    this.`webhookClientConfig` = v1beta1_WebhookClientConfig()
  }

  this.`webhookClientConfig`.block()
}


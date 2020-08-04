// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhook as v1beta1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhook as v1beta1_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.WebhookClientConfig as v1beta1_WebhookClientConfig


fun  v1beta1_MutatingWebhook.`clientConfig`(block: v1beta1_WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = v1beta1_WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


fun  v1beta1_ValidatingWebhook.`clientConfig`(block: v1beta1_WebhookClientConfig.() -> Unit = {}) {
  if(this.`clientConfig` == null) {
    this.`clientConfig` = v1beta1_WebhookClientConfig()
  }

  this.`clientConfig`.block()
}


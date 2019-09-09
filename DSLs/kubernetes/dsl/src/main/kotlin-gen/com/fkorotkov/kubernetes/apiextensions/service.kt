// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.ServiceReference as apiextensions_ServiceReference
import io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig as apiextensions_WebhookClientConfig


fun  apiextensions_WebhookClientConfig.`service`(block: apiextensions_ServiceReference.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = apiextensions_ServiceReference()
  }

  this.`service`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig
import io.fabric8.kubernetes.api.model.apiextensions.ServiceReference
import io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig


fun  WebhookClientConfig.`service`(block: ServiceReference.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = ServiceReference()
  }

  this.`service`.block()
}


fun  WebhookClientConfig.`service`(block: ServiceReference.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = ServiceReference()
  }

  this.`service`.block()
}


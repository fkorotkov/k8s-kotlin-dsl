// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference as v1_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.v1.WebhookClientConfig as v1_WebhookClientConfig


fun  v1_WebhookClientConfig.`service`(block: v1_ServiceReference.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = v1_ServiceReference()
  }

  this.`service`.block()
}


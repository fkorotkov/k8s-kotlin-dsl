// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReference as admissionregistration_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig as admissionregistration_WebhookClientConfig


fun  admissionregistration_WebhookClientConfig.`service`(block: admissionregistration_ServiceReference.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = admissionregistration_ServiceReference()
  }

  this.`service`.block()
}


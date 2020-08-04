// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.APIServiceSpec as model_APIServiceSpec
import io.fabric8.kubernetes.api.model.ServiceReference as model_ServiceReference


fun  model_APIServiceSpec.`service`(block: model_ServiceReference.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = model_ServiceReference()
  }

  this.`service`.block()
}


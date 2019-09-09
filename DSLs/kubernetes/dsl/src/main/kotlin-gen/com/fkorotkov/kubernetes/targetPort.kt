// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.ServicePort as model_ServicePort


fun  model_ServicePort.`targetPort`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`targetPort` == null) {
    this.`targetPort` = model_IntOrString()
  }

  this.`targetPort`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.ServicePort


fun  ServicePort.`targetPort`(block: IntOrString.() -> Unit = {}) {
  if(this.`targetPort` == null) {
    this.`targetPort` = IntOrString()
  }

  this.`targetPort`.block()
}


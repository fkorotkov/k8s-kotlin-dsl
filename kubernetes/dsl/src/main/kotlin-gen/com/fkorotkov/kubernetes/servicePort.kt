// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.extensions.IngressBackend


fun  IngressBackend.`servicePort`(block: IntOrString.() -> Unit = {}) {
  if(this.`servicePort` == null) {
    this.`servicePort` = IntOrString()
  }

  this.`servicePort`.block()
}


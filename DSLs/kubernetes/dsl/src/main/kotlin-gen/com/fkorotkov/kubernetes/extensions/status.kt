// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus


fun  extensions_Ingress.`status`(block: extensions_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = extensions_IngressStatus()
  }

  this.`status`.block()
}


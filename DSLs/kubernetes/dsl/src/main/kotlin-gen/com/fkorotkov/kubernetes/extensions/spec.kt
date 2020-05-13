// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec


fun  extensions_Ingress.`spec`(block: extensions_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_IngressSpec()
  }

  this.`spec`.block()
}


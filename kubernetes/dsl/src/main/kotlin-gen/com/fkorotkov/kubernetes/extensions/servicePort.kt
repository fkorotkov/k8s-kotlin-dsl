// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend


fun  extensions_IngressBackend.`servicePort`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`servicePort` == null) {
    this.`servicePort` = model_IntOrString()
  }

  this.`servicePort`.block()
}


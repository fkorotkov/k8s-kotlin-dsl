// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath as extensions_HTTPIngressPath
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec


fun  extensions_HTTPIngressPath.`backend`(block: extensions_IngressBackend.() -> Unit = {}) {
  if(this.`backend` == null) {
    this.`backend` = extensions_IngressBackend()
  }

  this.`backend`.block()
}


fun  extensions_IngressSpec.`backend`(block: extensions_IngressBackend.() -> Unit = {}) {
  if(this.`backend` == null) {
    this.`backend` = extensions_IngressBackend()
  }

  this.`backend`.block()
}


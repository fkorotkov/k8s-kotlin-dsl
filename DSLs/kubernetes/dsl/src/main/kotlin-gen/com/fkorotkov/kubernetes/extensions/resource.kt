// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend


fun  extensions_IngressBackend.`resource`(block: model_TypedLocalObjectReference.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = model_TypedLocalObjectReference()
  }

  this.`resource`.block()
}


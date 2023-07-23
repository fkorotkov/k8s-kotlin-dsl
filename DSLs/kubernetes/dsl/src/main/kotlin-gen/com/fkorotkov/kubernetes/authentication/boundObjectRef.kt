// GENERATED
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.BoundObjectReference as authentication_BoundObjectReference
import io.fabric8.kubernetes.api.model.authentication.TokenRequestSpec as authentication_TokenRequestSpec


fun  authentication_TokenRequestSpec.`boundObjectRef`(block: authentication_BoundObjectReference.() -> Unit = {}) {
  if(this.`boundObjectRef` == null) {
    this.`boundObjectRef` = authentication_BoundObjectReference()
  }

  this.`boundObjectRef`.block()
}


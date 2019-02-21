// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.SecretSpec as model_SecretSpec


fun  model_SecretSpec.`secretSource`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretSource` == null) {
    this.`secretSource` = model_LocalObjectReference()
  }

  this.`secretSource`.block()
}


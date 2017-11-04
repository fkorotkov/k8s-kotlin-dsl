// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.openshift.api.model.SecretSpec


fun  SecretSpec.`secretSource`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretSource` == null) {
    this.`secretSource` = LocalObjectReference()
  }

  this.`secretSource`.block()
}


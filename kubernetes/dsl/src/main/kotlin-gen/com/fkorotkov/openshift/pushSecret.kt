// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.openshift.api.model.BuildOutput


fun  BuildOutput.`pushSecret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`pushSecret` == null) {
    this.`pushSecret` = LocalObjectReference()
  }

  this.`pushSecret`.block()
}


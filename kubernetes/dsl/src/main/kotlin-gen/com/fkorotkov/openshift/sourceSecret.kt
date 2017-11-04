// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.openshift.api.model.BuildSource


fun  BuildSource.`sourceSecret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`sourceSecret` == null) {
    this.`sourceSecret` = LocalObjectReference()
  }

  this.`sourceSecret`.block()
}


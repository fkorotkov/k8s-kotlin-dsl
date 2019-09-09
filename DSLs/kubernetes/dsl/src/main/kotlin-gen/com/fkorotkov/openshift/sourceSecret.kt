// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.BuildSource as model_BuildSource


fun  model_BuildSource.`sourceSecret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`sourceSecret` == null) {
    this.`sourceSecret` = model_LocalObjectReference()
  }

  this.`sourceSecret`.block()
}


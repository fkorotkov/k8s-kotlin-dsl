// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.BuildOutput as model_BuildOutput


fun  model_BuildOutput.`pushSecret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`pushSecret` == null) {
    this.`pushSecret` = model_LocalObjectReference()
  }

  this.`pushSecret`.block()
}


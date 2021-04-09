// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConfigMapFileReference as model_ConfigMapFileReference
import io.fabric8.openshift.api.model.InfrastructureSpec as model_InfrastructureSpec


fun  model_InfrastructureSpec.`cloudConfig`(block: model_ConfigMapFileReference.() -> Unit = {}) {
  if(this.`cloudConfig` == null) {
    this.`cloudConfig` = model_ConfigMapFileReference()
  }

  this.`cloudConfig`.block()
}


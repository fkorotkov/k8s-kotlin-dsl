// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ConfigMapFileReference as v1_ConfigMapFileReference
import io.fabric8.openshift.api.model.config.v1.InfrastructureSpec as v1_InfrastructureSpec


fun  v1_InfrastructureSpec.`cloudConfig`(block: v1_ConfigMapFileReference.() -> Unit = {}) {
  if(this.`cloudConfig` == null) {
    this.`cloudConfig` = v1_ConfigMapFileReference()
  }

  this.`cloudConfig`.block()
}


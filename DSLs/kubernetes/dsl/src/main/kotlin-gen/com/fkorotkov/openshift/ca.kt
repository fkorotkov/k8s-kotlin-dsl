// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConnectionConfig as model_ConnectionConfig
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference


fun  model_ConnectionConfig.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


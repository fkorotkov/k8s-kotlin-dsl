// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConditionalUpdate as model_ConditionalUpdate
import io.fabric8.openshift.api.model.Release as model_Release


fun  model_ConditionalUpdate.`release`(block: model_Release.() -> Unit = {}) {
  if(this.`release` == null) {
    this.`release` = model_Release()
  }

  this.`release`.block()
}


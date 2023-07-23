// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ConditionalUpdate as v1_ConditionalUpdate
import io.fabric8.openshift.api.model.config.v1.Release as v1_Release


fun  v1_ConditionalUpdate.`release`(block: v1_Release.() -> Unit = {}) {
  if(this.`release` == null) {
    this.`release` = v1_Release()
  }

  this.`release`.block()
}


// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BuildDefaults as v1_BuildDefaults
import io.fabric8.openshift.api.model.config.v1.BuildSpec as v1_BuildSpec


fun  v1_BuildSpec.`buildDefaults`(block: v1_BuildDefaults.() -> Unit = {}) {
  if(this.`buildDefaults` == null) {
    this.`buildDefaults` = v1_BuildDefaults()
  }

  this.`buildDefaults`.block()
}


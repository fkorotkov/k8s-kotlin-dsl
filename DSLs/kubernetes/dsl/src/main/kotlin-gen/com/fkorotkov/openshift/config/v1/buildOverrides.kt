// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BuildOverrides as v1_BuildOverrides
import io.fabric8.openshift.api.model.config.v1.BuildSpec as v1_BuildSpec


fun  v1_BuildSpec.`buildOverrides`(block: v1_BuildOverrides.() -> Unit = {}) {
  if(this.`buildOverrides` == null) {
    this.`buildOverrides` = v1_BuildOverrides()
  }

  this.`buildOverrides`.block()
}


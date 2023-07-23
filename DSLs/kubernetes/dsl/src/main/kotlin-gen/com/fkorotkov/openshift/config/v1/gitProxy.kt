// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BuildDefaults as v1_BuildDefaults
import io.fabric8.openshift.api.model.config.v1.ProxySpec as v1_ProxySpec


fun  v1_BuildDefaults.`gitProxy`(block: v1_ProxySpec.() -> Unit = {}) {
  if(this.`gitProxy` == null) {
    this.`gitProxy` = v1_ProxySpec()
  }

  this.`gitProxy`.block()
}


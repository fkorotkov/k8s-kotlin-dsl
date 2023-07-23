// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BuildDefaults as v1_BuildDefaults
import io.fabric8.openshift.api.model.config.v1.ProxySpec as v1_ProxySpec


fun  v1_BuildDefaults.`defaultProxy`(block: v1_ProxySpec.() -> Unit = {}) {
  if(this.`defaultProxy` == null) {
    this.`defaultProxy` = v1_ProxySpec()
  }

  this.`defaultProxy`.block()
}


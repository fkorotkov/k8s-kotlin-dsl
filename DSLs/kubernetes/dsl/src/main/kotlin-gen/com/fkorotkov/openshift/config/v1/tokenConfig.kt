// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OAuthSpec as v1_OAuthSpec
import io.fabric8.openshift.api.model.config.v1.TokenConfig as v1_TokenConfig


fun  v1_OAuthSpec.`tokenConfig`(block: v1_TokenConfig.() -> Unit = {}) {
  if(this.`tokenConfig` == null) {
    this.`tokenConfig` = v1_TokenConfig()
  }

  this.`tokenConfig`.block()
}


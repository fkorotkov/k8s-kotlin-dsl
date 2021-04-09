// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthSpec as model_OAuthSpec
import io.fabric8.openshift.api.model.TokenConfig as model_TokenConfig


fun  model_OAuthSpec.`tokenConfig`(block: model_TokenConfig.() -> Unit = {}) {
  if(this.`tokenConfig` == null) {
    this.`tokenConfig` = model_TokenConfig()
  }

  this.`tokenConfig`.block()
}


// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.kubernetes.api.model.Duration as model_Duration
import io.fabric8.openshift.api.model.config.v1.TokenConfig as v1_TokenConfig


fun  v1_TokenConfig.`accessTokenInactivityTimeout`(block: model_Duration.() -> Unit = {}) {
  if(this.`accessTokenInactivityTimeout` == null) {
    this.`accessTokenInactivityTimeout` = model_Duration()
  }

  this.`accessTokenInactivityTimeout`.block()
}


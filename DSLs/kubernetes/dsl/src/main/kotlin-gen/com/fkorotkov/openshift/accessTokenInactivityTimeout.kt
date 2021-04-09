// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.Duration as model_Duration
import io.fabric8.openshift.api.model.TokenConfig as model_TokenConfig


fun  model_TokenConfig.`accessTokenInactivityTimeout`(block: model_Duration.() -> Unit = {}) {
  if(this.`accessTokenInactivityTimeout` == null) {
    this.`accessTokenInactivityTimeout` = model_Duration()
  }

  this.`accessTokenInactivityTimeout`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RouteSpec as model_RouteSpec
import io.fabric8.openshift.api.model.TLSConfig as model_TLSConfig


fun  model_RouteSpec.`tls`(block: model_TLSConfig.() -> Unit = {}) {
  if(this.`tls` == null) {
    this.`tls` = model_TLSConfig()
  }

  this.`tls`.block()
}


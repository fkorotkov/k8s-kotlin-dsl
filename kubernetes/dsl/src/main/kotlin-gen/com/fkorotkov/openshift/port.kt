// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RoutePort as model_RoutePort
import io.fabric8.openshift.api.model.RouteSpec as model_RouteSpec


fun  model_RouteSpec.`port`(block: model_RoutePort.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = model_RoutePort()
  }

  this.`port`.block()
}


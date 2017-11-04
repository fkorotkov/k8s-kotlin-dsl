// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RoutePort
import io.fabric8.openshift.api.model.RouteSpec


fun  RouteSpec.`port`(block: RoutePort.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = RoutePort()
  }

  this.`port`.block()
}


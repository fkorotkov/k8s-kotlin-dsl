// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RouteSpec
import io.fabric8.openshift.api.model.TLSConfig


fun  RouteSpec.`tls`(block: TLSConfig.() -> Unit = {}) {
  if(this.`tls` == null) {
    this.`tls` = TLSConfig()
  }

  this.`tls`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.openshift.api.model.RoutePort


fun  RoutePort.`targetPort`(block: IntOrString.() -> Unit = {}) {
  if(this.`targetPort` == null) {
    this.`targetPort` = IntOrString()
  }

  this.`targetPort`.block()
}


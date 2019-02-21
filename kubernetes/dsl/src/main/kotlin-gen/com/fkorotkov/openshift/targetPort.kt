// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.openshift.api.model.RoutePort as model_RoutePort


fun  model_RoutePort.`targetPort`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`targetPort` == null) {
    this.`targetPort` = model_IntOrString()
  }

  this.`targetPort`.block()
}


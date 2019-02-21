// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HTTPGetAction as model_HTTPGetAction
import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.TCPSocketAction as model_TCPSocketAction


fun  model_HTTPGetAction.`port`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = model_IntOrString()
  }

  this.`port`.block()
}


fun  model_TCPSocketAction.`port`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = model_IntOrString()
  }

  this.`port`.block()
}


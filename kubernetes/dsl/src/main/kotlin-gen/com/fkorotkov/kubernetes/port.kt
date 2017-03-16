// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HTTPGetAction
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.TCPSocketAction


fun  HTTPGetAction.`port`(block: IntOrString.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = IntOrString()
  }

  this.`port`.block()
}


fun  TCPSocketAction.`port`(block: IntOrString.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = IntOrString()
  }

  this.`port`.block()
}


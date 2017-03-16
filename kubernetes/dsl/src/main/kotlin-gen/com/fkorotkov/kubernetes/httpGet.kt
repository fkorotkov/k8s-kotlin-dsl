// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HTTPGetAction
import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Probe


fun  Handler.`httpGet`(block: HTTPGetAction.() -> Unit = {}) {
  if(this.`httpGet` == null) {
    this.`httpGet` = HTTPGetAction()
  }

  this.`httpGet`.block()
}


fun  Probe.`httpGet`(block: HTTPGetAction.() -> Unit = {}) {
  if(this.`httpGet` == null) {
    this.`httpGet` = HTTPGetAction()
  }

  this.`httpGet`.block()
}


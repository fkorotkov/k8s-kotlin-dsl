// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HTTPGetAction as model_HTTPGetAction
import io.fabric8.kubernetes.api.model.Handler as model_Handler
import io.fabric8.kubernetes.api.model.Probe as model_Probe


fun  model_Handler.`httpGet`(block: model_HTTPGetAction.() -> Unit = {}) {
  if(this.`httpGet` == null) {
    this.`httpGet` = model_HTTPGetAction()
  }

  this.`httpGet`.block()
}


fun  model_Probe.`httpGet`(block: model_HTTPGetAction.() -> Unit = {}) {
  if(this.`httpGet` == null) {
    this.`httpGet` = model_HTTPGetAction()
  }

  this.`httpGet`.block()
}


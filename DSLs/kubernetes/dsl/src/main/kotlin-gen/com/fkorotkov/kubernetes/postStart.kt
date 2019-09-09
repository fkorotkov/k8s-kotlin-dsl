// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Handler as model_Handler
import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle


fun  model_Lifecycle.`postStart`(block: model_Handler.() -> Unit = {}) {
  if(this.`postStart` == null) {
    this.`postStart` = model_Handler()
  }

  this.`postStart`.block()
}


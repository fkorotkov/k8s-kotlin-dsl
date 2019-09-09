// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Handler as model_Handler
import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle


fun  model_Lifecycle.`preStop`(block: model_Handler.() -> Unit = {}) {
  if(this.`preStop` == null) {
    this.`preStop` = model_Handler()
  }

  this.`preStop`.block()
}


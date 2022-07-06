// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler


fun  model_Lifecycle.`postStart`(block: model_LifecycleHandler.() -> Unit = {}) {
  if(this.`postStart` == null) {
    this.`postStart` = model_LifecycleHandler()
  }

  this.`postStart`.block()
}


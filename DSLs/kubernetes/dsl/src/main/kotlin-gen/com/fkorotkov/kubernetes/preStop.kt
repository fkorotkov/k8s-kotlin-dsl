// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler


fun  model_Lifecycle.`preStop`(block: model_LifecycleHandler.() -> Unit = {}) {
  if(this.`preStop` == null) {
    this.`preStop` = model_LifecycleHandler()
  }

  this.`preStop`.block()
}


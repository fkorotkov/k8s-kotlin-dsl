// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle


fun  model_Container.`lifecycle`(block: model_Lifecycle.() -> Unit = {}) {
  if(this.`lifecycle` == null) {
    this.`lifecycle` = model_Lifecycle()
  }

  this.`lifecycle`.block()
}


fun  model_EphemeralContainer.`lifecycle`(block: model_Lifecycle.() -> Unit = {}) {
  if(this.`lifecycle` == null) {
    this.`lifecycle` = model_Lifecycle()
  }

  this.`lifecycle`.block()
}


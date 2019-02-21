// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Initializers as model_Initializers
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta


fun  model_ObjectMeta.`initializers`(block: model_Initializers.() -> Unit = {}) {
  if(this.`initializers` == null) {
    this.`initializers` = model_Initializers()
  }

  this.`initializers`.block()
}


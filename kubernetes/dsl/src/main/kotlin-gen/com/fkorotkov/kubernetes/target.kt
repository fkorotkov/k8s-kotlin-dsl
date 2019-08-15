// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Binding as model_Binding
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference


fun  model_Binding.`target`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_ObjectReference()
  }

  this.`target`.block()
}


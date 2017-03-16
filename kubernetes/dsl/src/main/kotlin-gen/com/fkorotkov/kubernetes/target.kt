// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Binding
import io.fabric8.kubernetes.api.model.ObjectReference


fun  Binding.`target`(block: ObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = ObjectReference()
  }

  this.`target`.block()
}


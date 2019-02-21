// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Binding
import io.fabric8.kubernetes.api.model.CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus
import io.fabric8.kubernetes.api.model.ObjectReference


fun  Binding.`target`(block: ObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = ObjectReference()
  }

  this.`target`.block()
}


fun  ObjectMetricSource.`target`(block: CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = CrossVersionObjectReference()
  }

  this.`target`.block()
}


fun  ObjectMetricStatus.`target`(block: CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = CrossVersionObjectReference()
  }

  this.`target`.block()
}


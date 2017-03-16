// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Quantity
import io.fabric8.kubernetes.api.model.ResourceFieldSelector


fun  ResourceFieldSelector.`divisor`(block: Quantity.() -> Unit = {}) {
  if(this.`divisor` == null) {
    this.`divisor` = Quantity()
  }

  this.`divisor`.block()
}


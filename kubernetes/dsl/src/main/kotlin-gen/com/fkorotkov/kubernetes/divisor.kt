// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.ResourceFieldSelector as model_ResourceFieldSelector


fun  model_ResourceFieldSelector.`divisor`(block: model_Quantity.() -> Unit = {}) {
  if(this.`divisor` == null) {
    this.`divisor` = model_Quantity()
  }

  this.`divisor`.block()
}


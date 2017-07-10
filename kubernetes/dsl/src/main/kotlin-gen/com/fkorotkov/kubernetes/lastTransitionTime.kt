// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Time
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition


fun  CustomResourceDefinitionCondition.`lastTransitionTime`(block: Time.() -> Unit = {}) {
  if(this.`lastTransitionTime` == null) {
    this.`lastTransitionTime` = Time()
  }

  this.`lastTransitionTime`.block()
}


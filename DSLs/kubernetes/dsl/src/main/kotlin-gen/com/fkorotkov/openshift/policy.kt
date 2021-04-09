// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference
import io.fabric8.openshift.api.model.SchedulerSpec as model_SchedulerSpec


fun  model_SchedulerSpec.`policy`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`policy` == null) {
    this.`policy` = model_ConfigMapNameReference()
  }

  this.`policy`.block()
}


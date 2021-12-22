// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec


fun  v1_JobSpec.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}


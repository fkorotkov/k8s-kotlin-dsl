// GENERATED
package com.fkorotkov.kubernetes.batch

import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.batch.JobSpec as batch_JobSpec


fun  batch_JobSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec


fun  v1_JobSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec
import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicy as v1_PodFailurePolicy


fun  v1_JobSpec.`podFailurePolicy`(block: v1_PodFailurePolicy.() -> Unit = {}) {
  if(this.`podFailurePolicy` == null) {
    this.`podFailurePolicy` = v1_PodFailurePolicy()
  }

  this.`podFailurePolicy`.block()
}


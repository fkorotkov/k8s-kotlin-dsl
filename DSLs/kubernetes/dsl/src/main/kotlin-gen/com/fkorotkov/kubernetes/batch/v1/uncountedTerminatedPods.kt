// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.JobStatus as v1_JobStatus
import io.fabric8.kubernetes.api.model.batch.v1.UncountedTerminatedPods as v1_UncountedTerminatedPods


fun  v1_JobStatus.`uncountedTerminatedPods`(block: v1_UncountedTerminatedPods.() -> Unit = {}) {
  if(this.`uncountedTerminatedPods` == null) {
    this.`uncountedTerminatedPods` = v1_UncountedTerminatedPods()
  }

  this.`uncountedTerminatedPods`.block()
}


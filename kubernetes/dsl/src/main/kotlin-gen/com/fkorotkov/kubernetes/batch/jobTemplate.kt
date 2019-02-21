// GENERATED
package com.fkorotkov.kubernetes.batch

import io.fabric8.kubernetes.api.model.batch.CronJobSpec as batch_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec as batch_JobTemplateSpec


fun  batch_CronJobSpec.`jobTemplate`(block: batch_JobTemplateSpec.() -> Unit = {}) {
  if(this.`jobTemplate` == null) {
    this.`jobTemplate` = batch_JobTemplateSpec()
  }

  this.`jobTemplate`.block()
}


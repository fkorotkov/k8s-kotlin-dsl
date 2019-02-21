// GENERATED
package com.fkorotkov.kubernetes.batch

import io.fabric8.kubernetes.api.model.batch.CronJob as batch_CronJob
import io.fabric8.kubernetes.api.model.batch.CronJobSpec as batch_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.Job as batch_Job
import io.fabric8.kubernetes.api.model.batch.JobSpec as batch_JobSpec
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec as batch_JobTemplateSpec


fun  batch_CronJob.`spec`(block: batch_CronJobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = batch_CronJobSpec()
  }

  this.`spec`.block()
}


fun  batch_Job.`spec`(block: batch_JobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = batch_JobSpec()
  }

  this.`spec`.block()
}


fun  batch_JobTemplateSpec.`spec`(block: batch_JobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = batch_JobSpec()
  }

  this.`spec`.block()
}


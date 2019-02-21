// GENERATED
package com.fkorotkov.kubernetes.batch

import io.fabric8.kubernetes.api.model.batch.CronJob as batch_CronJob
import io.fabric8.kubernetes.api.model.batch.CronJobStatus as batch_CronJobStatus
import io.fabric8.kubernetes.api.model.batch.Job as batch_Job
import io.fabric8.kubernetes.api.model.batch.JobStatus as batch_JobStatus


fun  batch_CronJob.`status`(block: batch_CronJobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = batch_CronJobStatus()
  }

  this.`status`.block()
}


fun  batch_Job.`status`(block: batch_JobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = batch_JobStatus()
  }

  this.`status`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.CronJob as v1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1.CronJobStatus as v1_CronJobStatus
import io.fabric8.kubernetes.api.model.batch.v1.Job as v1_Job
import io.fabric8.kubernetes.api.model.batch.v1.JobStatus as v1_JobStatus


fun  v1_CronJob.`status`(block: v1_CronJobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_CronJobStatus()
  }

  this.`status`.block()
}


fun  v1_Job.`status`(block: v1_JobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_JobStatus()
  }

  this.`status`.block()
}


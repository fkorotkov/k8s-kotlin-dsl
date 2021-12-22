// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.CronJob as v1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1.CronJobSpec as v1_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.v1.Job as v1_Job
import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec
import io.fabric8.kubernetes.api.model.batch.v1.JobTemplateSpec as v1_JobTemplateSpec


fun  v1_CronJob.`spec`(block: v1_CronJobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_CronJobSpec()
  }

  this.`spec`.block()
}


fun  v1_Job.`spec`(block: v1_JobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_JobSpec()
  }

  this.`spec`.block()
}


fun  v1_JobTemplateSpec.`spec`(block: v1_JobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_JobSpec()
  }

  this.`spec`.block()
}


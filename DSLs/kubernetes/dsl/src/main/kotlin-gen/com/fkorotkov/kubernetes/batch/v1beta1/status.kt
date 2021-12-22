// GENERATED
package com.fkorotkov.kubernetes.batch.v1beta1

import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJob as v1beta1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobStatus as v1beta1_CronJobStatus


fun  v1beta1_CronJob.`status`(block: v1beta1_CronJobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1beta1_CronJobStatus()
  }

  this.`status`.block()
}


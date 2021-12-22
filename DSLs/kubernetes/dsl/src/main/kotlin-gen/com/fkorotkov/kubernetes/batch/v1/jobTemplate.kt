// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.CronJobSpec as v1_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.v1.JobTemplateSpec as v1_JobTemplateSpec


fun  v1_CronJobSpec.`jobTemplate`(block: v1_JobTemplateSpec.() -> Unit = {}) {
  if(this.`jobTemplate` == null) {
    this.`jobTemplate` = v1_JobTemplateSpec()
  }

  this.`jobTemplate`.block()
}


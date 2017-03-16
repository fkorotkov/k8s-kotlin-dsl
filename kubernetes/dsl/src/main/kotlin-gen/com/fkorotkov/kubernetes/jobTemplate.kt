// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CronJobSpec
import io.fabric8.kubernetes.api.model.JobTemplateSpec


fun  CronJobSpec.`jobTemplate`(block: JobTemplateSpec.() -> Unit = {}) {
  if(this.`jobTemplate` == null) {
    this.`jobTemplate` = JobTemplateSpec()
  }

  this.`jobTemplate`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.batch.v1beta1

import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobSpec as v1beta1_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.v1beta1.JobTemplateSpec as v1beta1_JobTemplateSpec


fun  v1beta1_CronJobSpec.`jobTemplate`(block: v1beta1_JobTemplateSpec.() -> Unit = {}) {
  if(this.`jobTemplate` == null) {
    this.`jobTemplate` = v1beta1_JobTemplateSpec()
  }

  this.`jobTemplate`.block()
}


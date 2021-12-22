// GENERATE
package com.fkorotkov.kubernetes.batch.v1beta1

import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJob as v1beta1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobList as v1beta1_CronJobList
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobSpec as v1beta1_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobStatus as v1beta1_CronJobStatus
import io.fabric8.kubernetes.api.model.batch.v1beta1.JobTemplateSpec as v1beta1_JobTemplateSpec


fun newCronJob(block : v1beta1_CronJob.() -> Unit = {}): v1beta1_CronJob {
  val instance = v1beta1_CronJob()
  instance.block()
  return instance
}


fun newCronJobList(block : v1beta1_CronJobList.() -> Unit = {}): v1beta1_CronJobList {
  val instance = v1beta1_CronJobList()
  instance.block()
  return instance
}


fun newCronJobSpec(block : v1beta1_CronJobSpec.() -> Unit = {}): v1beta1_CronJobSpec {
  val instance = v1beta1_CronJobSpec()
  instance.block()
  return instance
}


fun newCronJobStatus(block : v1beta1_CronJobStatus.() -> Unit = {}): v1beta1_CronJobStatus {
  val instance = v1beta1_CronJobStatus()
  instance.block()
  return instance
}


fun newJobTemplateSpec(block : v1beta1_JobTemplateSpec.() -> Unit = {}): v1beta1_JobTemplateSpec {
  val instance = v1beta1_JobTemplateSpec()
  instance.block()
  return instance
}


// GENERATE
package com.fkorotkov.kubernetes.batch

import io.fabric8.kubernetes.api.model.batch.CronJob as batch_CronJob
import io.fabric8.kubernetes.api.model.batch.CronJobList as batch_CronJobList
import io.fabric8.kubernetes.api.model.batch.CronJobSpec as batch_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.CronJobStatus as batch_CronJobStatus
import io.fabric8.kubernetes.api.model.batch.Job as batch_Job
import io.fabric8.kubernetes.api.model.batch.JobCondition as batch_JobCondition
import io.fabric8.kubernetes.api.model.batch.JobList as batch_JobList
import io.fabric8.kubernetes.api.model.batch.JobSpec as batch_JobSpec
import io.fabric8.kubernetes.api.model.batch.JobStatus as batch_JobStatus
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec as batch_JobTemplateSpec


fun newCronJob(block : batch_CronJob.() -> Unit = {}): batch_CronJob {
  val instance = batch_CronJob()
  instance.block()
  return instance
}


fun newCronJobList(block : batch_CronJobList.() -> Unit = {}): batch_CronJobList {
  val instance = batch_CronJobList()
  instance.block()
  return instance
}


fun newCronJobSpec(block : batch_CronJobSpec.() -> Unit = {}): batch_CronJobSpec {
  val instance = batch_CronJobSpec()
  instance.block()
  return instance
}


fun newCronJobStatus(block : batch_CronJobStatus.() -> Unit = {}): batch_CronJobStatus {
  val instance = batch_CronJobStatus()
  instance.block()
  return instance
}


fun newJob(block : batch_Job.() -> Unit = {}): batch_Job {
  val instance = batch_Job()
  instance.block()
  return instance
}


fun newJobCondition(block : batch_JobCondition.() -> Unit = {}): batch_JobCondition {
  val instance = batch_JobCondition()
  instance.block()
  return instance
}


fun newJobList(block : batch_JobList.() -> Unit = {}): batch_JobList {
  val instance = batch_JobList()
  instance.block()
  return instance
}


fun newJobSpec(block : batch_JobSpec.() -> Unit = {}): batch_JobSpec {
  val instance = batch_JobSpec()
  instance.block()
  return instance
}


fun newJobStatus(block : batch_JobStatus.() -> Unit = {}): batch_JobStatus {
  val instance = batch_JobStatus()
  instance.block()
  return instance
}


fun newJobTemplateSpec(block : batch_JobTemplateSpec.() -> Unit = {}): batch_JobTemplateSpec {
  val instance = batch_JobTemplateSpec()
  instance.block()
  return instance
}


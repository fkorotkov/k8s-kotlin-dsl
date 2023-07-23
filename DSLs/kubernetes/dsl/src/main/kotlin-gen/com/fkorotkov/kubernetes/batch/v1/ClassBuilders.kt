// GENERATE
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.CronJob as v1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1.CronJobList as v1_CronJobList
import io.fabric8.kubernetes.api.model.batch.v1.CronJobSpec as v1_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.v1.CronJobStatus as v1_CronJobStatus
import io.fabric8.kubernetes.api.model.batch.v1.Job as v1_Job
import io.fabric8.kubernetes.api.model.batch.v1.JobCondition as v1_JobCondition
import io.fabric8.kubernetes.api.model.batch.v1.JobList as v1_JobList
import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec
import io.fabric8.kubernetes.api.model.batch.v1.JobStatus as v1_JobStatus
import io.fabric8.kubernetes.api.model.batch.v1.JobTemplateSpec as v1_JobTemplateSpec
import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicy as v1_PodFailurePolicy
import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicyOnExitCodesRequirement as v1_PodFailurePolicyOnExitCodesRequirement
import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicyOnPodConditionsPattern as v1_PodFailurePolicyOnPodConditionsPattern
import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicyRule as v1_PodFailurePolicyRule
import io.fabric8.kubernetes.api.model.batch.v1.UncountedTerminatedPods as v1_UncountedTerminatedPods


fun newCronJob(block : v1_CronJob.() -> Unit = {}): v1_CronJob {
  val instance = v1_CronJob()
  instance.block()
  return instance
}


fun newCronJobList(block : v1_CronJobList.() -> Unit = {}): v1_CronJobList {
  val instance = v1_CronJobList()
  instance.block()
  return instance
}


fun newCronJobSpec(block : v1_CronJobSpec.() -> Unit = {}): v1_CronJobSpec {
  val instance = v1_CronJobSpec()
  instance.block()
  return instance
}


fun newCronJobStatus(block : v1_CronJobStatus.() -> Unit = {}): v1_CronJobStatus {
  val instance = v1_CronJobStatus()
  instance.block()
  return instance
}


fun newJob(block : v1_Job.() -> Unit = {}): v1_Job {
  val instance = v1_Job()
  instance.block()
  return instance
}


fun newJobCondition(block : v1_JobCondition.() -> Unit = {}): v1_JobCondition {
  val instance = v1_JobCondition()
  instance.block()
  return instance
}


fun newJobList(block : v1_JobList.() -> Unit = {}): v1_JobList {
  val instance = v1_JobList()
  instance.block()
  return instance
}


fun newJobSpec(block : v1_JobSpec.() -> Unit = {}): v1_JobSpec {
  val instance = v1_JobSpec()
  instance.block()
  return instance
}


fun newJobStatus(block : v1_JobStatus.() -> Unit = {}): v1_JobStatus {
  val instance = v1_JobStatus()
  instance.block()
  return instance
}


fun newJobTemplateSpec(block : v1_JobTemplateSpec.() -> Unit = {}): v1_JobTemplateSpec {
  val instance = v1_JobTemplateSpec()
  instance.block()
  return instance
}


fun newPodFailurePolicy(block : v1_PodFailurePolicy.() -> Unit = {}): v1_PodFailurePolicy {
  val instance = v1_PodFailurePolicy()
  instance.block()
  return instance
}


fun newPodFailurePolicyOnExitCodesRequirement(block : v1_PodFailurePolicyOnExitCodesRequirement.() -> Unit = {}): v1_PodFailurePolicyOnExitCodesRequirement {
  val instance = v1_PodFailurePolicyOnExitCodesRequirement()
  instance.block()
  return instance
}


fun newPodFailurePolicyOnPodConditionsPattern(block : v1_PodFailurePolicyOnPodConditionsPattern.() -> Unit = {}): v1_PodFailurePolicyOnPodConditionsPattern {
  val instance = v1_PodFailurePolicyOnPodConditionsPattern()
  instance.block()
  return instance
}


fun newPodFailurePolicyRule(block : v1_PodFailurePolicyRule.() -> Unit = {}): v1_PodFailurePolicyRule {
  val instance = v1_PodFailurePolicyRule()
  instance.block()
  return instance
}


fun newUncountedTerminatedPods(block : v1_UncountedTerminatedPods.() -> Unit = {}): v1_UncountedTerminatedPods {
  val instance = v1_UncountedTerminatedPods()
  instance.block()
  return instance
}


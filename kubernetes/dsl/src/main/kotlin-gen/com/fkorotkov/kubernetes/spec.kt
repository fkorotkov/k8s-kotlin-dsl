// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CronJob
import io.fabric8.kubernetes.api.model.CronJobSpec
import io.fabric8.kubernetes.api.model.Job
import io.fabric8.kubernetes.api.model.JobSpec
import io.fabric8.kubernetes.api.model.JobTemplateSpec
import io.fabric8.kubernetes.api.model.LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeSpec
import io.fabric8.kubernetes.api.model.Namespace
import io.fabric8.kubernetes.api.model.NamespaceSpec
import io.fabric8.kubernetes.api.model.Node
import io.fabric8.kubernetes.api.model.NodeSpec
import io.fabric8.kubernetes.api.model.PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Pod
import io.fabric8.kubernetes.api.model.PodSpec
import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec
import io.fabric8.kubernetes.api.model.ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.Service
import io.fabric8.kubernetes.api.model.ServiceSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.extensions.Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressSpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec
import io.fabric8.kubernetes.api.model.extensions.StatefulSet
import io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec


fun  CronJob.`spec`(block: CronJobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = CronJobSpec()
  }

  this.`spec`.block()
}


fun  DaemonSet.`spec`(block: DaemonSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = DaemonSetSpec()
  }

  this.`spec`.block()
}


fun  Deployment.`spec`(block: DeploymentSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = DeploymentSpec()
  }

  this.`spec`.block()
}


fun  HorizontalPodAutoscaler.`spec`(block: HorizontalPodAutoscalerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = HorizontalPodAutoscalerSpec()
  }

  this.`spec`.block()
}


fun  Ingress.`spec`(block: IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = IngressSpec()
  }

  this.`spec`.block()
}


fun  Job.`spec`(block: JobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = JobSpec()
  }

  this.`spec`.block()
}


fun  JobTemplateSpec.`spec`(block: JobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = JobSpec()
  }

  this.`spec`.block()
}


fun  LimitRange.`spec`(block: LimitRangeSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = LimitRangeSpec()
  }

  this.`spec`.block()
}


fun  Namespace.`spec`(block: NamespaceSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = NamespaceSpec()
  }

  this.`spec`.block()
}


fun  Node.`spec`(block: NodeSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = NodeSpec()
  }

  this.`spec`.block()
}


fun  PersistentVolume.`spec`(block: PersistentVolumeSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PersistentVolumeSpec()
  }

  this.`spec`.block()
}


fun  PersistentVolumeClaim.`spec`(block: PersistentVolumeClaimSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PersistentVolumeClaimSpec()
  }

  this.`spec`.block()
}


fun  Pod.`spec`(block: PodSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PodSpec()
  }

  this.`spec`.block()
}


fun  PodTemplateSpec.`spec`(block: PodSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PodSpec()
  }

  this.`spec`.block()
}


fun  ReplicaSet.`spec`(block: ReplicaSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ReplicaSetSpec()
  }

  this.`spec`.block()
}


fun  ReplicationController.`spec`(block: ReplicationControllerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ReplicationControllerSpec()
  }

  this.`spec`.block()
}


fun  ResourceQuota.`spec`(block: ResourceQuotaSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ResourceQuotaSpec()
  }

  this.`spec`.block()
}


fun  Scale.`spec`(block: ScaleSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ScaleSpec()
  }

  this.`spec`.block()
}


fun  Service.`spec`(block: ServiceSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ServiceSpec()
  }

  this.`spec`.block()
}


fun  StatefulSet.`spec`(block: StatefulSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = StatefulSetSpec()
  }

  this.`spec`.block()
}


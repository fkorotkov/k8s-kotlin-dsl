// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerStatus
import io.fabric8.kubernetes.api.model.Namespace
import io.fabric8.kubernetes.api.model.NamespaceStatus
import io.fabric8.kubernetes.api.model.Node
import io.fabric8.kubernetes.api.model.NodeStatus
import io.fabric8.kubernetes.api.model.PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeStatus
import io.fabric8.kubernetes.api.model.Pod
import io.fabric8.kubernetes.api.model.PodStatus
import io.fabric8.kubernetes.api.model.ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerStatus
import io.fabric8.kubernetes.api.model.ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.Service
import io.fabric8.kubernetes.api.model.ServiceStatus
import io.fabric8.kubernetes.api.model.Status
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatus
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources
import io.fabric8.kubernetes.api.model.apps.DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatus
import io.fabric8.kubernetes.api.model.apps.Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentStatus
import io.fabric8.kubernetes.api.model.apps.ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatus
import io.fabric8.kubernetes.api.model.apps.StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatus
import io.fabric8.kubernetes.api.model.authentication.TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.batch.CronJob
import io.fabric8.kubernetes.api.model.batch.CronJobStatus
import io.fabric8.kubernetes.api.model.batch.Job
import io.fabric8.kubernetes.api.model.batch.JobStatus
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus
import io.fabric8.kubernetes.api.model.extensions.Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressStatus
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleStatus
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus


fun  AdmissionResponse.`status`(block: Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = Status()
  }

  this.`status`.block()
}


fun  CertificateSigningRequest.`status`(block: CertificateSigningRequestStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = CertificateSigningRequestStatus()
  }

  this.`status`.block()
}


fun  CronJob.`status`(block: CronJobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = CronJobStatus()
  }

  this.`status`.block()
}


fun  CustomResourceDefinition.`status`(block: CustomResourceDefinitionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = CustomResourceDefinitionStatus()
  }

  this.`status`.block()
}


fun  CustomResourceSubresources.`status`(block: CustomResourceSubresourceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = CustomResourceSubresourceStatus()
  }

  this.`status`.block()
}


fun  DaemonSet.`status`(block: DaemonSetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = DaemonSetStatus()
  }

  this.`status`.block()
}


fun  Deployment.`status`(block: DeploymentStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = DeploymentStatus()
  }

  this.`status`.block()
}


fun  HorizontalPodAutoscaler.`status`(block: HorizontalPodAutoscalerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = HorizontalPodAutoscalerStatus()
  }

  this.`status`.block()
}


fun  Ingress.`status`(block: IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = IngressStatus()
  }

  this.`status`.block()
}


fun  Job.`status`(block: JobStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = JobStatus()
  }

  this.`status`.block()
}


fun  LocalSubjectAccessReview.`status`(block: SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  Namespace.`status`(block: NamespaceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = NamespaceStatus()
  }

  this.`status`.block()
}


fun  Node.`status`(block: NodeStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = NodeStatus()
  }

  this.`status`.block()
}


fun  PersistentVolume.`status`(block: PersistentVolumeStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = PersistentVolumeStatus()
  }

  this.`status`.block()
}


fun  PersistentVolumeClaim.`status`(block: PersistentVolumeClaimStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = PersistentVolumeClaimStatus()
  }

  this.`status`.block()
}


fun  Pod.`status`(block: PodStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = PodStatus()
  }

  this.`status`.block()
}


fun  PodDisruptionBudget.`status`(block: PodDisruptionBudgetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = PodDisruptionBudgetStatus()
  }

  this.`status`.block()
}


fun  ReplicaSet.`status`(block: ReplicaSetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ReplicaSetStatus()
  }

  this.`status`.block()
}


fun  ReplicationController.`status`(block: ReplicationControllerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ReplicationControllerStatus()
  }

  this.`status`.block()
}


fun  ResourceQuota.`status`(block: ResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ResourceQuotaStatus()
  }

  this.`status`.block()
}


fun  Scale.`status`(block: ScaleStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ScaleStatus()
  }

  this.`status`.block()
}


fun  Service.`status`(block: ServiceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ServiceStatus()
  }

  this.`status`.block()
}


fun  StatefulSet.`status`(block: StatefulSetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = StatefulSetStatus()
  }

  this.`status`.block()
}


fun  SubjectAccessReview.`status`(block: SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  TokenReview.`status`(block: TokenReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = TokenReviewStatus()
  }

  this.`status`.block()
}


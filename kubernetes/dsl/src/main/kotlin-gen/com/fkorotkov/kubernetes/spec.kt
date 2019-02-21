// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerSpec
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
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apps.DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec
import io.fabric8.kubernetes.api.model.authentication.TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.batch.CronJob
import io.fabric8.kubernetes.api.model.batch.CronJobSpec
import io.fabric8.kubernetes.api.model.batch.Job
import io.fabric8.kubernetes.api.model.batch.JobSpec
import io.fabric8.kubernetes.api.model.batch.JobTemplateSpec
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec
import io.fabric8.kubernetes.api.model.extensions.Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressSpec
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.settings.PodPreset
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec


fun  CertificateSigningRequest.`spec`(block: CertificateSigningRequestSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = CertificateSigningRequestSpec()
  }

  this.`spec`.block()
}


fun  CronJob.`spec`(block: CronJobSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = CronJobSpec()
  }

  this.`spec`.block()
}


fun  CustomResourceDefinition.`spec`(block: CustomResourceDefinitionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = CustomResourceDefinitionSpec()
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


fun  LocalSubjectAccessReview.`spec`(block: SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  Namespace.`spec`(block: NamespaceSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = NamespaceSpec()
  }

  this.`spec`.block()
}


fun  NetworkPolicy.`spec`(block: NetworkPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = NetworkPolicySpec()
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


fun  PodDisruptionBudget.`spec`(block: PodDisruptionBudgetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PodDisruptionBudgetSpec()
  }

  this.`spec`.block()
}


fun  PodPreset.`spec`(block: PodPresetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PodPresetSpec()
  }

  this.`spec`.block()
}


fun  PodSecurityPolicy.`spec`(block: PodSecurityPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = PodSecurityPolicySpec()
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


fun  SubjectAccessReview.`spec`(block: SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  TokenReview.`spec`(block: TokenReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = TokenReviewSpec()
  }

  this.`spec`.block()
}


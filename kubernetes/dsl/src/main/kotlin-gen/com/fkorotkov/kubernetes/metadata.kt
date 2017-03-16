// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.BaseKubernetesList
import io.fabric8.kubernetes.api.model.Binding
import io.fabric8.kubernetes.api.model.ComponentStatus
import io.fabric8.kubernetes.api.model.ComponentStatusList
import io.fabric8.kubernetes.api.model.ConfigMap
import io.fabric8.kubernetes.api.model.ConfigMapList
import io.fabric8.kubernetes.api.model.CronJob
import io.fabric8.kubernetes.api.model.CronJobList
import io.fabric8.kubernetes.api.model.DeprecatedDownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.Endpoints
import io.fabric8.kubernetes.api.model.EndpointsList
import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.EventList
import io.fabric8.kubernetes.api.model.Job
import io.fabric8.kubernetes.api.model.JobList
import io.fabric8.kubernetes.api.model.JobTemplateSpec
import io.fabric8.kubernetes.api.model.LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeList
import io.fabric8.kubernetes.api.model.ListMeta
import io.fabric8.kubernetes.api.model.Namespace
import io.fabric8.kubernetes.api.model.NamespaceList
import io.fabric8.kubernetes.api.model.Node
import io.fabric8.kubernetes.api.model.NodeList
import io.fabric8.kubernetes.api.model.ObjectMeta
import io.fabric8.kubernetes.api.model.PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimList
import io.fabric8.kubernetes.api.model.PersistentVolumeList
import io.fabric8.kubernetes.api.model.Pod
import io.fabric8.kubernetes.api.model.PodList
import io.fabric8.kubernetes.api.model.PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateList
import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerList
import io.fabric8.kubernetes.api.model.ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaList
import io.fabric8.kubernetes.api.model.Secret
import io.fabric8.kubernetes.api.model.SecretList
import io.fabric8.kubernetes.api.model.SecurityContextConstraints
import io.fabric8.kubernetes.api.model.SecurityContextConstraintsList
import io.fabric8.kubernetes.api.model.Service
import io.fabric8.kubernetes.api.model.ServiceAccount
import io.fabric8.kubernetes.api.model.ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceList
import io.fabric8.kubernetes.api.model.Status
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.extensions.DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetList
import io.fabric8.kubernetes.api.model.extensions.Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentList
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.extensions.Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressList
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetList
import io.fabric8.kubernetes.api.model.extensions.Scale
import io.fabric8.kubernetes.api.model.extensions.StatefulSet
import io.fabric8.kubernetes.api.model.extensions.StatefulSetList
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResourceList


fun  BaseKubernetesList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Binding.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ComponentStatus.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ComponentStatusList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ConfigMap.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ConfigMapList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  CronJob.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  CronJobList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  DaemonSet.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  DaemonSetList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Deployment.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  DeploymentList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Endpoints.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  EndpointsList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Event.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  EventList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  HorizontalPodAutoscaler.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  HorizontalPodAutoscalerList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Ingress.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  IngressList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Job.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  JobList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  JobTemplateSpec.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  LimitRange.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  LimitRangeList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Namespace.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  NamespaceList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Node.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  NodeList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  PersistentVolume.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  PersistentVolumeClaim.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  PersistentVolumeClaimList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  PersistentVolumeList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Pod.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  PodList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  PodTemplate.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  PodTemplateList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  PodTemplateSpec.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ReplicaSet.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ReplicaSetList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ReplicationController.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ReplicationControllerList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ResourceQuota.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ResourceQuotaList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Scale.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  Secret.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  SecretList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  SecurityContextConstraints.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  SecurityContextConstraintsList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Service.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ServiceAccount.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ServiceAccountList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ServiceList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  StatefulSet.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  StatefulSetList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Status.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ThirdPartyResource.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ThirdPartyResourceList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Volume.`metadata`(block: DeprecatedDownwardAPIVolumeSource.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = DeprecatedDownwardAPIVolumeSource()
  }

  this.`metadata`.block()
}


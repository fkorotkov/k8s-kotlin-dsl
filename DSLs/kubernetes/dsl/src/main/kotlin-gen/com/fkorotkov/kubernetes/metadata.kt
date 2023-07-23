// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.APIService as model_APIService
import io.fabric8.kubernetes.api.model.APIServiceList as model_APIServiceList
import io.fabric8.kubernetes.api.model.Binding as model_Binding
import io.fabric8.kubernetes.api.model.ComponentStatus as model_ComponentStatus
import io.fabric8.kubernetes.api.model.ComponentStatusList as model_ComponentStatusList
import io.fabric8.kubernetes.api.model.ConfigMap as model_ConfigMap
import io.fabric8.kubernetes.api.model.ConfigMapList as model_ConfigMapList
import io.fabric8.kubernetes.api.model.Endpoints as model_Endpoints
import io.fabric8.kubernetes.api.model.EndpointsList as model_EndpointsList
import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventList as model_EventList
import io.fabric8.kubernetes.api.model.GenericKubernetesResource as model_GenericKubernetesResource
import io.fabric8.kubernetes.api.model.LimitRange as model_LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeList as model_LimitRangeList
import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.Namespace as model_Namespace
import io.fabric8.kubernetes.api.model.NamespaceList as model_NamespaceList
import io.fabric8.kubernetes.api.model.Node as model_Node
import io.fabric8.kubernetes.api.model.NodeList as model_NodeList
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.PersistentVolume as model_PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim as model_PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimList as model_PersistentVolumeClaimList
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimTemplate as model_PersistentVolumeClaimTemplate
import io.fabric8.kubernetes.api.model.PersistentVolumeList as model_PersistentVolumeList
import io.fabric8.kubernetes.api.model.Pod as model_Pod
import io.fabric8.kubernetes.api.model.PodList as model_PodList
import io.fabric8.kubernetes.api.model.PodTemplate as model_PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateList as model_PodTemplateList
import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationController as model_ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerList as model_ReplicationControllerList
import io.fabric8.kubernetes.api.model.ResourceQuota as model_ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaList as model_ResourceQuotaList
import io.fabric8.kubernetes.api.model.Secret as model_Secret
import io.fabric8.kubernetes.api.model.SecretList as model_SecretList
import io.fabric8.kubernetes.api.model.Service as model_Service
import io.fabric8.kubernetes.api.model.ServiceAccount as model_ServiceAccount
import io.fabric8.kubernetes.api.model.ServiceAccountList as model_ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceList as model_ServiceList
import io.fabric8.kubernetes.api.model.Status as model_Status


fun  model_APIService.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_APIServiceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Binding.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ComponentStatus.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ComponentStatusList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ConfigMap.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ConfigMapList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Endpoints.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_EndpointsList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Event.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_EventList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_GenericKubernetesResource.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_LimitRange.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_LimitRangeList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Namespace.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_NamespaceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Node.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_NodeList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_PersistentVolume.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_PersistentVolumeClaim.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_PersistentVolumeClaimList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_PersistentVolumeClaimTemplate.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_PersistentVolumeList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Pod.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_PodList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_PodTemplate.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_PodTemplateList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_PodTemplateSpec.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ReplicationController.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ReplicationControllerList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ResourceQuota.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ResourceQuotaList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Secret.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_SecretList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Service.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ServiceAccount.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ServiceAccountList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ServiceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Status.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Namespace as model_Namespace
import io.fabric8.kubernetes.api.model.NamespaceStatus as model_NamespaceStatus
import io.fabric8.kubernetes.api.model.Node as model_Node
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus
import io.fabric8.kubernetes.api.model.PersistentVolume as model_PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim as model_PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus as model_PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeStatus as model_PersistentVolumeStatus
import io.fabric8.kubernetes.api.model.Pod as model_Pod
import io.fabric8.kubernetes.api.model.PodStatus as model_PodStatus
import io.fabric8.kubernetes.api.model.ReplicationController as model_ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerStatus as model_ReplicationControllerStatus
import io.fabric8.kubernetes.api.model.ResourceQuota as model_ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaStatus as model_ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.Service as model_Service
import io.fabric8.kubernetes.api.model.ServiceStatus as model_ServiceStatus


fun  model_Namespace.`status`(block: model_NamespaceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_NamespaceStatus()
  }

  this.`status`.block()
}


fun  model_Node.`status`(block: model_NodeStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_NodeStatus()
  }

  this.`status`.block()
}


fun  model_PersistentVolume.`status`(block: model_PersistentVolumeStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_PersistentVolumeStatus()
  }

  this.`status`.block()
}


fun  model_PersistentVolumeClaim.`status`(block: model_PersistentVolumeClaimStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_PersistentVolumeClaimStatus()
  }

  this.`status`.block()
}


fun  model_Pod.`status`(block: model_PodStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_PodStatus()
  }

  this.`status`.block()
}


fun  model_ReplicationController.`status`(block: model_ReplicationControllerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ReplicationControllerStatus()
  }

  this.`status`.block()
}


fun  model_ResourceQuota.`status`(block: model_ResourceQuotaStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ResourceQuotaStatus()
  }

  this.`status`.block()
}


fun  model_Service.`status`(block: model_ServiceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ServiceStatus()
  }

  this.`status`.block()
}


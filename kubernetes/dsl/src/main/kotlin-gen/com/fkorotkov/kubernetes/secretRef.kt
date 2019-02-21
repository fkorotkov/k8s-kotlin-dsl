// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSPersistentVolumeSource as model_CephFSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CephFSVolumeSource as model_CephFSVolumeSource
import io.fabric8.kubernetes.api.model.CinderPersistentVolumeSource as model_CinderPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CinderVolumeSource as model_CinderVolumeSource
import io.fabric8.kubernetes.api.model.EnvFromSource as model_EnvFromSource
import io.fabric8.kubernetes.api.model.FlexPersistentVolumeSource as model_FlexPersistentVolumeSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource as model_FlexVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIPersistentVolumeSource as model_ISCSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource as model_ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.RBDPersistentVolumeSource as model_RBDPersistentVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource as model_RBDVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOPersistentVolumeSource as model_ScaleIOPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource as model_ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.SecretEnvSource as model_SecretEnvSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource as model_StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource as model_StorageOSVolumeSource


fun  model_CephFSPersistentVolumeSource.`secretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretReference()
  }

  this.`secretRef`.block()
}


fun  model_CephFSVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_CinderPersistentVolumeSource.`secretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretReference()
  }

  this.`secretRef`.block()
}


fun  model_CinderVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_EnvFromSource.`secretRef`(block: model_SecretEnvSource.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretEnvSource()
  }

  this.`secretRef`.block()
}


fun  model_FlexPersistentVolumeSource.`secretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretReference()
  }

  this.`secretRef`.block()
}


fun  model_FlexVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_ISCSIPersistentVolumeSource.`secretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretReference()
  }

  this.`secretRef`.block()
}


fun  model_ISCSIVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_RBDPersistentVolumeSource.`secretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretReference()
  }

  this.`secretRef`.block()
}


fun  model_RBDVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_ScaleIOPersistentVolumeSource.`secretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_SecretReference()
  }

  this.`secretRef`.block()
}


fun  model_ScaleIOVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_StorageOSPersistentVolumeSource.`secretRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_ObjectReference()
  }

  this.`secretRef`.block()
}


fun  model_StorageOSVolumeSource.`secretRef`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = model_LocalObjectReference()
  }

  this.`secretRef`.block()
}


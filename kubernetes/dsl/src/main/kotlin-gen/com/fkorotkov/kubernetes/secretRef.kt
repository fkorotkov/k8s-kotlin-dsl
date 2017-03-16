// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource
import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.kubernetes.api.model.RBDVolumeSource


fun  CephFSVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  FlexVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  RBDVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


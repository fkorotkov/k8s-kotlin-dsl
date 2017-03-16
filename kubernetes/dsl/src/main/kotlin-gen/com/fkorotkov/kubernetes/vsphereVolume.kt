// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.VsphereVirtualDiskVolumeSource


fun  PersistentVolumeSpec.`vsphereVolume`(block: VsphereVirtualDiskVolumeSource.() -> Unit = {}) {
  if(this.`vsphereVolume` == null) {
    this.`vsphereVolume` = VsphereVirtualDiskVolumeSource()
  }

  this.`vsphereVolume`.block()
}


fun  Volume.`vsphereVolume`(block: VsphereVirtualDiskVolumeSource.() -> Unit = {}) {
  if(this.`vsphereVolume` == null) {
    this.`vsphereVolume` = VsphereVirtualDiskVolumeSource()
  }

  this.`vsphereVolume`.block()
}


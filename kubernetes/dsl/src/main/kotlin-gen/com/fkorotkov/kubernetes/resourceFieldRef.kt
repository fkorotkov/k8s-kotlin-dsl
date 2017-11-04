// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.EnvVarSource
import io.fabric8.kubernetes.api.model.ResourceFieldSelector


fun  DownwardAPIVolumeFile.`resourceFieldRef`(block: ResourceFieldSelector.() -> Unit = {}) {
  if(this.`resourceFieldRef` == null) {
    this.`resourceFieldRef` = ResourceFieldSelector()
  }

  this.`resourceFieldRef`.block()
}


fun  EnvVarSource.`resourceFieldRef`(block: ResourceFieldSelector.() -> Unit = {}) {
  if(this.`resourceFieldRef` == null) {
    this.`resourceFieldRef` = ResourceFieldSelector()
  }

  this.`resourceFieldRef`.block()
}


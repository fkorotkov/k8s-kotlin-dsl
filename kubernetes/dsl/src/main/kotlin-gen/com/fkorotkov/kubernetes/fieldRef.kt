// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.EnvVarSource
import io.fabric8.kubernetes.api.model.ObjectFieldSelector


fun  DownwardAPIVolumeFile.`fieldRef`(block: ObjectFieldSelector.() -> Unit = {}) {
  if(this.`fieldRef` == null) {
    this.`fieldRef` = ObjectFieldSelector()
  }

  this.`fieldRef`.block()
}


fun  EnvVarSource.`fieldRef`(block: ObjectFieldSelector.() -> Unit = {}) {
  if(this.`fieldRef` == null) {
    this.`fieldRef` = ObjectFieldSelector()
  }

  this.`fieldRef`.block()
}


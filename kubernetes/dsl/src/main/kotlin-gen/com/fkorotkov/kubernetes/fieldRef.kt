// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile as model_DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource
import io.fabric8.kubernetes.api.model.ObjectFieldSelector as model_ObjectFieldSelector


fun  model_DownwardAPIVolumeFile.`fieldRef`(block: model_ObjectFieldSelector.() -> Unit = {}) {
  if(this.`fieldRef` == null) {
    this.`fieldRef` = model_ObjectFieldSelector()
  }

  this.`fieldRef`.block()
}


fun  model_EnvVarSource.`fieldRef`(block: model_ObjectFieldSelector.() -> Unit = {}) {
  if(this.`fieldRef` == null) {
    this.`fieldRef` = model_ObjectFieldSelector()
  }

  this.`fieldRef`.block()
}


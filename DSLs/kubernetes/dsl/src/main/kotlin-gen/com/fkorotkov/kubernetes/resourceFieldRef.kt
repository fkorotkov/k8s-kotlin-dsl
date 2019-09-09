// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile as model_DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource
import io.fabric8.kubernetes.api.model.ResourceFieldSelector as model_ResourceFieldSelector


fun  model_DownwardAPIVolumeFile.`resourceFieldRef`(block: model_ResourceFieldSelector.() -> Unit = {}) {
  if(this.`resourceFieldRef` == null) {
    this.`resourceFieldRef` = model_ResourceFieldSelector()
  }

  this.`resourceFieldRef`.block()
}


fun  model_EnvVarSource.`resourceFieldRef`(block: model_ResourceFieldSelector.() -> Unit = {}) {
  if(this.`resourceFieldRef` == null) {
    this.`resourceFieldRef` = model_ResourceFieldSelector()
  }

  this.`resourceFieldRef`.block()
}


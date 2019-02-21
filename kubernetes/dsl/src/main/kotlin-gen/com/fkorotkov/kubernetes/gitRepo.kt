// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GitRepoVolumeSource as model_GitRepoVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_Volume.`gitRepo`(block: model_GitRepoVolumeSource.() -> Unit = {}) {
  if(this.`gitRepo` == null) {
    this.`gitRepo` = model_GitRepoVolumeSource()
  }

  this.`gitRepo`.block()
}


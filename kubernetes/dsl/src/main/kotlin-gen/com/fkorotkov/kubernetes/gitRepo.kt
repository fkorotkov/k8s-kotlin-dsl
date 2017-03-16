// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GitRepoVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`gitRepo`(block: GitRepoVolumeSource.() -> Unit = {}) {
  if(this.`gitRepo` == null) {
    this.`gitRepo` = GitRepoVolumeSource()
  }

  this.`gitRepo`.block()
}


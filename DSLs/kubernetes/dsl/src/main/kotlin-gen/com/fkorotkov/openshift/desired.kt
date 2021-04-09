// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterVersionStatus as model_ClusterVersionStatus
import io.fabric8.openshift.api.model.Release as model_Release


fun  model_ClusterVersionStatus.`desired`(block: model_Release.() -> Unit = {}) {
  if(this.`desired` == null) {
    this.`desired` = model_Release()
  }

  this.`desired`.block()
}


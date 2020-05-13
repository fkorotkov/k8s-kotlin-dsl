// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterVersionStatus as model_ClusterVersionStatus
import io.fabric8.openshift.api.model.Update as model_Update


fun  model_ClusterVersionStatus.`desired`(block: model_Update.() -> Unit = {}) {
  if(this.`desired` == null) {
    this.`desired` = model_Update()
  }

  this.`desired`.block()
}


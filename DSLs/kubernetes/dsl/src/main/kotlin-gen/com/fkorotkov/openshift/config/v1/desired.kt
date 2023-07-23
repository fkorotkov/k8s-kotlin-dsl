// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ClusterVersionStatus as v1_ClusterVersionStatus
import io.fabric8.openshift.api.model.config.v1.Release as v1_Release


fun  v1_ClusterVersionStatus.`desired`(block: v1_Release.() -> Unit = {}) {
  if(this.`desired` == null) {
    this.`desired` = v1_Release()
  }

  this.`desired`.block()
}


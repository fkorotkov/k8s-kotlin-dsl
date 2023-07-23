// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ClusterVersionSpec as v1_ClusterVersionSpec
import io.fabric8.openshift.api.model.config.v1.Update as v1_Update


fun  v1_ClusterVersionSpec.`desiredUpdate`(block: v1_Update.() -> Unit = {}) {
  if(this.`desiredUpdate` == null) {
    this.`desiredUpdate` = v1_Update()
  }

  this.`desiredUpdate`.block()
}


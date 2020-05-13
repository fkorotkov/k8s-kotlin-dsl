// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterVersionSpec as model_ClusterVersionSpec
import io.fabric8.openshift.api.model.Update as model_Update


fun  model_ClusterVersionSpec.`desiredUpdate`(block: model_Update.() -> Unit = {}) {
  if(this.`desiredUpdate` == null) {
    this.`desiredUpdate` = model_Update()
  }

  this.`desiredUpdate`.block()
}


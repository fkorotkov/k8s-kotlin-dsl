// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.DockerStrategyOptions as model_DockerStrategyOptions


fun  model_BuildRequest.`dockerStrategyOptions`(block: model_DockerStrategyOptions.() -> Unit = {}) {
  if(this.`dockerStrategyOptions` == null) {
    this.`dockerStrategyOptions` = model_DockerStrategyOptions()
  }

  this.`dockerStrategyOptions`.block()
}


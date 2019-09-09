// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy as model_BuildStrategy
import io.fabric8.openshift.api.model.DockerBuildStrategy as model_DockerBuildStrategy


fun  model_BuildStrategy.`dockerStrategy`(block: model_DockerBuildStrategy.() -> Unit = {}) {
  if(this.`dockerStrategy` == null) {
    this.`dockerStrategy` = model_DockerBuildStrategy()
  }

  this.`dockerStrategy`.block()
}


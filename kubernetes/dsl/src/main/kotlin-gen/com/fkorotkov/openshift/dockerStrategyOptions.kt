// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.DockerStrategyOptions


fun  BuildRequest.`dockerStrategyOptions`(block: DockerStrategyOptions.() -> Unit = {}) {
  if(this.`dockerStrategyOptions` == null) {
    this.`dockerStrategyOptions` = DockerStrategyOptions()
  }

  this.`dockerStrategyOptions`.block()
}


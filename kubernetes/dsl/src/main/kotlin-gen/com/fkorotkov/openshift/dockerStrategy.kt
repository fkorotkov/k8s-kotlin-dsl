// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy
import io.fabric8.openshift.api.model.DockerBuildStrategy


fun  BuildStrategy.`dockerStrategy`(block: DockerBuildStrategy.() -> Unit = {}) {
  if(this.`dockerStrategy` == null) {
    this.`dockerStrategy` = DockerBuildStrategy()
  }

  this.`dockerStrategy`.block()
}


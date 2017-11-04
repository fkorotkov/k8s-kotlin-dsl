// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy
import io.fabric8.openshift.api.model.SourceBuildStrategy


fun  BuildStrategy.`sourceStrategy`(block: SourceBuildStrategy.() -> Unit = {}) {
  if(this.`sourceStrategy` == null) {
    this.`sourceStrategy` = SourceBuildStrategy()
  }

  this.`sourceStrategy`.block()
}


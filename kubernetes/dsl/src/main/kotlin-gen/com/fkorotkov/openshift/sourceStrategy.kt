// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy as model_BuildStrategy
import io.fabric8.openshift.api.model.SourceBuildStrategy as model_SourceBuildStrategy


fun  model_BuildStrategy.`sourceStrategy`(block: model_SourceBuildStrategy.() -> Unit = {}) {
  if(this.`sourceStrategy` == null) {
    this.`sourceStrategy` = model_SourceBuildStrategy()
  }

  this.`sourceStrategy`.block()
}


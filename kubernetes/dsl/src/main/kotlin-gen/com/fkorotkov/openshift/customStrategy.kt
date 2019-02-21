// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy as model_BuildStrategy
import io.fabric8.openshift.api.model.CustomBuildStrategy as model_CustomBuildStrategy


fun  model_BuildStrategy.`customStrategy`(block: model_CustomBuildStrategy.() -> Unit = {}) {
  if(this.`customStrategy` == null) {
    this.`customStrategy` = model_CustomBuildStrategy()
  }

  this.`customStrategy`.block()
}


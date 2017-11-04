// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy
import io.fabric8.openshift.api.model.CustomBuildStrategy


fun  BuildStrategy.`customStrategy`(block: CustomBuildStrategy.() -> Unit = {}) {
  if(this.`customStrategy` == null) {
    this.`customStrategy` = CustomBuildStrategy()
  }

  this.`customStrategy`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSource
import io.fabric8.openshift.api.model.BuildSpec


fun  BuildConfigSpec.`source`(block: BuildSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = BuildSource()
  }

  this.`source`.block()
}


fun  BuildSpec.`source`(block: BuildSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = BuildSource()
  }

  this.`source`.block()
}


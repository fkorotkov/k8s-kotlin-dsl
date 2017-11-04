// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildOutput
import io.fabric8.openshift.api.model.BuildSpec
import io.fabric8.openshift.api.model.BuildStatus
import io.fabric8.openshift.api.model.BuildStatusOutput


fun  BuildConfigSpec.`output`(block: BuildOutput.() -> Unit = {}) {
  if(this.`output` == null) {
    this.`output` = BuildOutput()
  }

  this.`output`.block()
}


fun  BuildSpec.`output`(block: BuildOutput.() -> Unit = {}) {
  if(this.`output` == null) {
    this.`output` = BuildOutput()
  }

  this.`output`.block()
}


fun  BuildStatus.`output`(block: BuildStatusOutput.() -> Unit = {}) {
  if(this.`output` == null) {
    this.`output` = BuildStatusOutput()
  }

  this.`output`.block()
}


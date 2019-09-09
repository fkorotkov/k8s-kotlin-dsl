// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildOutput as model_BuildOutput
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.BuildStatus as model_BuildStatus
import io.fabric8.openshift.api.model.BuildStatusOutput as model_BuildStatusOutput


fun  model_BuildConfigSpec.`output`(block: model_BuildOutput.() -> Unit = {}) {
  if(this.`output` == null) {
    this.`output` = model_BuildOutput()
  }

  this.`output`.block()
}


fun  model_BuildSpec.`output`(block: model_BuildOutput.() -> Unit = {}) {
  if(this.`output` == null) {
    this.`output` = model_BuildOutput()
  }

  this.`output`.block()
}


fun  model_BuildStatus.`output`(block: model_BuildStatusOutput.() -> Unit = {}) {
  if(this.`output` == null) {
    this.`output` = model_BuildStatusOutput()
  }

  this.`output`.block()
}


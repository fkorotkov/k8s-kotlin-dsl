// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BinaryBuildSource as model_BinaryBuildSource
import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.BuildSource as model_BuildSource


fun  model_BuildRequest.`binary`(block: model_BinaryBuildSource.() -> Unit = {}) {
  if(this.`binary` == null) {
    this.`binary` = model_BinaryBuildSource()
  }

  this.`binary`.block()
}


fun  model_BuildSource.`binary`(block: model_BinaryBuildSource.() -> Unit = {}) {
  if(this.`binary` == null) {
    this.`binary` = model_BinaryBuildSource()
  }

  this.`binary`.block()
}


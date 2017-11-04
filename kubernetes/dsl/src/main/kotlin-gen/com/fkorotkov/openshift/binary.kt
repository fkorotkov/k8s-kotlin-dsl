// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BinaryBuildSource
import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.BuildSource


fun  BuildRequest.`binary`(block: BinaryBuildSource.() -> Unit = {}) {
  if(this.`binary` == null) {
    this.`binary` = BinaryBuildSource()
  }

  this.`binary`.block()
}


fun  BuildSource.`binary`(block: BinaryBuildSource.() -> Unit = {}) {
  if(this.`binary` == null) {
    this.`binary` = BinaryBuildSource()
  }

  this.`binary`.block()
}


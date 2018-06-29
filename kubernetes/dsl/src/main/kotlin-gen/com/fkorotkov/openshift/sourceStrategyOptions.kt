// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.SourceStrategyOptions


fun  BuildRequest.`sourceStrategyOptions`(block: SourceStrategyOptions.() -> Unit = {}) {
  if(this.`sourceStrategyOptions` == null) {
    this.`sourceStrategyOptions` = SourceStrategyOptions()
  }

  this.`sourceStrategyOptions`.block()
}


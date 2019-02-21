// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.SourceStrategyOptions as model_SourceStrategyOptions


fun  model_BuildRequest.`sourceStrategyOptions`(block: model_SourceStrategyOptions.() -> Unit = {}) {
  if(this.`sourceStrategyOptions` == null) {
    this.`sourceStrategyOptions` = model_SourceStrategyOptions()
  }

  this.`sourceStrategyOptions`.block()
}


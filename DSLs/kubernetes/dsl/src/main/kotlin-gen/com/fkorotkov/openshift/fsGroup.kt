// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.FSGroupStrategyOptions as model_FSGroupStrategyOptions
import io.fabric8.openshift.api.model.SecurityContextConstraints as model_SecurityContextConstraints


fun  model_SecurityContextConstraints.`fsGroup`(block: model_FSGroupStrategyOptions.() -> Unit = {}) {
  if(this.`fsGroup` == null) {
    this.`fsGroup` = model_FSGroupStrategyOptions()
  }

  this.`fsGroup`.block()
}


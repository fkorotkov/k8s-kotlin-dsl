// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.SecurityContextConstraints


fun  SecurityContextConstraints.`fsGroup`(block: FSGroupStrategyOptions.() -> Unit = {}) {
  if(this.`fsGroup` == null) {
    this.`fsGroup` = FSGroupStrategyOptions()
  }

  this.`fsGroup`.block()
}


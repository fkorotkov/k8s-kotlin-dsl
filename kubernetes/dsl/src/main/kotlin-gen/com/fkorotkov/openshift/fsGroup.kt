// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.FSGroupStrategyOptions
import io.fabric8.openshift.api.model.SecurityContextConstraints


fun  SecurityContextConstraints.`fsGroup`(block: FSGroupStrategyOptions.() -> Unit = {}) {
  if(this.`fsGroup` == null) {
    this.`fsGroup` = FSGroupStrategyOptions()
  }

  this.`fsGroup`.block()
}


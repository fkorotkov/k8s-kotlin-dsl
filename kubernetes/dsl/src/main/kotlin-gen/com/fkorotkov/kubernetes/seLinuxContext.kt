// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.SELinuxContextStrategyOptions
import io.fabric8.kubernetes.api.model.SecurityContextConstraints


fun  SecurityContextConstraints.`seLinuxContext`(block: SELinuxContextStrategyOptions.() -> Unit = {}) {
  if(this.`seLinuxContext` == null) {
    this.`seLinuxContext` = SELinuxContextStrategyOptions()
  }

  this.`seLinuxContext`.block()
}


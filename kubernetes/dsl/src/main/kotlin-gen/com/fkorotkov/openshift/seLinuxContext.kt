// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions
import io.fabric8.openshift.api.model.SecurityContextConstraints


fun  SecurityContextConstraints.`seLinuxContext`(block: SELinuxContextStrategyOptions.() -> Unit = {}) {
  if(this.`seLinuxContext` == null) {
    this.`seLinuxContext` = SELinuxContextStrategyOptions()
  }

  this.`seLinuxContext`.block()
}


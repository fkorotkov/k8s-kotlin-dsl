// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions as model_SELinuxContextStrategyOptions
import io.fabric8.openshift.api.model.SecurityContextConstraints as model_SecurityContextConstraints


fun  model_SecurityContextConstraints.`seLinuxContext`(block: model_SELinuxContextStrategyOptions.() -> Unit = {}) {
  if(this.`seLinuxContext` == null) {
    this.`seLinuxContext` = model_SELinuxContextStrategyOptions()
  }

  this.`seLinuxContext`.block()
}


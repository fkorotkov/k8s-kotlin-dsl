// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.SELinuxOptions as model_SELinuxOptions
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions as model_SELinuxContextStrategyOptions


fun  model_SELinuxContextStrategyOptions.`seLinuxOptions`(block: model_SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = model_SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


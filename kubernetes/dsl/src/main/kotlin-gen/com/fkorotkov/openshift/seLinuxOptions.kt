// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.SELinuxOptions
import io.fabric8.openshift.api.model.SELinuxContextStrategyOptions


fun  SELinuxContextStrategyOptions.`seLinuxOptions`(block: SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


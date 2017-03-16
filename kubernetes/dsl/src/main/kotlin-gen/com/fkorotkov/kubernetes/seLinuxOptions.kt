// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSecurityContext
import io.fabric8.kubernetes.api.model.SELinuxContextStrategyOptions
import io.fabric8.kubernetes.api.model.SELinuxOptions
import io.fabric8.kubernetes.api.model.SecurityContext


fun  PodSecurityContext.`seLinuxOptions`(block: SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


fun  SELinuxContextStrategyOptions.`seLinuxOptions`(block: SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


fun  SecurityContext.`seLinuxOptions`(block: SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


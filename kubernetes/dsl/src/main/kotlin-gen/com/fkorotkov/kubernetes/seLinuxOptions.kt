// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSecurityContext
import io.fabric8.kubernetes.api.model.SELinuxOptions
import io.fabric8.kubernetes.api.model.SecurityContext
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions


fun  PodSecurityContext.`seLinuxOptions`(block: SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


fun  SELinuxStrategyOptions.`seLinuxOptions`(block: SELinuxOptions.() -> Unit = {}) {
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


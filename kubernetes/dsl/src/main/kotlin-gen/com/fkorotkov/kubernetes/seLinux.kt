// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions


fun  PodSecurityPolicySpec.`seLinux`(block: SELinuxStrategyOptions.() -> Unit = {}) {
  if(this.`seLinux` == null) {
    this.`seLinux` = SELinuxStrategyOptions()
  }

  this.`seLinux`.block()
}


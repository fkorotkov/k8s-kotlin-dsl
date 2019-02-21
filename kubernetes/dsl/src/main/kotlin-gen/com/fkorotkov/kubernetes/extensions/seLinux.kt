// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions as extensions_SELinuxStrategyOptions


fun  extensions_PodSecurityPolicySpec.`seLinux`(block: extensions_SELinuxStrategyOptions.() -> Unit = {}) {
  if(this.`seLinux` == null) {
    this.`seLinux` = extensions_SELinuxStrategyOptions()
  }

  this.`seLinux`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.SELinuxOptions as model_SELinuxOptions
import io.fabric8.kubernetes.api.model.policy.SELinuxStrategyOptions as policy_SELinuxStrategyOptions


fun  policy_SELinuxStrategyOptions.`seLinuxOptions`(block: model_SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = model_SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


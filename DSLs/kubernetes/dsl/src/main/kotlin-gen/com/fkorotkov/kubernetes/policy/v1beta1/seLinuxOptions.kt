// GENERATED
package com.fkorotkov.kubernetes.policy.v1beta1

import io.fabric8.kubernetes.api.model.SELinuxOptions as model_SELinuxOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.SELinuxStrategyOptions as v1beta1_SELinuxStrategyOptions


fun  v1beta1_SELinuxStrategyOptions.`seLinuxOptions`(block: model_SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = model_SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


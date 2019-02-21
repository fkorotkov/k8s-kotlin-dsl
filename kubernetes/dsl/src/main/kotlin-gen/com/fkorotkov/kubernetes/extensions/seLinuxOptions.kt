// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.SELinuxOptions as model_SELinuxOptions
import io.fabric8.kubernetes.api.model.extensions.SELinuxStrategyOptions as extensions_SELinuxStrategyOptions


fun  extensions_SELinuxStrategyOptions.`seLinuxOptions`(block: model_SELinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = model_SELinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


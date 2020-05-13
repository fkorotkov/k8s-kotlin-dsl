// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec as extensions_DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy as extensions_DaemonSetUpdateStrategy


fun  extensions_DaemonSetSpec.`updateStrategy`(block: extensions_DaemonSetUpdateStrategy.() -> Unit = {}) {
  if(this.`updateStrategy` == null) {
    this.`updateStrategy` = extensions_DaemonSetUpdateStrategy()
  }

  this.`updateStrategy`.block()
}


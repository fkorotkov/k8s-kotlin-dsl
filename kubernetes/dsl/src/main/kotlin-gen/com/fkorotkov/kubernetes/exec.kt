// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExecAction
import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Probe


fun  Handler.`exec`(block: ExecAction.() -> Unit = {}) {
  if(this.`exec` == null) {
    this.`exec` = ExecAction()
  }

  this.`exec`.block()
}


fun  Probe.`exec`(block: ExecAction.() -> Unit = {}) {
  if(this.`exec` == null) {
    this.`exec` = ExecAction()
  }

  this.`exec`.block()
}


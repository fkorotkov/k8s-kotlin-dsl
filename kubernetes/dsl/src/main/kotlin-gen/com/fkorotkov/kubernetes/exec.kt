// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.ExecAction
import io.fabric8.kubernetes.api.model.ExecConfig
import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Probe


fun  AuthInfo.`exec`(block: ExecConfig.() -> Unit = {}) {
  if(this.`exec` == null) {
    this.`exec` = ExecConfig()
  }

  this.`exec`.block()
}


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


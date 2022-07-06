// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.ExecAction as model_ExecAction
import io.fabric8.kubernetes.api.model.ExecConfig as model_ExecConfig
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.Probe as model_Probe


fun  model_AuthInfo.`exec`(block: model_ExecConfig.() -> Unit = {}) {
  if(this.`exec` == null) {
    this.`exec` = model_ExecConfig()
  }

  this.`exec`.block()
}


fun  model_LifecycleHandler.`exec`(block: model_ExecAction.() -> Unit = {}) {
  if(this.`exec` == null) {
    this.`exec` = model_ExecAction()
  }

  this.`exec`.block()
}


fun  model_Probe.`exec`(block: model_ExecAction.() -> Unit = {}) {
  if(this.`exec` == null) {
    this.`exec` = model_ExecAction()
  }

  this.`exec`.block()
}


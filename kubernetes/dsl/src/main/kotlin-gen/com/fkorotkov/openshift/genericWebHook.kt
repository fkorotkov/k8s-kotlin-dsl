// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause as model_BuildTriggerCause
import io.fabric8.openshift.api.model.GenericWebHookCause as model_GenericWebHookCause


fun  model_BuildTriggerCause.`genericWebHook`(block: model_GenericWebHookCause.() -> Unit = {}) {
  if(this.`genericWebHook` == null) {
    this.`genericWebHook` = model_GenericWebHookCause()
  }

  this.`genericWebHook`.block()
}


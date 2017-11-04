// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause
import io.fabric8.openshift.api.model.GenericWebHookCause


fun  BuildTriggerCause.`genericWebHook`(block: GenericWebHookCause.() -> Unit = {}) {
  if(this.`genericWebHook` == null) {
    this.`genericWebHook` = GenericWebHookCause()
  }

  this.`genericWebHook`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy
import io.fabric8.openshift.api.model.WebHookTrigger


fun  BuildTriggerPolicy.`github`(block: WebHookTrigger.() -> Unit = {}) {
  if(this.`github` == null) {
    this.`github` = WebHookTrigger()
  }

  this.`github`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy
import io.fabric8.openshift.api.model.WebHookTrigger


fun  BuildTriggerPolicy.`generic`(block: WebHookTrigger.() -> Unit = {}) {
  if(this.`generic` == null) {
    this.`generic` = WebHookTrigger()
  }

  this.`generic`.block()
}


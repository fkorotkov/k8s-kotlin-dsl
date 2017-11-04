// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy
import io.fabric8.openshift.api.model.WebHookTrigger


fun  BuildTriggerPolicy.`gitlab`(block: WebHookTrigger.() -> Unit = {}) {
  if(this.`gitlab` == null) {
    this.`gitlab` = WebHookTrigger()
  }

  this.`gitlab`.block()
}


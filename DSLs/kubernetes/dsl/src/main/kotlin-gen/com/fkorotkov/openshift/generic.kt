// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy as model_BuildTriggerPolicy
import io.fabric8.openshift.api.model.WebHookTrigger as model_WebHookTrigger


fun  model_BuildTriggerPolicy.`generic`(block: model_WebHookTrigger.() -> Unit = {}) {
  if(this.`generic` == null) {
    this.`generic` = model_WebHookTrigger()
  }

  this.`generic`.block()
}


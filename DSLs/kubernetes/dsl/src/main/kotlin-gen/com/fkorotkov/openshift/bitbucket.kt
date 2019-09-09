// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy as model_BuildTriggerPolicy
import io.fabric8.openshift.api.model.WebHookTrigger as model_WebHookTrigger


fun  model_BuildTriggerPolicy.`bitbucket`(block: model_WebHookTrigger.() -> Unit = {}) {
  if(this.`bitbucket` == null) {
    this.`bitbucket` = model_WebHookTrigger()
  }

  this.`bitbucket`.block()
}


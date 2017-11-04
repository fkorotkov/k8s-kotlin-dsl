// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy
import io.fabric8.openshift.api.model.WebHookTrigger


fun  BuildTriggerPolicy.`bitbucket`(block: WebHookTrigger.() -> Unit = {}) {
  if(this.`bitbucket` == null) {
    this.`bitbucket` = WebHookTrigger()
  }

  this.`bitbucket`.block()
}


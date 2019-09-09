// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause as model_BuildTriggerCause
import io.fabric8.openshift.api.model.GitLabWebHookCause as model_GitLabWebHookCause


fun  model_BuildTriggerCause.`gitlabWebHook`(block: model_GitLabWebHookCause.() -> Unit = {}) {
  if(this.`gitlabWebHook` == null) {
    this.`gitlabWebHook` = model_GitLabWebHookCause()
  }

  this.`gitlabWebHook`.block()
}


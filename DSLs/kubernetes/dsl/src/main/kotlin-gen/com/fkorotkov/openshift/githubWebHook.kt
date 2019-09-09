// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause as model_BuildTriggerCause
import io.fabric8.openshift.api.model.GitHubWebHookCause as model_GitHubWebHookCause


fun  model_BuildTriggerCause.`githubWebHook`(block: model_GitHubWebHookCause.() -> Unit = {}) {
  if(this.`githubWebHook` == null) {
    this.`githubWebHook` = model_GitHubWebHookCause()
  }

  this.`githubWebHook`.block()
}


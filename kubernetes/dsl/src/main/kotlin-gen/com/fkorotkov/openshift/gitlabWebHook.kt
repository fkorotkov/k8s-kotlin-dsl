// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause
import io.fabric8.openshift.api.model.GitLabWebHookCause


fun  BuildTriggerCause.`gitlabWebHook`(block: GitLabWebHookCause.() -> Unit = {}) {
  if(this.`gitlabWebHook` == null) {
    this.`gitlabWebHook` = GitLabWebHookCause()
  }

  this.`gitlabWebHook`.block()
}


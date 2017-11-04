// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause
import io.fabric8.openshift.api.model.GitHubWebHookCause


fun  BuildTriggerCause.`githubWebHook`(block: GitHubWebHookCause.() -> Unit = {}) {
  if(this.`githubWebHook` == null) {
    this.`githubWebHook` = GitHubWebHookCause()
  }

  this.`githubWebHook`.block()
}


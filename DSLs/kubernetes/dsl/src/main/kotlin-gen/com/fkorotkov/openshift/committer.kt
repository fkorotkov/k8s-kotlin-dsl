// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GitSourceRevision as model_GitSourceRevision
import io.fabric8.openshift.api.model.SourceControlUser as model_SourceControlUser


fun  model_GitSourceRevision.`committer`(block: model_SourceControlUser.() -> Unit = {}) {
  if(this.`committer` == null) {
    this.`committer` = model_SourceControlUser()
  }

  this.`committer`.block()
}


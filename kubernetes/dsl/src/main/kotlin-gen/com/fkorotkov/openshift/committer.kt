// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GitSourceRevision
import io.fabric8.openshift.api.model.SourceControlUser


fun  GitSourceRevision.`committer`(block: SourceControlUser.() -> Unit = {}) {
  if(this.`committer` == null) {
    this.`committer` = SourceControlUser()
  }

  this.`committer`.block()
}


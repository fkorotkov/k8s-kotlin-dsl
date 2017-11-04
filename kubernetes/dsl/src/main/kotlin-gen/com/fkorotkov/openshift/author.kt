// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GitSourceRevision
import io.fabric8.openshift.api.model.SourceControlUser


fun  GitSourceRevision.`author`(block: SourceControlUser.() -> Unit = {}) {
  if(this.`author` == null) {
    this.`author` = SourceControlUser()
  }

  this.`author`.block()
}


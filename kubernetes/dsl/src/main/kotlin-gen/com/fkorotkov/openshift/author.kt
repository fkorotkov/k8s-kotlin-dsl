// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GitSourceRevision as model_GitSourceRevision
import io.fabric8.openshift.api.model.SourceControlUser as model_SourceControlUser


fun  model_GitSourceRevision.`author`(block: model_SourceControlUser.() -> Unit = {}) {
  if(this.`author` == null) {
    this.`author` = model_SourceControlUser()
  }

  this.`author`.block()
}


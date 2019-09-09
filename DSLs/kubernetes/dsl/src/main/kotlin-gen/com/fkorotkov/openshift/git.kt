// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildSource as model_BuildSource
import io.fabric8.openshift.api.model.GitBuildSource as model_GitBuildSource
import io.fabric8.openshift.api.model.GitSourceRevision as model_GitSourceRevision
import io.fabric8.openshift.api.model.SourceRevision as model_SourceRevision


fun  model_BuildSource.`git`(block: model_GitBuildSource.() -> Unit = {}) {
  if(this.`git` == null) {
    this.`git` = model_GitBuildSource()
  }

  this.`git`.block()
}


fun  model_SourceRevision.`git`(block: model_GitSourceRevision.() -> Unit = {}) {
  if(this.`git` == null) {
    this.`git` = model_GitSourceRevision()
  }

  this.`git`.block()
}


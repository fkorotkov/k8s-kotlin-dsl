// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildSource
import io.fabric8.openshift.api.model.GitBuildSource
import io.fabric8.openshift.api.model.GitSourceRevision
import io.fabric8.openshift.api.model.SourceRevision


fun  BuildSource.`git`(block: GitBuildSource.() -> Unit = {}) {
  if(this.`git` == null) {
    this.`git` = GitBuildSource()
  }

  this.`git`.block()
}


fun  SourceRevision.`git`(block: GitSourceRevision.() -> Unit = {}) {
  if(this.`git` == null) {
    this.`git` = GitSourceRevision()
  }

  this.`git`.block()
}


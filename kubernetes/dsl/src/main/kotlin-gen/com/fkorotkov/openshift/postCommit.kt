// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildPostCommitSpec
import io.fabric8.openshift.api.model.BuildSpec


fun  BuildConfigSpec.`postCommit`(block: BuildPostCommitSpec.() -> Unit = {}) {
  if(this.`postCommit` == null) {
    this.`postCommit` = BuildPostCommitSpec()
  }

  this.`postCommit`.block()
}


fun  BuildSpec.`postCommit`(block: BuildPostCommitSpec.() -> Unit = {}) {
  if(this.`postCommit` == null) {
    this.`postCommit` = BuildPostCommitSpec()
  }

  this.`postCommit`.block()
}


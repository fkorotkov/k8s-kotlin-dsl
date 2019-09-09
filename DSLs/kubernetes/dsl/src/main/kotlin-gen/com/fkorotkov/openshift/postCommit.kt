// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildPostCommitSpec as model_BuildPostCommitSpec
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec


fun  model_BuildConfigSpec.`postCommit`(block: model_BuildPostCommitSpec.() -> Unit = {}) {
  if(this.`postCommit` == null) {
    this.`postCommit` = model_BuildPostCommitSpec()
  }

  this.`postCommit`.block()
}


fun  model_BuildSpec.`postCommit`(block: model_BuildPostCommitSpec.() -> Unit = {}) {
  if(this.`postCommit` == null) {
    this.`postCommit` = model_BuildPostCommitSpec()
  }

  this.`postCommit`.block()
}


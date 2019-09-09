// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BitbucketWebHookCause as model_BitbucketWebHookCause
import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.GenericWebHookCause as model_GenericWebHookCause
import io.fabric8.openshift.api.model.GitHubWebHookCause as model_GitHubWebHookCause
import io.fabric8.openshift.api.model.GitLabWebHookCause as model_GitLabWebHookCause
import io.fabric8.openshift.api.model.SourceRevision as model_SourceRevision


fun  model_BitbucketWebHookCause.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


fun  model_BuildConfigSpec.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


fun  model_BuildRequest.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


fun  model_BuildSpec.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


fun  model_GenericWebHookCause.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


fun  model_GitHubWebHookCause.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


fun  model_GitLabWebHookCause.`revision`(block: model_SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = model_SourceRevision()
  }

  this.`revision`.block()
}


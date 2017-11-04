// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BitbucketWebHookCause
import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.BuildSpec
import io.fabric8.openshift.api.model.GenericWebHookCause
import io.fabric8.openshift.api.model.GitHubWebHookCause
import io.fabric8.openshift.api.model.GitLabWebHookCause
import io.fabric8.openshift.api.model.SourceRevision


fun  BitbucketWebHookCause.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


fun  BuildConfigSpec.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


fun  BuildRequest.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


fun  BuildSpec.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


fun  GenericWebHookCause.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


fun  GitHubWebHookCause.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


fun  GitLabWebHookCause.`revision`(block: SourceRevision.() -> Unit = {}) {
  if(this.`revision` == null) {
    this.`revision` = SourceRevision()
  }

  this.`revision`.block()
}


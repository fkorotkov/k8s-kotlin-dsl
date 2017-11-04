// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.CustomBuildStrategy
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams
import io.fabric8.openshift.api.model.DockerBuildStrategy
import io.fabric8.openshift.api.model.ImageChangeTrigger
import io.fabric8.openshift.api.model.ImageSource
import io.fabric8.openshift.api.model.SourceBuildStrategy
import io.fabric8.openshift.api.model.TagReference


fun  BuildRequest.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  CustomBuildStrategy.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  DeploymentCauseImageTrigger.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  DeploymentTriggerImageChangeParams.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  DockerBuildStrategy.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  ImageChangeTrigger.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  ImageSource.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  SourceBuildStrategy.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


fun  TagReference.`from`(block: ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = ObjectReference()
  }

  this.`from`.block()
}


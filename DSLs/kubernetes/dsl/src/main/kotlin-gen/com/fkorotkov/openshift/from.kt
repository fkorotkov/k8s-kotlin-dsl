// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.CustomBuildStrategy as model_CustomBuildStrategy
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger as model_DeploymentCauseImageTrigger
import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams as model_DeploymentTriggerImageChangeParams
import io.fabric8.openshift.api.model.DockerBuildStrategy as model_DockerBuildStrategy
import io.fabric8.openshift.api.model.ImageChangeTrigger as model_ImageChangeTrigger
import io.fabric8.openshift.api.model.ImageImportSpec as model_ImageImportSpec
import io.fabric8.openshift.api.model.ImageSource as model_ImageSource
import io.fabric8.openshift.api.model.RepositoryImportSpec as model_RepositoryImportSpec
import io.fabric8.openshift.api.model.SourceBuildStrategy as model_SourceBuildStrategy
import io.fabric8.openshift.api.model.TagReference as model_TagReference


fun  model_BuildRequest.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_CustomBuildStrategy.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_DeploymentCauseImageTrigger.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_DeploymentTriggerImageChangeParams.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_DockerBuildStrategy.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_ImageChangeTrigger.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_ImageImportSpec.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_ImageSource.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_RepositoryImportSpec.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_SourceBuildStrategy.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


fun  model_TagReference.`from`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`from` == null) {
    this.`from` = model_ObjectReference()
  }

  this.`from`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.CustomBuildStrategy as model_CustomBuildStrategy
import io.fabric8.openshift.api.model.DockerBuildStrategy as model_DockerBuildStrategy
import io.fabric8.openshift.api.model.ImageSource as model_ImageSource
import io.fabric8.openshift.api.model.SourceBuildStrategy as model_SourceBuildStrategy


fun  model_CustomBuildStrategy.`pullSecret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = model_LocalObjectReference()
  }

  this.`pullSecret`.block()
}


fun  model_DockerBuildStrategy.`pullSecret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = model_LocalObjectReference()
  }

  this.`pullSecret`.block()
}


fun  model_ImageSource.`pullSecret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = model_LocalObjectReference()
  }

  this.`pullSecret`.block()
}


fun  model_SourceBuildStrategy.`pullSecret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = model_LocalObjectReference()
  }

  this.`pullSecret`.block()
}


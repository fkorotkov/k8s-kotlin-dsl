// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.openshift.api.model.CustomBuildStrategy
import io.fabric8.openshift.api.model.DockerBuildStrategy
import io.fabric8.openshift.api.model.ImageSource
import io.fabric8.openshift.api.model.SourceBuildStrategy


fun  CustomBuildStrategy.`pullSecret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = LocalObjectReference()
  }

  this.`pullSecret`.block()
}


fun  DockerBuildStrategy.`pullSecret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = LocalObjectReference()
  }

  this.`pullSecret`.block()
}


fun  ImageSource.`pullSecret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = LocalObjectReference()
  }

  this.`pullSecret`.block()
}


fun  SourceBuildStrategy.`pullSecret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`pullSecret` == null) {
    this.`pullSecret` = LocalObjectReference()
  }

  this.`pullSecret`.block()
}


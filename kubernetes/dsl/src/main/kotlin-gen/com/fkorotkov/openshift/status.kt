// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.Status
import io.fabric8.openshift.api.model.Build
import io.fabric8.openshift.api.model.BuildConfig
import io.fabric8.openshift.api.model.BuildConfigStatus
import io.fabric8.openshift.api.model.BuildStatus
import io.fabric8.openshift.api.model.DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigStatus
import io.fabric8.openshift.api.model.ImageImportStatus
import io.fabric8.openshift.api.model.ImageStream
import io.fabric8.openshift.api.model.ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportStatus
import io.fabric8.openshift.api.model.ImageStreamStatus
import io.fabric8.openshift.api.model.Project
import io.fabric8.openshift.api.model.ProjectStatus
import io.fabric8.openshift.api.model.RepositoryImportStatus
import io.fabric8.openshift.api.model.Route
import io.fabric8.openshift.api.model.RouteStatus


fun  Build.`status`(block: BuildStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = BuildStatus()
  }

  this.`status`.block()
}


fun  BuildConfig.`status`(block: BuildConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = BuildConfigStatus()
  }

  this.`status`.block()
}


fun  DeploymentConfig.`status`(block: DeploymentConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = DeploymentConfigStatus()
  }

  this.`status`.block()
}


fun  ImageImportStatus.`status`(block: Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = Status()
  }

  this.`status`.block()
}


fun  ImageStream.`status`(block: ImageStreamStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ImageStreamStatus()
  }

  this.`status`.block()
}


fun  ImageStreamImport.`status`(block: ImageStreamImportStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ImageStreamImportStatus()
  }

  this.`status`.block()
}


fun  Project.`status`(block: ProjectStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = ProjectStatus()
  }

  this.`status`.block()
}


fun  RepositoryImportStatus.`status`(block: Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = Status()
  }

  this.`status`.block()
}


fun  Route.`status`(block: RouteStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = RouteStatus()
  }

  this.`status`.block()
}


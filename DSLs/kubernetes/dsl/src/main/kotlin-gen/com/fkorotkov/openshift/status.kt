// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigStatus as model_BuildConfigStatus
import io.fabric8.openshift.api.model.BuildStatus as model_BuildStatus
import io.fabric8.openshift.api.model.ClusterVersion as model_ClusterVersion
import io.fabric8.openshift.api.model.ClusterVersionStatus as model_ClusterVersionStatus
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigStatus as model_DeploymentConfigStatus
import io.fabric8.openshift.api.model.ImageImportStatus as model_ImageImportStatus
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportStatus as model_ImageStreamImportStatus
import io.fabric8.openshift.api.model.ImageStreamStatus as model_ImageStreamStatus
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectStatus as model_ProjectStatus
import io.fabric8.openshift.api.model.RepositoryImportStatus as model_RepositoryImportStatus
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteStatus as model_RouteStatus


fun  model_Build.`status`(block: model_BuildStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_BuildStatus()
  }

  this.`status`.block()
}


fun  model_BuildConfig.`status`(block: model_BuildConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_BuildConfigStatus()
  }

  this.`status`.block()
}


fun  model_ClusterVersion.`status`(block: model_ClusterVersionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ClusterVersionStatus()
  }

  this.`status`.block()
}


fun  model_DeploymentConfig.`status`(block: model_DeploymentConfigStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_DeploymentConfigStatus()
  }

  this.`status`.block()
}


fun  model_ImageImportStatus.`status`(block: model_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_Status()
  }

  this.`status`.block()
}


fun  model_ImageStream.`status`(block: model_ImageStreamStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ImageStreamStatus()
  }

  this.`status`.block()
}


fun  model_ImageStreamImport.`status`(block: model_ImageStreamImportStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ImageStreamImportStatus()
  }

  this.`status`.block()
}


fun  model_Project.`status`(block: model_ProjectStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_ProjectStatus()
  }

  this.`status`.block()
}


fun  model_RepositoryImportStatus.`status`(block: model_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_Status()
  }

  this.`status`.block()
}


fun  model_Route.`status`(block: model_RouteStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_RouteStatus()
  }

  this.`status`.block()
}


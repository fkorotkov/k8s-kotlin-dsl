// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Build
import io.fabric8.openshift.api.model.BuildConfig
import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec
import io.fabric8.openshift.api.model.DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigSpec
import io.fabric8.openshift.api.model.ImageStream
import io.fabric8.openshift.api.model.ImageStreamSpec
import io.fabric8.openshift.api.model.Project
import io.fabric8.openshift.api.model.ProjectSpec
import io.fabric8.openshift.api.model.RoleBindingRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.Route
import io.fabric8.openshift.api.model.RouteSpec


fun  Build.`spec`(block: BuildSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = BuildSpec()
  }

  this.`spec`.block()
}


fun  BuildConfig.`spec`(block: BuildConfigSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = BuildConfigSpec()
  }

  this.`spec`.block()
}


fun  DeploymentConfig.`spec`(block: DeploymentConfigSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = DeploymentConfigSpec()
  }

  this.`spec`.block()
}


fun  ImageStream.`spec`(block: ImageStreamSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ImageStreamSpec()
  }

  this.`spec`.block()
}


fun  Project.`spec`(block: ProjectSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = ProjectSpec()
  }

  this.`spec`.block()
}


fun  RoleBindingRestriction.`spec`(block: RoleBindingRestrictionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = RoleBindingRestrictionSpec()
  }

  this.`spec`.block()
}


fun  Route.`spec`(block: RouteSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = RouteSpec()
  }

  this.`spec`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigSpec as model_DeploymentConfigSpec
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamImportSpec as model_ImageStreamImportSpec
import io.fabric8.openshift.api.model.ImageStreamSpec as model_ImageStreamSpec
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestriction as model_OpenshiftRoleBindingRestriction
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec as model_OpenshiftRoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectSpec as model_ProjectSpec
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteSpec as model_RouteSpec


fun  model_Build.`spec`(block: model_BuildSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_BuildSpec()
  }

  this.`spec`.block()
}


fun  model_BuildConfig.`spec`(block: model_BuildConfigSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_BuildConfigSpec()
  }

  this.`spec`.block()
}


fun  model_DeploymentConfig.`spec`(block: model_DeploymentConfigSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_DeploymentConfigSpec()
  }

  this.`spec`.block()
}


fun  model_ImageStream.`spec`(block: model_ImageStreamSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ImageStreamSpec()
  }

  this.`spec`.block()
}


fun  model_ImageStreamImport.`spec`(block: model_ImageStreamImportSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ImageStreamImportSpec()
  }

  this.`spec`.block()
}


fun  model_OpenshiftRoleBindingRestriction.`spec`(block: model_OpenshiftRoleBindingRestrictionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_OpenshiftRoleBindingRestrictionSpec()
  }

  this.`spec`.block()
}


fun  model_Project.`spec`(block: model_ProjectSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_ProjectSpec()
  }

  this.`spec`.block()
}


fun  model_Route.`spec`(block: model_RouteSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = model_RouteSpec()
  }

  this.`spec`.block()
}


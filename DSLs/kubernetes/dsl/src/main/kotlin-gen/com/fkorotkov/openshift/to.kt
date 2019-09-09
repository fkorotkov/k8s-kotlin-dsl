// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.BuildOutput as model_BuildOutput
import io.fabric8.openshift.api.model.BuildStatusOutput as model_BuildStatusOutput
import io.fabric8.openshift.api.model.BuildStatusOutputTo as model_BuildStatusOutputTo
import io.fabric8.openshift.api.model.ImageImportSpec as model_ImageImportSpec
import io.fabric8.openshift.api.model.RouteSpec as model_RouteSpec
import io.fabric8.openshift.api.model.RouteTargetReference as model_RouteTargetReference
import io.fabric8.openshift.api.model.TagImageHook as model_TagImageHook


fun  model_BuildOutput.`to`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = model_ObjectReference()
  }

  this.`to`.block()
}


fun  model_BuildStatusOutput.`to`(block: model_BuildStatusOutputTo.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = model_BuildStatusOutputTo()
  }

  this.`to`.block()
}


fun  model_ImageImportSpec.`to`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = model_LocalObjectReference()
  }

  this.`to`.block()
}


fun  model_RouteSpec.`to`(block: model_RouteTargetReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = model_RouteTargetReference()
  }

  this.`to`.block()
}


fun  model_TagImageHook.`to`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = model_ObjectReference()
  }

  this.`to`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.BuildOutput
import io.fabric8.openshift.api.model.BuildStatusOutput
import io.fabric8.openshift.api.model.BuildStatusOutputTo
import io.fabric8.openshift.api.model.RouteSpec
import io.fabric8.openshift.api.model.RouteTargetReference
import io.fabric8.openshift.api.model.TagImageHook


fun  BuildOutput.`to`(block: ObjectReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = ObjectReference()
  }

  this.`to`.block()
}


fun  BuildStatusOutput.`to`(block: BuildStatusOutputTo.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = BuildStatusOutputTo()
  }

  this.`to`.block()
}


fun  RouteSpec.`to`(block: RouteTargetReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = RouteTargetReference()
  }

  this.`to`.block()
}


fun  TagImageHook.`to`(block: ObjectReference.() -> Unit = {}) {
  if(this.`to` == null) {
    this.`to` = ObjectReference()
  }

  this.`to`.block()
}


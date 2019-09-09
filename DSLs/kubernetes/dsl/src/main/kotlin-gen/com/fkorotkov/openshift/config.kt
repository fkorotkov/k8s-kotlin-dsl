// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.BuildStatus as model_BuildStatus


fun  model_BuildStatus.`config`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`config` == null) {
    this.`config` = model_ObjectReference()
  }

  this.`config`.block()
}


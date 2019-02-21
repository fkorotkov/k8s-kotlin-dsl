// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest


fun  model_BuildRequest.`triggeredByImage`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`triggeredByImage` == null) {
    this.`triggeredByImage` = model_ObjectReference()
  }

  this.`triggeredByImage`.block()
}


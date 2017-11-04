// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.BuildRequest


fun  BuildRequest.`triggeredByImage`(block: ObjectReference.() -> Unit = {}) {
  if(this.`triggeredByImage` == null) {
    this.`triggeredByImage` = ObjectReference()
  }

  this.`triggeredByImage`.block()
}


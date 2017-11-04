// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.BuildStatus


fun  BuildStatus.`config`(block: ObjectReference.() -> Unit = {}) {
  if(this.`config` == null) {
    this.`config` = ObjectReference()
  }

  this.`config`.block()
}


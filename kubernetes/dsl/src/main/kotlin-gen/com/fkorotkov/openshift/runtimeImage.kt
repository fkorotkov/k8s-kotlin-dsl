// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.SourceBuildStrategy


fun  SourceBuildStrategy.`runtimeImage`(block: ObjectReference.() -> Unit = {}) {
  if(this.`runtimeImage` == null) {
    this.`runtimeImage` = ObjectReference()
  }

  this.`runtimeImage`.block()
}


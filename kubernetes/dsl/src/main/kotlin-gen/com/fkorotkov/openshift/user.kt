// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.Identity


fun  Identity.`user`(block: ObjectReference.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = ObjectReference()
  }

  this.`user`.block()
}


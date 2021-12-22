// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.Identity as model_Identity
import io.fabric8.openshift.api.model.UserIdentityMapping as model_UserIdentityMapping


fun  model_Identity.`user`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = model_ObjectReference()
  }

  this.`user`.block()
}


fun  model_UserIdentityMapping.`user`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = model_ObjectReference()
  }

  this.`user`.block()
}


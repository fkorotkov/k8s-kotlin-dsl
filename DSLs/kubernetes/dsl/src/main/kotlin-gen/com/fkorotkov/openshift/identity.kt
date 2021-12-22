// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.UserIdentityMapping as model_UserIdentityMapping


fun  model_UserIdentityMapping.`identity`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`identity` == null) {
    this.`identity` = model_ObjectReference()
  }

  this.`identity`.block()
}


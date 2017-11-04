// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.ImageChangeCause


fun  ImageChangeCause.`fromRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`fromRef` == null) {
    this.`fromRef` = ObjectReference()
  }

  this.`fromRef`.block()
}


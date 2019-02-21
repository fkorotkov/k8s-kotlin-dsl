// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.ImageChangeCause as model_ImageChangeCause


fun  model_ImageChangeCause.`fromRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`fromRef` == null) {
    this.`fromRef` = model_ObjectReference()
  }

  this.`fromRef`.block()
}


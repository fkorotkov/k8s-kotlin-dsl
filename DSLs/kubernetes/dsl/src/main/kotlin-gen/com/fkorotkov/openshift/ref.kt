// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.TemplateInstanceObject as model_TemplateInstanceObject


fun  model_TemplateInstanceObject.`ref`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`ref` == null) {
    this.`ref` = model_ObjectReference()
  }

  this.`ref`.block()
}


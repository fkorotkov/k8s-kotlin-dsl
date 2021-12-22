// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.BrokerTemplateInstanceSpec as model_BrokerTemplateInstanceSpec


fun  model_BrokerTemplateInstanceSpec.`templateInstance`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`templateInstance` == null) {
    this.`templateInstance` = model_ObjectReference()
  }

  this.`templateInstance`.block()
}


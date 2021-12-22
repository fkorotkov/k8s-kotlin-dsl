// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.TemplateInstanceRequester as model_TemplateInstanceRequester
import io.fabric8.openshift.api.model.TemplateInstanceSpec as model_TemplateInstanceSpec


fun  model_TemplateInstanceSpec.`requester`(block: model_TemplateInstanceRequester.() -> Unit = {}) {
  if(this.`requester` == null) {
    this.`requester` = model_TemplateInstanceRequester()
  }

  this.`requester`.block()
}


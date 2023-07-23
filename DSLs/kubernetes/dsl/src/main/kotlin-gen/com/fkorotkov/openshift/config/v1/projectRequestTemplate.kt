// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ProjectSpec as v1_ProjectSpec
import io.fabric8.openshift.api.model.config.v1.TemplateReference as v1_TemplateReference


fun  v1_ProjectSpec.`projectRequestTemplate`(block: v1_TemplateReference.() -> Unit = {}) {
  if(this.`projectRequestTemplate` == null) {
    this.`projectRequestTemplate` = v1_TemplateReference()
  }

  this.`projectRequestTemplate`.block()
}


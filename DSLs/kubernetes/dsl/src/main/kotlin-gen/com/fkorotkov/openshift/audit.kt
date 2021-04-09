// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec
import io.fabric8.openshift.api.model.Audit as model_Audit


fun  model_APIServerSpec.`audit`(block: model_Audit.() -> Unit = {}) {
  if(this.`audit` == null) {
    this.`audit` = model_Audit()
  }

  this.`audit`.block()
}


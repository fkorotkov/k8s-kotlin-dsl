// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec
import io.fabric8.openshift.api.model.config.v1.Audit as v1_Audit


fun  v1_APIServerSpec.`audit`(block: v1_Audit.() -> Unit = {}) {
  if(this.`audit` == null) {
    this.`audit` = v1_Audit()
  }

  this.`audit`.block()
}


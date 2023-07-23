// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServerServingCerts as v1_APIServerServingCerts
import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec


fun  v1_APIServerSpec.`servingCerts`(block: v1_APIServerServingCerts.() -> Unit = {}) {
  if(this.`servingCerts` == null) {
    this.`servingCerts` = v1_APIServerServingCerts()
  }

  this.`servingCerts`.block()
}


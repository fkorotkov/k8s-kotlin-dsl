// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServerServingCerts as model_APIServerServingCerts
import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec


fun  model_APIServerSpec.`servingCerts`(block: model_APIServerServingCerts.() -> Unit = {}) {
  if(this.`servingCerts` == null) {
    this.`servingCerts` = model_APIServerServingCerts()
  }

  this.`servingCerts`.block()
}


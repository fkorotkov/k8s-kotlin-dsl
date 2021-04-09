// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServerEncryption as model_APIServerEncryption
import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec


fun  model_APIServerSpec.`encryption`(block: model_APIServerEncryption.() -> Unit = {}) {
  if(this.`encryption` == null) {
    this.`encryption` = model_APIServerEncryption()
  }

  this.`encryption`.block()
}


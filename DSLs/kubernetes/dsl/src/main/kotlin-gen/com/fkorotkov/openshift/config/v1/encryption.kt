// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServerEncryption as v1_APIServerEncryption
import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec


fun  v1_APIServerSpec.`encryption`(block: v1_APIServerEncryption.() -> Unit = {}) {
  if(this.`encryption` == null) {
    this.`encryption` = v1_APIServerEncryption()
  }

  this.`encryption`.block()
}


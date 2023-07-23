// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ComponentRouteSpec as v1_ComponentRouteSpec
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_ComponentRouteSpec.`servingCertKeyPairSecret`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`servingCertKeyPairSecret` == null) {
    this.`servingCertKeyPairSecret` = v1_SecretNameReference()
  }

  this.`servingCertKeyPairSecret`.block()
}


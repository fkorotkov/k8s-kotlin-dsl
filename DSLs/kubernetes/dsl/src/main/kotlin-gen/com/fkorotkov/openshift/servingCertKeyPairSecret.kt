// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ComponentRouteSpec as model_ComponentRouteSpec
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_ComponentRouteSpec.`servingCertKeyPairSecret`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`servingCertKeyPairSecret` == null) {
    this.`servingCertKeyPairSecret` = model_SecretNameReference()
  }

  this.`servingCertKeyPairSecret`.block()
}


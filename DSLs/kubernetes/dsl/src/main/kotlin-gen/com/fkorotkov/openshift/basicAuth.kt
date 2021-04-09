// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BasicAuthIdentityProvider as model_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider


fun  model_IdentityProvider.`basicAuth`(block: model_BasicAuthIdentityProvider.() -> Unit = {}) {
  if(this.`basicAuth` == null) {
    this.`basicAuth` = model_BasicAuthIdentityProvider()
  }

  this.`basicAuth`.block()
}


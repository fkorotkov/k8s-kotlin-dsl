// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GoogleIdentityProvider as model_GoogleIdentityProvider
import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider


fun  model_IdentityProvider.`google`(block: model_GoogleIdentityProvider.() -> Unit = {}) {
  if(this.`google` == null) {
    this.`google` = model_GoogleIdentityProvider()
  }

  this.`google`.block()
}


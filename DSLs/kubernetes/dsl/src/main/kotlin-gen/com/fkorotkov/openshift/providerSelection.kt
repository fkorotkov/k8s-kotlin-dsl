// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthTemplates as model_OAuthTemplates
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_OAuthTemplates.`providerSelection`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`providerSelection` == null) {
    this.`providerSelection` = model_SecretNameReference()
  }

  this.`providerSelection`.block()
}


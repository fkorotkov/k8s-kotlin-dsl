// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OAuthTemplates as v1_OAuthTemplates
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_OAuthTemplates.`providerSelection`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`providerSelection` == null) {
    this.`providerSelection` = v1_SecretNameReference()
  }

  this.`providerSelection`.block()
}


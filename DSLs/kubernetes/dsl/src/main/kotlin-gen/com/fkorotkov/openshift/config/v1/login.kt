// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OAuthTemplates as v1_OAuthTemplates
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_OAuthTemplates.`login`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`login` == null) {
    this.`login` = v1_SecretNameReference()
  }

  this.`login`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthTemplates as model_OAuthTemplates
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_OAuthTemplates.`error`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`error` == null) {
    this.`error` = model_SecretNameReference()
  }

  this.`error`.block()
}


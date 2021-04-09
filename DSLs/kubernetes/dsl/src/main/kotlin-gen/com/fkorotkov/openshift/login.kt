// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthTemplates as model_OAuthTemplates
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_OAuthTemplates.`login`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`login` == null) {
    this.`login` = model_SecretNameReference()
  }

  this.`login`.block()
}


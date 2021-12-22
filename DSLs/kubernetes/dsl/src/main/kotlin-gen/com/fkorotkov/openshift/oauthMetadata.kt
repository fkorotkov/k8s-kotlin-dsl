// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.AuthenticationSpec as model_AuthenticationSpec
import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference


fun  model_AuthenticationSpec.`oauthMetadata`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`oauthMetadata` == null) {
    this.`oauthMetadata` = model_ConfigMapNameReference()
  }

  this.`oauthMetadata`.block()
}


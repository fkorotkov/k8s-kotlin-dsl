// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.AuthenticationStatus as model_AuthenticationStatus
import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference


fun  model_AuthenticationStatus.`integratedOAuthMetadata`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`integratedOAuthMetadata` == null) {
    this.`integratedOAuthMetadata` = model_ConfigMapNameReference()
  }

  this.`integratedOAuthMetadata`.block()
}


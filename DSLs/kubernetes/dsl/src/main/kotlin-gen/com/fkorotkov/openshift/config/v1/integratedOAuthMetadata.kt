// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.AuthenticationStatus as v1_AuthenticationStatus
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference


fun  v1_AuthenticationStatus.`integratedOAuthMetadata`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`integratedOAuthMetadata` == null) {
    this.`integratedOAuthMetadata` = v1_ConfigMapNameReference()
  }

  this.`integratedOAuthMetadata`.block()
}


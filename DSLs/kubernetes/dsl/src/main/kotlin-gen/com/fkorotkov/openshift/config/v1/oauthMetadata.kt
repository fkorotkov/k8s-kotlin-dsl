// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.AuthenticationSpec as v1_AuthenticationSpec
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference


fun  v1_AuthenticationSpec.`oauthMetadata`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`oauthMetadata` == null) {
    this.`oauthMetadata` = v1_ConfigMapNameReference()
  }

  this.`oauthMetadata`.block()
}


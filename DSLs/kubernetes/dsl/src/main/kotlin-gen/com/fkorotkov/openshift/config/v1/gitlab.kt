// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.GitLabIdentityProvider as v1_GitLabIdentityProvider
import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider


fun  v1_IdentityProvider.`gitlab`(block: v1_GitLabIdentityProvider.() -> Unit = {}) {
  if(this.`gitlab` == null) {
    this.`gitlab` = v1_GitLabIdentityProvider()
  }

  this.`gitlab`.block()
}


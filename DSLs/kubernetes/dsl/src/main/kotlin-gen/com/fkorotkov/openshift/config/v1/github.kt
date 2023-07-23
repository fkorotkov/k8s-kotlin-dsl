// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.GitHubIdentityProvider as v1_GitHubIdentityProvider
import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider


fun  v1_IdentityProvider.`github`(block: v1_GitHubIdentityProvider.() -> Unit = {}) {
  if(this.`github` == null) {
    this.`github` = v1_GitHubIdentityProvider()
  }

  this.`github`.block()
}


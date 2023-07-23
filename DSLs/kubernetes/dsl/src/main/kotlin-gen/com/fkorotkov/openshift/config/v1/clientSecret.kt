// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.GitHubIdentityProvider as v1_GitHubIdentityProvider
import io.fabric8.openshift.api.model.config.v1.GitLabIdentityProvider as v1_GitLabIdentityProvider
import io.fabric8.openshift.api.model.config.v1.GoogleIdentityProvider as v1_GoogleIdentityProvider
import io.fabric8.openshift.api.model.config.v1.OpenIDIdentityProvider as v1_OpenIDIdentityProvider
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_GitHubIdentityProvider.`clientSecret`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = v1_SecretNameReference()
  }

  this.`clientSecret`.block()
}


fun  v1_GitLabIdentityProvider.`clientSecret`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = v1_SecretNameReference()
  }

  this.`clientSecret`.block()
}


fun  v1_GoogleIdentityProvider.`clientSecret`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = v1_SecretNameReference()
  }

  this.`clientSecret`.block()
}


fun  v1_OpenIDIdentityProvider.`clientSecret`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = v1_SecretNameReference()
  }

  this.`clientSecret`.block()
}


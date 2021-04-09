// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GitHubIdentityProvider as model_GitHubIdentityProvider
import io.fabric8.openshift.api.model.GitLabIdentityProvider as model_GitLabIdentityProvider
import io.fabric8.openshift.api.model.GoogleIdentityProvider as model_GoogleIdentityProvider
import io.fabric8.openshift.api.model.OpenIDIdentityProvider as model_OpenIDIdentityProvider
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_GitHubIdentityProvider.`clientSecret`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = model_SecretNameReference()
  }

  this.`clientSecret`.block()
}


fun  model_GitLabIdentityProvider.`clientSecret`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = model_SecretNameReference()
  }

  this.`clientSecret`.block()
}


fun  model_GoogleIdentityProvider.`clientSecret`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = model_SecretNameReference()
  }

  this.`clientSecret`.block()
}


fun  model_OpenIDIdentityProvider.`clientSecret`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`clientSecret` == null) {
    this.`clientSecret` = model_SecretNameReference()
  }

  this.`clientSecret`.block()
}


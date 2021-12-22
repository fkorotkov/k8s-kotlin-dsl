// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BasicAuthIdentityProvider as model_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference
import io.fabric8.openshift.api.model.ConnectionConfig as model_ConnectionConfig
import io.fabric8.openshift.api.model.GitHubIdentityProvider as model_GitHubIdentityProvider
import io.fabric8.openshift.api.model.GitLabIdentityProvider as model_GitLabIdentityProvider
import io.fabric8.openshift.api.model.KeystoneIdentityProvider as model_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.LDAPIdentityProvider as model_LDAPIdentityProvider
import io.fabric8.openshift.api.model.OpenIDIdentityProvider as model_OpenIDIdentityProvider
import io.fabric8.openshift.api.model.RequestHeaderIdentityProvider as model_RequestHeaderIdentityProvider


fun  model_BasicAuthIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_ConnectionConfig.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_GitHubIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_GitLabIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_KeystoneIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_LDAPIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_OpenIDIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  model_RequestHeaderIdentityProvider.`ca`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = model_ConfigMapNameReference()
  }

  this.`ca`.block()
}


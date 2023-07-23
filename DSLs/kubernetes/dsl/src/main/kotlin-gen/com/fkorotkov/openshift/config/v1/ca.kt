// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BasicAuthIdentityProvider as v1_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference
import io.fabric8.openshift.api.model.config.v1.GitHubIdentityProvider as v1_GitHubIdentityProvider
import io.fabric8.openshift.api.model.config.v1.GitLabIdentityProvider as v1_GitLabIdentityProvider
import io.fabric8.openshift.api.model.config.v1.KeystoneIdentityProvider as v1_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.config.v1.LDAPIdentityProvider as v1_LDAPIdentityProvider
import io.fabric8.openshift.api.model.config.v1.OpenIDIdentityProvider as v1_OpenIDIdentityProvider
import io.fabric8.openshift.api.model.config.v1.RequestHeaderIdentityProvider as v1_RequestHeaderIdentityProvider


fun  v1_BasicAuthIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  v1_GitHubIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  v1_GitLabIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  v1_KeystoneIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  v1_LDAPIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  v1_OpenIDIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


fun  v1_RequestHeaderIdentityProvider.`ca`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`ca` == null) {
    this.`ca` = v1_ConfigMapNameReference()
  }

  this.`ca`.block()
}


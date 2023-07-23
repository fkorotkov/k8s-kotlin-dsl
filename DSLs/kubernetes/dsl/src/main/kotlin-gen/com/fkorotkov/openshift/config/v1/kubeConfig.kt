// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.DeprecatedWebhookTokenAuthenticator as v1_DeprecatedWebhookTokenAuthenticator
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference
import io.fabric8.openshift.api.model.config.v1.WebhookTokenAuthenticator as v1_WebhookTokenAuthenticator


fun  v1_DeprecatedWebhookTokenAuthenticator.`kubeConfig`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`kubeConfig` == null) {
    this.`kubeConfig` = v1_SecretNameReference()
  }

  this.`kubeConfig`.block()
}


fun  v1_WebhookTokenAuthenticator.`kubeConfig`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`kubeConfig` == null) {
    this.`kubeConfig` = v1_SecretNameReference()
  }

  this.`kubeConfig`.block()
}


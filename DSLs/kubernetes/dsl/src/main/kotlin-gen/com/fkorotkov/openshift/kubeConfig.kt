// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeprecatedWebhookTokenAuthenticator as model_DeprecatedWebhookTokenAuthenticator
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference
import io.fabric8.openshift.api.model.WebhookTokenAuthenticator as model_WebhookTokenAuthenticator


fun  model_DeprecatedWebhookTokenAuthenticator.`kubeConfig`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`kubeConfig` == null) {
    this.`kubeConfig` = model_SecretNameReference()
  }

  this.`kubeConfig`.block()
}


fun  model_WebhookTokenAuthenticator.`kubeConfig`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`kubeConfig` == null) {
    this.`kubeConfig` = model_SecretNameReference()
  }

  this.`kubeConfig`.block()
}


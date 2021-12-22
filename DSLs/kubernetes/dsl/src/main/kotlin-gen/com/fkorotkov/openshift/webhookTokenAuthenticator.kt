// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.AuthenticationSpec as model_AuthenticationSpec
import io.fabric8.openshift.api.model.WebhookTokenAuthenticator as model_WebhookTokenAuthenticator


fun  model_AuthenticationSpec.`webhookTokenAuthenticator`(block: model_WebhookTokenAuthenticator.() -> Unit = {}) {
  if(this.`webhookTokenAuthenticator` == null) {
    this.`webhookTokenAuthenticator` = model_WebhookTokenAuthenticator()
  }

  this.`webhookTokenAuthenticator`.block()
}


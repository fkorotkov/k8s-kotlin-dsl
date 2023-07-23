// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.AuthenticationSpec as v1_AuthenticationSpec
import io.fabric8.openshift.api.model.config.v1.WebhookTokenAuthenticator as v1_WebhookTokenAuthenticator


fun  v1_AuthenticationSpec.`webhookTokenAuthenticator`(block: v1_WebhookTokenAuthenticator.() -> Unit = {}) {
  if(this.`webhookTokenAuthenticator` == null) {
    this.`webhookTokenAuthenticator` = v1_WebhookTokenAuthenticator()
  }

  this.`webhookTokenAuthenticator`.block()
}


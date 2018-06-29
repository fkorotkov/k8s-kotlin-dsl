// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SecretLocalReference
import io.fabric8.openshift.api.model.WebHookTrigger


fun  WebHookTrigger.`secretReference`(block: SecretLocalReference.() -> Unit = {}) {
  if(this.`secretReference` == null) {
    this.`secretReference` = SecretLocalReference()
  }

  this.`secretReference`.block()
}


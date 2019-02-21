// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SecretLocalReference as model_SecretLocalReference
import io.fabric8.openshift.api.model.WebHookTrigger as model_WebHookTrigger


fun  model_WebHookTrigger.`secretReference`(block: model_SecretLocalReference.() -> Unit = {}) {
  if(this.`secretReference` == null) {
    this.`secretReference` = model_SecretLocalReference()
  }

  this.`secretReference`.block()
}


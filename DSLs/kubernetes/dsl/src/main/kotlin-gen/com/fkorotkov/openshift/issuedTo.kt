// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageSignature as model_ImageSignature
import io.fabric8.openshift.api.model.SignatureSubject as model_SignatureSubject


fun  model_ImageSignature.`issuedTo`(block: model_SignatureSubject.() -> Unit = {}) {
  if(this.`issuedTo` == null) {
    this.`issuedTo` = model_SignatureSubject()
  }

  this.`issuedTo`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageSignature
import io.fabric8.openshift.api.model.SignatureSubject


fun  ImageSignature.`issuedTo`(block: SignatureSubject.() -> Unit = {}) {
  if(this.`issuedTo` == null) {
    this.`issuedTo` = SignatureSubject()
  }

  this.`issuedTo`.block()
}


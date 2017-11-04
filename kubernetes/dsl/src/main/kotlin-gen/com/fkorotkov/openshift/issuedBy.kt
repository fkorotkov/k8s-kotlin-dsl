// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageSignature
import io.fabric8.openshift.api.model.SignatureIssuer


fun  ImageSignature.`issuedBy`(block: SignatureIssuer.() -> Unit = {}) {
  if(this.`issuedBy` == null) {
    this.`issuedBy` = SignatureIssuer()
  }

  this.`issuedBy`.block()
}


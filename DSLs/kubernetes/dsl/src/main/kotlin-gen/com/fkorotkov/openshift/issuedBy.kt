// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageSignature as model_ImageSignature
import io.fabric8.openshift.api.model.SignatureIssuer as model_SignatureIssuer


fun  model_ImageSignature.`issuedBy`(block: model_SignatureIssuer.() -> Unit = {}) {
  if(this.`issuedBy` == null) {
    this.`issuedBy` = model_SignatureIssuer()
  }

  this.`issuedBy`.block()
}


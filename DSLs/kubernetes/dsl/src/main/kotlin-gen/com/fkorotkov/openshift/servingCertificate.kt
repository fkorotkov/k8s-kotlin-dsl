// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServerNamedServingCert as model_APIServerNamedServingCert
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_APIServerNamedServingCert.`servingCertificate`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`servingCertificate` == null) {
    this.`servingCertificate` = model_SecretNameReference()
  }

  this.`servingCertificate`.block()
}


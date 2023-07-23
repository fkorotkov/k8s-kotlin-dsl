// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServerNamedServingCert as v1_APIServerNamedServingCert
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_APIServerNamedServingCert.`servingCertificate`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`servingCertificate` == null) {
    this.`servingCertificate` = v1_SecretNameReference()
  }

  this.`servingCertificate`.block()
}


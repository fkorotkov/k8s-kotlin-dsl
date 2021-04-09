// GENERATED
package com.fkorotkov.kubernetes.certificates.v1

import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequest as v1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequestSpec as v1_CertificateSigningRequestSpec


fun  v1_CertificateSigningRequest.`spec`(block: v1_CertificateSigningRequestSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_CertificateSigningRequestSpec()
  }

  this.`spec`.block()
}


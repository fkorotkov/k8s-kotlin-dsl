// GENERATED
package com.fkorotkov.kubernetes.certificates

import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest as certificates_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec as certificates_CertificateSigningRequestSpec


fun  certificates_CertificateSigningRequest.`spec`(block: certificates_CertificateSigningRequestSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = certificates_CertificateSigningRequestSpec()
  }

  this.`spec`.block()
}


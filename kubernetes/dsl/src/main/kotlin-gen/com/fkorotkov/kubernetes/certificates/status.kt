// GENERATED
package com.fkorotkov.kubernetes.certificates

import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest as certificates_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus as certificates_CertificateSigningRequestStatus


fun  certificates_CertificateSigningRequest.`status`(block: certificates_CertificateSigningRequestStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = certificates_CertificateSigningRequestStatus()
  }

  this.`status`.block()
}


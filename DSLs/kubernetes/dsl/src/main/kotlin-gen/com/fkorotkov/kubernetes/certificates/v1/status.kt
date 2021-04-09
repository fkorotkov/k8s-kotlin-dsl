// GENERATED
package com.fkorotkov.kubernetes.certificates.v1

import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequest as v1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequestStatus as v1_CertificateSigningRequestStatus


fun  v1_CertificateSigningRequest.`status`(block: v1_CertificateSigningRequestStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_CertificateSigningRequestStatus()
  }

  this.`status`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.certificates.v1beta1

import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequest as v1beta1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestStatus as v1beta1_CertificateSigningRequestStatus


fun  v1beta1_CertificateSigningRequest.`status`(block: v1beta1_CertificateSigningRequestStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1beta1_CertificateSigningRequestStatus()
  }

  this.`status`.block()
}


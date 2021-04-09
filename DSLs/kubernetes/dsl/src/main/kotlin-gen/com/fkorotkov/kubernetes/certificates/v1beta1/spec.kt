// GENERATED
package com.fkorotkov.kubernetes.certificates.v1beta1

import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequest as v1beta1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestSpec as v1beta1_CertificateSigningRequestSpec


fun  v1beta1_CertificateSigningRequest.`spec`(block: v1beta1_CertificateSigningRequestSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_CertificateSigningRequestSpec()
  }

  this.`spec`.block()
}


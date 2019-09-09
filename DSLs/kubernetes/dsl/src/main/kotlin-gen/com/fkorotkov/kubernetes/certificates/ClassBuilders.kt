// GENERATE
package com.fkorotkov.kubernetes.certificates

import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest as certificates_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestCondition as certificates_CertificateSigningRequestCondition
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList as certificates_CertificateSigningRequestList
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestSpec as certificates_CertificateSigningRequestSpec
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestStatus as certificates_CertificateSigningRequestStatus


fun newCertificateSigningRequest(block : certificates_CertificateSigningRequest.() -> Unit = {}): certificates_CertificateSigningRequest {
  val instance = certificates_CertificateSigningRequest()
  instance.block()
  return instance
}


fun newCertificateSigningRequestCondition(block : certificates_CertificateSigningRequestCondition.() -> Unit = {}): certificates_CertificateSigningRequestCondition {
  val instance = certificates_CertificateSigningRequestCondition()
  instance.block()
  return instance
}


fun newCertificateSigningRequestList(block : certificates_CertificateSigningRequestList.() -> Unit = {}): certificates_CertificateSigningRequestList {
  val instance = certificates_CertificateSigningRequestList()
  instance.block()
  return instance
}


fun newCertificateSigningRequestSpec(block : certificates_CertificateSigningRequestSpec.() -> Unit = {}): certificates_CertificateSigningRequestSpec {
  val instance = certificates_CertificateSigningRequestSpec()
  instance.block()
  return instance
}


fun newCertificateSigningRequestStatus(block : certificates_CertificateSigningRequestStatus.() -> Unit = {}): certificates_CertificateSigningRequestStatus {
  val instance = certificates_CertificateSigningRequestStatus()
  instance.block()
  return instance
}


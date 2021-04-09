// GENERATE
package com.fkorotkov.kubernetes.certificates.v1

import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequest as v1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequestCondition as v1_CertificateSigningRequestCondition
import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequestList as v1_CertificateSigningRequestList
import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequestSpec as v1_CertificateSigningRequestSpec
import io.fabric8.kubernetes.api.model.certificates.v1.CertificateSigningRequestStatus as v1_CertificateSigningRequestStatus


fun newCertificateSigningRequest(block : v1_CertificateSigningRequest.() -> Unit = {}): v1_CertificateSigningRequest {
  val instance = v1_CertificateSigningRequest()
  instance.block()
  return instance
}


fun newCertificateSigningRequestCondition(block : v1_CertificateSigningRequestCondition.() -> Unit = {}): v1_CertificateSigningRequestCondition {
  val instance = v1_CertificateSigningRequestCondition()
  instance.block()
  return instance
}


fun newCertificateSigningRequestList(block : v1_CertificateSigningRequestList.() -> Unit = {}): v1_CertificateSigningRequestList {
  val instance = v1_CertificateSigningRequestList()
  instance.block()
  return instance
}


fun newCertificateSigningRequestSpec(block : v1_CertificateSigningRequestSpec.() -> Unit = {}): v1_CertificateSigningRequestSpec {
  val instance = v1_CertificateSigningRequestSpec()
  instance.block()
  return instance
}


fun newCertificateSigningRequestStatus(block : v1_CertificateSigningRequestStatus.() -> Unit = {}): v1_CertificateSigningRequestStatus {
  val instance = v1_CertificateSigningRequestStatus()
  instance.block()
  return instance
}


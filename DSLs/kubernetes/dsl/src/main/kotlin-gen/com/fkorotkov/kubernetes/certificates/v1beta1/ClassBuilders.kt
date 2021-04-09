// GENERATE
package com.fkorotkov.kubernetes.certificates.v1beta1

import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequest as v1beta1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestCondition as v1beta1_CertificateSigningRequestCondition
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestList as v1beta1_CertificateSigningRequestList
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestSpec as v1beta1_CertificateSigningRequestSpec
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestStatus as v1beta1_CertificateSigningRequestStatus


fun newCertificateSigningRequest(block : v1beta1_CertificateSigningRequest.() -> Unit = {}): v1beta1_CertificateSigningRequest {
  val instance = v1beta1_CertificateSigningRequest()
  instance.block()
  return instance
}


fun newCertificateSigningRequestCondition(block : v1beta1_CertificateSigningRequestCondition.() -> Unit = {}): v1beta1_CertificateSigningRequestCondition {
  val instance = v1beta1_CertificateSigningRequestCondition()
  instance.block()
  return instance
}


fun newCertificateSigningRequestList(block : v1beta1_CertificateSigningRequestList.() -> Unit = {}): v1beta1_CertificateSigningRequestList {
  val instance = v1beta1_CertificateSigningRequestList()
  instance.block()
  return instance
}


fun newCertificateSigningRequestSpec(block : v1beta1_CertificateSigningRequestSpec.() -> Unit = {}): v1beta1_CertificateSigningRequestSpec {
  val instance = v1beta1_CertificateSigningRequestSpec()
  instance.block()
  return instance
}


fun newCertificateSigningRequestStatus(block : v1beta1_CertificateSigningRequestStatus.() -> Unit = {}): v1beta1_CertificateSigningRequestStatus {
  val instance = v1beta1_CertificateSigningRequestStatus()
  instance.block()
  return instance
}


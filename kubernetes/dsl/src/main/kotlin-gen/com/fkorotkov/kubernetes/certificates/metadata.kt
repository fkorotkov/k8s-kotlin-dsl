// GENERATED
package com.fkorotkov.kubernetes.certificates

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequest as certificates_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.CertificateSigningRequestList as certificates_CertificateSigningRequestList


fun  certificates_CertificateSigningRequest.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  certificates_CertificateSigningRequestList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


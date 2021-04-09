// GENERATE
package com.fkorotkov.kubernetes.admission.v1beta1

import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest as v1beta1_AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse as v1beta1_AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview as v1beta1_AdmissionReview


fun newAdmissionRequest(block : v1beta1_AdmissionRequest.() -> Unit = {}): v1beta1_AdmissionRequest {
  val instance = v1beta1_AdmissionRequest()
  instance.block()
  return instance
}


fun newAdmissionResponse(block : v1beta1_AdmissionResponse.() -> Unit = {}): v1beta1_AdmissionResponse {
  val instance = v1beta1_AdmissionResponse()
  instance.block()
  return instance
}


fun newAdmissionReview(block : v1beta1_AdmissionReview.() -> Unit = {}): v1beta1_AdmissionReview {
  val instance = v1beta1_AdmissionReview()
  instance.block()
  return instance
}


// GENERATE
package com.fkorotkov.kubernetes.admission.v1

import io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest as v1_AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse as v1_AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview as v1_AdmissionReview


fun newAdmissionRequest(block : v1_AdmissionRequest.() -> Unit = {}): v1_AdmissionRequest {
  val instance = v1_AdmissionRequest()
  instance.block()
  return instance
}


fun newAdmissionResponse(block : v1_AdmissionResponse.() -> Unit = {}): v1_AdmissionResponse {
  val instance = v1_AdmissionResponse()
  instance.block()
  return instance
}


fun newAdmissionReview(block : v1_AdmissionReview.() -> Unit = {}): v1_AdmissionReview {
  val instance = v1_AdmissionReview()
  instance.block()
  return instance
}


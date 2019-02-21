// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse as admission_AdmissionResponse


fun  admission_AdmissionResponse.`status`(block: model_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = model_Status()
  }

  this.`status`.block()
}


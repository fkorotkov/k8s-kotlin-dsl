// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.GroupVersionKind as model_GroupVersionKind
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest


fun  admission_AdmissionRequest.`kind`(block: model_GroupVersionKind.() -> Unit = {}) {
  if(this.`kind` == null) {
    this.`kind` = model_GroupVersionKind()
  }

  this.`kind`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.GroupVersionResource as model_GroupVersionResource
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest


fun  admission_AdmissionRequest.`requestResource`(block: model_GroupVersionResource.() -> Unit = {}) {
  if(this.`requestResource` == null) {
    this.`requestResource` = model_GroupVersionResource()
  }

  this.`requestResource`.block()
}


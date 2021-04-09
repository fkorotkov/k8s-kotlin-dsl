// GENERATED
package com.fkorotkov.kubernetes.admission.v1

import io.fabric8.kubernetes.api.model.GroupVersionResource as model_GroupVersionResource
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest as v1_AdmissionRequest


fun  v1_AdmissionRequest.`requestResource`(block: model_GroupVersionResource.() -> Unit = {}) {
  if(this.`requestResource` == null) {
    this.`requestResource` = model_GroupVersionResource()
  }

  this.`requestResource`.block()
}


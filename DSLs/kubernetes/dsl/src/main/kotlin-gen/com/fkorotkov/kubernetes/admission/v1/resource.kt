// GENERATED
package com.fkorotkov.kubernetes.admission.v1

import io.fabric8.kubernetes.api.model.GroupVersionResource as model_GroupVersionResource
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest as v1_AdmissionRequest


fun  v1_AdmissionRequest.`resource`(block: model_GroupVersionResource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = model_GroupVersionResource()
  }

  this.`resource`.block()
}


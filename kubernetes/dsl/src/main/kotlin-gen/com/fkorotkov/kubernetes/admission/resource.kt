// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.GroupVersionResource as model_GroupVersionResource
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest


fun  admission_AdmissionRequest.`resource`(block: model_GroupVersionResource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = model_GroupVersionResource()
  }

  this.`resource`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.admission.v1beta1

import io.fabric8.kubernetes.api.model.GroupVersionKind as model_GroupVersionKind
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest as v1beta1_AdmissionRequest


fun  v1beta1_AdmissionRequest.`kind`(block: model_GroupVersionKind.() -> Unit = {}) {
  if(this.`kind` == null) {
    this.`kind` = model_GroupVersionKind()
  }

  this.`kind`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GroupVersionKind
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest


fun  AdmissionRequest.`kind`(block: GroupVersionKind.() -> Unit = {}) {
  if(this.`kind` == null) {
    this.`kind` = GroupVersionKind()
  }

  this.`kind`.block()
}


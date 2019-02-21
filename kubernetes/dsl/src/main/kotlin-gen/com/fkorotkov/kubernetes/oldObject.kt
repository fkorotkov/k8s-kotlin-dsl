// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HasMetadata
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest


fun  AdmissionRequest.`oldObject`(block: HasMetadata.() -> Unit = {}) {
  this.`oldObject`.block()
}


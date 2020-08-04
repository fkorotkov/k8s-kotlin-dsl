// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.KubernetesResource as model_KubernetesResource
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest


fun  admission_AdmissionRequest.`object`(block: model_KubernetesResource.() -> Unit = {}) {
  this.`object`.block()
}


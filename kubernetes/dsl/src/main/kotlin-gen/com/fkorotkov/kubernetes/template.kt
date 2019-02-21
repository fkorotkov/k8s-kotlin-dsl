// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodTemplate as model_PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec as model_ReplicationControllerSpec


fun  model_PodTemplate.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  model_ReplicationControllerSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


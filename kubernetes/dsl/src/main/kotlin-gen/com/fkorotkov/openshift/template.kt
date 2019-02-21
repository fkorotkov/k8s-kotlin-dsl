// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.openshift.api.model.DeploymentConfigSpec as model_DeploymentConfigSpec


fun  model_DeploymentConfigSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


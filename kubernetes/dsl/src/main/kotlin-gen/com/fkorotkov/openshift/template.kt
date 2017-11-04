// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.openshift.api.model.DeploymentConfigSpec


fun  DeploymentConfigSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


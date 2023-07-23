// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.kubernetes.api.model.ResourceRequirements as model_ResourceRequirements
import io.fabric8.openshift.api.model.config.v1.BuildDefaults as v1_BuildDefaults


fun  v1_BuildDefaults.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}


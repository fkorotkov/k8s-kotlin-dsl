// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams as model_DeploymentTriggerImageChangeParams
import io.fabric8.openshift.api.model.DeploymentTriggerPolicy as model_DeploymentTriggerPolicy


fun  model_DeploymentTriggerPolicy.`imageChangeParams`(block: model_DeploymentTriggerImageChangeParams.() -> Unit = {}) {
  if(this.`imageChangeParams` == null) {
    this.`imageChangeParams` = model_DeploymentTriggerImageChangeParams()
  }

  this.`imageChangeParams`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams
import io.fabric8.openshift.api.model.DeploymentTriggerPolicy


fun  DeploymentTriggerPolicy.`imageChangeParams`(block: DeploymentTriggerImageChangeParams.() -> Unit = {}) {
  if(this.`imageChangeParams` == null) {
    this.`imageChangeParams` = DeploymentTriggerImageChangeParams()
  }

  this.`imageChangeParams`.block()
}


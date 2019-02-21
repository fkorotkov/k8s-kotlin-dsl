// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentConfigStatus as model_DeploymentConfigStatus
import io.fabric8.openshift.api.model.DeploymentDetails as model_DeploymentDetails


fun  model_DeploymentConfigStatus.`details`(block: model_DeploymentDetails.() -> Unit = {}) {
  if(this.`details` == null) {
    this.`details` = model_DeploymentDetails()
  }

  this.`details`.block()
}


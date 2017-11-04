// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentConfigStatus
import io.fabric8.openshift.api.model.DeploymentDetails


fun  DeploymentConfigStatus.`details`(block: DeploymentDetails.() -> Unit = {}) {
  if(this.`details` == null) {
    this.`details` = DeploymentDetails()
  }

  this.`details`.block()
}


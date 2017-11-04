// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentCause
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger


fun  DeploymentCause.`imageTrigger`(block: DeploymentCauseImageTrigger.() -> Unit = {}) {
  if(this.`imageTrigger` == null) {
    this.`imageTrigger` = DeploymentCauseImageTrigger()
  }

  this.`imageTrigger`.block()
}


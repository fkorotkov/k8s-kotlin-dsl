// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentCause as model_DeploymentCause
import io.fabric8.openshift.api.model.DeploymentCauseImageTrigger as model_DeploymentCauseImageTrigger


fun  model_DeploymentCause.`imageTrigger`(block: model_DeploymentCauseImageTrigger.() -> Unit = {}) {
  if(this.`imageTrigger` == null) {
    this.`imageTrigger` = model_DeploymentCauseImageTrigger()
  }

  this.`imageTrigger`.block()
}


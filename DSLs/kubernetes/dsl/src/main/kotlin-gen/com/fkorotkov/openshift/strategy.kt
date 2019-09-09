// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.BuildStrategy as model_BuildStrategy
import io.fabric8.openshift.api.model.DeploymentConfigSpec as model_DeploymentConfigSpec
import io.fabric8.openshift.api.model.DeploymentStrategy as model_DeploymentStrategy


fun  model_BuildConfigSpec.`strategy`(block: model_BuildStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = model_BuildStrategy()
  }

  this.`strategy`.block()
}


fun  model_BuildSpec.`strategy`(block: model_BuildStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = model_BuildStrategy()
  }

  this.`strategy`.block()
}


fun  model_DeploymentConfigSpec.`strategy`(block: model_DeploymentStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = model_DeploymentStrategy()
  }

  this.`strategy`.block()
}


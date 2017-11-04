// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec
import io.fabric8.openshift.api.model.BuildStrategy
import io.fabric8.openshift.api.model.DeploymentConfigSpec
import io.fabric8.openshift.api.model.DeploymentStrategy


fun  BuildConfigSpec.`strategy`(block: BuildStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = BuildStrategy()
  }

  this.`strategy`.block()
}


fun  BuildSpec.`strategy`(block: BuildStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = BuildStrategy()
  }

  this.`strategy`.block()
}


fun  DeploymentConfigSpec.`strategy`(block: DeploymentStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = DeploymentStrategy()
  }

  this.`strategy`.block()
}


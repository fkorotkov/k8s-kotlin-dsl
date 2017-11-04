// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ResourceRequirements
import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec
import io.fabric8.openshift.api.model.DeploymentStrategy


fun  BuildConfigSpec.`resources`(block: ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = ResourceRequirements()
  }

  this.`resources`.block()
}


fun  BuildSpec.`resources`(block: ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = ResourceRequirements()
  }

  this.`resources`.block()
}


fun  DeploymentStrategy.`resources`(block: ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = ResourceRequirements()
  }

  this.`resources`.block()
}


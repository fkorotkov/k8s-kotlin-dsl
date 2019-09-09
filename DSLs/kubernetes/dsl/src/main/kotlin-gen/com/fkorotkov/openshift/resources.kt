// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ResourceRequirements as model_ResourceRequirements
import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.DeploymentStrategy as model_DeploymentStrategy


fun  model_BuildConfigSpec.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}


fun  model_BuildSpec.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}


fun  model_DeploymentStrategy.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}


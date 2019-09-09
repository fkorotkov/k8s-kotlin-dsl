// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RunAsUserStrategyOptions as model_RunAsUserStrategyOptions
import io.fabric8.openshift.api.model.SecurityContextConstraints as model_SecurityContextConstraints


fun  model_SecurityContextConstraints.`runAsUser`(block: model_RunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = model_RunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}


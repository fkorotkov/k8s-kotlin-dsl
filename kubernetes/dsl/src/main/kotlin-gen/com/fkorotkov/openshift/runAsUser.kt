// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RunAsUserStrategyOptions
import io.fabric8.openshift.api.model.SecurityContextConstraints


fun  SecurityContextConstraints.`runAsUser`(block: RunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = RunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}


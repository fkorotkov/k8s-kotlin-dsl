// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.RunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.SecurityContextConstraints


fun  SecurityContextConstraints.`runAsUser`(block: RunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = RunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}


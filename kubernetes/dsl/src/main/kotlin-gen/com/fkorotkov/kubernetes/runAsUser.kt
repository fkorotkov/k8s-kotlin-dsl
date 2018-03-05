// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec


fun  PodSecurityPolicySpec.`runAsUser`(block: KubernetesRunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = KubernetesRunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}


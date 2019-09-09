// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptions as extensions_KubernetesRunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec


fun  extensions_PodSecurityPolicySpec.`runAsUser`(block: extensions_KubernetesRunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = extensions_KubernetesRunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}


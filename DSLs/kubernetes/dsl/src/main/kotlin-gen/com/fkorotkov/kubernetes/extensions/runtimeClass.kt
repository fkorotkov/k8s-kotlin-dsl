// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.RuntimeClassStrategyOptions as extensions_RuntimeClassStrategyOptions


fun  extensions_PodSecurityPolicySpec.`runtimeClass`(block: extensions_RuntimeClassStrategyOptions.() -> Unit = {}) {
  if(this.`runtimeClass` == null) {
    this.`runtimeClass` = extensions_RuntimeClassStrategyOptions()
  }

  this.`runtimeClass`.block()
}


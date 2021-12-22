// GENERATED
package com.fkorotkov.kubernetes.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.RunAsGroupStrategyOptions as v1beta1_RunAsGroupStrategyOptions


fun  v1beta1_PodSecurityPolicySpec.`runAsGroup`(block: v1beta1_RunAsGroupStrategyOptions.() -> Unit = {}) {
  if(this.`runAsGroup` == null) {
    this.`runAsGroup` = v1beta1_RunAsGroupStrategyOptions()
  }

  this.`runAsGroup`.block()
}


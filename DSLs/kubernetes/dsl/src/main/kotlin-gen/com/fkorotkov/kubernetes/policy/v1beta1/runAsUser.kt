// GENERATED
package com.fkorotkov.kubernetes.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.RunAsUserStrategyOptions as v1beta1_RunAsUserStrategyOptions


fun  v1beta1_PodSecurityPolicySpec.`runAsUser`(block: v1beta1_RunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = v1beta1_RunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}


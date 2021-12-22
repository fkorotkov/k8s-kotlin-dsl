// GENERATED
package com.fkorotkov.kubernetes.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.SELinuxStrategyOptions as v1beta1_SELinuxStrategyOptions


fun  v1beta1_PodSecurityPolicySpec.`seLinux`(block: v1beta1_SELinuxStrategyOptions.() -> Unit = {}) {
  if(this.`seLinux` == null) {
    this.`seLinux` = v1beta1_SELinuxStrategyOptions()
  }

  this.`seLinux`.block()
}


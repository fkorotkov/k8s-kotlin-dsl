// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.SELinuxStrategyOptions as policy_SELinuxStrategyOptions


fun  policy_PodSecurityPolicySpec.`seLinux`(block: policy_SELinuxStrategyOptions.() -> Unit = {}) {
  if(this.`seLinux` == null) {
    this.`seLinux` = policy_SELinuxStrategyOptions()
  }

  this.`seLinux`.block()
}


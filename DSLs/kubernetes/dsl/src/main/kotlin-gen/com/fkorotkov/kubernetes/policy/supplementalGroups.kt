// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.SupplementalGroupsStrategyOptions as policy_SupplementalGroupsStrategyOptions


fun  policy_PodSecurityPolicySpec.`supplementalGroups`(block: policy_SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = policy_SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


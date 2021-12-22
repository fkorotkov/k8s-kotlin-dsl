// GENERATED
package com.fkorotkov.kubernetes.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.SupplementalGroupsStrategyOptions as v1beta1_SupplementalGroupsStrategyOptions


fun  v1beta1_PodSecurityPolicySpec.`supplementalGroups`(block: v1beta1_SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = v1beta1_SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


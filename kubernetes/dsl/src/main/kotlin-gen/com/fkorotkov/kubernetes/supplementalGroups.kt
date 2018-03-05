// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions


fun  PodSecurityPolicySpec.`supplementalGroups`(block: SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions as extensions_SupplementalGroupsStrategyOptions


fun  extensions_PodSecurityPolicySpec.`supplementalGroups`(block: extensions_SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = extensions_SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


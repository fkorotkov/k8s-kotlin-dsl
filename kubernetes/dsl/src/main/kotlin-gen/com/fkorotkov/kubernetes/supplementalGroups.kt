// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.SecurityContextConstraints
import io.fabric8.kubernetes.api.model.SupplementalGroupsStrategyOptions


fun  SecurityContextConstraints.`supplementalGroups`(block: SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


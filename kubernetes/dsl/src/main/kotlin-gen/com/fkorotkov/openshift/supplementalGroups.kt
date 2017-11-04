// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions


fun  SecurityContextConstraints.`supplementalGroups`(block: SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


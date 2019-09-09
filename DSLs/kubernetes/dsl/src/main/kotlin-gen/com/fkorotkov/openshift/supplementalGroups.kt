// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SecurityContextConstraints as model_SecurityContextConstraints
import io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions as model_SupplementalGroupsStrategyOptions


fun  model_SecurityContextConstraints.`supplementalGroups`(block: model_SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = model_SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}


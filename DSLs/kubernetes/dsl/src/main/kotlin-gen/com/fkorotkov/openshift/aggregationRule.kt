// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.rbac.AggregationRule as rbac_AggregationRule
import io.fabric8.openshift.api.model.ClusterRole as model_ClusterRole


fun  model_ClusterRole.`aggregationRule`(block: rbac_AggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = rbac_AggregationRule()
  }

  this.`aggregationRule`.block()
}


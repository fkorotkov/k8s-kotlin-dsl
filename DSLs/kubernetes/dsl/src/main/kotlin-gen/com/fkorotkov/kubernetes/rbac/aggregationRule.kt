// GENERATED
package com.fkorotkov.kubernetes.rbac

import io.fabric8.kubernetes.api.model.rbac.AggregationRule as rbac_AggregationRule
import io.fabric8.kubernetes.api.model.rbac.ClusterRole as rbac_ClusterRole


fun  rbac_ClusterRole.`aggregationRule`(block: rbac_AggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = rbac_AggregationRule()
  }

  this.`aggregationRule`.block()
}


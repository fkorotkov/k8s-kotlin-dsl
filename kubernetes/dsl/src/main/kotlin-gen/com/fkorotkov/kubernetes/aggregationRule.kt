// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.rbac.AggregationRule
import io.fabric8.kubernetes.api.model.rbac.ClusterRole


fun  ClusterRole.`aggregationRule`(block: AggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = AggregationRule()
  }

  this.`aggregationRule`.block()
}


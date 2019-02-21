// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.rbac.AggregationRule
import io.fabric8.openshift.api.model.OpenshiftClusterRole


fun  OpenshiftClusterRole.`aggregationRule`(block: AggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = AggregationRule()
  }

  this.`aggregationRule`.block()
}


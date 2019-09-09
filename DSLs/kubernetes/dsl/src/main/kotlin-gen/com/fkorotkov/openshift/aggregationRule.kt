// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.rbac.AggregationRule as rbac_AggregationRule
import io.fabric8.openshift.api.model.OpenshiftClusterRole as model_OpenshiftClusterRole


fun  model_OpenshiftClusterRole.`aggregationRule`(block: rbac_AggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = rbac_AggregationRule()
  }

  this.`aggregationRule`.block()
}


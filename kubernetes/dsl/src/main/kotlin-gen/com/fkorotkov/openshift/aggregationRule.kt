// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.rbac.KubernetesAggregationRule
import io.fabric8.openshift.api.model.ClusterRole


fun  ClusterRole.`aggregationRule`(block: KubernetesAggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = KubernetesAggregationRule()
  }

  this.`aggregationRule`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.rbac.KubernetesAggregationRule
import io.fabric8.kubernetes.api.model.rbac.KubernetesClusterRole


fun  KubernetesClusterRole.`aggregationRule`(block: KubernetesAggregationRule.() -> Unit = {}) {
  if(this.`aggregationRule` == null) {
    this.`aggregationRule` = KubernetesAggregationRule()
  }

  this.`aggregationRule`.block()
}


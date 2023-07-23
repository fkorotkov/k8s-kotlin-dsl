// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ClusterCondition as v1_ClusterCondition
import io.fabric8.openshift.api.model.config.v1.PromQLClusterCondition as v1_PromQLClusterCondition


fun  v1_ClusterCondition.`promql`(block: v1_PromQLClusterCondition.() -> Unit = {}) {
  if(this.`promql` == null) {
    this.`promql` = v1_PromQLClusterCondition()
  }

  this.`promql`.block()
}


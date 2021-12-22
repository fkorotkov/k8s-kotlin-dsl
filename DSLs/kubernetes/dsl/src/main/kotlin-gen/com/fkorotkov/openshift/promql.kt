// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterCondition as model_ClusterCondition
import io.fabric8.openshift.api.model.PromQLClusterCondition as model_PromQLClusterCondition


fun  model_ClusterCondition.`promql`(block: model_PromQLClusterCondition.() -> Unit = {}) {
  if(this.`promql` == null) {
    this.`promql` = model_PromQLClusterCondition()
  }

  this.`promql`.block()
}


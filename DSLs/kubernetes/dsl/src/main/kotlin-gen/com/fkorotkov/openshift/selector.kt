// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterResourceQuotaSelector as model_ClusterResourceQuotaSelector
import io.fabric8.openshift.api.model.ClusterResourceQuotaSpec as model_ClusterResourceQuotaSpec


fun  model_ClusterResourceQuotaSpec.`selector`(block: model_ClusterResourceQuotaSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_ClusterResourceQuotaSelector()
  }

  this.`selector`.block()
}


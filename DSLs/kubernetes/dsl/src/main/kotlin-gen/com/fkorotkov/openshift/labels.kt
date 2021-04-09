// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.openshift.api.model.ClusterResourceQuotaSelector as model_ClusterResourceQuotaSelector


fun  model_ClusterResourceQuotaSelector.`labels`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`labels` == null) {
    this.`labels` = model_LabelSelector()
  }

  this.`labels`.block()
}


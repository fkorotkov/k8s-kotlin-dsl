// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ResourceQuotaSpec as model_ResourceQuotaSpec
import io.fabric8.openshift.api.model.ClusterResourceQuotaSpec as model_ClusterResourceQuotaSpec


fun  model_ClusterResourceQuotaSpec.`quota`(block: model_ResourceQuotaSpec.() -> Unit = {}) {
  if(this.`quota` == null) {
    this.`quota` = model_ResourceQuotaSpec()
  }

  this.`quota`.block()
}


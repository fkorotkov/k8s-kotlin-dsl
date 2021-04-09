// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ResourceQuotaStatus as model_ResourceQuotaStatus
import io.fabric8.openshift.api.model.ClusterResourceQuotaStatus as model_ClusterResourceQuotaStatus


fun  model_ClusterResourceQuotaStatus.`total`(block: model_ResourceQuotaStatus.() -> Unit = {}) {
  if(this.`total` == null) {
    this.`total` = model_ResourceQuotaStatus()
  }

  this.`total`.block()
}


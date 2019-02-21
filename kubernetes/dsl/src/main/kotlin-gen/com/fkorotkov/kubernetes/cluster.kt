// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Cluster as model_Cluster
import io.fabric8.kubernetes.api.model.NamedCluster as model_NamedCluster


fun  model_NamedCluster.`cluster`(block: model_Cluster.() -> Unit = {}) {
  if(this.`cluster` == null) {
    this.`cluster` = model_Cluster()
  }

  this.`cluster`.block()
}


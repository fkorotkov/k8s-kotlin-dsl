// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Cluster
import io.fabric8.kubernetes.api.model.NamedCluster


fun  NamedCluster.`cluster`(block: Cluster.() -> Unit = {}) {
  if(this.`cluster` == null) {
    this.`cluster` = Cluster()
  }

  this.`cluster`.block()
}


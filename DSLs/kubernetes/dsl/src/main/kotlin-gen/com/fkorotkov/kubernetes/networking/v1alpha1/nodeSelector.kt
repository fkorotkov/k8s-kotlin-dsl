// GENERATED
package com.fkorotkov.kubernetes.networking.v1alpha1

import io.fabric8.kubernetes.api.model.NodeSelector as model_NodeSelector
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRSpec as v1alpha1_ClusterCIDRSpec


fun  v1alpha1_ClusterCIDRSpec.`nodeSelector`(block: model_NodeSelector.() -> Unit = {}) {
  if(this.`nodeSelector` == null) {
    this.`nodeSelector` = model_NodeSelector()
  }

  this.`nodeSelector`.block()
}


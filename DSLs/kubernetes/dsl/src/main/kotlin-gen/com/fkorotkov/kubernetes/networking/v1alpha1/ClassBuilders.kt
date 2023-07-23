// GENERATE
package com.fkorotkov.kubernetes.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDR as v1alpha1_ClusterCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRList as v1alpha1_ClusterCIDRList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRSpec as v1alpha1_ClusterCIDRSpec


fun newClusterCIDR(block : v1alpha1_ClusterCIDR.() -> Unit = {}): v1alpha1_ClusterCIDR {
  val instance = v1alpha1_ClusterCIDR()
  instance.block()
  return instance
}


fun newClusterCIDRList(block : v1alpha1_ClusterCIDRList.() -> Unit = {}): v1alpha1_ClusterCIDRList {
  val instance = v1alpha1_ClusterCIDRList()
  instance.block()
  return instance
}


fun newClusterCIDRSpec(block : v1alpha1_ClusterCIDRSpec.() -> Unit = {}): v1alpha1_ClusterCIDRSpec {
  val instance = v1alpha1_ClusterCIDRSpec()
  instance.block()
  return instance
}


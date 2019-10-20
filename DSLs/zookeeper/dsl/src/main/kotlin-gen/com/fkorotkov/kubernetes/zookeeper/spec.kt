// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec
import com.fkorotkov.kubernetes.zookeeper.ZookeeperCluster as zookeeper_ZookeeperCluster


fun  zookeeper_ZookeeperCluster.`spec`(block: zookeeper_Spec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = zookeeper_Spec()
  }

  this.`spec`.block()
}


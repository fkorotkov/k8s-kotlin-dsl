// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Status as zookeeper_Status
import com.fkorotkov.kubernetes.zookeeper.ZookeeperCluster as zookeeper_ZookeeperCluster


fun  zookeeper_ZookeeperCluster.`status`(block: zookeeper_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = zookeeper_Status()
  }

  this.`status`.block()
}


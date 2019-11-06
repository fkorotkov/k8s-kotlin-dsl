// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.NodeAffinity as zookeeper_NodeAffinity
import com.fkorotkov.kubernetes.zookeeper.Placement as zookeeper_Placement


fun  zookeeper_Placement.`nodeAffinity`(block: zookeeper_NodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = zookeeper_NodeAffinity()
  }

  this.`nodeAffinity`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Placement as zookeeper_Placement
import com.fkorotkov.kubernetes.zookeeper.Rack as zookeeper_Rack


fun  zookeeper_Placement.`rack`(block: zookeeper_Rack.() -> Unit = {}) {
  if(this.`rack` == null) {
    this.`rack` = zookeeper_Rack()
  }

  this.`rack`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Limits as zookeeper_Limits
import com.fkorotkov.kubernetes.zookeeper.Resources as zookeeper_Resources


fun  zookeeper_Resources.`limits`(block: zookeeper_Limits.() -> Unit = {}) {
  if(this.`limits` == null) {
    this.`limits` = zookeeper_Limits()
  }

  this.`limits`.block()
}


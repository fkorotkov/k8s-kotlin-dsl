// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Placement as zookeeper_Placement
import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec


fun  zookeeper_Spec.`placement`(block: zookeeper_Placement.() -> Unit = {}) {
  if(this.`placement` == null) {
    this.`placement` = zookeeper_Placement()
  }

  this.`placement`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.ConfigOverrides as zookeeper_ConfigOverrides
import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec


fun  zookeeper_Spec.`configOverrides`(block: zookeeper_ConfigOverrides.() -> Unit = {}) {
  if(this.`configOverrides` == null) {
    this.`configOverrides` = zookeeper_ConfigOverrides()
  }

  this.`configOverrides`.block()
}


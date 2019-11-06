// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Resources as zookeeper_Resources
import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec


fun  zookeeper_Spec.`resources`(block: zookeeper_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = zookeeper_Resources()
  }

  this.`resources`.block()
}


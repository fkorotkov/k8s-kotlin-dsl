// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.PodSecurityContext as zookeeper_PodSecurityContext
import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec


fun  zookeeper_Spec.`podSecurityContext`(block: zookeeper_PodSecurityContext.() -> Unit = {}) {
  if(this.`podSecurityContext` == null) {
    this.`podSecurityContext` = zookeeper_PodSecurityContext()
  }

  this.`podSecurityContext`.block()
}


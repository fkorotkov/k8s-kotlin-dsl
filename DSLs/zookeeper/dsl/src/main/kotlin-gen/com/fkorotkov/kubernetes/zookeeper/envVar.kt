// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.EnvVar as zookeeper_EnvVar
import com.fkorotkov.kubernetes.zookeeper.InitContainer as zookeeper_InitContainer


fun  zookeeper_InitContainer.`envVar`(block: zookeeper_EnvVar.() -> Unit = {}) {
  if(this.`envVar` == null) {
    this.`envVar` = zookeeper_EnvVar()
  }

  this.`envVar`.block()
}


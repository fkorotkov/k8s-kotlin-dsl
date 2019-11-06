// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Config as zookeeper_Config
import com.fkorotkov.kubernetes.zookeeper.Status as zookeeper_Status


fun  zookeeper_Status.`config`(block: zookeeper_Config.() -> Unit = {}) {
  if(this.`config` == null) {
    this.`config` = zookeeper_Config()
  }

  this.`config`.block()
}


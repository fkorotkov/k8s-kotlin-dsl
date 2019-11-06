// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.JvmConfig as zookeeper_JvmConfig
import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec


fun  zookeeper_Spec.`jvmConfig`(block: zookeeper_JvmConfig.() -> Unit = {}) {
  if(this.`jvmConfig` == null) {
    this.`jvmConfig` = zookeeper_JvmConfig()
  }

  this.`jvmConfig`.block()
}


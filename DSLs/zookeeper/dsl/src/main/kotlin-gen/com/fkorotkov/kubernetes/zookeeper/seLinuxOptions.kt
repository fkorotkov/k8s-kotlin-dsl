// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.PodSecurityContext as zookeeper_PodSecurityContext
import com.fkorotkov.kubernetes.zookeeper.SeLinuxOptions as zookeeper_SeLinuxOptions


fun  zookeeper_PodSecurityContext.`seLinuxOptions`(block: zookeeper_SeLinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = zookeeper_SeLinuxOptions()
  }

  this.`seLinuxOptions`.block()
}


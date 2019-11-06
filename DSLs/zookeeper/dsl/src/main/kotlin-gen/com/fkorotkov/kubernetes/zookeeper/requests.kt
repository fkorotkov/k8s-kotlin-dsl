// GENERATED
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Requests as zookeeper_Requests
import com.fkorotkov.kubernetes.zookeeper.Resources as zookeeper_Resources


fun  zookeeper_Resources.`requests`(block: zookeeper_Requests.() -> Unit = {}) {
  if(this.`requests` == null) {
    this.`requests` = zookeeper_Requests()
  }

  this.`requests`.block()
}


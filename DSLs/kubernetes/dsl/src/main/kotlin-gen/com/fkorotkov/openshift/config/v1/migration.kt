// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.NetworkMigration as v1_NetworkMigration
import io.fabric8.openshift.api.model.config.v1.NetworkStatus as v1_NetworkStatus


fun  v1_NetworkStatus.`migration`(block: v1_NetworkMigration.() -> Unit = {}) {
  if(this.`migration` == null) {
    this.`migration` = v1_NetworkMigration()
  }

  this.`migration`.block()
}


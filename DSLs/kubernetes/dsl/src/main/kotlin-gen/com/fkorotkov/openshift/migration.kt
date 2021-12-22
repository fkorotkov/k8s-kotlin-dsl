// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.NetworkMigration as model_NetworkMigration
import io.fabric8.openshift.api.model.NetworkStatus as model_NetworkStatus


fun  model_NetworkStatus.`migration`(block: model_NetworkMigration.() -> Unit = {}) {
  if(this.`migration` == null) {
    this.`migration` = model_NetworkMigration()
  }

  this.`migration`.block()
}


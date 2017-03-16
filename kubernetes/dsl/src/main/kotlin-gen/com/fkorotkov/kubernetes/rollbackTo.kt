// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig


fun  DeploymentRollback.`rollbackTo`(block: RollbackConfig.() -> Unit = {}) {
  if(this.`rollbackTo` == null) {
    this.`rollbackTo` = RollbackConfig()
  }

  this.`rollbackTo`.block()
}


fun  DeploymentSpec.`rollbackTo`(block: RollbackConfig.() -> Unit = {}) {
  if(this.`rollbackTo` == null) {
    this.`rollbackTo` = RollbackConfig()
  }

  this.`rollbackTo`.block()
}


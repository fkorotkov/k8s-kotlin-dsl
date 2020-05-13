// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback as extensions_DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig as extensions_RollbackConfig


fun  extensions_DeploymentRollback.`rollbackTo`(block: extensions_RollbackConfig.() -> Unit = {}) {
  if(this.`rollbackTo` == null) {
    this.`rollbackTo` = extensions_RollbackConfig()
  }

  this.`rollbackTo`.block()
}


fun  extensions_DeploymentSpec.`rollbackTo`(block: extensions_RollbackConfig.() -> Unit = {}) {
  if(this.`rollbackTo` == null) {
    this.`rollbackTo` = extensions_RollbackConfig()
  }

  this.`rollbackTo`.block()
}


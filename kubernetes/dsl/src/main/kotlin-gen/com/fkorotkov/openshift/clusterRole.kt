// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ScopeRestriction


fun  ScopeRestriction.`clusterRole`(block: OpenshiftClusterRoleScopeRestriction.() -> Unit = {}) {
  if(this.`clusterRole` == null) {
    this.`clusterRole` = OpenshiftClusterRoleScopeRestriction()
  }

  this.`clusterRole`.block()
}


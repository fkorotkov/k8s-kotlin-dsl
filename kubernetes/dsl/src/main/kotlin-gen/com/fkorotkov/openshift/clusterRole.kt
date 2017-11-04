// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ScopeRestriction


fun  ScopeRestriction.`clusterRole`(block: ClusterRoleScopeRestriction.() -> Unit = {}) {
  if(this.`clusterRole` == null) {
    this.`clusterRole` = ClusterRoleScopeRestriction()
  }

  this.`clusterRole`.block()
}


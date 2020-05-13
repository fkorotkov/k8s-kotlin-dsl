// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction as model_ClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ScopeRestriction as model_ScopeRestriction


fun  model_ScopeRestriction.`clusterRole`(block: model_ClusterRoleScopeRestriction.() -> Unit = {}) {
  if(this.`clusterRole` == null) {
    this.`clusterRole` = model_ClusterRoleScopeRestriction()
  }

  this.`clusterRole`.block()
}


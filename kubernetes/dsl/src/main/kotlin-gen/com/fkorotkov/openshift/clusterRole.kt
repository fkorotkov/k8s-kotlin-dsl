// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenshiftClusterRoleScopeRestriction as model_OpenshiftClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ScopeRestriction as model_ScopeRestriction


fun  model_ScopeRestriction.`clusterRole`(block: model_OpenshiftClusterRoleScopeRestriction.() -> Unit = {}) {
  if(this.`clusterRole` == null) {
    this.`clusterRole` = model_OpenshiftClusterRoleScopeRestriction()
  }

  this.`clusterRole`.block()
}


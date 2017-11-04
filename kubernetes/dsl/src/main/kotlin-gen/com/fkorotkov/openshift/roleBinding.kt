// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.NamedClusterRoleBinding
import io.fabric8.openshift.api.model.NamedRoleBinding
import io.fabric8.openshift.api.model.RoleBinding


fun  NamedClusterRoleBinding.`roleBinding`(block: ClusterRoleBinding.() -> Unit = {}) {
  if(this.`roleBinding` == null) {
    this.`roleBinding` = ClusterRoleBinding()
  }

  this.`roleBinding`.block()
}


fun  NamedRoleBinding.`roleBinding`(block: RoleBinding.() -> Unit = {}) {
  if(this.`roleBinding` == null) {
    this.`roleBinding` = RoleBinding()
  }

  this.`roleBinding`.block()
}


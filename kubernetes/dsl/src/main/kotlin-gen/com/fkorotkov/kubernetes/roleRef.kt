// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleRef


fun  ClusterRoleBinding.`roleRef`(block: RoleRef.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = RoleRef()
  }

  this.`roleRef`.block()
}


fun  RoleBinding.`roleRef`(block: RoleRef.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = RoleRef()
  }

  this.`roleRef`.block()
}


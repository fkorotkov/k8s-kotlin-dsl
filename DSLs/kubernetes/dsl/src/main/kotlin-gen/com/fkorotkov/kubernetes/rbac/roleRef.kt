// GENERATED
package com.fkorotkov.kubernetes.rbac

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding as rbac_ClusterRoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleBinding as rbac_RoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleRef as rbac_RoleRef


fun  rbac_ClusterRoleBinding.`roleRef`(block: rbac_RoleRef.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = rbac_RoleRef()
  }

  this.`roleRef`.block()
}


fun  rbac_RoleBinding.`roleRef`(block: rbac_RoleRef.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = rbac_RoleRef()
  }

  this.`roleRef`.block()
}


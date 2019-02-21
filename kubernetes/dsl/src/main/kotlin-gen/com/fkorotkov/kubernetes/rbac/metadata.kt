// GENERATED
package com.fkorotkov.kubernetes.rbac

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.rbac.ClusterRole as rbac_ClusterRole
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding as rbac_ClusterRoleBinding
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList as rbac_ClusterRoleBindingList
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList as rbac_ClusterRoleList
import io.fabric8.kubernetes.api.model.rbac.Role as rbac_Role
import io.fabric8.kubernetes.api.model.rbac.RoleBinding as rbac_RoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList as rbac_RoleBindingList
import io.fabric8.kubernetes.api.model.rbac.RoleList as rbac_RoleList


fun  rbac_ClusterRole.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  rbac_ClusterRoleBinding.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  rbac_ClusterRoleBindingList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  rbac_ClusterRoleList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  rbac_Role.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  rbac_RoleBinding.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  rbac_RoleBindingList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  rbac_RoleList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


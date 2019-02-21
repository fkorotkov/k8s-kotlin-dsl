// GENERATE
package com.fkorotkov.kubernetes.rbac

import io.fabric8.kubernetes.api.model.rbac.AggregationRule as rbac_AggregationRule
import io.fabric8.kubernetes.api.model.rbac.ClusterRole as rbac_ClusterRole
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding as rbac_ClusterRoleBinding
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBindingList as rbac_ClusterRoleBindingList
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleList as rbac_ClusterRoleList
import io.fabric8.kubernetes.api.model.rbac.PolicyRule as rbac_PolicyRule
import io.fabric8.kubernetes.api.model.rbac.Role as rbac_Role
import io.fabric8.kubernetes.api.model.rbac.RoleBinding as rbac_RoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleBindingList as rbac_RoleBindingList
import io.fabric8.kubernetes.api.model.rbac.RoleList as rbac_RoleList
import io.fabric8.kubernetes.api.model.rbac.RoleRef as rbac_RoleRef
import io.fabric8.kubernetes.api.model.rbac.Subject as rbac_Subject


fun newAggregationRule(block : rbac_AggregationRule.() -> Unit = {}): rbac_AggregationRule {
  val instance = rbac_AggregationRule()
  instance.block()
  return instance
}


fun newClusterRole(block : rbac_ClusterRole.() -> Unit = {}): rbac_ClusterRole {
  val instance = rbac_ClusterRole()
  instance.block()
  return instance
}


fun newClusterRoleBinding(block : rbac_ClusterRoleBinding.() -> Unit = {}): rbac_ClusterRoleBinding {
  val instance = rbac_ClusterRoleBinding()
  instance.block()
  return instance
}


fun newClusterRoleBindingList(block : rbac_ClusterRoleBindingList.() -> Unit = {}): rbac_ClusterRoleBindingList {
  val instance = rbac_ClusterRoleBindingList()
  instance.block()
  return instance
}


fun newClusterRoleList(block : rbac_ClusterRoleList.() -> Unit = {}): rbac_ClusterRoleList {
  val instance = rbac_ClusterRoleList()
  instance.block()
  return instance
}


fun newPolicyRule(block : rbac_PolicyRule.() -> Unit = {}): rbac_PolicyRule {
  val instance = rbac_PolicyRule()
  instance.block()
  return instance
}


fun newRole(block : rbac_Role.() -> Unit = {}): rbac_Role {
  val instance = rbac_Role()
  instance.block()
  return instance
}


fun newRoleBinding(block : rbac_RoleBinding.() -> Unit = {}): rbac_RoleBinding {
  val instance = rbac_RoleBinding()
  instance.block()
  return instance
}


fun newRoleBindingList(block : rbac_RoleBindingList.() -> Unit = {}): rbac_RoleBindingList {
  val instance = rbac_RoleBindingList()
  instance.block()
  return instance
}


fun newRoleList(block : rbac_RoleList.() -> Unit = {}): rbac_RoleList {
  val instance = rbac_RoleList()
  instance.block()
  return instance
}


fun newRoleRef(block : rbac_RoleRef.() -> Unit = {}): rbac_RoleRef {
  val instance = rbac_RoleRef()
  instance.block()
  return instance
}


fun newSubject(block : rbac_Subject.() -> Unit = {}): rbac_Subject {
  val instance = rbac_Subject()
  instance.block()
  return instance
}


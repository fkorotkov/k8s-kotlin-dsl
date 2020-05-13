// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.ClusterRoleBinding as model_ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding as model_RoleBinding


fun  model_ClusterRoleBinding.`roleRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = model_ObjectReference()
  }

  this.`roleRef`.block()
}


fun  model_RoleBinding.`roleRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = model_ObjectReference()
  }

  this.`roleRef`.block()
}


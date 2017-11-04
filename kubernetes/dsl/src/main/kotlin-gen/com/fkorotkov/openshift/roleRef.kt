// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding


fun  ClusterRoleBinding.`roleRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = ObjectReference()
  }

  this.`roleRef`.block()
}


fun  RoleBinding.`roleRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = ObjectReference()
  }

  this.`roleRef`.block()
}


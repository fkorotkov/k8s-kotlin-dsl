// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding
import io.fabric8.openshift.api.model.OpenshiftRoleBinding


fun  OpenshiftClusterRoleBinding.`roleRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = ObjectReference()
  }

  this.`roleRef`.block()
}


fun  OpenshiftRoleBinding.`roleRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = ObjectReference()
  }

  this.`roleRef`.block()
}


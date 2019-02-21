// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding as model_OpenshiftClusterRoleBinding
import io.fabric8.openshift.api.model.OpenshiftRoleBinding as model_OpenshiftRoleBinding


fun  model_OpenshiftClusterRoleBinding.`roleRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = model_ObjectReference()
  }

  this.`roleRef`.block()
}


fun  model_OpenshiftRoleBinding.`roleRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = model_ObjectReference()
  }

  this.`roleRef`.block()
}


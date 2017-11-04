// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.openshift.api.model.ClusterPolicyBinding
import io.fabric8.openshift.api.model.PolicyBinding


fun  ClusterPolicyBinding.`policyRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`policyRef` == null) {
    this.`policyRef` = ObjectReference()
  }

  this.`policyRef`.block()
}


fun  PolicyBinding.`policyRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`policyRef` == null) {
    this.`policyRef` = ObjectReference()
  }

  this.`policyRef`.block()
}


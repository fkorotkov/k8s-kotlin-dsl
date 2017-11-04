// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRole
import io.fabric8.openshift.api.model.NamedClusterRole
import io.fabric8.openshift.api.model.NamedRole
import io.fabric8.openshift.api.model.Role


fun  NamedClusterRole.`role`(block: ClusterRole.() -> Unit = {}) {
  if(this.`role` == null) {
    this.`role` = ClusterRole()
  }

  this.`role`.block()
}


fun  NamedRole.`role`(block: Role.() -> Unit = {}) {
  if(this.`role` == null) {
    this.`role` = Role()
  }

  this.`role`.block()
}


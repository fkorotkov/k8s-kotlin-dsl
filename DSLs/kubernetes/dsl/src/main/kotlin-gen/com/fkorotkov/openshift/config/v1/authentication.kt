// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ConsoleAuthentication as v1_ConsoleAuthentication
import io.fabric8.openshift.api.model.config.v1.ConsoleSpec as v1_ConsoleSpec


fun  v1_ConsoleSpec.`authentication`(block: v1_ConsoleAuthentication.() -> Unit = {}) {
  if(this.`authentication` == null) {
    this.`authentication` = v1_ConsoleAuthentication()
  }

  this.`authentication`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConsoleAuthentication as model_ConsoleAuthentication
import io.fabric8.openshift.api.model.ConsoleSpec as model_ConsoleSpec


fun  model_ConsoleSpec.`authentication`(block: model_ConsoleAuthentication.() -> Unit = {}) {
  if(this.`authentication` == null) {
    this.`authentication` = model_ConsoleAuthentication()
  }

  this.`authentication`.block()
}


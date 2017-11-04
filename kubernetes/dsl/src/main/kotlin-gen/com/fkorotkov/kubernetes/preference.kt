// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeSelectorTerm
import io.fabric8.kubernetes.api.model.PreferredSchedulingTerm


fun  PreferredSchedulingTerm.`preference`(block: NodeSelectorTerm.() -> Unit = {}) {
  if(this.`preference` == null) {
    this.`preference` = NodeSelectorTerm()
  }

  this.`preference`.block()
}


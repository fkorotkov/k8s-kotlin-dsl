// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeSelectorTerm as model_NodeSelectorTerm
import io.fabric8.kubernetes.api.model.PreferredSchedulingTerm as model_PreferredSchedulingTerm


fun  model_PreferredSchedulingTerm.`preference`(block: model_NodeSelectorTerm.() -> Unit = {}) {
  if(this.`preference` == null) {
    this.`preference` = model_NodeSelectorTerm()
  }

  this.`preference`.block()
}


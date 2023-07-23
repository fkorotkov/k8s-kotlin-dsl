// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.openshift.api.model.config.v1.RequiredHSTSPolicy as v1_RequiredHSTSPolicy


fun  v1_RequiredHSTSPolicy.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


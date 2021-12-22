// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.openshift.api.model.RequiredHSTSPolicy as model_RequiredHSTSPolicy


fun  model_RequiredHSTSPolicy.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources


fun  v1alpha1_MatchResources.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ResourceQuotaSpec as model_ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.ScopeSelector as model_ScopeSelector


fun  model_ResourceQuotaSpec.`scopeSelector`(block: model_ScopeSelector.() -> Unit = {}) {
  if(this.`scopeSelector` == null) {
    this.`scopeSelector` = model_ScopeSelector()
  }

  this.`scopeSelector`.block()
}


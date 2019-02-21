// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.ScopeSelector


fun  ResourceQuotaSpec.`scopeSelector`(block: ScopeSelector.() -> Unit = {}) {
  if(this.`scopeSelector` == null) {
    this.`scopeSelector` = ScopeSelector()
  }

  this.`scopeSelector`.block()
}


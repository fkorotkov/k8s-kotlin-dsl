// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ClaimSource as model_ClaimSource
import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventSource as model_EventSource
import io.fabric8.kubernetes.api.model.PodResourceClaim as model_PodResourceClaim


fun  model_Event.`source`(block: model_EventSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = model_EventSource()
  }

  this.`source`.block()
}


fun  model_PodResourceClaim.`source`(block: model_ClaimSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = model_ClaimSource()
  }

  this.`source`.block()
}


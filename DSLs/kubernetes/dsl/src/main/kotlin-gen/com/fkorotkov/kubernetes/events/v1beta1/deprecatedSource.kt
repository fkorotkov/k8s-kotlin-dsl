// GENERATED
package com.fkorotkov.kubernetes.events.v1beta1

import io.fabric8.kubernetes.api.model.EventSource as model_EventSource
import io.fabric8.kubernetes.api.model.events.v1beta1.Event as v1beta1_Event


fun  v1beta1_Event.`deprecatedSource`(block: model_EventSource.() -> Unit = {}) {
  if(this.`deprecatedSource` == null) {
    this.`deprecatedSource` = model_EventSource()
  }

  this.`deprecatedSource`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionResponse as v1_ConversionResponse


fun  v1_ConversionResponse.`result`(block: model_Status.() -> Unit = {}) {
  if(this.`result` == null) {
    this.`result` = model_Status()
  }

  this.`result`.block()
}


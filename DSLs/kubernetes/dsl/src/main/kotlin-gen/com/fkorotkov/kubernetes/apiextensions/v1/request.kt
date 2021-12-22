// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionRequest as v1_ConversionRequest
import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionReview as v1_ConversionReview


fun  v1_ConversionReview.`request`(block: v1_ConversionRequest.() -> Unit = {}) {
  if(this.`request` == null) {
    this.`request` = v1_ConversionRequest()
  }

  this.`request`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus
import io.fabric8.kubernetes.api.model.extensions.Scale as extensions_Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleStatus as extensions_ScaleStatus


fun  extensions_Ingress.`status`(block: extensions_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = extensions_IngressStatus()
  }

  this.`status`.block()
}


fun  extensions_Scale.`status`(block: extensions_ScaleStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = extensions_ScaleStatus()
  }

  this.`status`.block()
}


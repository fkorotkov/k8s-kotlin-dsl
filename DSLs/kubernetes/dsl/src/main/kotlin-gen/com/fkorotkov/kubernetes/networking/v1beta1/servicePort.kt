// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressBackend as v1beta1_IngressBackend


fun  v1beta1_IngressBackend.`servicePort`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`servicePort` == null) {
    this.`servicePort` = model_IntOrString()
  }

  this.`servicePort`.block()
}


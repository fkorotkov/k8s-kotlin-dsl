// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath
import io.fabric8.kubernetes.api.model.extensions.IngressBackend
import io.fabric8.kubernetes.api.model.extensions.IngressSpec


fun  HTTPIngressPath.`backend`(block: IngressBackend.() -> Unit = {}) {
  if(this.`backend` == null) {
    this.`backend` = IngressBackend()
  }

  this.`backend`.block()
}


fun  IngressSpec.`backend`(block: IngressBackend.() -> Unit = {}) {
  if(this.`backend` == null) {
    this.`backend` = IngressBackend()
  }

  this.`backend`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy as extensions_PodSecurityPolicy
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.Scale as extensions_Scale
import io.fabric8.kubernetes.api.model.extensions.ScaleSpec as extensions_ScaleSpec


fun  extensions_Ingress.`spec`(block: extensions_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_IngressSpec()
  }

  this.`spec`.block()
}


fun  extensions_PodSecurityPolicy.`spec`(block: extensions_PodSecurityPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_PodSecurityPolicySpec()
  }

  this.`spec`.block()
}


fun  extensions_Scale.`spec`(block: extensions_ScaleSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_ScaleSpec()
  }

  this.`spec`.block()
}


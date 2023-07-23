// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference
import io.fabric8.openshift.api.model.config.v1.ProxySpec as v1_ProxySpec


fun  v1_ProxySpec.`trustedCA`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`trustedCA` == null) {
    this.`trustedCA` = v1_ConfigMapNameReference()
  }

  this.`trustedCA`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference
import io.fabric8.openshift.api.model.ProxySpec as model_ProxySpec


fun  model_ProxySpec.`trustedCA`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`trustedCA` == null) {
    this.`trustedCA` = model_ConfigMapNameReference()
  }

  this.`trustedCA`.block()
}


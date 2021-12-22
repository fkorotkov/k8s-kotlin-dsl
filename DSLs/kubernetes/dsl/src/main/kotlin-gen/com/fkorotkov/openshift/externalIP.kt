// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ExternalIPConfig as model_ExternalIPConfig
import io.fabric8.openshift.api.model.NetworkSpec as model_NetworkSpec


fun  model_NetworkSpec.`externalIP`(block: model_ExternalIPConfig.() -> Unit = {}) {
  if(this.`externalIP` == null) {
    this.`externalIP` = model_ExternalIPConfig()
  }

  this.`externalIP`.block()
}


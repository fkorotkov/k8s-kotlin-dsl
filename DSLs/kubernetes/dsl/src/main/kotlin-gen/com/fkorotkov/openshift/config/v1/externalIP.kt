// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ExternalIPConfig as v1_ExternalIPConfig
import io.fabric8.openshift.api.model.config.v1.NetworkSpec as v1_NetworkSpec


fun  v1_NetworkSpec.`externalIP`(block: v1_ExternalIPConfig.() -> Unit = {}) {
  if(this.`externalIP` == null) {
    this.`externalIP` = v1_ExternalIPConfig()
  }

  this.`externalIP`.block()
}


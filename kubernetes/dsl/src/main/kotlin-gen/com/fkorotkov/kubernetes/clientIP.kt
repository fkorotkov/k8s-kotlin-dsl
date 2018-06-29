// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ClientIPConfig
import io.fabric8.kubernetes.api.model.SessionAffinityConfig


fun  SessionAffinityConfig.`clientIP`(block: ClientIPConfig.() -> Unit = {}) {
  if(this.`clientIP` == null) {
    this.`clientIP` = ClientIPConfig()
  }

  this.`clientIP`.block()
}


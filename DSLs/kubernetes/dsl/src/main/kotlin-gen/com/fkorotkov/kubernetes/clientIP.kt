// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ClientIPConfig as model_ClientIPConfig
import io.fabric8.kubernetes.api.model.SessionAffinityConfig as model_SessionAffinityConfig


fun  model_SessionAffinityConfig.`clientIP`(block: model_ClientIPConfig.() -> Unit = {}) {
  if(this.`clientIP` == null) {
    this.`clientIP` = model_ClientIPConfig()
  }

  this.`clientIP`.block()
}


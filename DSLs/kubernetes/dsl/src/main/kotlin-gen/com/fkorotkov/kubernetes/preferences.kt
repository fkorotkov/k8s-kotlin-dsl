// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Config as model_Config
import io.fabric8.kubernetes.api.model.Preferences as model_Preferences


fun  model_Config.`preferences`(block: model_Preferences.() -> Unit = {}) {
  if(this.`preferences` == null) {
    this.`preferences` = model_Preferences()
  }

  this.`preferences`.block()
}


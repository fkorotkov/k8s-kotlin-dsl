// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Config
import io.fabric8.kubernetes.api.model.Preferences


fun  Config.`preferences`(block: Preferences.() -> Unit = {}) {
  if(this.`preferences` == null) {
    this.`preferences` = Preferences()
  }

  this.`preferences`.block()
}


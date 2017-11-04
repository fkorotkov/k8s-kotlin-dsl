// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy
import io.fabric8.openshift.api.model.ImageChangeTrigger


fun  BuildTriggerPolicy.`imageChange`(block: ImageChangeTrigger.() -> Unit = {}) {
  if(this.`imageChange` == null) {
    this.`imageChange` = ImageChangeTrigger()
  }

  this.`imageChange`.block()
}


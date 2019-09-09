// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy as model_BuildTriggerPolicy
import io.fabric8.openshift.api.model.ImageChangeTrigger as model_ImageChangeTrigger


fun  model_BuildTriggerPolicy.`imageChange`(block: model_ImageChangeTrigger.() -> Unit = {}) {
  if(this.`imageChange` == null) {
    this.`imageChange` = model_ImageChangeTrigger()
  }

  this.`imageChange`.block()
}


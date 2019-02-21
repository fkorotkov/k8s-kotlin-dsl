// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause as model_BuildTriggerCause
import io.fabric8.openshift.api.model.ImageChangeCause as model_ImageChangeCause


fun  model_BuildTriggerCause.`imageChangeBuild`(block: model_ImageChangeCause.() -> Unit = {}) {
  if(this.`imageChangeBuild` == null) {
    this.`imageChangeBuild` = model_ImageChangeCause()
  }

  this.`imageChangeBuild`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerCause
import io.fabric8.openshift.api.model.ImageChangeCause


fun  BuildTriggerCause.`imageChangeBuild`(block: ImageChangeCause.() -> Unit = {}) {
  if(this.`imageChangeBuild` == null) {
    this.`imageChangeBuild` = ImageChangeCause()
  }

  this.`imageChangeBuild`.block()
}


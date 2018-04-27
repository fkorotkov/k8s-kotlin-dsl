// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.runtime.RawExtension
import io.fabric8.openshift.api.model.Image


fun  Image.`dockerImageMetadata`(block: RawExtension.() -> Unit = {}) {
  if(this.`dockerImageMetadata` == null) {
    this.`dockerImageMetadata` = RawExtension()
  }

  this.`dockerImageMetadata`.block()
}


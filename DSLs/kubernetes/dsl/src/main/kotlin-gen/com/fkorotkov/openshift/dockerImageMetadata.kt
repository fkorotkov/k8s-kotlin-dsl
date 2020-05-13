// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image as model_Image
import io.fabric8.openshift.api.model.runtime.RawExtension as runtime_RawExtension


fun  model_Image.`dockerImageMetadata`(block: runtime_RawExtension.() -> Unit = {}) {
  if(this.`dockerImageMetadata` == null) {
    this.`dockerImageMetadata` = runtime_RawExtension()
  }

  this.`dockerImageMetadata`.block()
}


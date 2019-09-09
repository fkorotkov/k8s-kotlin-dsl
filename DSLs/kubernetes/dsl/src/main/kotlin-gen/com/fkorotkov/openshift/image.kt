// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image as model_Image
import io.fabric8.openshift.api.model.ImageImportStatus as model_ImageImportStatus
import io.fabric8.openshift.api.model.ImageStreamTag as model_ImageStreamTag


fun  model_ImageImportStatus.`image`(block: model_Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = model_Image()
  }

  this.`image`.block()
}


fun  model_ImageStreamTag.`image`(block: model_Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = model_Image()
  }

  this.`image`.block()
}


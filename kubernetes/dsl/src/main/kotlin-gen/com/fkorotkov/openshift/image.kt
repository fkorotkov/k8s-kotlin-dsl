// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image
import io.fabric8.openshift.api.model.ImageImportStatus
import io.fabric8.openshift.api.model.ImageStreamTag


fun  ImageImportStatus.`image`(block: Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = Image()
  }

  this.`image`.block()
}


fun  ImageStreamTag.`image`(block: Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = Image()
  }

  this.`image`.block()
}


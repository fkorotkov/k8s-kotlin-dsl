// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image as model_Image
import io.fabric8.openshift.api.model.ImageImportStatus as model_ImageImportStatus
import io.fabric8.openshift.api.model.ImageStreamImage as model_ImageStreamImage
import io.fabric8.openshift.api.model.ImageStreamMapping as model_ImageStreamMapping
import io.fabric8.openshift.api.model.ImageStreamTag as model_ImageStreamTag
import io.fabric8.openshift.api.model.ImageTag as model_ImageTag


fun  model_ImageImportStatus.`image`(block: model_Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = model_Image()
  }

  this.`image`.block()
}


fun  model_ImageStreamImage.`image`(block: model_Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = model_Image()
  }

  this.`image`.block()
}


fun  model_ImageStreamMapping.`image`(block: model_Image.() -> Unit = {}) {
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


fun  model_ImageTag.`image`(block: model_Image.() -> Unit = {}) {
  if(this.`image` == null) {
    this.`image` = model_Image()
  }

  this.`image`.block()
}


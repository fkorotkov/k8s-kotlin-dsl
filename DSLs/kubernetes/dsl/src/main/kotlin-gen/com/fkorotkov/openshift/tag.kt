// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStreamTag as model_ImageStreamTag
import io.fabric8.openshift.api.model.TagReference as model_TagReference


fun  model_ImageStreamTag.`tag`(block: model_TagReference.() -> Unit = {}) {
  if(this.`tag` == null) {
    this.`tag` = model_TagReference()
  }

  this.`tag`.block()
}


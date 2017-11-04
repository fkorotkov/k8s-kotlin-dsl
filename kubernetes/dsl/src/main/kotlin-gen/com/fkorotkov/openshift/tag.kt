// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStreamTag
import io.fabric8.openshift.api.model.TagReference


fun  ImageStreamTag.`tag`(block: TagReference.() -> Unit = {}) {
  if(this.`tag` == null) {
    this.`tag` = TagReference()
  }

  this.`tag`.block()
}


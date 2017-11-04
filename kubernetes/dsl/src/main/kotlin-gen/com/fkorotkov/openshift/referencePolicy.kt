// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.TagReference
import io.fabric8.openshift.api.model.TagReferencePolicy


fun  TagReference.`referencePolicy`(block: TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageLookupPolicy
import io.fabric8.openshift.api.model.ImageStreamSpec
import io.fabric8.openshift.api.model.ImageStreamTag


fun  ImageStreamSpec.`lookupPolicy`(block: ImageLookupPolicy.() -> Unit = {}) {
  if(this.`lookupPolicy` == null) {
    this.`lookupPolicy` = ImageLookupPolicy()
  }

  this.`lookupPolicy`.block()
}


fun  ImageStreamTag.`lookupPolicy`(block: ImageLookupPolicy.() -> Unit = {}) {
  if(this.`lookupPolicy` == null) {
    this.`lookupPolicy` = ImageLookupPolicy()
  }

  this.`lookupPolicy`.block()
}


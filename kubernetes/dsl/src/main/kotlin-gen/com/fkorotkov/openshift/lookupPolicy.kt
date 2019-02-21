// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageLookupPolicy as model_ImageLookupPolicy
import io.fabric8.openshift.api.model.ImageStreamSpec as model_ImageStreamSpec
import io.fabric8.openshift.api.model.ImageStreamTag as model_ImageStreamTag


fun  model_ImageStreamSpec.`lookupPolicy`(block: model_ImageLookupPolicy.() -> Unit = {}) {
  if(this.`lookupPolicy` == null) {
    this.`lookupPolicy` = model_ImageLookupPolicy()
  }

  this.`lookupPolicy`.block()
}


fun  model_ImageStreamTag.`lookupPolicy`(block: model_ImageLookupPolicy.() -> Unit = {}) {
  if(this.`lookupPolicy` == null) {
    this.`lookupPolicy` = model_ImageLookupPolicy()
  }

  this.`lookupPolicy`.block()
}


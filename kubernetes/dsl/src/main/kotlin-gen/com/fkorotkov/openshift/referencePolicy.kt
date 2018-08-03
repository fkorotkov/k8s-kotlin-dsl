// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageImportSpec
import io.fabric8.openshift.api.model.RepositoryImportSpec
import io.fabric8.openshift.api.model.TagReference
import io.fabric8.openshift.api.model.TagReferencePolicy


fun  ImageImportSpec.`referencePolicy`(block: TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


fun  RepositoryImportSpec.`referencePolicy`(block: TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


fun  TagReference.`referencePolicy`(block: TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


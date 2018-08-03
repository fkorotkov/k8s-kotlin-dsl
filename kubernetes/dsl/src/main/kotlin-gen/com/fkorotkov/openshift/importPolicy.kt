// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageImportSpec
import io.fabric8.openshift.api.model.RepositoryImportSpec
import io.fabric8.openshift.api.model.TagImportPolicy
import io.fabric8.openshift.api.model.TagReference


fun  ImageImportSpec.`importPolicy`(block: TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = TagImportPolicy()
  }

  this.`importPolicy`.block()
}


fun  RepositoryImportSpec.`importPolicy`(block: TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = TagImportPolicy()
  }

  this.`importPolicy`.block()
}


fun  TagReference.`importPolicy`(block: TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = TagImportPolicy()
  }

  this.`importPolicy`.block()
}


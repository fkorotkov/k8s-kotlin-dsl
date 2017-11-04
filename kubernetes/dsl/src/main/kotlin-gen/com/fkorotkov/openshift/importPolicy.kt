// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.TagImportPolicy
import io.fabric8.openshift.api.model.TagReference


fun  TagReference.`importPolicy`(block: TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = TagImportPolicy()
  }

  this.`importPolicy`.block()
}


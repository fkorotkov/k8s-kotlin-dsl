// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageImportSpec as model_ImageImportSpec
import io.fabric8.openshift.api.model.RepositoryImportSpec as model_RepositoryImportSpec
import io.fabric8.openshift.api.model.TagImportPolicy as model_TagImportPolicy
import io.fabric8.openshift.api.model.TagReference as model_TagReference


fun  model_ImageImportSpec.`importPolicy`(block: model_TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = model_TagImportPolicy()
  }

  this.`importPolicy`.block()
}


fun  model_RepositoryImportSpec.`importPolicy`(block: model_TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = model_TagImportPolicy()
  }

  this.`importPolicy`.block()
}


fun  model_TagReference.`importPolicy`(block: model_TagImportPolicy.() -> Unit = {}) {
  if(this.`importPolicy` == null) {
    this.`importPolicy` = model_TagImportPolicy()
  }

  this.`importPolicy`.block()
}


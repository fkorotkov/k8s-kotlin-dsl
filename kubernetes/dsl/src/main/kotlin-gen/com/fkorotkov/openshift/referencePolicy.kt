// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageImportSpec as model_ImageImportSpec
import io.fabric8.openshift.api.model.RepositoryImportSpec as model_RepositoryImportSpec
import io.fabric8.openshift.api.model.TagReference as model_TagReference
import io.fabric8.openshift.api.model.TagReferencePolicy as model_TagReferencePolicy


fun  model_ImageImportSpec.`referencePolicy`(block: model_TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = model_TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


fun  model_RepositoryImportSpec.`referencePolicy`(block: model_TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = model_TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


fun  model_TagReference.`referencePolicy`(block: model_TagReferencePolicy.() -> Unit = {}) {
  if(this.`referencePolicy` == null) {
    this.`referencePolicy` = model_TagReferencePolicy()
  }

  this.`referencePolicy`.block()
}


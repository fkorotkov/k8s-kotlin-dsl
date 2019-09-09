// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStreamImportSpec as model_ImageStreamImportSpec
import io.fabric8.openshift.api.model.ImageStreamImportStatus as model_ImageStreamImportStatus
import io.fabric8.openshift.api.model.RepositoryImportSpec as model_RepositoryImportSpec
import io.fabric8.openshift.api.model.RepositoryImportStatus as model_RepositoryImportStatus


fun  model_ImageStreamImportSpec.`repository`(block: model_RepositoryImportSpec.() -> Unit = {}) {
  if(this.`repository` == null) {
    this.`repository` = model_RepositoryImportSpec()
  }

  this.`repository`.block()
}


fun  model_ImageStreamImportStatus.`repository`(block: model_RepositoryImportStatus.() -> Unit = {}) {
  if(this.`repository` == null) {
    this.`repository` = model_RepositoryImportStatus()
  }

  this.`repository`.block()
}


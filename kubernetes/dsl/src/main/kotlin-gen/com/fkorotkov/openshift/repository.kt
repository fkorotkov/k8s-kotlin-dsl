// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStreamImportSpec
import io.fabric8.openshift.api.model.ImageStreamImportStatus
import io.fabric8.openshift.api.model.RepositoryImportSpec
import io.fabric8.openshift.api.model.RepositoryImportStatus


fun  ImageStreamImportSpec.`repository`(block: RepositoryImportSpec.() -> Unit = {}) {
  if(this.`repository` == null) {
    this.`repository` = RepositoryImportSpec()
  }

  this.`repository`.block()
}


fun  ImageStreamImportStatus.`repository`(block: RepositoryImportStatus.() -> Unit = {}) {
  if(this.`repository` == null) {
    this.`repository` = RepositoryImportStatus()
  }

  this.`repository`.block()
}


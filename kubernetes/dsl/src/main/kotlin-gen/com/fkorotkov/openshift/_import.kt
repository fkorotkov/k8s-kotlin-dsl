// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImportStatus as model_ImageStreamImportStatus


fun  model_ImageStreamImportStatus.`_import`(block: model_ImageStream.() -> Unit = {}) {
  if(this.`import` == null) {
    this.`import` = model_ImageStream()
  }

  this.`import`.block()
}


// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStream
import io.fabric8.openshift.api.model.ImageStreamImportStatus


fun  ImageStreamImportStatus.`_import`(block: ImageStream.() -> Unit = {}) {
  if(this.`import` == null) {
    this.`import` = ImageStream()
  }

  this.`import`.block()
}


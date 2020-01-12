// GENERATED
package com.fkorotkov.kubernetes.storage.v1beta1

import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriver as v1beta1_CSIDriver
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriverSpec as v1beta1_CSIDriverSpec
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINode as v1beta1_CSINode
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINodeSpec as v1beta1_CSINodeSpec


fun  v1beta1_CSIDriver.`spec`(block: v1beta1_CSIDriverSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_CSIDriverSpec()
  }

  this.`spec`.block()
}


fun  v1beta1_CSINode.`spec`(block: v1beta1_CSINodeSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_CSINodeSpec()
  }

  this.`spec`.block()
}


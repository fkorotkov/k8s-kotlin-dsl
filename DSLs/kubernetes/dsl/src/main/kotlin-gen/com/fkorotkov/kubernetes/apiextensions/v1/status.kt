// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition as v1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionStatus as v1_CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresourceStatus as v1_CustomResourceSubresourceStatus
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresources as v1_CustomResourceSubresources


fun  v1_CustomResourceDefinition.`status`(block: v1_CustomResourceDefinitionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_CustomResourceDefinitionStatus()
  }

  this.`status`.block()
}


fun  v1_CustomResourceSubresources.`status`(block: v1_CustomResourceSubresourceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_CustomResourceSubresourceStatus()
  }

  this.`status`.block()
}


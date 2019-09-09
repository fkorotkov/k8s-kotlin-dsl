// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition as apiextensions_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus as apiextensions_CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceStatus as apiextensions_CustomResourceSubresourceStatus
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources as apiextensions_CustomResourceSubresources


fun  apiextensions_CustomResourceDefinition.`status`(block: apiextensions_CustomResourceDefinitionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = apiextensions_CustomResourceDefinitionStatus()
  }

  this.`status`.block()
}


fun  apiextensions_CustomResourceSubresources.`status`(block: apiextensions_CustomResourceSubresourceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = apiextensions_CustomResourceSubresourceStatus()
  }

  this.`status`.block()
}


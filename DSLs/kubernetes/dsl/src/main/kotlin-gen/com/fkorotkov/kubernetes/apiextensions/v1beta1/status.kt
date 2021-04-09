// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinition as v1beta1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionStatus as v1beta1_CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceSubresourceStatus as v1beta1_CustomResourceSubresourceStatus
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceSubresources as v1beta1_CustomResourceSubresources


fun  v1beta1_CustomResourceDefinition.`status`(block: v1beta1_CustomResourceDefinitionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1beta1_CustomResourceDefinitionStatus()
  }

  this.`status`.block()
}


fun  v1beta1_CustomResourceSubresources.`status`(block: v1beta1_CustomResourceSubresourceStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1beta1_CustomResourceSubresourceStatus()
  }

  this.`status`.block()
}


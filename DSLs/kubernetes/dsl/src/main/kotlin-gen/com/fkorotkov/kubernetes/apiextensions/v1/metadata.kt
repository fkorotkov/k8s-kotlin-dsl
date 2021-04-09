// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition as v1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionList as v1_CustomResourceDefinitionList


fun  v1_CustomResourceDefinition.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_CustomResourceDefinitionList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


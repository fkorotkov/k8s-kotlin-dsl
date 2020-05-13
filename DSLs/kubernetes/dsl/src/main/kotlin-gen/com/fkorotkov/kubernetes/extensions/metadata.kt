// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressList as extensions_IngressList


fun  extensions_Ingress.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  extensions_IngressList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


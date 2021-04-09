// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress as v1beta1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass as v1beta1_IngressClass
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList as v1beta1_IngressClassList
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList as v1beta1_IngressList


fun  v1beta1_Ingress.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_IngressClass.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_IngressClassList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_IngressList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.discovery.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSlice as v1beta1_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSliceList as v1beta1_EndpointSliceList


fun  v1beta1_EndpointSlice.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_EndpointSliceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


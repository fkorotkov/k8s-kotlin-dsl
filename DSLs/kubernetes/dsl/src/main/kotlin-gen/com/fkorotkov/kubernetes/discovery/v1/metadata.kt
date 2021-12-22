// GENERATED
package com.fkorotkov.kubernetes.discovery.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointSlice as v1_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointSliceList as v1_EndpointSliceList


fun  v1_EndpointSlice.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_EndpointSliceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


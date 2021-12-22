// GENERATE
package com.fkorotkov.kubernetes.discovery.v1beta1

import io.fabric8.kubernetes.api.model.discovery.v1beta1.Endpoint as v1beta1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointConditions as v1beta1_EndpointConditions
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointHints as v1beta1_EndpointHints
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointPort as v1beta1_EndpointPort
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSlice as v1beta1_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSliceList as v1beta1_EndpointSliceList
import io.fabric8.kubernetes.api.model.discovery.v1beta1.ForZone as v1beta1_ForZone


fun newEndpoint(block : v1beta1_Endpoint.() -> Unit = {}): v1beta1_Endpoint {
  val instance = v1beta1_Endpoint()
  instance.block()
  return instance
}


fun newEndpointConditions(block : v1beta1_EndpointConditions.() -> Unit = {}): v1beta1_EndpointConditions {
  val instance = v1beta1_EndpointConditions()
  instance.block()
  return instance
}


fun newEndpointHints(block : v1beta1_EndpointHints.() -> Unit = {}): v1beta1_EndpointHints {
  val instance = v1beta1_EndpointHints()
  instance.block()
  return instance
}


fun newEndpointPort(block : v1beta1_EndpointPort.() -> Unit = {}): v1beta1_EndpointPort {
  val instance = v1beta1_EndpointPort()
  instance.block()
  return instance
}


fun newEndpointSlice(block : v1beta1_EndpointSlice.() -> Unit = {}): v1beta1_EndpointSlice {
  val instance = v1beta1_EndpointSlice()
  instance.block()
  return instance
}


fun newEndpointSliceList(block : v1beta1_EndpointSliceList.() -> Unit = {}): v1beta1_EndpointSliceList {
  val instance = v1beta1_EndpointSliceList()
  instance.block()
  return instance
}


fun newForZone(block : v1beta1_ForZone.() -> Unit = {}): v1beta1_ForZone {
  val instance = v1beta1_ForZone()
  instance.block()
  return instance
}


// GENERATE
package com.fkorotkov.kubernetes.discovery.v1

import io.fabric8.kubernetes.api.model.discovery.v1.Endpoint as v1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointConditions as v1_EndpointConditions
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointHints as v1_EndpointHints
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointPort as v1_EndpointPort
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointSlice as v1_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointSliceList as v1_EndpointSliceList
import io.fabric8.kubernetes.api.model.discovery.v1.ForZone as v1_ForZone


fun newEndpoint(block : v1_Endpoint.() -> Unit = {}): v1_Endpoint {
  val instance = v1_Endpoint()
  instance.block()
  return instance
}


fun newEndpointConditions(block : v1_EndpointConditions.() -> Unit = {}): v1_EndpointConditions {
  val instance = v1_EndpointConditions()
  instance.block()
  return instance
}


fun newEndpointHints(block : v1_EndpointHints.() -> Unit = {}): v1_EndpointHints {
  val instance = v1_EndpointHints()
  instance.block()
  return instance
}


fun newEndpointPort(block : v1_EndpointPort.() -> Unit = {}): v1_EndpointPort {
  val instance = v1_EndpointPort()
  instance.block()
  return instance
}


fun newEndpointSlice(block : v1_EndpointSlice.() -> Unit = {}): v1_EndpointSlice {
  val instance = v1_EndpointSlice()
  instance.block()
  return instance
}


fun newEndpointSliceList(block : v1_EndpointSliceList.() -> Unit = {}): v1_EndpointSliceList {
  val instance = v1_EndpointSliceList()
  instance.block()
  return instance
}


fun newForZone(block : v1_ForZone.() -> Unit = {}): v1_ForZone {
  val instance = v1_ForZone()
  instance.block()
  return instance
}


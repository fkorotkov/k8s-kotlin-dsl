// GENERATE
package com.fkorotkov.kubernetes.discovery

import io.fabric8.kubernetes.api.model.discovery.Endpoint as discovery_Endpoint
import io.fabric8.kubernetes.api.model.discovery.EndpointConditions as discovery_EndpointConditions
import io.fabric8.kubernetes.api.model.discovery.EndpointPort as discovery_EndpointPort
import io.fabric8.kubernetes.api.model.discovery.EndpointSlice as discovery_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.EndpointSliceList as discovery_EndpointSliceList


fun newEndpoint(block : discovery_Endpoint.() -> Unit = {}): discovery_Endpoint {
  val instance = discovery_Endpoint()
  instance.block()
  return instance
}


fun newEndpointConditions(block : discovery_EndpointConditions.() -> Unit = {}): discovery_EndpointConditions {
  val instance = discovery_EndpointConditions()
  instance.block()
  return instance
}


fun newEndpointPort(block : discovery_EndpointPort.() -> Unit = {}): discovery_EndpointPort {
  val instance = discovery_EndpointPort()
  instance.block()
  return instance
}


fun newEndpointSlice(block : discovery_EndpointSlice.() -> Unit = {}): discovery_EndpointSlice {
  val instance = discovery_EndpointSlice()
  instance.block()
  return instance
}


fun newEndpointSliceList(block : discovery_EndpointSliceList.() -> Unit = {}): discovery_EndpointSliceList {
  val instance = discovery_EndpointSliceList()
  instance.block()
  return instance
}


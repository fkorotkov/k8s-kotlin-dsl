package com.fkorotkov.kubernetes.kafka

class Status {
  var authenticationType: String? = null
  var bootstrapEndpoint: String? = null
  var brokerEndpoints: Map<String, Any>? = null
  var brokerExternalListener: String? = null
  var brokerInternalListener: String? = null
  var clientAuthentication: Boolean? = null
  var clusterName: String? = null
  var currentReplicas: Int = 0
  var externalClient: String? = null
  var internalClient: String? = null
  var jmxPort: Int? = null
  var jolokiaPort: Int? = null
  var minIsr: Int? = null
  var phase: String = ""
  var prometheusPort: Int? = null
  var pscVersion: String? = null
  var readyReplicas: Int = 0
  var reason: String? = null
  var replicas: Int = 0
  var replicationFactor: Int? = null
  var securityProtocol: String? = null
  var zookeeperConnect: String? = null
}
package com.fkorotkov.kubernetes.kafka

class Network {
  var annotations: Map<String, Any>? = null
  var bootstrapPrefix: String? = null
  var brokerPrefix: String? = null
  var domain: String = ""
  var type: String = ""
}
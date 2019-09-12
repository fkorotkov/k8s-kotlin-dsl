package com.fkorotkov.kubernetes.kafka

class MetricReporter {
  var bootstrapEndpoint: String = ""
  var internal: Boolean? = null
  var publishMs: Int? = null
  var replicationFactor: Int = 0
  var tls: Tls? = null
}
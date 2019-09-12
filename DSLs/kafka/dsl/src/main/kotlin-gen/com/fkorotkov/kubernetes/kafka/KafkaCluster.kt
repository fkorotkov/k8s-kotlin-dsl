package com.fkorotkov.kubernetes.kafka

class KafkaCluster {
  var apiVersion: String? = null
  var kind: String? = null
  var metadata: Map<String, Any>? = null
  var spec: Spec? = null
  var status: Status? = null
}
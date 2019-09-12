package com.fkorotkov.kubernetes.kafka

class Spec {
  var configOverrides: ConfigOverrides? = null
  var image: String = ""
  var initContainers: List<InitContainer> = emptyList()
  var internalKubDomain: String? = null
  var jvmConfig: JvmConfig = JvmConfig()
  var metricReporter: MetricReporter? = null
  var network: Network? = null
  var options: Options? = null
  var placement: Placement? = null
  var podSecurityContext: PodSecurityContext? = null
  var replicas: Int = 0
  var resources: Resources = Resources()
  var terminationGracePeriodInSecond: Int? = null
  var tls: Tls? = null
  var zones: List<String> = emptyList()
  var zookeeper: Zookeeper? = null
}
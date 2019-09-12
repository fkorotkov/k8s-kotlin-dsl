package com.fkorotkov.kubernetes.kafka

class PodSecurityContext {
  var fsGroup: Int? = null
  var randomUID: Boolean? = null
  var runAsGroup: Int? = null
  var runAsNonRoot: Boolean? = null
  var runAsUser: Int? = null
  var seLinuxOptions: SeLinuxOptions? = null
  var supplementalGroups: List<Int>? = null
  var sysctls: List<Sysctl>? = null
}
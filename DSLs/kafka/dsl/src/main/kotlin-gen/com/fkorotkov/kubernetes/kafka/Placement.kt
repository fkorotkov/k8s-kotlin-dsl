package com.fkorotkov.kubernetes.kafka

class Placement {
  var disableHostPort: Boolean? = null
  var nodeAffinity: NodeAffinity? = null
  var rack: Rack? = null
}
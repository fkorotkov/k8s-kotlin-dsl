// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Network as kafka_Network
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`network`(block: kafka_Network.() -> Unit = {}) {
  if(this.`network` == null) {
    this.`network` = kafka_Network()
  }

  this.`network`.block()
}


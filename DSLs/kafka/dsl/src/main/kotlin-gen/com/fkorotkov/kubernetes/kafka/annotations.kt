// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Annotations as kafka_Annotations
import com.fkorotkov.kubernetes.kafka.Network as kafka_Network


fun  kafka_Network.`annotations`(block: kafka_Annotations.() -> Unit = {}) {
  if(this.`annotations` == null) {
    this.`annotations` = kafka_Annotations()
  }

  this.`annotations`.block()
}


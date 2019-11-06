// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Limits as kafka_Limits
import com.fkorotkov.kubernetes.kafka.Resources as kafka_Resources


fun  kafka_Resources.`limits`(block: kafka_Limits.() -> Unit = {}) {
  if(this.`limits` == null) {
    this.`limits` = kafka_Limits()
  }

  this.`limits`.block()
}


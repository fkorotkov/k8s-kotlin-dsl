// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.BrokerEndpoints as kafka_BrokerEndpoints
import com.fkorotkov.kubernetes.kafka.Status as kafka_Status


fun  kafka_Status.`brokerEndpoints`(block: kafka_BrokerEndpoints.() -> Unit = {}) {
  if(this.`brokerEndpoints` == null) {
    this.`brokerEndpoints` = kafka_BrokerEndpoints()
  }

  this.`brokerEndpoints`.block()
}


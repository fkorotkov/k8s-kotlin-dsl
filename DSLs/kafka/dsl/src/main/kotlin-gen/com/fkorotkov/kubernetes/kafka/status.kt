// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.KafkaCluster as kafka_KafkaCluster
import com.fkorotkov.kubernetes.kafka.Status as kafka_Status


fun  kafka_KafkaCluster.`status`(block: kafka_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = kafka_Status()
  }

  this.`status`.block()
}


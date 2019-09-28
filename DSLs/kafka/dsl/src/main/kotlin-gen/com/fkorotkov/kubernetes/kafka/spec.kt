// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.KafkaCluster as kafka_KafkaCluster
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_KafkaCluster.`spec`(block: kafka_Spec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = kafka_Spec()
  }

  this.`spec`.block()
}


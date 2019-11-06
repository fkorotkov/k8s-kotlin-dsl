// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.NodeAffinity as kafka_NodeAffinity
import com.fkorotkov.kubernetes.kafka.Placement as kafka_Placement


fun  kafka_Placement.`nodeAffinity`(block: kafka_NodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = kafka_NodeAffinity()
  }

  this.`nodeAffinity`.block()
}


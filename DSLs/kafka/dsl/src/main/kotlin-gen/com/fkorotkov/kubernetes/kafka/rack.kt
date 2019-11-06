// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Placement as kafka_Placement
import com.fkorotkov.kubernetes.kafka.Rack as kafka_Rack


fun  kafka_Placement.`rack`(block: kafka_Rack.() -> Unit = {}) {
  if(this.`rack` == null) {
    this.`rack` = kafka_Rack()
  }

  this.`rack`.block()
}


// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Placement as kafka_Placement
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`placement`(block: kafka_Placement.() -> Unit = {}) {
  if(this.`placement` == null) {
    this.`placement` = kafka_Placement()
  }

  this.`placement`.block()
}


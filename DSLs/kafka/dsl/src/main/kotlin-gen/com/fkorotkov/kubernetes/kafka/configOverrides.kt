// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.ConfigOverrides as kafka_ConfigOverrides
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`configOverrides`(block: kafka_ConfigOverrides.() -> Unit = {}) {
  if(this.`configOverrides` == null) {
    this.`configOverrides` = kafka_ConfigOverrides()
  }

  this.`configOverrides`.block()
}


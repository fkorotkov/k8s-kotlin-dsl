// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Resources as kafka_Resources
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`resources`(block: kafka_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = kafka_Resources()
  }

  this.`resources`.block()
}


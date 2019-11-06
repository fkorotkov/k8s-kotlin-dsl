// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Options as kafka_Options
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`options`(block: kafka_Options.() -> Unit = {}) {
  if(this.`options` == null) {
    this.`options` = kafka_Options()
  }

  this.`options`.block()
}


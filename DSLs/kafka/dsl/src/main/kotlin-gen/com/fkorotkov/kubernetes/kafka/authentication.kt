// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Authentication as kafka_Authentication
import com.fkorotkov.kubernetes.kafka.Tls as kafka_Tls


fun  kafka_Tls.`authentication`(block: kafka_Authentication.() -> Unit = {}) {
  if(this.`authentication` == null) {
    this.`authentication` = kafka_Authentication()
  }

  this.`authentication`.block()
}


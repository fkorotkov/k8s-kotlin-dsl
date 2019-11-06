// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Requests as kafka_Requests
import com.fkorotkov.kubernetes.kafka.Resources as kafka_Resources


fun  kafka_Resources.`requests`(block: kafka_Requests.() -> Unit = {}) {
  if(this.`requests` == null) {
    this.`requests` = kafka_Requests()
  }

  this.`requests`.block()
}


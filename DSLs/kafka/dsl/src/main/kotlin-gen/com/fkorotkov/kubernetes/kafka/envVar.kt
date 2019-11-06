// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.EnvVar as kafka_EnvVar
import com.fkorotkov.kubernetes.kafka.InitContainer as kafka_InitContainer


fun  kafka_InitContainer.`envVar`(block: kafka_EnvVar.() -> Unit = {}) {
  if(this.`envVar` == null) {
    this.`envVar` = kafka_EnvVar()
  }

  this.`envVar`.block()
}


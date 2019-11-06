// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.JvmConfig as kafka_JvmConfig
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`jvmConfig`(block: kafka_JvmConfig.() -> Unit = {}) {
  if(this.`jvmConfig` == null) {
    this.`jvmConfig` = kafka_JvmConfig()
  }

  this.`jvmConfig`.block()
}


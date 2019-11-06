// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.MetricReporter as kafka_MetricReporter
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec
import com.fkorotkov.kubernetes.kafka.Tls as kafka_Tls


fun  kafka_MetricReporter.`tls`(block: kafka_Tls.() -> Unit = {}) {
  if(this.`tls` == null) {
    this.`tls` = kafka_Tls()
  }

  this.`tls`.block()
}


fun  kafka_Spec.`tls`(block: kafka_Tls.() -> Unit = {}) {
  if(this.`tls` == null) {
    this.`tls` = kafka_Tls()
  }

  this.`tls`.block()
}


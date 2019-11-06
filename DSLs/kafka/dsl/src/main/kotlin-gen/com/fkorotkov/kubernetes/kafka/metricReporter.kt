// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.MetricReporter as kafka_MetricReporter
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`metricReporter`(block: kafka_MetricReporter.() -> Unit = {}) {
  if(this.`metricReporter` == null) {
    this.`metricReporter` = kafka_MetricReporter()
  }

  this.`metricReporter`.block()
}


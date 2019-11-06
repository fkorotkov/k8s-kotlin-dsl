// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.PodSecurityContext as kafka_PodSecurityContext
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec


fun  kafka_Spec.`podSecurityContext`(block: kafka_PodSecurityContext.() -> Unit = {}) {
  if(this.`podSecurityContext` == null) {
    this.`podSecurityContext` = kafka_PodSecurityContext()
  }

  this.`podSecurityContext`.block()
}


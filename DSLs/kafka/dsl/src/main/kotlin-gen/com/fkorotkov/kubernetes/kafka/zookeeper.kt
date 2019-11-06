// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec
import com.fkorotkov.kubernetes.kafka.Zookeeper as kafka_Zookeeper


fun  kafka_Spec.`zookeeper`(block: kafka_Zookeeper.() -> Unit = {}) {
  if(this.`zookeeper` == null) {
    this.`zookeeper` = kafka_Zookeeper()
  }

  this.`zookeeper`.block()
}


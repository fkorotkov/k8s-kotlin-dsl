// GENERATE
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.KafkaCluster as kafka_KafkaCluster
import com.fkorotkov.kubernetes.kafka.KafkaClusterList as kafka_KafkaClusterList


fun newKafkaCluster(block : kafka_KafkaCluster.() -> Unit = {}): kafka_KafkaCluster {
  val instance = kafka_KafkaCluster()
  instance.block()
  return instance
}


fun newKafkaClusterList(block : kafka_KafkaClusterList.() -> Unit = {}): kafka_KafkaClusterList {
  val instance = kafka_KafkaClusterList()
  instance.block()
  return instance
}


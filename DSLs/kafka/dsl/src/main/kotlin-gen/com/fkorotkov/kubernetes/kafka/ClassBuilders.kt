// GENERATE
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.Annotations as kafka_Annotations
import com.fkorotkov.kubernetes.kafka.Authentication as kafka_Authentication
import com.fkorotkov.kubernetes.kafka.BrokerEndpoints as kafka_BrokerEndpoints
import com.fkorotkov.kubernetes.kafka.ConfigOverrides as kafka_ConfigOverrides
import com.fkorotkov.kubernetes.kafka.EnvVar as kafka_EnvVar
import com.fkorotkov.kubernetes.kafka.InitContainer as kafka_InitContainer
import com.fkorotkov.kubernetes.kafka.JvmConfig as kafka_JvmConfig
import com.fkorotkov.kubernetes.kafka.KafkaCluster as kafka_KafkaCluster
import com.fkorotkov.kubernetes.kafka.KafkaClusterList as kafka_KafkaClusterList
import com.fkorotkov.kubernetes.kafka.Limits as kafka_Limits
import com.fkorotkov.kubernetes.kafka.MetricReporter as kafka_MetricReporter
import com.fkorotkov.kubernetes.kafka.Network as kafka_Network
import com.fkorotkov.kubernetes.kafka.NodeAffinity as kafka_NodeAffinity
import com.fkorotkov.kubernetes.kafka.Options as kafka_Options
import com.fkorotkov.kubernetes.kafka.Placement as kafka_Placement
import com.fkorotkov.kubernetes.kafka.PodSecurityContext as kafka_PodSecurityContext
import com.fkorotkov.kubernetes.kafka.Rack as kafka_Rack
import com.fkorotkov.kubernetes.kafka.Requests as kafka_Requests
import com.fkorotkov.kubernetes.kafka.Resources as kafka_Resources
import com.fkorotkov.kubernetes.kafka.SeLinuxOptions as kafka_SeLinuxOptions
import com.fkorotkov.kubernetes.kafka.Spec as kafka_Spec
import com.fkorotkov.kubernetes.kafka.Status as kafka_Status
import com.fkorotkov.kubernetes.kafka.Storage as kafka_Storage
import com.fkorotkov.kubernetes.kafka.Sysctl as kafka_Sysctl
import com.fkorotkov.kubernetes.kafka.Tls as kafka_Tls
import com.fkorotkov.kubernetes.kafka.Zookeeper as kafka_Zookeeper


fun newAnnotations(block : kafka_Annotations.() -> Unit = {}): kafka_Annotations {
  val instance = kafka_Annotations()
  instance.block()
  return instance
}


fun newStorage(block : kafka_Storage.() -> Unit = {}): kafka_Storage {
  val instance = kafka_Storage()
  instance.block()
  return instance
}


fun newOptions(block : kafka_Options.() -> Unit = {}): kafka_Options {
  val instance = kafka_Options()
  instance.block()
  return instance
}


fun newAuthentication(block : kafka_Authentication.() -> Unit = {}): kafka_Authentication {
  val instance = kafka_Authentication()
  instance.block()
  return instance
}


fun newConfigOverrides(block : kafka_ConfigOverrides.() -> Unit = {}): kafka_ConfigOverrides {
  val instance = kafka_ConfigOverrides()
  instance.block()
  return instance
}


fun newLimits(block : kafka_Limits.() -> Unit = {}): kafka_Limits {
  val instance = kafka_Limits()
  instance.block()
  return instance
}


fun newSysctl(block : kafka_Sysctl.() -> Unit = {}): kafka_Sysctl {
  val instance = kafka_Sysctl()
  instance.block()
  return instance
}


fun newInitContainer(block : kafka_InitContainer.() -> Unit = {}): kafka_InitContainer {
  val instance = kafka_InitContainer()
  instance.block()
  return instance
}


fun newPlacement(block : kafka_Placement.() -> Unit = {}): kafka_Placement {
  val instance = kafka_Placement()
  instance.block()
  return instance
}


fun newZookeeper(block : kafka_Zookeeper.() -> Unit = {}): kafka_Zookeeper {
  val instance = kafka_Zookeeper()
  instance.block()
  return instance
}


fun newRequests(block : kafka_Requests.() -> Unit = {}): kafka_Requests {
  val instance = kafka_Requests()
  instance.block()
  return instance
}


fun newNetwork(block : kafka_Network.() -> Unit = {}): kafka_Network {
  val instance = kafka_Network()
  instance.block()
  return instance
}


fun newJvmConfig(block : kafka_JvmConfig.() -> Unit = {}): kafka_JvmConfig {
  val instance = kafka_JvmConfig()
  instance.block()
  return instance
}


fun newNodeAffinity(block : kafka_NodeAffinity.() -> Unit = {}): kafka_NodeAffinity {
  val instance = kafka_NodeAffinity()
  instance.block()
  return instance
}


fun newPodSecurityContext(block : kafka_PodSecurityContext.() -> Unit = {}): kafka_PodSecurityContext {
  val instance = kafka_PodSecurityContext()
  instance.block()
  return instance
}


fun newSpec(block : kafka_Spec.() -> Unit = {}): kafka_Spec {
  val instance = kafka_Spec()
  instance.block()
  return instance
}


fun newBrokerEndpoints(block : kafka_BrokerEndpoints.() -> Unit = {}): kafka_BrokerEndpoints {
  val instance = kafka_BrokerEndpoints()
  instance.block()
  return instance
}


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


fun newEnvVar(block : kafka_EnvVar.() -> Unit = {}): kafka_EnvVar {
  val instance = kafka_EnvVar()
  instance.block()
  return instance
}


fun newRack(block : kafka_Rack.() -> Unit = {}): kafka_Rack {
  val instance = kafka_Rack()
  instance.block()
  return instance
}


fun newMetricReporter(block : kafka_MetricReporter.() -> Unit = {}): kafka_MetricReporter {
  val instance = kafka_MetricReporter()
  instance.block()
  return instance
}


fun newStatus(block : kafka_Status.() -> Unit = {}): kafka_Status {
  val instance = kafka_Status()
  instance.block()
  return instance
}


fun newResources(block : kafka_Resources.() -> Unit = {}): kafka_Resources {
  val instance = kafka_Resources()
  instance.block()
  return instance
}


fun newTls(block : kafka_Tls.() -> Unit = {}): kafka_Tls {
  val instance = kafka_Tls()
  instance.block()
  return instance
}


fun newSeLinuxOptions(block : kafka_SeLinuxOptions.() -> Unit = {}): kafka_SeLinuxOptions {
  val instance = kafka_SeLinuxOptions()
  instance.block()
  return instance
}


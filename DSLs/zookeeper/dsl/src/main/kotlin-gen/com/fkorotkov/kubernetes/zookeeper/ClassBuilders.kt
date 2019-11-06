// GENERATE
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.Config as zookeeper_Config
import com.fkorotkov.kubernetes.zookeeper.ConfigOverrides as zookeeper_ConfigOverrides
import com.fkorotkov.kubernetes.zookeeper.EnvVar as zookeeper_EnvVar
import com.fkorotkov.kubernetes.zookeeper.InitContainer as zookeeper_InitContainer
import com.fkorotkov.kubernetes.zookeeper.JvmConfig as zookeeper_JvmConfig
import com.fkorotkov.kubernetes.zookeeper.Limits as zookeeper_Limits
import com.fkorotkov.kubernetes.zookeeper.NodeAffinity as zookeeper_NodeAffinity
import com.fkorotkov.kubernetes.zookeeper.Placement as zookeeper_Placement
import com.fkorotkov.kubernetes.zookeeper.PodSecurityContext as zookeeper_PodSecurityContext
import com.fkorotkov.kubernetes.zookeeper.Rack as zookeeper_Rack
import com.fkorotkov.kubernetes.zookeeper.Requests as zookeeper_Requests
import com.fkorotkov.kubernetes.zookeeper.Resources as zookeeper_Resources
import com.fkorotkov.kubernetes.zookeeper.SeLinuxOptions as zookeeper_SeLinuxOptions
import com.fkorotkov.kubernetes.zookeeper.Spec as zookeeper_Spec
import com.fkorotkov.kubernetes.zookeeper.Status as zookeeper_Status
import com.fkorotkov.kubernetes.zookeeper.Storage as zookeeper_Storage
import com.fkorotkov.kubernetes.zookeeper.Sysctl as zookeeper_Sysctl
import com.fkorotkov.kubernetes.zookeeper.ZookeeperCluster as zookeeper_ZookeeperCluster
import com.fkorotkov.kubernetes.zookeeper.ZookeeperClusterList as zookeeper_ZookeeperClusterList


fun newStorage(block : zookeeper_Storage.() -> Unit = {}): zookeeper_Storage {
  val instance = zookeeper_Storage()
  instance.block()
  return instance
}


fun newConfigOverrides(block : zookeeper_ConfigOverrides.() -> Unit = {}): zookeeper_ConfigOverrides {
  val instance = zookeeper_ConfigOverrides()
  instance.block()
  return instance
}


fun newLimits(block : zookeeper_Limits.() -> Unit = {}): zookeeper_Limits {
  val instance = zookeeper_Limits()
  instance.block()
  return instance
}


fun newSysctl(block : zookeeper_Sysctl.() -> Unit = {}): zookeeper_Sysctl {
  val instance = zookeeper_Sysctl()
  instance.block()
  return instance
}


fun newInitContainer(block : zookeeper_InitContainer.() -> Unit = {}): zookeeper_InitContainer {
  val instance = zookeeper_InitContainer()
  instance.block()
  return instance
}


fun newPlacement(block : zookeeper_Placement.() -> Unit = {}): zookeeper_Placement {
  val instance = zookeeper_Placement()
  instance.block()
  return instance
}


fun newZookeeperCluster(block : zookeeper_ZookeeperCluster.() -> Unit = {}): zookeeper_ZookeeperCluster {
  val instance = zookeeper_ZookeeperCluster()
  instance.block()
  return instance
}


fun newConfig(block : zookeeper_Config.() -> Unit = {}): zookeeper_Config {
  val instance = zookeeper_Config()
  instance.block()
  return instance
}


fun newRequests(block : zookeeper_Requests.() -> Unit = {}): zookeeper_Requests {
  val instance = zookeeper_Requests()
  instance.block()
  return instance
}


fun newZookeeperClusterList(block : zookeeper_ZookeeperClusterList.() -> Unit = {}): zookeeper_ZookeeperClusterList {
  val instance = zookeeper_ZookeeperClusterList()
  instance.block()
  return instance
}


fun newJvmConfig(block : zookeeper_JvmConfig.() -> Unit = {}): zookeeper_JvmConfig {
  val instance = zookeeper_JvmConfig()
  instance.block()
  return instance
}


fun newNodeAffinity(block : zookeeper_NodeAffinity.() -> Unit = {}): zookeeper_NodeAffinity {
  val instance = zookeeper_NodeAffinity()
  instance.block()
  return instance
}


fun newPodSecurityContext(block : zookeeper_PodSecurityContext.() -> Unit = {}): zookeeper_PodSecurityContext {
  val instance = zookeeper_PodSecurityContext()
  instance.block()
  return instance
}


fun newSpec(block : zookeeper_Spec.() -> Unit = {}): zookeeper_Spec {
  val instance = zookeeper_Spec()
  instance.block()
  return instance
}


fun newEnvVar(block : zookeeper_EnvVar.() -> Unit = {}): zookeeper_EnvVar {
  val instance = zookeeper_EnvVar()
  instance.block()
  return instance
}


fun newRack(block : zookeeper_Rack.() -> Unit = {}): zookeeper_Rack {
  val instance = zookeeper_Rack()
  instance.block()
  return instance
}


fun newStatus(block : zookeeper_Status.() -> Unit = {}): zookeeper_Status {
  val instance = zookeeper_Status()
  instance.block()
  return instance
}


fun newResources(block : zookeeper_Resources.() -> Unit = {}): zookeeper_Resources {
  val instance = zookeeper_Resources()
  instance.block()
  return instance
}


fun newSeLinuxOptions(block : zookeeper_SeLinuxOptions.() -> Unit = {}): zookeeper_SeLinuxOptions {
  val instance = zookeeper_SeLinuxOptions()
  instance.block()
  return instance
}


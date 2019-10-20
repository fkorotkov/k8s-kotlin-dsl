// GENERATE
package com.fkorotkov.kubernetes.zookeeper

import com.fkorotkov.kubernetes.zookeeper.ZookeeperCluster as zookeeper_ZookeeperCluster
import com.fkorotkov.kubernetes.zookeeper.ZookeeperClusterList as zookeeper_ZookeeperClusterList


fun newZookeeperCluster(block : zookeeper_ZookeeperCluster.() -> Unit = {}): zookeeper_ZookeeperCluster {
  val instance = zookeeper_ZookeeperCluster()
  instance.block()
  return instance
}


fun newZookeeperClusterList(block : zookeeper_ZookeeperClusterList.() -> Unit = {}): zookeeper_ZookeeperClusterList {
  val instance = zookeeper_ZookeeperClusterList()
  instance.block()
  return instance
}


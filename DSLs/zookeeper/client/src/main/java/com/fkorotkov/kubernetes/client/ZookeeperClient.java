package com.fkorotkov.kubernetes.client;


import com.fkorotkov.kubernetes.zookeeper.*;
import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;

public interface ZookeeperClient extends Client {
  
  MixedOperation<ZookeeperCluster, ZookeeperClusterList, DoneableZookeeperCluster, Resource<ZookeeperCluster, DoneableZookeeperCluster>> zookeeperClusters();
}

package com.fkorotkov.kubernetes.client;


import com.fkorotkov.kubernetes.kafka.*;
import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;

public interface KafkaClient extends Client {
  
  MixedOperation<KafkaCluster, KafkaClusterList, DoneableKafkaCluster, Resource<KafkaCluster, DoneableKafkaCluster>> kafkaClusters();
}

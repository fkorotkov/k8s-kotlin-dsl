package com.fkorotkov.kubernetes.client;

public interface NamespacedZookeeperClient extends ZookeeperClient,
        GenericZookeeperClient<NamespacedZookeeperClient> {
}

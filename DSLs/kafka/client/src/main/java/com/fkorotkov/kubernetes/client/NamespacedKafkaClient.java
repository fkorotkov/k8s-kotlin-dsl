package com.fkorotkov.kubernetes.client;

public interface NamespacedKafkaClient extends KafkaClient,
        GenericKafkaClient<NamespacedKafkaClient> {
}

package com.fkorotkov.kubernetes.kafka.client;

public interface NamespacedKafkaClient extends KafkaClient,
        GenericKafkaClient<NamespacedKafkaClient> {
}

package com.fkorotkov.kubernetes.kafka.client;

import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.AnyNamespaceable;
import io.fabric8.kubernetes.client.dsl.Namespaceable;
import io.fabric8.kubernetes.client.dsl.RequestConfigurable;

public interface GenericKafkaClient<C extends Client> extends Client, KafkaClient,
        Namespaceable<C>,
        AnyNamespaceable<C>,
        RequestConfigurable<C> {
}

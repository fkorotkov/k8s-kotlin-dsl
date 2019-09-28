package com.fkorotkov.kubernetes.kafka.client;

import com.fkorotkov.kubernetes.kafka.*;
import io.fabric8.kubernetes.client.*;
import io.fabric8.kubernetes.client.dsl.FunctionCallable;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.internal.KafkaClusterOperationsImpl;
import okhttp3.OkHttpClient;

public class DefaultKafkaClient extends BaseClient implements NamespacedKafkaClient {

    public DefaultKafkaClient() {
        super();
    }

    public DefaultKafkaClient(Config configuration) {
        super(configuration);
    }

    public DefaultKafkaClient(OkHttpClient httpClient, Config configuration) {
        super(httpClient, configuration);
    }

    @Override
    public NamespacedKafkaClient inAnyNamespace() {
        return inNamespace(null);
    }

    @Override
    public NamespacedKafkaClient inNamespace(String namespace) {
        Config updated = new ConfigBuilder(getConfiguration())
                .withNamespace(namespace)
                .build();

        return new DefaultKafkaClient(getHttpClient(), updated);
    }
  @Override
  public FunctionCallable<NamespacedKafkaClient> withRequestConfig(RequestConfig requestConfig) {
    return new WithRequestCallable<NamespacedKafkaClient>(this, requestConfig);
  }

  public MixedOperation<KafkaCluster, KafkaClusterList, DoneableKafkaCluster, Resource<KafkaCluster, DoneableKafkaCluster>> kafkaClusters() {
    return new KafkaClusterOperationsImpl(this.getHttpClient(), this.getConfiguration());
  }
}

package com.fkorotkov.kubernetes.client;

import io.fabric8.kubernetes.api.model.RootPaths;
import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.ExtensionAdapter;
import okhttp3.OkHttpClient;

import java.net.URL;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class KafkaExtensionAdapter implements ExtensionAdapter<KafkaClient> {

    static final ConcurrentMap<URL, Boolean> IS_KAFKA = new ConcurrentHashMap<>();
    static final ConcurrentMap<URL, Boolean> USES_TEKTON_APIGROUPS = new ConcurrentHashMap<>();
    
	@Override
	public Class<KafkaClient> getExtensionType() {
		return KafkaClient.class;
	}

	@Override
	public Boolean isAdaptable(Client client) {
		return isKafkaAvailable(client);
	}

	@Override
	public KafkaClient adapt(Client client) {
            return new DefaultKafkaClient(client.adapt(OkHttpClient.class), client.getConfiguration());
	}

	private boolean isKafkaAvailable(Client client) {
        URL masterUrl = client.getMasterUrl();
        if (IS_KAFKA.containsKey(masterUrl)) {
            return IS_KAFKA.get(masterUrl);
        } else {
            RootPaths rootPaths = client.rootPaths();
            if (rootPaths != null) {
                List<String> paths = rootPaths.getPaths();
                if (paths != null) {
                    for (String path : paths) {
                        // lets detect the new API Groups APIs for OpenShift
                        if (path.endsWith("cluster.confluent.com") || path.contains("cluster.confluent.com/")) {
                            USES_TEKTON_APIGROUPS.putIfAbsent(masterUrl, true);
                            IS_KAFKA.putIfAbsent(masterUrl, true);
                            return true;
                        }
                    }
                }
            }
        }
        IS_KAFKA.putIfAbsent(masterUrl, false);
        return false;
    }
}

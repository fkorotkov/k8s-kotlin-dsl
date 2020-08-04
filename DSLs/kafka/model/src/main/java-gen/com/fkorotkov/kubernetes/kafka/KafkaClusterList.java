
package com.fkorotkov.kubernetes.kafka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "items",
    "kind",
    "metadata"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
@ApiVersion("v1alpha1")
@ApiGroup("cluster.confluent.com")
public class KafkaClusterList implements KubernetesResource, KubernetesResourceList<KafkaCluster>
{

    /**
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("")
    private String apiVersion = "cluster.confluent.com/v1alpha1";
    /**
     * 
     */
    @JsonProperty("items")
    @JsonPropertyDescription("")
    private List<com.fkorotkov.kubernetes.kafka.KafkaCluster> items = new ArrayList<com.fkorotkov.kubernetes.kafka.KafkaCluster>();
    /**
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("")
    private String kind = "KafkaClusterList";
    /**
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("")
    private ListMeta metadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public KafkaClusterList() {
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param items
     */
    public KafkaClusterList(String apiVersion, List<com.fkorotkov.kubernetes.kafka.KafkaCluster> items, String kind, ListMeta metadata) {
        super();
        this.apiVersion = apiVersion;
        this.items = items;
        this.kind = kind;
        this.metadata = metadata;
    }

    /**
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     */
    @JsonProperty("items")
    public List<com.fkorotkov.kubernetes.kafka.KafkaCluster> getItems() {
        return items;
    }

    /**
     * 
     */
    @JsonProperty("items")
    public void setItems(List<com.fkorotkov.kubernetes.kafka.KafkaCluster> items) {
        this.items = items;
    }

    /**
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     */
    @JsonProperty("metadata")
    public ListMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

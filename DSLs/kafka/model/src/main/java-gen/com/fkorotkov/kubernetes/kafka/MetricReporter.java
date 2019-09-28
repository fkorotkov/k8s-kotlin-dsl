
package com.fkorotkov.kubernetes.kafka;

import java.util.HashMap;
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
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bootstrapEndpoint",
    "internal",
    "publishMs",
    "replicationFactor",
    "tls"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class MetricReporter {

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapEndpoint")
    @JsonPropertyDescription("")
    private String bootstrapEndpoint;
    /**
     * 
     * 
     */
    @JsonProperty("internal")
    @JsonPropertyDescription("")
    private Boolean internal;
    /**
     * 
     * 
     */
    @JsonProperty("publishMs")
    @JsonPropertyDescription("")
    private Integer publishMs;
    /**
     * 
     * 
     */
    @JsonProperty("replicationFactor")
    @JsonPropertyDescription("")
    private Integer replicationFactor;
    /**
     * 
     * 
     */
    @JsonProperty("tls")
    @JsonPropertyDescription("")
    private Tls tls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetricReporter() {
    }

    /**
     * 
     * @param publishMs
     * @param replicationFactor
     * @param bootstrapEndpoint
     * @param internal
     * @param tls
     */
    public MetricReporter(String bootstrapEndpoint, Boolean internal, Integer publishMs, Integer replicationFactor, Tls tls) {
        super();
        this.bootstrapEndpoint = bootstrapEndpoint;
        this.internal = internal;
        this.publishMs = publishMs;
        this.replicationFactor = replicationFactor;
        this.tls = tls;
    }

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapEndpoint")
    public String getBootstrapEndpoint() {
        return bootstrapEndpoint;
    }

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapEndpoint")
    public void setBootstrapEndpoint(String bootstrapEndpoint) {
        this.bootstrapEndpoint = bootstrapEndpoint;
    }

    /**
     * 
     * 
     */
    @JsonProperty("internal")
    public Boolean getInternal() {
        return internal;
    }

    /**
     * 
     * 
     */
    @JsonProperty("internal")
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    /**
     * 
     * 
     */
    @JsonProperty("publishMs")
    public Integer getPublishMs() {
        return publishMs;
    }

    /**
     * 
     * 
     */
    @JsonProperty("publishMs")
    public void setPublishMs(Integer publishMs) {
        this.publishMs = publishMs;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    /**
     * 
     * 
     */
    @JsonProperty("tls")
    public Tls getTls() {
        return tls;
    }

    /**
     * 
     * 
     */
    @JsonProperty("tls")
    public void setTls(Tls tls) {
        this.tls = tls;
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

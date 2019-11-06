
package com.fkorotkov.kubernetes.zookeeper;

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
import io.fabric8.kubernetes.api.model.KubernetesResource;
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
    "alternateEndpoint",
    "clusterName",
    "config",
    "currentReplicas",
    "endpoints",
    "phase",
    "readyReplicas",
    "reason",
    "replicas"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class Status implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("alternateEndpoint")
    @JsonPropertyDescription("")
    private String alternateEndpoint;
    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    @JsonPropertyDescription("")
    private String clusterName;
    /**
     * 
     * 
     */
    @JsonProperty("config")
    @JsonPropertyDescription("")
    private Config config;
    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    @JsonPropertyDescription("")
    private Integer currentReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("endpoints")
    @JsonPropertyDescription("")
    private String endpoints;
    /**
     * 
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("")
    private String phase;
    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    @JsonPropertyDescription("")
    private Integer readyReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("")
    private String reason;
    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    @JsonPropertyDescription("")
    private Integer replicas;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param phase
     * @param reason
     * @param endpoints
     * @param replicas
     * @param clusterName
     * @param readyReplicas
     * @param currentReplicas
     * @param config
     * @param alternateEndpoint
     */
    public Status(String alternateEndpoint, String clusterName, Config config, Integer currentReplicas, String endpoints, String phase, Integer readyReplicas, String reason, Integer replicas) {
        super();
        this.alternateEndpoint = alternateEndpoint;
        this.clusterName = clusterName;
        this.config = config;
        this.currentReplicas = currentReplicas;
        this.endpoints = endpoints;
        this.phase = phase;
        this.readyReplicas = readyReplicas;
        this.reason = reason;
        this.replicas = replicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("alternateEndpoint")
    public String getAlternateEndpoint() {
        return alternateEndpoint;
    }

    /**
     * 
     * 
     */
    @JsonProperty("alternateEndpoint")
    public void setAlternateEndpoint(String alternateEndpoint) {
        this.alternateEndpoint = alternateEndpoint;
    }

    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    public String getClusterName() {
        return clusterName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    /**
     * 
     * 
     */
    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    public void setCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpoints")
    public String getEndpoints() {
        return endpoints;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpoints")
    public void setEndpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * 
     * 
     */
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * 
     * 
     */
    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * 
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
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

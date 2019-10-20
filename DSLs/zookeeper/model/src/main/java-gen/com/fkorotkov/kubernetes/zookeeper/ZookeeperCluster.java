
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
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;
import io.sundr.transform.annotations.VelocityTransformations;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "spec",
    "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class)
})
@ApiVersion("v1alpha1")
@ApiGroup("cluster.confluent.com")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "zookeeper.properties", gather = true)
})
public class ZookeeperCluster implements HasMetadata
{

    /**
     * 
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("")
    private String apiVersion = "cluster.confluent.com/v1alpha1";
    /**
     * 
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("")
    private String kind = "ZookeeperCluster";
    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("")
    private io.fabric8.kubernetes.api.model.ObjectMeta metadata;
    /**
     * 
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("")
    private Spec spec;
    /**
     * 
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ZookeeperCluster() {
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param spec
     * @param status
     */
    public ZookeeperCluster(String apiVersion, String kind, io.fabric8.kubernetes.api.model.ObjectMeta metadata, Spec spec, Status status) {
        super();
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * 
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    public io.fabric8.kubernetes.api.model.ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(io.fabric8.kubernetes.api.model.ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * 
     */
    @JsonProperty("spec")
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     * 
     */
    @JsonProperty("spec")
    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    /**
     * 
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
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

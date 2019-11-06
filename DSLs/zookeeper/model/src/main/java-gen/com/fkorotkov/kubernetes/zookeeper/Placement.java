
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
    "disableHostPort",
    "nodeAffinity",
    "rack"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class Placement implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("disableHostPort")
    @JsonPropertyDescription("")
    private Boolean disableHostPort;
    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    @JsonPropertyDescription("")
    private NodeAffinity nodeAffinity;
    /**
     * 
     * 
     */
    @JsonProperty("rack")
    @JsonPropertyDescription("")
    private Rack rack;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Placement() {
    }

    /**
     * 
     * @param rack
     * @param nodeAffinity
     * @param disableHostPort
     */
    public Placement(Boolean disableHostPort, NodeAffinity nodeAffinity, Rack rack) {
        super();
        this.disableHostPort = disableHostPort;
        this.nodeAffinity = nodeAffinity;
        this.rack = rack;
    }

    /**
     * 
     * 
     */
    @JsonProperty("disableHostPort")
    public Boolean getDisableHostPort() {
        return disableHostPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("disableHostPort")
    public void setDisableHostPort(Boolean disableHostPort) {
        this.disableHostPort = disableHostPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * 
     * 
     */
    @JsonProperty("rack")
    public Rack getRack() {
        return rack;
    }

    /**
     * 
     * 
     */
    @JsonProperty("rack")
    public void setRack(Rack rack) {
        this.rack = rack;
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

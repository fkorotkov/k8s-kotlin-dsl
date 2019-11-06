
package com.fkorotkov.kubernetes.zookeeper;

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
    "limits",
    "requests",
    "storage"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class Resources implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("limits")
    @JsonPropertyDescription("")
    private Limits limits;
    /**
     * 
     * 
     */
    @JsonProperty("requests")
    @JsonPropertyDescription("")
    private Requests requests;
    /**
     * 
     * 
     */
    @JsonProperty("storage")
    @JsonPropertyDescription("")
    private List<Storage> storage = new ArrayList<Storage>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resources() {
    }

    /**
     * 
     * @param requests
     * @param storage
     * @param limits
     */
    public Resources(Limits limits, Requests requests, List<Storage> storage) {
        super();
        this.limits = limits;
        this.requests = requests;
        this.storage = storage;
    }

    /**
     * 
     * 
     */
    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    /**
     * 
     * 
     */
    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    /**
     * 
     * 
     */
    @JsonProperty("requests")
    public Requests getRequests() {
        return requests;
    }

    /**
     * 
     * 
     */
    @JsonProperty("requests")
    public void setRequests(Requests requests) {
        this.requests = requests;
    }

    /**
     * 
     * 
     */
    @JsonProperty("storage")
    public List<Storage> getStorage() {
        return storage;
    }

    /**
     * 
     * 
     */
    @JsonProperty("storage")
    public void setStorage(List<Storage> storage) {
        this.storage = storage;
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

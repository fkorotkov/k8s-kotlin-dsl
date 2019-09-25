
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


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "heapSize"
})
public class JvmConfig {

    /**
     * 
     * 
     */
    @JsonProperty("heapSize")
    @JsonPropertyDescription("")
    private String heapSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JvmConfig() {
    }

    /**
     * 
     * @param heapSize
     */
    public JvmConfig(String heapSize) {
        super();
        this.heapSize = heapSize;
    }

    /**
     * 
     * 
     */
    @JsonProperty("heapSize")
    public String getHeapSize() {
        return heapSize;
    }

    /**
     * 
     * 
     */
    @JsonProperty("heapSize")
    public void setHeapSize(String heapSize) {
        this.heapSize = heapSize;
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

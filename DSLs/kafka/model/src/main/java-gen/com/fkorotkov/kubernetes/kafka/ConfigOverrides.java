
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


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jvm",
    "server"
})
public class ConfigOverrides {

    /**
     * 
     * 
     */
    @JsonProperty("jvm")
    @JsonPropertyDescription("")
    private List<String> jvm = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("")
    private List<String> server = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfigOverrides() {
    }

    /**
     * 
     * @param jvm
     * @param server
     */
    public ConfigOverrides(List<String> jvm, List<String> server) {
        super();
        this.jvm = jvm;
        this.server = server;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jvm")
    public List<String> getJvm() {
        return jvm;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jvm")
    public void setJvm(List<String> jvm) {
        this.jvm = jvm;
    }

    /**
     * 
     * 
     */
    @JsonProperty("server")
    public List<String> getServer() {
        return server;
    }

    /**
     * 
     * 
     */
    @JsonProperty("server")
    public void setServer(List<String> server) {
        this.server = server;
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

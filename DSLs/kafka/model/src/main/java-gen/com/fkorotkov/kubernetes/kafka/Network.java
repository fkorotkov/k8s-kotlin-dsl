
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
    "annotations",
    "bootstrapPrefix",
    "brokerPrefix",
    "domain",
    "type"
})
public class Network {

    /**
     * 
     * 
     */
    @JsonProperty("annotations")
    @JsonPropertyDescription("")
    private Annotations annotations;
    /**
     * 
     * 
     */
    @JsonProperty("bootstrapPrefix")
    @JsonPropertyDescription("")
    private String bootstrapPrefix;
    /**
     * 
     * 
     */
    @JsonProperty("brokerPrefix")
    @JsonPropertyDescription("")
    private String brokerPrefix;
    /**
     * 
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("")
    private String domain;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Network() {
    }

    /**
     * 
     * @param domain
     * @param annotations
     * @param brokerPrefix
     * @param bootstrapPrefix
     * @param type
     */
    public Network(Annotations annotations, String bootstrapPrefix, String brokerPrefix, String domain, String type) {
        super();
        this.annotations = annotations;
        this.bootstrapPrefix = bootstrapPrefix;
        this.brokerPrefix = brokerPrefix;
        this.domain = domain;
        this.type = type;
    }

    /**
     * 
     * 
     */
    @JsonProperty("annotations")
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * 
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapPrefix")
    public String getBootstrapPrefix() {
        return bootstrapPrefix;
    }

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapPrefix")
    public void setBootstrapPrefix(String bootstrapPrefix) {
        this.bootstrapPrefix = bootstrapPrefix;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerPrefix")
    public String getBrokerPrefix() {
        return brokerPrefix;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerPrefix")
    public void setBrokerPrefix(String brokerPrefix) {
        this.brokerPrefix = brokerPrefix;
    }

    /**
     * 
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * 
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * 
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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


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
    "authentication",
    "enabled"
})
public class Tls {

    /**
     * 
     * 
     */
    @JsonProperty("authentication")
    @JsonPropertyDescription("")
    private Authentication authentication;
    /**
     * 
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("")
    private Boolean enabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tls() {
    }

    /**
     * 
     * @param enabled
     * @param authentication
     */
    public Tls(Authentication authentication, Boolean enabled) {
        super();
        this.authentication = authentication;
        this.enabled = enabled;
    }

    /**
     * 
     * 
     */
    @JsonProperty("authentication")
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * 
     * 
     */
    @JsonProperty("authentication")
    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * 
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

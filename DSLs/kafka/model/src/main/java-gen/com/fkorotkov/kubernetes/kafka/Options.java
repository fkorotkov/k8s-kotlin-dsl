
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
    "acl",
    "enterprise",
    "supers"
})
public class Options {

    /**
     * 
     * 
     */
    @JsonProperty("acl")
    @JsonPropertyDescription("")
    private Boolean acl;
    /**
     * 
     * 
     */
    @JsonProperty("enterprise")
    @JsonPropertyDescription("")
    private Boolean enterprise;
    /**
     * 
     * 
     */
    @JsonProperty("supers")
    @JsonPropertyDescription("")
    private String supers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Options() {
    }

    /**
     * 
     * @param enterprise
     * @param supers
     * @param acl
     */
    public Options(Boolean acl, Boolean enterprise, String supers) {
        super();
        this.acl = acl;
        this.enterprise = enterprise;
        this.supers = supers;
    }

    /**
     * 
     * 
     */
    @JsonProperty("acl")
    public Boolean getAcl() {
        return acl;
    }

    /**
     * 
     * 
     */
    @JsonProperty("acl")
    public void setAcl(Boolean acl) {
        this.acl = acl;
    }

    /**
     * 
     * 
     */
    @JsonProperty("enterprise")
    public Boolean getEnterprise() {
        return enterprise;
    }

    /**
     * 
     * 
     */
    @JsonProperty("enterprise")
    public void setEnterprise(Boolean enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * 
     * 
     */
    @JsonProperty("supers")
    public String getSupers() {
        return supers;
    }

    /**
     * 
     * 
     */
    @JsonProperty("supers")
    public void setSupers(String supers) {
        this.supers = supers;
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

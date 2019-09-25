
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
    "level",
    "role",
    "type",
    "user"
})
public class SeLinuxOptions {

    /**
     * 
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("")
    private String level;
    /**
     * 
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("")
    private String role;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("")
    private String type;
    /**
     * 
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SeLinuxOptions() {
    }

    /**
     * 
     * @param role
     * @param level
     * @param type
     * @param user
     */
    public SeLinuxOptions(String level, String role, String type, String user) {
        super();
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    /**
     * 
     * 
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * 
     * 
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * 
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
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

    /**
     * 
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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


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
    "args",
    "command",
    "envVar",
    "image",
    "name"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class InitContainer implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("")
    private List<String> args = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("")
    private List<String> command = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("envVar")
    @JsonPropertyDescription("")
    private EnvVar envVar;
    /**
     * 
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private String image;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public InitContainer() {
    }

    /**
     * 
     * @param args
     * @param image
     * @param envVar
     * @param name
     * @param command
     */
    public InitContainer(List<String> args, List<String> command, EnvVar envVar, String image, String name) {
        super();
        this.args = args;
        this.command = command;
        this.envVar = envVar;
        this.image = image;
        this.name = name;
    }

    /**
     * 
     * 
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * 
     * 
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * 
     * 
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * 
     * 
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * 
     * 
     */
    @JsonProperty("envVar")
    public EnvVar getEnvVar() {
        return envVar;
    }

    /**
     * 
     * 
     */
    @JsonProperty("envVar")
    public void setEnvVar(EnvVar envVar) {
        this.envVar = envVar;
    }

    /**
     * 
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

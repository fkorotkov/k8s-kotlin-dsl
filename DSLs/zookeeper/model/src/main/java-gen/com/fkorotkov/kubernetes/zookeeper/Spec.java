
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
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configOverrides",
    "image",
    "initContainers",
    "internalKubDomain",
    "jvmConfig",
    "placement",
    "podSecurityContext",
    "replicas",
    "resources",
    "terminationGracePeriodInSecond",
    "zones"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class Spec implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("configOverrides")
    @JsonPropertyDescription("")
    private ConfigOverrides configOverrides;
    /**
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private String image;
    /**
     * 
     */
    @JsonProperty("initContainers")
    @JsonPropertyDescription("")
    private List<InitContainer> initContainers = new ArrayList<InitContainer>();
    /**
     * 
     */
    @JsonProperty("internalKubDomain")
    @JsonPropertyDescription("")
    private String internalKubDomain;
    /**
     * 
     */
    @JsonProperty("jvmConfig")
    @JsonPropertyDescription("")
    private JvmConfig jvmConfig;
    /**
     * 
     */
    @JsonProperty("placement")
    @JsonPropertyDescription("")
    private Placement placement;
    /**
     * 
     */
    @JsonProperty("podSecurityContext")
    @JsonPropertyDescription("")
    private PodSecurityContext podSecurityContext;
    /**
     * 
     */
    @JsonProperty("replicas")
    @JsonPropertyDescription("")
    private Integer replicas;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     */
    @JsonProperty("terminationGracePeriodInSecond")
    @JsonPropertyDescription("")
    private Integer terminationGracePeriodInSecond;
    /**
     * 
     */
    @JsonProperty("zones")
    @JsonPropertyDescription("")
    private List<String> zones = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Spec() {
    }

    /**
     * 
     * @param image
     * @param configOverrides
     * @param podSecurityContext
     * @param replicas
     * @param internalKubDomain
     * @param terminationGracePeriodInSecond
     * @param resources
     * @param placement
     * @param zones
     * @param initContainers
     * @param jvmConfig
     */
    public Spec(ConfigOverrides configOverrides, String image, List<InitContainer> initContainers, String internalKubDomain, JvmConfig jvmConfig, Placement placement, PodSecurityContext podSecurityContext, Integer replicas, Resources resources, Integer terminationGracePeriodInSecond, List<String> zones) {
        super();
        this.configOverrides = configOverrides;
        this.image = image;
        this.initContainers = initContainers;
        this.internalKubDomain = internalKubDomain;
        this.jvmConfig = jvmConfig;
        this.placement = placement;
        this.podSecurityContext = podSecurityContext;
        this.replicas = replicas;
        this.resources = resources;
        this.terminationGracePeriodInSecond = terminationGracePeriodInSecond;
        this.zones = zones;
    }

    /**
     * 
     */
    @JsonProperty("configOverrides")
    public ConfigOverrides getConfigOverrides() {
        return configOverrides;
    }

    /**
     * 
     */
    @JsonProperty("configOverrides")
    public void setConfigOverrides(ConfigOverrides configOverrides) {
        this.configOverrides = configOverrides;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     */
    @JsonProperty("initContainers")
    public List<InitContainer> getInitContainers() {
        return initContainers;
    }

    /**
     * 
     */
    @JsonProperty("initContainers")
    public void setInitContainers(List<InitContainer> initContainers) {
        this.initContainers = initContainers;
    }

    /**
     * 
     */
    @JsonProperty("internalKubDomain")
    public String getInternalKubDomain() {
        return internalKubDomain;
    }

    /**
     * 
     */
    @JsonProperty("internalKubDomain")
    public void setInternalKubDomain(String internalKubDomain) {
        this.internalKubDomain = internalKubDomain;
    }

    /**
     * 
     */
    @JsonProperty("jvmConfig")
    public JvmConfig getJvmConfig() {
        return jvmConfig;
    }

    /**
     * 
     */
    @JsonProperty("jvmConfig")
    public void setJvmConfig(JvmConfig jvmConfig) {
        this.jvmConfig = jvmConfig;
    }

    /**
     * 
     */
    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    /**
     * 
     */
    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * 
     */
    @JsonProperty("podSecurityContext")
    public PodSecurityContext getPodSecurityContext() {
        return podSecurityContext;
    }

    /**
     * 
     */
    @JsonProperty("podSecurityContext")
    public void setPodSecurityContext(PodSecurityContext podSecurityContext) {
        this.podSecurityContext = podSecurityContext;
    }

    /**
     * 
     */
    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * 
     */
    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public Resources getResources() {
        return resources;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resources resources) {
        this.resources = resources;
    }

    /**
     * 
     */
    @JsonProperty("terminationGracePeriodInSecond")
    public Integer getTerminationGracePeriodInSecond() {
        return terminationGracePeriodInSecond;
    }

    /**
     * 
     */
    @JsonProperty("terminationGracePeriodInSecond")
    public void setTerminationGracePeriodInSecond(Integer terminationGracePeriodInSecond) {
        this.terminationGracePeriodInSecond = terminationGracePeriodInSecond;
    }

    /**
     * 
     */
    @JsonProperty("zones")
    public List<String> getZones() {
        return zones;
    }

    /**
     * 
     */
    @JsonProperty("zones")
    public void setZones(List<String> zones) {
        this.zones = zones;
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

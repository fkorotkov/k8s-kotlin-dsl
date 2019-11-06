
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
    "configOverrides",
    "image",
    "initContainers",
    "internalKubDomain",
    "jvmConfig",
    "metricReporter",
    "network",
    "options",
    "placement",
    "podSecurityContext",
    "replicas",
    "resources",
    "terminationGracePeriodInSecond",
    "tls",
    "zones",
    "zookeeper"
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
     * 
     */
    @JsonProperty("configOverrides")
    @JsonPropertyDescription("")
    private ConfigOverrides configOverrides;
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
    @JsonProperty("initContainers")
    @JsonPropertyDescription("")
    private List<InitContainer> initContainers = new ArrayList<InitContainer>();
    /**
     * 
     * 
     */
    @JsonProperty("internalKubDomain")
    @JsonPropertyDescription("")
    private String internalKubDomain;
    /**
     * 
     * 
     */
    @JsonProperty("jvmConfig")
    @JsonPropertyDescription("")
    private JvmConfig jvmConfig;
    /**
     * 
     * 
     */
    @JsonProperty("metricReporter")
    @JsonPropertyDescription("")
    private MetricReporter metricReporter;
    /**
     * 
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("")
    private Network network;
    /**
     * 
     * 
     */
    @JsonProperty("options")
    @JsonPropertyDescription("")
    private Options options;
    /**
     * 
     * 
     */
    @JsonProperty("placement")
    @JsonPropertyDescription("")
    private Placement placement;
    /**
     * 
     * 
     */
    @JsonProperty("podSecurityContext")
    @JsonPropertyDescription("")
    private PodSecurityContext podSecurityContext;
    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    @JsonPropertyDescription("")
    private Integer replicas;
    /**
     * 
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     * 
     */
    @JsonProperty("terminationGracePeriodInSecond")
    @JsonPropertyDescription("")
    private Integer terminationGracePeriodInSecond;
    /**
     * 
     * 
     */
    @JsonProperty("tls")
    @JsonPropertyDescription("")
    private Tls tls;
    /**
     * 
     * 
     */
    @JsonProperty("zones")
    @JsonPropertyDescription("")
    private List<String> zones = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("zookeeper")
    @JsonPropertyDescription("")
    private Zookeeper zookeeper;
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
     * @param metricReporter
     * @param zookeeper
     * @param podSecurityContext
     * @param replicas
     * @param resources
     * @param zones
     * @param jvmConfig
     * @param network
     * @param configOverrides
     * @param internalKubDomain
     * @param options
     * @param terminationGracePeriodInSecond
     * @param tls
     * @param placement
     * @param initContainers
     */
    public Spec(ConfigOverrides configOverrides, String image, List<InitContainer> initContainers, String internalKubDomain, JvmConfig jvmConfig, MetricReporter metricReporter, Network network, Options options, Placement placement, PodSecurityContext podSecurityContext, Integer replicas, Resources resources, Integer terminationGracePeriodInSecond, Tls tls, List<String> zones, Zookeeper zookeeper) {
        super();
        this.configOverrides = configOverrides;
        this.image = image;
        this.initContainers = initContainers;
        this.internalKubDomain = internalKubDomain;
        this.jvmConfig = jvmConfig;
        this.metricReporter = metricReporter;
        this.network = network;
        this.options = options;
        this.placement = placement;
        this.podSecurityContext = podSecurityContext;
        this.replicas = replicas;
        this.resources = resources;
        this.terminationGracePeriodInSecond = terminationGracePeriodInSecond;
        this.tls = tls;
        this.zones = zones;
        this.zookeeper = zookeeper;
    }

    /**
     * 
     * 
     */
    @JsonProperty("configOverrides")
    public ConfigOverrides getConfigOverrides() {
        return configOverrides;
    }

    /**
     * 
     * 
     */
    @JsonProperty("configOverrides")
    public void setConfigOverrides(ConfigOverrides configOverrides) {
        this.configOverrides = configOverrides;
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
    @JsonProperty("initContainers")
    public List<InitContainer> getInitContainers() {
        return initContainers;
    }

    /**
     * 
     * 
     */
    @JsonProperty("initContainers")
    public void setInitContainers(List<InitContainer> initContainers) {
        this.initContainers = initContainers;
    }

    /**
     * 
     * 
     */
    @JsonProperty("internalKubDomain")
    public String getInternalKubDomain() {
        return internalKubDomain;
    }

    /**
     * 
     * 
     */
    @JsonProperty("internalKubDomain")
    public void setInternalKubDomain(String internalKubDomain) {
        this.internalKubDomain = internalKubDomain;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jvmConfig")
    public JvmConfig getJvmConfig() {
        return jvmConfig;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jvmConfig")
    public void setJvmConfig(JvmConfig jvmConfig) {
        this.jvmConfig = jvmConfig;
    }

    /**
     * 
     * 
     */
    @JsonProperty("metricReporter")
    public MetricReporter getMetricReporter() {
        return metricReporter;
    }

    /**
     * 
     * 
     */
    @JsonProperty("metricReporter")
    public void setMetricReporter(MetricReporter metricReporter) {
        this.metricReporter = metricReporter;
    }

    /**
     * 
     * 
     */
    @JsonProperty("network")
    public Network getNetwork() {
        return network;
    }

    /**
     * 
     * 
     */
    @JsonProperty("network")
    public void setNetwork(Network network) {
        this.network = network;
    }

    /**
     * 
     * 
     */
    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    /**
     * 
     * 
     */
    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * 
     * 
     */
    @JsonProperty("placement")
    public Placement getPlacement() {
        return placement;
    }

    /**
     * 
     * 
     */
    @JsonProperty("placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * 
     * 
     */
    @JsonProperty("podSecurityContext")
    public PodSecurityContext getPodSecurityContext() {
        return podSecurityContext;
    }

    /**
     * 
     * 
     */
    @JsonProperty("podSecurityContext")
    public void setPodSecurityContext(PodSecurityContext podSecurityContext) {
        this.podSecurityContext = podSecurityContext;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("resources")
    public Resources getResources() {
        return resources;
    }

    /**
     * 
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resources resources) {
        this.resources = resources;
    }

    /**
     * 
     * 
     */
    @JsonProperty("terminationGracePeriodInSecond")
    public Integer getTerminationGracePeriodInSecond() {
        return terminationGracePeriodInSecond;
    }

    /**
     * 
     * 
     */
    @JsonProperty("terminationGracePeriodInSecond")
    public void setTerminationGracePeriodInSecond(Integer terminationGracePeriodInSecond) {
        this.terminationGracePeriodInSecond = terminationGracePeriodInSecond;
    }

    /**
     * 
     * 
     */
    @JsonProperty("tls")
    public Tls getTls() {
        return tls;
    }

    /**
     * 
     * 
     */
    @JsonProperty("tls")
    public void setTls(Tls tls) {
        this.tls = tls;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zones")
    public List<String> getZones() {
        return zones;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zones")
    public void setZones(List<String> zones) {
        this.zones = zones;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeper")
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeper")
    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
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

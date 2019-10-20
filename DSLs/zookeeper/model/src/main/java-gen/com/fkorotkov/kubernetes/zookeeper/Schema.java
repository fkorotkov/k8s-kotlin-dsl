
package com.fkorotkov.kubernetes.zookeeper;

import java.util.HashMap;
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
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "config",
    "configOverrides",
    "envVar",
    "initContainer",
    "jvmConfig",
    "limits",
    "nodeAffinity",
    "placement",
    "podSecurityContext",
    "rack",
    "requests",
    "resources",
    "seLinuxOptions",
    "spec",
    "status",
    "storage",
    "sysctl",
    "zookeeperCluster",
    "zookeeperClusterList"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class Schema {

    /**
     * 
     * 
     */
    @JsonProperty("config")
    @JsonPropertyDescription("")
    private Config config;
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
    @JsonProperty("envVar")
    @JsonPropertyDescription("")
    private EnvVar envVar;
    /**
     * 
     * 
     */
    @JsonProperty("initContainer")
    @JsonPropertyDescription("")
    private InitContainer initContainer;
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
    @JsonProperty("limits")
    @JsonPropertyDescription("")
    private Limits limits;
    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    @JsonPropertyDescription("")
    private NodeAffinity nodeAffinity;
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
    @JsonProperty("rack")
    @JsonPropertyDescription("")
    private Rack rack;
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
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("")
    private SeLinuxOptions seLinuxOptions;
    /**
     * 
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("")
    private Spec spec;
    /**
     * 
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Status status;
    /**
     * 
     * 
     */
    @JsonProperty("storage")
    @JsonPropertyDescription("")
    private Storage storage;
    /**
     * 
     * 
     */
    @JsonProperty("sysctl")
    @JsonPropertyDescription("")
    private Sysctl sysctl;
    /**
     * 
     * 
     */
    @JsonProperty("zookeeperCluster")
    @JsonPropertyDescription("")
    private ZookeeperCluster zookeeperCluster;
    /**
     * 
     * 
     */
    @JsonProperty("zookeeperClusterList")
    @JsonPropertyDescription("")
    private ZookeeperClusterList zookeeperClusterList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Schema() {
    }

    /**
     * 
     * @param rack
     * @param seLinuxOptions
     * @param zookeeperClusterList
     * @param envVar
     * @param podSecurityContext
     * @param resources
     * @param nodeAffinity
     * @param initContainer
     * @param requests
     * @param storage
     * @param spec
     * @param zookeeperCluster
     * @param jvmConfig
     * @param sysctl
     * @param configOverrides
     * @param placement
     * @param config
     * @param limits
     * @param status
     */
    public Schema(Config config, ConfigOverrides configOverrides, EnvVar envVar, InitContainer initContainer, JvmConfig jvmConfig, Limits limits, NodeAffinity nodeAffinity, Placement placement, PodSecurityContext podSecurityContext, Rack rack, Requests requests, Resources resources, SeLinuxOptions seLinuxOptions, Spec spec, Status status, Storage storage, Sysctl sysctl, ZookeeperCluster zookeeperCluster, ZookeeperClusterList zookeeperClusterList) {
        super();
        this.config = config;
        this.configOverrides = configOverrides;
        this.envVar = envVar;
        this.initContainer = initContainer;
        this.jvmConfig = jvmConfig;
        this.limits = limits;
        this.nodeAffinity = nodeAffinity;
        this.placement = placement;
        this.podSecurityContext = podSecurityContext;
        this.rack = rack;
        this.requests = requests;
        this.resources = resources;
        this.seLinuxOptions = seLinuxOptions;
        this.spec = spec;
        this.status = status;
        this.storage = storage;
        this.sysctl = sysctl;
        this.zookeeperCluster = zookeeperCluster;
        this.zookeeperClusterList = zookeeperClusterList;
    }

    /**
     * 
     * 
     */
    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    /**
     * 
     * 
     */
    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
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
    @JsonProperty("initContainer")
    public InitContainer getInitContainer() {
        return initContainer;
    }

    /**
     * 
     * 
     */
    @JsonProperty("initContainer")
    public void setInitContainer(InitContainer initContainer) {
        this.initContainer = initContainer;
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
    @JsonProperty("nodeAffinity")
    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
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
    @JsonProperty("rack")
    public Rack getRack() {
        return rack;
    }

    /**
     * 
     * 
     */
    @JsonProperty("rack")
    public void setRack(Rack rack) {
        this.rack = rack;
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
    @JsonProperty("seLinuxOptions")
    public SeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * 
     * 
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * 
     * 
     */
    @JsonProperty("spec")
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     * 
     */
    @JsonProperty("spec")
    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    /**
     * 
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * 
     */
    @JsonProperty("storage")
    public Storage getStorage() {
        return storage;
    }

    /**
     * 
     * 
     */
    @JsonProperty("storage")
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * 
     * 
     */
    @JsonProperty("sysctl")
    public Sysctl getSysctl() {
        return sysctl;
    }

    /**
     * 
     * 
     */
    @JsonProperty("sysctl")
    public void setSysctl(Sysctl sysctl) {
        this.sysctl = sysctl;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeperCluster")
    public ZookeeperCluster getZookeeperCluster() {
        return zookeeperCluster;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeperCluster")
    public void setZookeeperCluster(ZookeeperCluster zookeeperCluster) {
        this.zookeeperCluster = zookeeperCluster;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeperClusterList")
    public ZookeeperClusterList getZookeeperClusterList() {
        return zookeeperClusterList;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeperClusterList")
    public void setZookeeperClusterList(ZookeeperClusterList zookeeperClusterList) {
        this.zookeeperClusterList = zookeeperClusterList;
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

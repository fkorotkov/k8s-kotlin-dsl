
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
    "annotations",
    "authentication",
    "brokerEndpoints",
    "configOverrides",
    "envVar",
    "initContainer",
    "jvmConfig",
    "kafkaCluster",
    "kafkaClusterList",
    "limits",
    "metricReporter",
    "network",
    "nodeAffinity",
    "options",
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
    "tls",
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
public class Schema {

    /**
     * 
     */
    @JsonProperty("annotations")
    @JsonPropertyDescription("")
    private Annotations annotations;
    /**
     * 
     */
    @JsonProperty("authentication")
    @JsonPropertyDescription("")
    private Authentication authentication;
    /**
     * 
     */
    @JsonProperty("brokerEndpoints")
    @JsonPropertyDescription("")
    private BrokerEndpoints brokerEndpoints;
    /**
     * 
     */
    @JsonProperty("configOverrides")
    @JsonPropertyDescription("")
    private ConfigOverrides configOverrides;
    /**
     * 
     */
    @JsonProperty("envVar")
    @JsonPropertyDescription("")
    private EnvVar envVar;
    /**
     * 
     */
    @JsonProperty("initContainer")
    @JsonPropertyDescription("")
    private InitContainer initContainer;
    /**
     * 
     */
    @JsonProperty("jvmConfig")
    @JsonPropertyDescription("")
    private JvmConfig jvmConfig;
    /**
     * 
     */
    @JsonProperty("kafkaCluster")
    @JsonPropertyDescription("")
    private KafkaCluster kafkaCluster;
    /**
     * 
     */
    @JsonProperty("kafkaClusterList")
    @JsonPropertyDescription("")
    private KafkaClusterList kafkaClusterList;
    /**
     * 
     */
    @JsonProperty("limits")
    @JsonPropertyDescription("")
    private Limits limits;
    /**
     * 
     */
    @JsonProperty("metricReporter")
    @JsonPropertyDescription("")
    private MetricReporter metricReporter;
    /**
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("")
    private Network network;
    /**
     * 
     */
    @JsonProperty("nodeAffinity")
    @JsonPropertyDescription("")
    private NodeAffinity nodeAffinity;
    /**
     * 
     */
    @JsonProperty("options")
    @JsonPropertyDescription("")
    private Options options;
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
    @JsonProperty("rack")
    @JsonPropertyDescription("")
    private Rack rack;
    /**
     * 
     */
    @JsonProperty("requests")
    @JsonPropertyDescription("")
    private Requests requests;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("")
    private SeLinuxOptions seLinuxOptions;
    /**
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("")
    private Spec spec;
    /**
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Status status;
    /**
     * 
     */
    @JsonProperty("storage")
    @JsonPropertyDescription("")
    private Storage storage;
    /**
     * 
     */
    @JsonProperty("sysctl")
    @JsonPropertyDescription("")
    private Sysctl sysctl;
    /**
     * 
     */
    @JsonProperty("tls")
    @JsonPropertyDescription("")
    private Tls tls;
    /**
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
    public Schema() {
    }

    /**
     * 
     * @param metricReporter
     * @param seLinuxOptions
     * @param podSecurityContext
     * @param annotations
     * @param initContainer
     * @param requests
     * @param storage
     * @param spec
     * @param jvmConfig
     * @param network
     * @param options
     * @param kafkaClusterList
     * @param limits
     * @param authentication
     * @param rack
     * @param envVar
     * @param zookeeper
     * @param resources
     * @param nodeAffinity
     * @param sysctl
     * @param configOverrides
     * @param brokerEndpoints
     * @param tls
     * @param placement
     * @param kafkaCluster
     * @param status
     */
    public Schema(Annotations annotations, Authentication authentication, BrokerEndpoints brokerEndpoints, ConfigOverrides configOverrides, EnvVar envVar, InitContainer initContainer, JvmConfig jvmConfig, KafkaCluster kafkaCluster, KafkaClusterList kafkaClusterList, Limits limits, MetricReporter metricReporter, Network network, NodeAffinity nodeAffinity, Options options, Placement placement, PodSecurityContext podSecurityContext, Rack rack, Requests requests, Resources resources, SeLinuxOptions seLinuxOptions, Spec spec, Status status, Storage storage, Sysctl sysctl, Tls tls, Zookeeper zookeeper) {
        super();
        this.annotations = annotations;
        this.authentication = authentication;
        this.brokerEndpoints = brokerEndpoints;
        this.configOverrides = configOverrides;
        this.envVar = envVar;
        this.initContainer = initContainer;
        this.jvmConfig = jvmConfig;
        this.kafkaCluster = kafkaCluster;
        this.kafkaClusterList = kafkaClusterList;
        this.limits = limits;
        this.metricReporter = metricReporter;
        this.network = network;
        this.nodeAffinity = nodeAffinity;
        this.options = options;
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
        this.tls = tls;
        this.zookeeper = zookeeper;
    }

    /**
     * 
     */
    @JsonProperty("annotations")
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    /**
     * 
     */
    @JsonProperty("authentication")
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * 
     */
    @JsonProperty("authentication")
    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * 
     */
    @JsonProperty("brokerEndpoints")
    public BrokerEndpoints getBrokerEndpoints() {
        return brokerEndpoints;
    }

    /**
     * 
     */
    @JsonProperty("brokerEndpoints")
    public void setBrokerEndpoints(BrokerEndpoints brokerEndpoints) {
        this.brokerEndpoints = brokerEndpoints;
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
    @JsonProperty("envVar")
    public EnvVar getEnvVar() {
        return envVar;
    }

    /**
     * 
     */
    @JsonProperty("envVar")
    public void setEnvVar(EnvVar envVar) {
        this.envVar = envVar;
    }

    /**
     * 
     */
    @JsonProperty("initContainer")
    public InitContainer getInitContainer() {
        return initContainer;
    }

    /**
     * 
     */
    @JsonProperty("initContainer")
    public void setInitContainer(InitContainer initContainer) {
        this.initContainer = initContainer;
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
    @JsonProperty("kafkaCluster")
    public KafkaCluster getKafkaCluster() {
        return kafkaCluster;
    }

    /**
     * 
     */
    @JsonProperty("kafkaCluster")
    public void setKafkaCluster(KafkaCluster kafkaCluster) {
        this.kafkaCluster = kafkaCluster;
    }

    /**
     * 
     */
    @JsonProperty("kafkaClusterList")
    public KafkaClusterList getKafkaClusterList() {
        return kafkaClusterList;
    }

    /**
     * 
     */
    @JsonProperty("kafkaClusterList")
    public void setKafkaClusterList(KafkaClusterList kafkaClusterList) {
        this.kafkaClusterList = kafkaClusterList;
    }

    /**
     * 
     */
    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    /**
     * 
     */
    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    /**
     * 
     */
    @JsonProperty("metricReporter")
    public MetricReporter getMetricReporter() {
        return metricReporter;
    }

    /**
     * 
     */
    @JsonProperty("metricReporter")
    public void setMetricReporter(MetricReporter metricReporter) {
        this.metricReporter = metricReporter;
    }

    /**
     * 
     */
    @JsonProperty("network")
    public Network getNetwork() {
        return network;
    }

    /**
     * 
     */
    @JsonProperty("network")
    public void setNetwork(Network network) {
        this.network = network;
    }

    /**
     * 
     */
    @JsonProperty("nodeAffinity")
    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * 
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * 
     */
    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    /**
     * 
     */
    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
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
    @JsonProperty("rack")
    public Rack getRack() {
        return rack;
    }

    /**
     * 
     */
    @JsonProperty("rack")
    public void setRack(Rack rack) {
        this.rack = rack;
    }

    /**
     * 
     */
    @JsonProperty("requests")
    public Requests getRequests() {
        return requests;
    }

    /**
     * 
     */
    @JsonProperty("requests")
    public void setRequests(Requests requests) {
        this.requests = requests;
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
    @JsonProperty("seLinuxOptions")
    public SeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * 
     */
    @JsonProperty("spec")
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     */
    @JsonProperty("spec")
    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     */
    @JsonProperty("storage")
    public Storage getStorage() {
        return storage;
    }

    /**
     * 
     */
    @JsonProperty("storage")
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * 
     */
    @JsonProperty("sysctl")
    public Sysctl getSysctl() {
        return sysctl;
    }

    /**
     * 
     */
    @JsonProperty("sysctl")
    public void setSysctl(Sysctl sysctl) {
        this.sysctl = sysctl;
    }

    /**
     * 
     */
    @JsonProperty("tls")
    public Tls getTls() {
        return tls;
    }

    /**
     * 
     */
    @JsonProperty("tls")
    public void setTls(Tls tls) {
        this.tls = tls;
    }

    /**
     * 
     */
    @JsonProperty("zookeeper")
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    /**
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

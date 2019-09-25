
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
    "authenticationType",
    "bootstrapEndpoint",
    "brokerEndpoints",
    "brokerExternalListener",
    "brokerInternalListener",
    "clientAuthentication",
    "clusterName",
    "currentReplicas",
    "externalClient",
    "internalClient",
    "jmxPort",
    "jolokiaPort",
    "minIsr",
    "phase",
    "prometheusPort",
    "pscVersion",
    "readyReplicas",
    "reason",
    "replicas",
    "replicationFactor",
    "securityProtocol",
    "zookeeperConnect"
})
public class Status {

    /**
     * 
     * 
     */
    @JsonProperty("authenticationType")
    @JsonPropertyDescription("")
    private String authenticationType;
    /**
     * 
     * 
     */
    @JsonProperty("bootstrapEndpoint")
    @JsonPropertyDescription("")
    private String bootstrapEndpoint;
    /**
     * 
     * 
     */
    @JsonProperty("brokerEndpoints")
    @JsonPropertyDescription("")
    private BrokerEndpoints brokerEndpoints;
    /**
     * 
     * 
     */
    @JsonProperty("brokerExternalListener")
    @JsonPropertyDescription("")
    private String brokerExternalListener;
    /**
     * 
     * 
     */
    @JsonProperty("brokerInternalListener")
    @JsonPropertyDescription("")
    private String brokerInternalListener;
    /**
     * 
     * 
     */
    @JsonProperty("clientAuthentication")
    @JsonPropertyDescription("")
    private Boolean clientAuthentication;
    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    @JsonPropertyDescription("")
    private String clusterName;
    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    @JsonPropertyDescription("")
    private Integer currentReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("externalClient")
    @JsonPropertyDescription("")
    private String externalClient;
    /**
     * 
     * 
     */
    @JsonProperty("internalClient")
    @JsonPropertyDescription("")
    private String internalClient;
    /**
     * 
     * 
     */
    @JsonProperty("jmxPort")
    @JsonPropertyDescription("")
    private Integer jmxPort;
    /**
     * 
     * 
     */
    @JsonProperty("jolokiaPort")
    @JsonPropertyDescription("")
    private Integer jolokiaPort;
    /**
     * 
     * 
     */
    @JsonProperty("minIsr")
    @JsonPropertyDescription("")
    private Integer minIsr;
    /**
     * 
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("")
    private String phase;
    /**
     * 
     * 
     */
    @JsonProperty("prometheusPort")
    @JsonPropertyDescription("")
    private Integer prometheusPort;
    /**
     * 
     * 
     */
    @JsonProperty("pscVersion")
    @JsonPropertyDescription("")
    private String pscVersion;
    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    @JsonPropertyDescription("")
    private Integer readyReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("")
    private String reason;
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
    @JsonProperty("replicationFactor")
    @JsonPropertyDescription("")
    private Integer replicationFactor;
    /**
     * 
     * 
     */
    @JsonProperty("securityProtocol")
    @JsonPropertyDescription("")
    private String securityProtocol;
    /**
     * 
     * 
     */
    @JsonProperty("zookeeperConnect")
    @JsonPropertyDescription("")
    private String zookeeperConnect;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param phase
     * @param reason
     * @param replicationFactor
     * @param bootstrapEndpoint
     * @param jmxPort
     * @param zookeeperConnect
     * @param replicas
     * @param readyReplicas
     * @param internalClient
     * @param minIsr
     * @param brokerExternalListener
     * @param jolokiaPort
     * @param securityProtocol
     * @param brokerEndpoints
     * @param brokerInternalListener
     * @param clusterName
     * @param pscVersion
     * @param clientAuthentication
     * @param currentReplicas
     * @param authenticationType
     * @param externalClient
     * @param prometheusPort
     */
    public Status(String authenticationType, String bootstrapEndpoint, BrokerEndpoints brokerEndpoints, String brokerExternalListener, String brokerInternalListener, Boolean clientAuthentication, String clusterName, Integer currentReplicas, String externalClient, String internalClient, Integer jmxPort, Integer jolokiaPort, Integer minIsr, String phase, Integer prometheusPort, String pscVersion, Integer readyReplicas, String reason, Integer replicas, Integer replicationFactor, String securityProtocol, String zookeeperConnect) {
        super();
        this.authenticationType = authenticationType;
        this.bootstrapEndpoint = bootstrapEndpoint;
        this.brokerEndpoints = brokerEndpoints;
        this.brokerExternalListener = brokerExternalListener;
        this.brokerInternalListener = brokerInternalListener;
        this.clientAuthentication = clientAuthentication;
        this.clusterName = clusterName;
        this.currentReplicas = currentReplicas;
        this.externalClient = externalClient;
        this.internalClient = internalClient;
        this.jmxPort = jmxPort;
        this.jolokiaPort = jolokiaPort;
        this.minIsr = minIsr;
        this.phase = phase;
        this.prometheusPort = prometheusPort;
        this.pscVersion = pscVersion;
        this.readyReplicas = readyReplicas;
        this.reason = reason;
        this.replicas = replicas;
        this.replicationFactor = replicationFactor;
        this.securityProtocol = securityProtocol;
        this.zookeeperConnect = zookeeperConnect;
    }

    /**
     * 
     * 
     */
    @JsonProperty("authenticationType")
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * 
     * 
     */
    @JsonProperty("authenticationType")
    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapEndpoint")
    public String getBootstrapEndpoint() {
        return bootstrapEndpoint;
    }

    /**
     * 
     * 
     */
    @JsonProperty("bootstrapEndpoint")
    public void setBootstrapEndpoint(String bootstrapEndpoint) {
        this.bootstrapEndpoint = bootstrapEndpoint;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerEndpoints")
    public BrokerEndpoints getBrokerEndpoints() {
        return brokerEndpoints;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerEndpoints")
    public void setBrokerEndpoints(BrokerEndpoints brokerEndpoints) {
        this.brokerEndpoints = brokerEndpoints;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerExternalListener")
    public String getBrokerExternalListener() {
        return brokerExternalListener;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerExternalListener")
    public void setBrokerExternalListener(String brokerExternalListener) {
        this.brokerExternalListener = brokerExternalListener;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerInternalListener")
    public String getBrokerInternalListener() {
        return brokerInternalListener;
    }

    /**
     * 
     * 
     */
    @JsonProperty("brokerInternalListener")
    public void setBrokerInternalListener(String brokerInternalListener) {
        this.brokerInternalListener = brokerInternalListener;
    }

    /**
     * 
     * 
     */
    @JsonProperty("clientAuthentication")
    public Boolean getClientAuthentication() {
        return clientAuthentication;
    }

    /**
     * 
     * 
     */
    @JsonProperty("clientAuthentication")
    public void setClientAuthentication(Boolean clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    public String getClusterName() {
        return clusterName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    public void setCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("externalClient")
    public String getExternalClient() {
        return externalClient;
    }

    /**
     * 
     * 
     */
    @JsonProperty("externalClient")
    public void setExternalClient(String externalClient) {
        this.externalClient = externalClient;
    }

    /**
     * 
     * 
     */
    @JsonProperty("internalClient")
    public String getInternalClient() {
        return internalClient;
    }

    /**
     * 
     * 
     */
    @JsonProperty("internalClient")
    public void setInternalClient(String internalClient) {
        this.internalClient = internalClient;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jmxPort")
    public Integer getJmxPort() {
        return jmxPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jmxPort")
    public void setJmxPort(Integer jmxPort) {
        this.jmxPort = jmxPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jolokiaPort")
    public Integer getJolokiaPort() {
        return jolokiaPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("jolokiaPort")
    public void setJolokiaPort(Integer jolokiaPort) {
        this.jolokiaPort = jolokiaPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("minIsr")
    public Integer getMinIsr() {
        return minIsr;
    }

    /**
     * 
     * 
     */
    @JsonProperty("minIsr")
    public void setMinIsr(Integer minIsr) {
        this.minIsr = minIsr;
    }

    /**
     * 
     * 
     */
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * 
     * 
     */
    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * 
     * 
     */
    @JsonProperty("prometheusPort")
    public Integer getPrometheusPort() {
        return prometheusPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("prometheusPort")
    public void setPrometheusPort(Integer prometheusPort) {
        this.prometheusPort = prometheusPort;
    }

    /**
     * 
     * 
     */
    @JsonProperty("pscVersion")
    public String getPscVersion() {
        return pscVersion;
    }

    /**
     * 
     * 
     */
    @JsonProperty("pscVersion")
    public void setPscVersion(String pscVersion) {
        this.pscVersion = pscVersion;
    }

    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    /**
     * 
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * 
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
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
    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * 
     * 
     */
    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    /**
     * 
     * 
     */
    @JsonProperty("securityProtocol")
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * 
     * 
     */
    @JsonProperty("securityProtocol")
    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeperConnect")
    public String getZookeeperConnect() {
        return zookeeperConnect;
    }

    /**
     * 
     * 
     */
    @JsonProperty("zookeeperConnect")
    public void setZookeeperConnect(String zookeeperConnect) {
        this.zookeeperConnect = zookeeperConnect;
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


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
    "fsGroup",
    "randomUID",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "supplementalGroups",
    "sysctls"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", inline = {
    @Inline(type = Doneable.class, prefix = "Doneable", value = "done")
}, refs = {
    @BuildableReference(ObjectMeta.class)
})
public class PodSecurityContext implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("fsGroup")
    @JsonPropertyDescription("")
    private Integer fsGroup;
    /**
     * 
     */
    @JsonProperty("randomUID")
    @JsonPropertyDescription("")
    private Boolean randomUID;
    /**
     * 
     */
    @JsonProperty("runAsGroup")
    @JsonPropertyDescription("")
    private Integer runAsGroup;
    /**
     * 
     */
    @JsonProperty("runAsNonRoot")
    @JsonPropertyDescription("")
    private Boolean runAsNonRoot;
    /**
     * 
     */
    @JsonProperty("runAsUser")
    @JsonPropertyDescription("")
    private Integer runAsUser;
    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("")
    private SeLinuxOptions seLinuxOptions;
    /**
     * 
     */
    @JsonProperty("supplementalGroups")
    @JsonPropertyDescription("")
    private List<Integer> supplementalGroups = new ArrayList<Integer>();
    /**
     * 
     */
    @JsonProperty("sysctls")
    @JsonPropertyDescription("")
    private List<Sysctl> sysctls = new ArrayList<Sysctl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodSecurityContext() {
    }

    /**
     * 
     * @param runAsUser
     * @param randomUID
     * @param seLinuxOptions
     * @param fsGroup
     * @param supplementalGroups
     * @param runAsGroup
     * @param runAsNonRoot
     * @param sysctls
     */
    public PodSecurityContext(Integer fsGroup, Boolean randomUID, Integer runAsGroup, Boolean runAsNonRoot, Integer runAsUser, SeLinuxOptions seLinuxOptions, List<Integer> supplementalGroups, List<Sysctl> sysctls) {
        super();
        this.fsGroup = fsGroup;
        this.randomUID = randomUID;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.supplementalGroups = supplementalGroups;
        this.sysctls = sysctls;
    }

    /**
     * 
     */
    @JsonProperty("fsGroup")
    public Integer getFsGroup() {
        return fsGroup;
    }

    /**
     * 
     */
    @JsonProperty("fsGroup")
    public void setFsGroup(Integer fsGroup) {
        this.fsGroup = fsGroup;
    }

    /**
     * 
     */
    @JsonProperty("randomUID")
    public Boolean getRandomUID() {
        return randomUID;
    }

    /**
     * 
     */
    @JsonProperty("randomUID")
    public void setRandomUID(Boolean randomUID) {
        this.randomUID = randomUID;
    }

    /**
     * 
     */
    @JsonProperty("runAsGroup")
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * 
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * 
     */
    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    /**
     * 
     */
    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * 
     */
    @JsonProperty("runAsUser")
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /**
     * 
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
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
    @JsonProperty("supplementalGroups")
    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    /**
     * 
     */
    @JsonProperty("supplementalGroups")
    public void setSupplementalGroups(List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    /**
     * 
     */
    @JsonProperty("sysctls")
    public List<Sysctl> getSysctls() {
        return sysctls;
    }

    /**
     * 
     */
    @JsonProperty("sysctls")
    public void setSysctls(List<Sysctl> sysctls) {
        this.sysctls = sysctls;
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

// GENERATE
package com.fkorotkov.kubernetes.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.AllowedCSIDriver as v1beta1_AllowedCSIDriver
import io.fabric8.kubernetes.api.model.policy.v1beta1.AllowedFlexVolume as v1beta1_AllowedFlexVolume
import io.fabric8.kubernetes.api.model.policy.v1beta1.AllowedHostPath as v1beta1_AllowedHostPath
import io.fabric8.kubernetes.api.model.policy.v1beta1.Eviction as v1beta1_Eviction
import io.fabric8.kubernetes.api.model.policy.v1beta1.FSGroupStrategyOptions as v1beta1_FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.HostPortRange as v1beta1_HostPortRange
import io.fabric8.kubernetes.api.model.policy.v1beta1.IDRange as v1beta1_IDRange
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudget as v1beta1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetList as v1beta1_PodDisruptionBudgetList
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetSpec as v1beta1_PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetStatus as v1beta1_PodDisruptionBudgetStatus
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy as v1beta1_PodSecurityPolicy
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicyList as v1beta1_PodSecurityPolicyList
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.RunAsGroupStrategyOptions as v1beta1_RunAsGroupStrategyOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.RunAsUserStrategyOptions as v1beta1_RunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.RuntimeClassStrategyOptions as v1beta1_RuntimeClassStrategyOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.SELinuxStrategyOptions as v1beta1_SELinuxStrategyOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.SupplementalGroupsStrategyOptions as v1beta1_SupplementalGroupsStrategyOptions


fun newAllowedCSIDriver(block : v1beta1_AllowedCSIDriver.() -> Unit = {}): v1beta1_AllowedCSIDriver {
  val instance = v1beta1_AllowedCSIDriver()
  instance.block()
  return instance
}


fun newAllowedFlexVolume(block : v1beta1_AllowedFlexVolume.() -> Unit = {}): v1beta1_AllowedFlexVolume {
  val instance = v1beta1_AllowedFlexVolume()
  instance.block()
  return instance
}


fun newAllowedHostPath(block : v1beta1_AllowedHostPath.() -> Unit = {}): v1beta1_AllowedHostPath {
  val instance = v1beta1_AllowedHostPath()
  instance.block()
  return instance
}


fun newEviction(block : v1beta1_Eviction.() -> Unit = {}): v1beta1_Eviction {
  val instance = v1beta1_Eviction()
  instance.block()
  return instance
}


fun newFSGroupStrategyOptions(block : v1beta1_FSGroupStrategyOptions.() -> Unit = {}): v1beta1_FSGroupStrategyOptions {
  val instance = v1beta1_FSGroupStrategyOptions()
  instance.block()
  return instance
}


fun newHostPortRange(block : v1beta1_HostPortRange.() -> Unit = {}): v1beta1_HostPortRange {
  val instance = v1beta1_HostPortRange()
  instance.block()
  return instance
}


fun newIDRange(block : v1beta1_IDRange.() -> Unit = {}): v1beta1_IDRange {
  val instance = v1beta1_IDRange()
  instance.block()
  return instance
}


fun newPodDisruptionBudget(block : v1beta1_PodDisruptionBudget.() -> Unit = {}): v1beta1_PodDisruptionBudget {
  val instance = v1beta1_PodDisruptionBudget()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetList(block : v1beta1_PodDisruptionBudgetList.() -> Unit = {}): v1beta1_PodDisruptionBudgetList {
  val instance = v1beta1_PodDisruptionBudgetList()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetSpec(block : v1beta1_PodDisruptionBudgetSpec.() -> Unit = {}): v1beta1_PodDisruptionBudgetSpec {
  val instance = v1beta1_PodDisruptionBudgetSpec()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetStatus(block : v1beta1_PodDisruptionBudgetStatus.() -> Unit = {}): v1beta1_PodDisruptionBudgetStatus {
  val instance = v1beta1_PodDisruptionBudgetStatus()
  instance.block()
  return instance
}


fun newPodSecurityPolicy(block : v1beta1_PodSecurityPolicy.() -> Unit = {}): v1beta1_PodSecurityPolicy {
  val instance = v1beta1_PodSecurityPolicy()
  instance.block()
  return instance
}


fun newPodSecurityPolicyList(block : v1beta1_PodSecurityPolicyList.() -> Unit = {}): v1beta1_PodSecurityPolicyList {
  val instance = v1beta1_PodSecurityPolicyList()
  instance.block()
  return instance
}


fun newPodSecurityPolicySpec(block : v1beta1_PodSecurityPolicySpec.() -> Unit = {}): v1beta1_PodSecurityPolicySpec {
  val instance = v1beta1_PodSecurityPolicySpec()
  instance.block()
  return instance
}


fun newRunAsGroupStrategyOptions(block : v1beta1_RunAsGroupStrategyOptions.() -> Unit = {}): v1beta1_RunAsGroupStrategyOptions {
  val instance = v1beta1_RunAsGroupStrategyOptions()
  instance.block()
  return instance
}


fun newRunAsUserStrategyOptions(block : v1beta1_RunAsUserStrategyOptions.() -> Unit = {}): v1beta1_RunAsUserStrategyOptions {
  val instance = v1beta1_RunAsUserStrategyOptions()
  instance.block()
  return instance
}


fun newRuntimeClassStrategyOptions(block : v1beta1_RuntimeClassStrategyOptions.() -> Unit = {}): v1beta1_RuntimeClassStrategyOptions {
  val instance = v1beta1_RuntimeClassStrategyOptions()
  instance.block()
  return instance
}


fun newSELinuxStrategyOptions(block : v1beta1_SELinuxStrategyOptions.() -> Unit = {}): v1beta1_SELinuxStrategyOptions {
  val instance = v1beta1_SELinuxStrategyOptions()
  instance.block()
  return instance
}


fun newSupplementalGroupsStrategyOptions(block : v1beta1_SupplementalGroupsStrategyOptions.() -> Unit = {}): v1beta1_SupplementalGroupsStrategyOptions {
  val instance = v1beta1_SupplementalGroupsStrategyOptions()
  instance.block()
  return instance
}


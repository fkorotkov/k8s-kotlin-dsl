// GENERATE
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.AllowedCSIDriver as policy_AllowedCSIDriver
import io.fabric8.kubernetes.api.model.policy.AllowedFlexVolume as policy_AllowedFlexVolume
import io.fabric8.kubernetes.api.model.policy.AllowedHostPath as policy_AllowedHostPath
import io.fabric8.kubernetes.api.model.policy.Eviction as policy_Eviction
import io.fabric8.kubernetes.api.model.policy.FSGroupStrategyOptions as policy_FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.policy.HostPortRange as policy_HostPortRange
import io.fabric8.kubernetes.api.model.policy.IDRange as policy_IDRange
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget as policy_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList as policy_PodDisruptionBudgetList
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec as policy_PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus as policy_PodDisruptionBudgetStatus
import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicy as policy_PodSecurityPolicy
import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicyList as policy_PodSecurityPolicyList
import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.RunAsGroupStrategyOptions as policy_RunAsGroupStrategyOptions
import io.fabric8.kubernetes.api.model.policy.RunAsUserStrategyOptions as policy_RunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.policy.RuntimeClassStrategyOptions as policy_RuntimeClassStrategyOptions
import io.fabric8.kubernetes.api.model.policy.SELinuxStrategyOptions as policy_SELinuxStrategyOptions
import io.fabric8.kubernetes.api.model.policy.SupplementalGroupsStrategyOptions as policy_SupplementalGroupsStrategyOptions


fun newAllowedCSIDriver(block : policy_AllowedCSIDriver.() -> Unit = {}): policy_AllowedCSIDriver {
  val instance = policy_AllowedCSIDriver()
  instance.block()
  return instance
}


fun newAllowedFlexVolume(block : policy_AllowedFlexVolume.() -> Unit = {}): policy_AllowedFlexVolume {
  val instance = policy_AllowedFlexVolume()
  instance.block()
  return instance
}


fun newAllowedHostPath(block : policy_AllowedHostPath.() -> Unit = {}): policy_AllowedHostPath {
  val instance = policy_AllowedHostPath()
  instance.block()
  return instance
}


fun newEviction(block : policy_Eviction.() -> Unit = {}): policy_Eviction {
  val instance = policy_Eviction()
  instance.block()
  return instance
}


fun newFSGroupStrategyOptions(block : policy_FSGroupStrategyOptions.() -> Unit = {}): policy_FSGroupStrategyOptions {
  val instance = policy_FSGroupStrategyOptions()
  instance.block()
  return instance
}


fun newHostPortRange(block : policy_HostPortRange.() -> Unit = {}): policy_HostPortRange {
  val instance = policy_HostPortRange()
  instance.block()
  return instance
}


fun newIDRange(block : policy_IDRange.() -> Unit = {}): policy_IDRange {
  val instance = policy_IDRange()
  instance.block()
  return instance
}


fun newPodDisruptionBudget(block : policy_PodDisruptionBudget.() -> Unit = {}): policy_PodDisruptionBudget {
  val instance = policy_PodDisruptionBudget()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetList(block : policy_PodDisruptionBudgetList.() -> Unit = {}): policy_PodDisruptionBudgetList {
  val instance = policy_PodDisruptionBudgetList()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetSpec(block : policy_PodDisruptionBudgetSpec.() -> Unit = {}): policy_PodDisruptionBudgetSpec {
  val instance = policy_PodDisruptionBudgetSpec()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetStatus(block : policy_PodDisruptionBudgetStatus.() -> Unit = {}): policy_PodDisruptionBudgetStatus {
  val instance = policy_PodDisruptionBudgetStatus()
  instance.block()
  return instance
}


fun newPodSecurityPolicy(block : policy_PodSecurityPolicy.() -> Unit = {}): policy_PodSecurityPolicy {
  val instance = policy_PodSecurityPolicy()
  instance.block()
  return instance
}


fun newPodSecurityPolicyList(block : policy_PodSecurityPolicyList.() -> Unit = {}): policy_PodSecurityPolicyList {
  val instance = policy_PodSecurityPolicyList()
  instance.block()
  return instance
}


fun newPodSecurityPolicySpec(block : policy_PodSecurityPolicySpec.() -> Unit = {}): policy_PodSecurityPolicySpec {
  val instance = policy_PodSecurityPolicySpec()
  instance.block()
  return instance
}


fun newRunAsGroupStrategyOptions(block : policy_RunAsGroupStrategyOptions.() -> Unit = {}): policy_RunAsGroupStrategyOptions {
  val instance = policy_RunAsGroupStrategyOptions()
  instance.block()
  return instance
}


fun newRunAsUserStrategyOptions(block : policy_RunAsUserStrategyOptions.() -> Unit = {}): policy_RunAsUserStrategyOptions {
  val instance = policy_RunAsUserStrategyOptions()
  instance.block()
  return instance
}


fun newRuntimeClassStrategyOptions(block : policy_RuntimeClassStrategyOptions.() -> Unit = {}): policy_RuntimeClassStrategyOptions {
  val instance = policy_RuntimeClassStrategyOptions()
  instance.block()
  return instance
}


fun newSELinuxStrategyOptions(block : policy_SELinuxStrategyOptions.() -> Unit = {}): policy_SELinuxStrategyOptions {
  val instance = policy_SELinuxStrategyOptions()
  instance.block()
  return instance
}


fun newSupplementalGroupsStrategyOptions(block : policy_SupplementalGroupsStrategyOptions.() -> Unit = {}): policy_SupplementalGroupsStrategyOptions {
  val instance = policy_SupplementalGroupsStrategyOptions()
  instance.block()
  return instance
}


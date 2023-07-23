// GENERATE
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSet as extensions_DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetCondition as extensions_DaemonSetCondition
import io.fabric8.kubernetes.api.model.extensions.DaemonSetList as extensions_DaemonSetList
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec as extensions_DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetStatus as extensions_DaemonSetStatus
import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy as extensions_DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.Deployment as extensions_Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentCondition as extensions_DeploymentCondition
import io.fabric8.kubernetes.api.model.extensions.DeploymentList as extensions_DeploymentList
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback as extensions_DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentStatus as extensions_DeploymentStatus
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy as extensions_DeploymentStrategy
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath as extensions_HTTPIngressPath
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue as extensions_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.extensions.IPBlock as extensions_IPBlock
import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend
import io.fabric8.kubernetes.api.model.extensions.IngressList as extensions_IngressList
import io.fabric8.kubernetes.api.model.extensions.IngressLoadBalancerIngress as extensions_IngressLoadBalancerIngress
import io.fabric8.kubernetes.api.model.extensions.IngressLoadBalancerStatus as extensions_IngressLoadBalancerStatus
import io.fabric8.kubernetes.api.model.extensions.IngressPortStatus as extensions_IngressPortStatus
import io.fabric8.kubernetes.api.model.extensions.IngressRule as extensions_IngressRule
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus
import io.fabric8.kubernetes.api.model.extensions.IngressTLS as extensions_IngressTLS
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicy as extensions_NetworkPolicy
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyEgressRule as extensions_NetworkPolicyEgressRule
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule as extensions_NetworkPolicyIngressRule
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyList as extensions_NetworkPolicyList
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer as extensions_NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort as extensions_NetworkPolicyPort
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec as extensions_NetworkPolicySpec
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyStatus as extensions_NetworkPolicyStatus
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet as extensions_ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition as extensions_ReplicaSetCondition
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetList as extensions_ReplicaSetList
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec as extensions_ReplicaSetSpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetStatus as extensions_ReplicaSetStatus
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig as extensions_RollbackConfig
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet as extensions_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment as extensions_RollingUpdateDeployment


fun newDaemonSet(block : extensions_DaemonSet.() -> Unit = {}): extensions_DaemonSet {
  val instance = extensions_DaemonSet()
  instance.block()
  return instance
}


fun newDaemonSetCondition(block : extensions_DaemonSetCondition.() -> Unit = {}): extensions_DaemonSetCondition {
  val instance = extensions_DaemonSetCondition()
  instance.block()
  return instance
}


fun newDaemonSetList(block : extensions_DaemonSetList.() -> Unit = {}): extensions_DaemonSetList {
  val instance = extensions_DaemonSetList()
  instance.block()
  return instance
}


fun newDaemonSetSpec(block : extensions_DaemonSetSpec.() -> Unit = {}): extensions_DaemonSetSpec {
  val instance = extensions_DaemonSetSpec()
  instance.block()
  return instance
}


fun newDaemonSetStatus(block : extensions_DaemonSetStatus.() -> Unit = {}): extensions_DaemonSetStatus {
  val instance = extensions_DaemonSetStatus()
  instance.block()
  return instance
}


fun newDaemonSetUpdateStrategy(block : extensions_DaemonSetUpdateStrategy.() -> Unit = {}): extensions_DaemonSetUpdateStrategy {
  val instance = extensions_DaemonSetUpdateStrategy()
  instance.block()
  return instance
}


fun newDeployment(block : extensions_Deployment.() -> Unit = {}): extensions_Deployment {
  val instance = extensions_Deployment()
  instance.block()
  return instance
}


fun newDeploymentCondition(block : extensions_DeploymentCondition.() -> Unit = {}): extensions_DeploymentCondition {
  val instance = extensions_DeploymentCondition()
  instance.block()
  return instance
}


fun newDeploymentList(block : extensions_DeploymentList.() -> Unit = {}): extensions_DeploymentList {
  val instance = extensions_DeploymentList()
  instance.block()
  return instance
}


fun newDeploymentRollback(block : extensions_DeploymentRollback.() -> Unit = {}): extensions_DeploymentRollback {
  val instance = extensions_DeploymentRollback()
  instance.block()
  return instance
}


fun newDeploymentSpec(block : extensions_DeploymentSpec.() -> Unit = {}): extensions_DeploymentSpec {
  val instance = extensions_DeploymentSpec()
  instance.block()
  return instance
}


fun newDeploymentStatus(block : extensions_DeploymentStatus.() -> Unit = {}): extensions_DeploymentStatus {
  val instance = extensions_DeploymentStatus()
  instance.block()
  return instance
}


fun newDeploymentStrategy(block : extensions_DeploymentStrategy.() -> Unit = {}): extensions_DeploymentStrategy {
  val instance = extensions_DeploymentStrategy()
  instance.block()
  return instance
}


fun newHTTPIngressPath(block : extensions_HTTPIngressPath.() -> Unit = {}): extensions_HTTPIngressPath {
  val instance = extensions_HTTPIngressPath()
  instance.block()
  return instance
}


fun newHTTPIngressRuleValue(block : extensions_HTTPIngressRuleValue.() -> Unit = {}): extensions_HTTPIngressRuleValue {
  val instance = extensions_HTTPIngressRuleValue()
  instance.block()
  return instance
}


fun newIPBlock(block : extensions_IPBlock.() -> Unit = {}): extensions_IPBlock {
  val instance = extensions_IPBlock()
  instance.block()
  return instance
}


fun newIngress(block : extensions_Ingress.() -> Unit = {}): extensions_Ingress {
  val instance = extensions_Ingress()
  instance.block()
  return instance
}


fun newIngressBackend(block : extensions_IngressBackend.() -> Unit = {}): extensions_IngressBackend {
  val instance = extensions_IngressBackend()
  instance.block()
  return instance
}


fun newIngressList(block : extensions_IngressList.() -> Unit = {}): extensions_IngressList {
  val instance = extensions_IngressList()
  instance.block()
  return instance
}


fun newIngressLoadBalancerIngress(block : extensions_IngressLoadBalancerIngress.() -> Unit = {}): extensions_IngressLoadBalancerIngress {
  val instance = extensions_IngressLoadBalancerIngress()
  instance.block()
  return instance
}


fun newIngressLoadBalancerStatus(block : extensions_IngressLoadBalancerStatus.() -> Unit = {}): extensions_IngressLoadBalancerStatus {
  val instance = extensions_IngressLoadBalancerStatus()
  instance.block()
  return instance
}


fun newIngressPortStatus(block : extensions_IngressPortStatus.() -> Unit = {}): extensions_IngressPortStatus {
  val instance = extensions_IngressPortStatus()
  instance.block()
  return instance
}


fun newIngressRule(block : extensions_IngressRule.() -> Unit = {}): extensions_IngressRule {
  val instance = extensions_IngressRule()
  instance.block()
  return instance
}


fun newIngressSpec(block : extensions_IngressSpec.() -> Unit = {}): extensions_IngressSpec {
  val instance = extensions_IngressSpec()
  instance.block()
  return instance
}


fun newIngressStatus(block : extensions_IngressStatus.() -> Unit = {}): extensions_IngressStatus {
  val instance = extensions_IngressStatus()
  instance.block()
  return instance
}


fun newIngressTLS(block : extensions_IngressTLS.() -> Unit = {}): extensions_IngressTLS {
  val instance = extensions_IngressTLS()
  instance.block()
  return instance
}


fun newNetworkPolicy(block : extensions_NetworkPolicy.() -> Unit = {}): extensions_NetworkPolicy {
  val instance = extensions_NetworkPolicy()
  instance.block()
  return instance
}


fun newNetworkPolicyEgressRule(block : extensions_NetworkPolicyEgressRule.() -> Unit = {}): extensions_NetworkPolicyEgressRule {
  val instance = extensions_NetworkPolicyEgressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyIngressRule(block : extensions_NetworkPolicyIngressRule.() -> Unit = {}): extensions_NetworkPolicyIngressRule {
  val instance = extensions_NetworkPolicyIngressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyList(block : extensions_NetworkPolicyList.() -> Unit = {}): extensions_NetworkPolicyList {
  val instance = extensions_NetworkPolicyList()
  instance.block()
  return instance
}


fun newNetworkPolicyPeer(block : extensions_NetworkPolicyPeer.() -> Unit = {}): extensions_NetworkPolicyPeer {
  val instance = extensions_NetworkPolicyPeer()
  instance.block()
  return instance
}


fun newNetworkPolicyPort(block : extensions_NetworkPolicyPort.() -> Unit = {}): extensions_NetworkPolicyPort {
  val instance = extensions_NetworkPolicyPort()
  instance.block()
  return instance
}


fun newNetworkPolicySpec(block : extensions_NetworkPolicySpec.() -> Unit = {}): extensions_NetworkPolicySpec {
  val instance = extensions_NetworkPolicySpec()
  instance.block()
  return instance
}


fun newNetworkPolicyStatus(block : extensions_NetworkPolicyStatus.() -> Unit = {}): extensions_NetworkPolicyStatus {
  val instance = extensions_NetworkPolicyStatus()
  instance.block()
  return instance
}


fun newReplicaSet(block : extensions_ReplicaSet.() -> Unit = {}): extensions_ReplicaSet {
  val instance = extensions_ReplicaSet()
  instance.block()
  return instance
}


fun newReplicaSetCondition(block : extensions_ReplicaSetCondition.() -> Unit = {}): extensions_ReplicaSetCondition {
  val instance = extensions_ReplicaSetCondition()
  instance.block()
  return instance
}


fun newReplicaSetList(block : extensions_ReplicaSetList.() -> Unit = {}): extensions_ReplicaSetList {
  val instance = extensions_ReplicaSetList()
  instance.block()
  return instance
}


fun newReplicaSetSpec(block : extensions_ReplicaSetSpec.() -> Unit = {}): extensions_ReplicaSetSpec {
  val instance = extensions_ReplicaSetSpec()
  instance.block()
  return instance
}


fun newReplicaSetStatus(block : extensions_ReplicaSetStatus.() -> Unit = {}): extensions_ReplicaSetStatus {
  val instance = extensions_ReplicaSetStatus()
  instance.block()
  return instance
}


fun newRollbackConfig(block : extensions_RollbackConfig.() -> Unit = {}): extensions_RollbackConfig {
  val instance = extensions_RollbackConfig()
  instance.block()
  return instance
}


fun newRollingUpdateDaemonSet(block : extensions_RollingUpdateDaemonSet.() -> Unit = {}): extensions_RollingUpdateDaemonSet {
  val instance = extensions_RollingUpdateDaemonSet()
  instance.block()
  return instance
}


fun newRollingUpdateDeployment(block : extensions_RollingUpdateDeployment.() -> Unit = {}): extensions_RollingUpdateDeployment {
  val instance = extensions_RollingUpdateDeployment()
  instance.block()
  return instance
}


// GENERATE
package com.fkorotkov.kubernetes.networking

import io.fabric8.kubernetes.api.model.networking.IPBlock as networking_IPBlock
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy as networking_NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyEgressRule as networking_NetworkPolicyEgressRule
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyIngressRule as networking_NetworkPolicyIngressRule
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList as networking_NetworkPolicyList
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer as networking_NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPort as networking_NetworkPolicyPort
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec as networking_NetworkPolicySpec


fun newIPBlock(block : networking_IPBlock.() -> Unit = {}): networking_IPBlock {
  val instance = networking_IPBlock()
  instance.block()
  return instance
}


fun newNetworkPolicy(block : networking_NetworkPolicy.() -> Unit = {}): networking_NetworkPolicy {
  val instance = networking_NetworkPolicy()
  instance.block()
  return instance
}


fun newNetworkPolicyEgressRule(block : networking_NetworkPolicyEgressRule.() -> Unit = {}): networking_NetworkPolicyEgressRule {
  val instance = networking_NetworkPolicyEgressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyIngressRule(block : networking_NetworkPolicyIngressRule.() -> Unit = {}): networking_NetworkPolicyIngressRule {
  val instance = networking_NetworkPolicyIngressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyList(block : networking_NetworkPolicyList.() -> Unit = {}): networking_NetworkPolicyList {
  val instance = networking_NetworkPolicyList()
  instance.block()
  return instance
}


fun newNetworkPolicyPeer(block : networking_NetworkPolicyPeer.() -> Unit = {}): networking_NetworkPolicyPeer {
  val instance = networking_NetworkPolicyPeer()
  instance.block()
  return instance
}


fun newNetworkPolicyPort(block : networking_NetworkPolicyPort.() -> Unit = {}): networking_NetworkPolicyPort {
  val instance = networking_NetworkPolicyPort()
  instance.block()
  return instance
}


fun newNetworkPolicySpec(block : networking_NetworkPolicySpec.() -> Unit = {}): networking_NetworkPolicySpec {
  val instance = networking_NetworkPolicySpec()
  instance.block()
  return instance
}


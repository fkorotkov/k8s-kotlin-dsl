// GENERATE
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.HTTPIngressPath as v1_HTTPIngressPath
import io.fabric8.kubernetes.api.model.networking.v1.HTTPIngressRuleValue as v1_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.networking.v1.IPBlock as v1_IPBlock
import io.fabric8.kubernetes.api.model.networking.v1.Ingress as v1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1.IngressBackend as v1_IngressBackend
import io.fabric8.kubernetes.api.model.networking.v1.IngressClass as v1_IngressClass
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassList as v1_IngressClassList
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassParametersReference as v1_IngressClassParametersReference
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassSpec as v1_IngressClassSpec
import io.fabric8.kubernetes.api.model.networking.v1.IngressList as v1_IngressList
import io.fabric8.kubernetes.api.model.networking.v1.IngressLoadBalancerIngress as v1_IngressLoadBalancerIngress
import io.fabric8.kubernetes.api.model.networking.v1.IngressLoadBalancerStatus as v1_IngressLoadBalancerStatus
import io.fabric8.kubernetes.api.model.networking.v1.IngressPortStatus as v1_IngressPortStatus
import io.fabric8.kubernetes.api.model.networking.v1.IngressRule as v1_IngressRule
import io.fabric8.kubernetes.api.model.networking.v1.IngressServiceBackend as v1_IngressServiceBackend
import io.fabric8.kubernetes.api.model.networking.v1.IngressSpec as v1_IngressSpec
import io.fabric8.kubernetes.api.model.networking.v1.IngressStatus as v1_IngressStatus
import io.fabric8.kubernetes.api.model.networking.v1.IngressTLS as v1_IngressTLS
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicy as v1_NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyEgressRule as v1_NetworkPolicyEgressRule
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyIngressRule as v1_NetworkPolicyIngressRule
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyList as v1_NetworkPolicyList
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPeer as v1_NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPort as v1_NetworkPolicyPort
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicySpec as v1_NetworkPolicySpec
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyStatus as v1_NetworkPolicyStatus
import io.fabric8.kubernetes.api.model.networking.v1.ServiceBackendPort as v1_ServiceBackendPort


fun newHTTPIngressPath(block : v1_HTTPIngressPath.() -> Unit = {}): v1_HTTPIngressPath {
  val instance = v1_HTTPIngressPath()
  instance.block()
  return instance
}


fun newHTTPIngressRuleValue(block : v1_HTTPIngressRuleValue.() -> Unit = {}): v1_HTTPIngressRuleValue {
  val instance = v1_HTTPIngressRuleValue()
  instance.block()
  return instance
}


fun newIPBlock(block : v1_IPBlock.() -> Unit = {}): v1_IPBlock {
  val instance = v1_IPBlock()
  instance.block()
  return instance
}


fun newIngress(block : v1_Ingress.() -> Unit = {}): v1_Ingress {
  val instance = v1_Ingress()
  instance.block()
  return instance
}


fun newIngressBackend(block : v1_IngressBackend.() -> Unit = {}): v1_IngressBackend {
  val instance = v1_IngressBackend()
  instance.block()
  return instance
}


fun newIngressClass(block : v1_IngressClass.() -> Unit = {}): v1_IngressClass {
  val instance = v1_IngressClass()
  instance.block()
  return instance
}


fun newIngressClassList(block : v1_IngressClassList.() -> Unit = {}): v1_IngressClassList {
  val instance = v1_IngressClassList()
  instance.block()
  return instance
}


fun newIngressClassParametersReference(block : v1_IngressClassParametersReference.() -> Unit = {}): v1_IngressClassParametersReference {
  val instance = v1_IngressClassParametersReference()
  instance.block()
  return instance
}


fun newIngressClassSpec(block : v1_IngressClassSpec.() -> Unit = {}): v1_IngressClassSpec {
  val instance = v1_IngressClassSpec()
  instance.block()
  return instance
}


fun newIngressList(block : v1_IngressList.() -> Unit = {}): v1_IngressList {
  val instance = v1_IngressList()
  instance.block()
  return instance
}


fun newIngressLoadBalancerIngress(block : v1_IngressLoadBalancerIngress.() -> Unit = {}): v1_IngressLoadBalancerIngress {
  val instance = v1_IngressLoadBalancerIngress()
  instance.block()
  return instance
}


fun newIngressLoadBalancerStatus(block : v1_IngressLoadBalancerStatus.() -> Unit = {}): v1_IngressLoadBalancerStatus {
  val instance = v1_IngressLoadBalancerStatus()
  instance.block()
  return instance
}


fun newIngressPortStatus(block : v1_IngressPortStatus.() -> Unit = {}): v1_IngressPortStatus {
  val instance = v1_IngressPortStatus()
  instance.block()
  return instance
}


fun newIngressRule(block : v1_IngressRule.() -> Unit = {}): v1_IngressRule {
  val instance = v1_IngressRule()
  instance.block()
  return instance
}


fun newIngressServiceBackend(block : v1_IngressServiceBackend.() -> Unit = {}): v1_IngressServiceBackend {
  val instance = v1_IngressServiceBackend()
  instance.block()
  return instance
}


fun newIngressSpec(block : v1_IngressSpec.() -> Unit = {}): v1_IngressSpec {
  val instance = v1_IngressSpec()
  instance.block()
  return instance
}


fun newIngressStatus(block : v1_IngressStatus.() -> Unit = {}): v1_IngressStatus {
  val instance = v1_IngressStatus()
  instance.block()
  return instance
}


fun newIngressTLS(block : v1_IngressTLS.() -> Unit = {}): v1_IngressTLS {
  val instance = v1_IngressTLS()
  instance.block()
  return instance
}


fun newNetworkPolicy(block : v1_NetworkPolicy.() -> Unit = {}): v1_NetworkPolicy {
  val instance = v1_NetworkPolicy()
  instance.block()
  return instance
}


fun newNetworkPolicyEgressRule(block : v1_NetworkPolicyEgressRule.() -> Unit = {}): v1_NetworkPolicyEgressRule {
  val instance = v1_NetworkPolicyEgressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyIngressRule(block : v1_NetworkPolicyIngressRule.() -> Unit = {}): v1_NetworkPolicyIngressRule {
  val instance = v1_NetworkPolicyIngressRule()
  instance.block()
  return instance
}


fun newNetworkPolicyList(block : v1_NetworkPolicyList.() -> Unit = {}): v1_NetworkPolicyList {
  val instance = v1_NetworkPolicyList()
  instance.block()
  return instance
}


fun newNetworkPolicyPeer(block : v1_NetworkPolicyPeer.() -> Unit = {}): v1_NetworkPolicyPeer {
  val instance = v1_NetworkPolicyPeer()
  instance.block()
  return instance
}


fun newNetworkPolicyPort(block : v1_NetworkPolicyPort.() -> Unit = {}): v1_NetworkPolicyPort {
  val instance = v1_NetworkPolicyPort()
  instance.block()
  return instance
}


fun newNetworkPolicySpec(block : v1_NetworkPolicySpec.() -> Unit = {}): v1_NetworkPolicySpec {
  val instance = v1_NetworkPolicySpec()
  instance.block()
  return instance
}


fun newNetworkPolicyStatus(block : v1_NetworkPolicyStatus.() -> Unit = {}): v1_NetworkPolicyStatus {
  val instance = v1_NetworkPolicyStatus()
  instance.block()
  return instance
}


fun newServiceBackendPort(block : v1_ServiceBackendPort.() -> Unit = {}): v1_ServiceBackendPort {
  val instance = v1_ServiceBackendPort()
  instance.block()
  return instance
}


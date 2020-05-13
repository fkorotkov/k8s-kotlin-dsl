// GENERATE
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback as extensions_DeploymentRollback
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath as extensions_HTTPIngressPath
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue as extensions_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend
import io.fabric8.kubernetes.api.model.extensions.IngressList as extensions_IngressList
import io.fabric8.kubernetes.api.model.extensions.IngressRule as extensions_IngressRule
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus
import io.fabric8.kubernetes.api.model.extensions.IngressTLS as extensions_IngressTLS
import io.fabric8.kubernetes.api.model.extensions.RollbackConfig as extensions_RollbackConfig


fun newDeploymentRollback(block : extensions_DeploymentRollback.() -> Unit = {}): extensions_DeploymentRollback {
  val instance = extensions_DeploymentRollback()
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


fun newRollbackConfig(block : extensions_RollbackConfig.() -> Unit = {}): extensions_RollbackConfig {
  val instance = extensions_RollbackConfig()
  instance.block()
  return instance
}


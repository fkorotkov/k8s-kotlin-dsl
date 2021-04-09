// GENERATE
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.HTTPIngressPath as v1beta1_HTTPIngressPath
import io.fabric8.kubernetes.api.model.networking.v1beta1.HTTPIngressRuleValue as v1beta1_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress as v1beta1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressBackend as v1beta1_IngressBackend
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass as v1beta1_IngressClass
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList as v1beta1_IngressClassList
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassSpec as v1beta1_IngressClassSpec
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList as v1beta1_IngressList
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressRule as v1beta1_IngressRule
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressSpec as v1beta1_IngressSpec
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressStatus as v1beta1_IngressStatus
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressTLS as v1beta1_IngressTLS


fun newHTTPIngressPath(block : v1beta1_HTTPIngressPath.() -> Unit = {}): v1beta1_HTTPIngressPath {
  val instance = v1beta1_HTTPIngressPath()
  instance.block()
  return instance
}


fun newHTTPIngressRuleValue(block : v1beta1_HTTPIngressRuleValue.() -> Unit = {}): v1beta1_HTTPIngressRuleValue {
  val instance = v1beta1_HTTPIngressRuleValue()
  instance.block()
  return instance
}


fun newIngress(block : v1beta1_Ingress.() -> Unit = {}): v1beta1_Ingress {
  val instance = v1beta1_Ingress()
  instance.block()
  return instance
}


fun newIngressBackend(block : v1beta1_IngressBackend.() -> Unit = {}): v1beta1_IngressBackend {
  val instance = v1beta1_IngressBackend()
  instance.block()
  return instance
}


fun newIngressClass(block : v1beta1_IngressClass.() -> Unit = {}): v1beta1_IngressClass {
  val instance = v1beta1_IngressClass()
  instance.block()
  return instance
}


fun newIngressClassList(block : v1beta1_IngressClassList.() -> Unit = {}): v1beta1_IngressClassList {
  val instance = v1beta1_IngressClassList()
  instance.block()
  return instance
}


fun newIngressClassSpec(block : v1beta1_IngressClassSpec.() -> Unit = {}): v1beta1_IngressClassSpec {
  val instance = v1beta1_IngressClassSpec()
  instance.block()
  return instance
}


fun newIngressList(block : v1beta1_IngressList.() -> Unit = {}): v1beta1_IngressList {
  val instance = v1beta1_IngressList()
  instance.block()
  return instance
}


fun newIngressRule(block : v1beta1_IngressRule.() -> Unit = {}): v1beta1_IngressRule {
  val instance = v1beta1_IngressRule()
  instance.block()
  return instance
}


fun newIngressSpec(block : v1beta1_IngressSpec.() -> Unit = {}): v1beta1_IngressSpec {
  val instance = v1beta1_IngressSpec()
  instance.block()
  return instance
}


fun newIngressStatus(block : v1beta1_IngressStatus.() -> Unit = {}): v1beta1_IngressStatus {
  val instance = v1beta1_IngressStatus()
  instance.block()
  return instance
}


fun newIngressTLS(block : v1beta1_IngressTLS.() -> Unit = {}): v1beta1_IngressTLS {
  val instance = v1beta1_IngressTLS()
  instance.block()
  return instance
}


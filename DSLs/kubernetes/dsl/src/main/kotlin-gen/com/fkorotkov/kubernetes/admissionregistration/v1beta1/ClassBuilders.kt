// GENERATE
package com.fkorotkov.kubernetes.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhook as v1beta1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration as v1beta1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList as v1beta1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.Rule as v1beta1_Rule
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.RuleWithOperations as v1beta1_RuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference as v1beta1_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhook as v1beta1_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration as v1beta1_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList as v1beta1_ValidatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.WebhookClientConfig as v1beta1_WebhookClientConfig


fun newMutatingWebhook(block : v1beta1_MutatingWebhook.() -> Unit = {}): v1beta1_MutatingWebhook {
  val instance = v1beta1_MutatingWebhook()
  instance.block()
  return instance
}


fun newMutatingWebhookConfiguration(block : v1beta1_MutatingWebhookConfiguration.() -> Unit = {}): v1beta1_MutatingWebhookConfiguration {
  val instance = v1beta1_MutatingWebhookConfiguration()
  instance.block()
  return instance
}


fun newMutatingWebhookConfigurationList(block : v1beta1_MutatingWebhookConfigurationList.() -> Unit = {}): v1beta1_MutatingWebhookConfigurationList {
  val instance = v1beta1_MutatingWebhookConfigurationList()
  instance.block()
  return instance
}


fun newRule(block : v1beta1_Rule.() -> Unit = {}): v1beta1_Rule {
  val instance = v1beta1_Rule()
  instance.block()
  return instance
}


fun newRuleWithOperations(block : v1beta1_RuleWithOperations.() -> Unit = {}): v1beta1_RuleWithOperations {
  val instance = v1beta1_RuleWithOperations()
  instance.block()
  return instance
}


fun newServiceReference(block : v1beta1_ServiceReference.() -> Unit = {}): v1beta1_ServiceReference {
  val instance = v1beta1_ServiceReference()
  instance.block()
  return instance
}


fun newValidatingWebhook(block : v1beta1_ValidatingWebhook.() -> Unit = {}): v1beta1_ValidatingWebhook {
  val instance = v1beta1_ValidatingWebhook()
  instance.block()
  return instance
}


fun newValidatingWebhookConfiguration(block : v1beta1_ValidatingWebhookConfiguration.() -> Unit = {}): v1beta1_ValidatingWebhookConfiguration {
  val instance = v1beta1_ValidatingWebhookConfiguration()
  instance.block()
  return instance
}


fun newValidatingWebhookConfigurationList(block : v1beta1_ValidatingWebhookConfigurationList.() -> Unit = {}): v1beta1_ValidatingWebhookConfigurationList {
  val instance = v1beta1_ValidatingWebhookConfigurationList()
  instance.block()
  return instance
}


fun newWebhookClientConfig(block : v1beta1_WebhookClientConfig.() -> Unit = {}): v1beta1_WebhookClientConfig {
  val instance = v1beta1_WebhookClientConfig()
  instance.block()
  return instance
}


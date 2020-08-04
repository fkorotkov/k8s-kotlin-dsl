// GENERATE
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhook as v1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration as v1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList as v1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.Rule as v1_Rule
import io.fabric8.kubernetes.api.model.admissionregistration.v1.RuleWithOperations as v1_RuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference as v1_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhook as v1_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration as v1_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList as v1_ValidatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.WebhookClientConfig as v1_WebhookClientConfig


fun newMutatingWebhook(block : v1_MutatingWebhook.() -> Unit = {}): v1_MutatingWebhook {
  val instance = v1_MutatingWebhook()
  instance.block()
  return instance
}


fun newMutatingWebhookConfiguration(block : v1_MutatingWebhookConfiguration.() -> Unit = {}): v1_MutatingWebhookConfiguration {
  val instance = v1_MutatingWebhookConfiguration()
  instance.block()
  return instance
}


fun newMutatingWebhookConfigurationList(block : v1_MutatingWebhookConfigurationList.() -> Unit = {}): v1_MutatingWebhookConfigurationList {
  val instance = v1_MutatingWebhookConfigurationList()
  instance.block()
  return instance
}


fun newRule(block : v1_Rule.() -> Unit = {}): v1_Rule {
  val instance = v1_Rule()
  instance.block()
  return instance
}


fun newRuleWithOperations(block : v1_RuleWithOperations.() -> Unit = {}): v1_RuleWithOperations {
  val instance = v1_RuleWithOperations()
  instance.block()
  return instance
}


fun newServiceReference(block : v1_ServiceReference.() -> Unit = {}): v1_ServiceReference {
  val instance = v1_ServiceReference()
  instance.block()
  return instance
}


fun newValidatingWebhook(block : v1_ValidatingWebhook.() -> Unit = {}): v1_ValidatingWebhook {
  val instance = v1_ValidatingWebhook()
  instance.block()
  return instance
}


fun newValidatingWebhookConfiguration(block : v1_ValidatingWebhookConfiguration.() -> Unit = {}): v1_ValidatingWebhookConfiguration {
  val instance = v1_ValidatingWebhookConfiguration()
  instance.block()
  return instance
}


fun newValidatingWebhookConfigurationList(block : v1_ValidatingWebhookConfigurationList.() -> Unit = {}): v1_ValidatingWebhookConfigurationList {
  val instance = v1_ValidatingWebhookConfigurationList()
  instance.block()
  return instance
}


fun newWebhookClientConfig(block : v1_WebhookClientConfig.() -> Unit = {}): v1_WebhookClientConfig {
  val instance = v1_WebhookClientConfig()
  instance.block()
  return instance
}


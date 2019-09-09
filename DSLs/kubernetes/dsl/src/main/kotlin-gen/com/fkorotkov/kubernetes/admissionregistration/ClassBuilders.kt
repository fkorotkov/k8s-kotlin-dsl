// GENERATE
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration as admissionregistration_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList as admissionregistration_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.Rule as admissionregistration_Rule
import io.fabric8.kubernetes.api.model.admissionregistration.RuleWithOperations as admissionregistration_RuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.ServiceReference as admissionregistration_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration as admissionregistration_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList as admissionregistration_ValidatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.Webhook as admissionregistration_Webhook
import io.fabric8.kubernetes.api.model.admissionregistration.WebhookClientConfig as admissionregistration_WebhookClientConfig


fun newMutatingWebhookConfiguration(block : admissionregistration_MutatingWebhookConfiguration.() -> Unit = {}): admissionregistration_MutatingWebhookConfiguration {
  val instance = admissionregistration_MutatingWebhookConfiguration()
  instance.block()
  return instance
}


fun newMutatingWebhookConfigurationList(block : admissionregistration_MutatingWebhookConfigurationList.() -> Unit = {}): admissionregistration_MutatingWebhookConfigurationList {
  val instance = admissionregistration_MutatingWebhookConfigurationList()
  instance.block()
  return instance
}


fun newRule(block : admissionregistration_Rule.() -> Unit = {}): admissionregistration_Rule {
  val instance = admissionregistration_Rule()
  instance.block()
  return instance
}


fun newRuleWithOperations(block : admissionregistration_RuleWithOperations.() -> Unit = {}): admissionregistration_RuleWithOperations {
  val instance = admissionregistration_RuleWithOperations()
  instance.block()
  return instance
}


fun newServiceReference(block : admissionregistration_ServiceReference.() -> Unit = {}): admissionregistration_ServiceReference {
  val instance = admissionregistration_ServiceReference()
  instance.block()
  return instance
}


fun newValidatingWebhookConfiguration(block : admissionregistration_ValidatingWebhookConfiguration.() -> Unit = {}): admissionregistration_ValidatingWebhookConfiguration {
  val instance = admissionregistration_ValidatingWebhookConfiguration()
  instance.block()
  return instance
}


fun newValidatingWebhookConfigurationList(block : admissionregistration_ValidatingWebhookConfigurationList.() -> Unit = {}): admissionregistration_ValidatingWebhookConfigurationList {
  val instance = admissionregistration_ValidatingWebhookConfigurationList()
  instance.block()
  return instance
}


fun newWebhook(block : admissionregistration_Webhook.() -> Unit = {}): admissionregistration_Webhook {
  val instance = admissionregistration_Webhook()
  instance.block()
  return instance
}


fun newWebhookClientConfig(block : admissionregistration_WebhookClientConfig.() -> Unit = {}): admissionregistration_WebhookClientConfig {
  val instance = admissionregistration_WebhookClientConfig()
  instance.block()
  return instance
}


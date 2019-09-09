// GENERATED
package com.fkorotkov.kubernetes.admissionregistration

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfiguration as admissionregistration_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.MutatingWebhookConfigurationList as admissionregistration_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfiguration as admissionregistration_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.ValidatingWebhookConfigurationList as admissionregistration_ValidatingWebhookConfigurationList


fun  admissionregistration_MutatingWebhookConfiguration.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  admissionregistration_MutatingWebhookConfigurationList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  admissionregistration_ValidatingWebhookConfiguration.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  admissionregistration_ValidatingWebhookConfigurationList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


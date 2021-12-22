// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.SecretVolumeSource as model_SecretVolumeSource
import io.fabric8.openshift.api.model.BrokerTemplateInstanceSpec as model_BrokerTemplateInstanceSpec
import io.fabric8.openshift.api.model.BuildVolumeSource as model_BuildVolumeSource
import io.fabric8.openshift.api.model.SecretBuildSource as model_SecretBuildSource
import io.fabric8.openshift.api.model.TemplateInstanceSpec as model_TemplateInstanceSpec


fun  model_BrokerTemplateInstanceSpec.`secret`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = model_ObjectReference()
  }

  this.`secret`.block()
}


fun  model_BuildVolumeSource.`secret`(block: model_SecretVolumeSource.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = model_SecretVolumeSource()
  }

  this.`secret`.block()
}


fun  model_SecretBuildSource.`secret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = model_LocalObjectReference()
  }

  this.`secret`.block()
}


fun  model_TemplateInstanceSpec.`secret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = model_LocalObjectReference()
  }

  this.`secret`.block()
}


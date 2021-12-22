// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference
import io.fabric8.openshift.api.model.ExternalIPConfig as model_ExternalIPConfig
import io.fabric8.openshift.api.model.ExternalIPPolicy as model_ExternalIPPolicy
import io.fabric8.openshift.api.model.SchedulerSpec as model_SchedulerSpec


fun  model_ExternalIPConfig.`policy`(block: model_ExternalIPPolicy.() -> Unit = {}) {
  if(this.`policy` == null) {
    this.`policy` = model_ExternalIPPolicy()
  }

  this.`policy`.block()
}


fun  model_SchedulerSpec.`policy`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`policy` == null) {
    this.`policy` = model_ConfigMapNameReference()
  }

  this.`policy`.block()
}


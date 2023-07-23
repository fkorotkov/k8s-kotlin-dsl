// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference
import io.fabric8.openshift.api.model.config.v1.ExternalIPConfig as v1_ExternalIPConfig
import io.fabric8.openshift.api.model.config.v1.ExternalIPPolicy as v1_ExternalIPPolicy
import io.fabric8.openshift.api.model.config.v1.SchedulerSpec as v1_SchedulerSpec


fun  v1_ExternalIPConfig.`policy`(block: v1_ExternalIPPolicy.() -> Unit = {}) {
  if(this.`policy` == null) {
    this.`policy` = v1_ExternalIPPolicy()
  }

  this.`policy`.block()
}


fun  v1_SchedulerSpec.`policy`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`policy` == null) {
    this.`policy` = v1_ConfigMapNameReference()
  }

  this.`policy`.block()
}


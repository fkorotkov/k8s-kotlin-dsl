// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.EquinixMetalPlatformSpec as model_EquinixMetalPlatformSpec
import io.fabric8.openshift.api.model.EquinixMetalPlatformStatus as model_EquinixMetalPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`equinixMetal`(block: model_EquinixMetalPlatformSpec.() -> Unit = {}) {
  if(this.`equinixMetal` == null) {
    this.`equinixMetal` = model_EquinixMetalPlatformSpec()
  }

  this.`equinixMetal`.block()
}


fun  model_PlatformStatus.`equinixMetal`(block: model_EquinixMetalPlatformStatus.() -> Unit = {}) {
  if(this.`equinixMetal` == null) {
    this.`equinixMetal` = model_EquinixMetalPlatformStatus()
  }

  this.`equinixMetal`.block()
}


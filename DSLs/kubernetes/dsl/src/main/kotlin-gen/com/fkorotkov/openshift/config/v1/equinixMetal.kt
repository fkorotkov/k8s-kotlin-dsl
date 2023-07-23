// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.EquinixMetalPlatformSpec as v1_EquinixMetalPlatformSpec
import io.fabric8.openshift.api.model.config.v1.EquinixMetalPlatformStatus as v1_EquinixMetalPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`equinixMetal`(block: v1_EquinixMetalPlatformSpec.() -> Unit = {}) {
  if(this.`equinixMetal` == null) {
    this.`equinixMetal` = v1_EquinixMetalPlatformSpec()
  }

  this.`equinixMetal`.block()
}


fun  v1_PlatformStatus.`equinixMetal`(block: v1_EquinixMetalPlatformStatus.() -> Unit = {}) {
  if(this.`equinixMetal` == null) {
    this.`equinixMetal` = v1_EquinixMetalPlatformStatus()
  }

  this.`equinixMetal`.block()
}


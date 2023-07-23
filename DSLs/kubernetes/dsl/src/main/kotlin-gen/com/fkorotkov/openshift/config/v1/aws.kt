// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.AWSPlatformSpec as v1_AWSPlatformSpec
import io.fabric8.openshift.api.model.config.v1.AWSPlatformStatus as v1_AWSPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`aws`(block: v1_AWSPlatformSpec.() -> Unit = {}) {
  if(this.`aws` == null) {
    this.`aws` = v1_AWSPlatformSpec()
  }

  this.`aws`.block()
}


fun  v1_PlatformStatus.`aws`(block: v1_AWSPlatformStatus.() -> Unit = {}) {
  if(this.`aws` == null) {
    this.`aws` = v1_AWSPlatformStatus()
  }

  this.`aws`.block()
}


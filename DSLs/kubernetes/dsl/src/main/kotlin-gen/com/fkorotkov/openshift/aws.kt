// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.AWSPlatformSpec as model_AWSPlatformSpec
import io.fabric8.openshift.api.model.AWSPlatformStatus as model_AWSPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`aws`(block: model_AWSPlatformSpec.() -> Unit = {}) {
  if(this.`aws` == null) {
    this.`aws` = model_AWSPlatformSpec()
  }

  this.`aws`.block()
}


fun  model_PlatformStatus.`aws`(block: model_AWSPlatformStatus.() -> Unit = {}) {
  if(this.`aws` == null) {
    this.`aws` = model_AWSPlatformStatus()
  }

  this.`aws`.block()
}


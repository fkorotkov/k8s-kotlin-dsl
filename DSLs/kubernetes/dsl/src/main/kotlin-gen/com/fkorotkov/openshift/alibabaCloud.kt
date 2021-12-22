// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.AlibabaCloudPlatformSpec as model_AlibabaCloudPlatformSpec
import io.fabric8.openshift.api.model.AlibabaCloudPlatformStatus as model_AlibabaCloudPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`alibabaCloud`(block: model_AlibabaCloudPlatformSpec.() -> Unit = {}) {
  if(this.`alibabaCloud` == null) {
    this.`alibabaCloud` = model_AlibabaCloudPlatformSpec()
  }

  this.`alibabaCloud`.block()
}


fun  model_PlatformStatus.`alibabaCloud`(block: model_AlibabaCloudPlatformStatus.() -> Unit = {}) {
  if(this.`alibabaCloud` == null) {
    this.`alibabaCloud` = model_AlibabaCloudPlatformStatus()
  }

  this.`alibabaCloud`.block()
}


// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.AlibabaCloudPlatformSpec as v1_AlibabaCloudPlatformSpec
import io.fabric8.openshift.api.model.config.v1.AlibabaCloudPlatformStatus as v1_AlibabaCloudPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`alibabaCloud`(block: v1_AlibabaCloudPlatformSpec.() -> Unit = {}) {
  if(this.`alibabaCloud` == null) {
    this.`alibabaCloud` = v1_AlibabaCloudPlatformSpec()
  }

  this.`alibabaCloud`.block()
}


fun  v1_PlatformStatus.`alibabaCloud`(block: v1_AlibabaCloudPlatformStatus.() -> Unit = {}) {
  if(this.`alibabaCloud` == null) {
    this.`alibabaCloud` = v1_AlibabaCloudPlatformStatus()
  }

  this.`alibabaCloud`.block()
}


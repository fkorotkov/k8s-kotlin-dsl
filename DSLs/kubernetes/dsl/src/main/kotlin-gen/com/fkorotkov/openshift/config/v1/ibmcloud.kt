// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.IBMCloudPlatformSpec as v1_IBMCloudPlatformSpec
import io.fabric8.openshift.api.model.config.v1.IBMCloudPlatformStatus as v1_IBMCloudPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`ibmcloud`(block: v1_IBMCloudPlatformSpec.() -> Unit = {}) {
  if(this.`ibmcloud` == null) {
    this.`ibmcloud` = v1_IBMCloudPlatformSpec()
  }

  this.`ibmcloud`.block()
}


fun  v1_PlatformStatus.`ibmcloud`(block: v1_IBMCloudPlatformStatus.() -> Unit = {}) {
  if(this.`ibmcloud` == null) {
    this.`ibmcloud` = v1_IBMCloudPlatformStatus()
  }

  this.`ibmcloud`.block()
}


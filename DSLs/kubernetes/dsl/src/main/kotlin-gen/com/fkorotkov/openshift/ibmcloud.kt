// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.IBMCloudPlatformSpec as model_IBMCloudPlatformSpec
import io.fabric8.openshift.api.model.IBMCloudPlatformStatus as model_IBMCloudPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`ibmcloud`(block: model_IBMCloudPlatformSpec.() -> Unit = {}) {
  if(this.`ibmcloud` == null) {
    this.`ibmcloud` = model_IBMCloudPlatformSpec()
  }

  this.`ibmcloud`.block()
}


fun  model_PlatformStatus.`ibmcloud`(block: model_IBMCloudPlatformStatus.() -> Unit = {}) {
  if(this.`ibmcloud` == null) {
    this.`ibmcloud` = model_IBMCloudPlatformStatus()
  }

  this.`ibmcloud`.block()
}


// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BuildSpec as v1_BuildSpec
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference
import io.fabric8.openshift.api.model.config.v1.ImageSpec as v1_ImageSpec


fun  v1_BuildSpec.`additionalTrustedCA`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`additionalTrustedCA` == null) {
    this.`additionalTrustedCA` = v1_ConfigMapNameReference()
  }

  this.`additionalTrustedCA`.block()
}


fun  v1_ImageSpec.`additionalTrustedCA`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`additionalTrustedCA` == null) {
    this.`additionalTrustedCA` = v1_ConfigMapNameReference()
  }

  this.`additionalTrustedCA`.block()
}


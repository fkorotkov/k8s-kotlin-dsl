// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec
import io.fabric8.openshift.api.model.config.v1.ConfigMapNameReference as v1_ConfigMapNameReference


fun  v1_APIServerSpec.`clientCA`(block: v1_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`clientCA` == null) {
    this.`clientCA` = v1_ConfigMapNameReference()
  }

  this.`clientCA`.block()
}


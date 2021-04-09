// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec
import io.fabric8.openshift.api.model.ConfigMapNameReference as model_ConfigMapNameReference


fun  model_APIServerSpec.`clientCA`(block: model_ConfigMapNameReference.() -> Unit = {}) {
  if(this.`clientCA` == null) {
    this.`clientCA` = model_ConfigMapNameReference()
  }

  this.`clientCA`.block()
}


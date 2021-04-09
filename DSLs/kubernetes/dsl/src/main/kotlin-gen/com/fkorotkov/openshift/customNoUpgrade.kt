// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.CustomFeatureGates as model_CustomFeatureGates
import io.fabric8.openshift.api.model.FeatureGateSpec as model_FeatureGateSpec


fun  model_FeatureGateSpec.`customNoUpgrade`(block: model_CustomFeatureGates.() -> Unit = {}) {
  if(this.`customNoUpgrade` == null) {
    this.`customNoUpgrade` = model_CustomFeatureGates()
  }

  this.`customNoUpgrade`.block()
}


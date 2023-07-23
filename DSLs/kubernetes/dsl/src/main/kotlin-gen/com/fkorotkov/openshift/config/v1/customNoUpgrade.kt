// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.CustomFeatureGates as v1_CustomFeatureGates
import io.fabric8.openshift.api.model.config.v1.FeatureGateSpec as v1_FeatureGateSpec


fun  v1_FeatureGateSpec.`customNoUpgrade`(block: v1_CustomFeatureGates.() -> Unit = {}) {
  if(this.`customNoUpgrade` == null) {
    this.`customNoUpgrade` = v1_CustomFeatureGates()
  }

  this.`customNoUpgrade`.block()
}


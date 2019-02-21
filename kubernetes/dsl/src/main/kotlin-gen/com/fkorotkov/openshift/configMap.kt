// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.ConfigMapBuildSource as model_ConfigMapBuildSource


fun  model_ConfigMapBuildSource.`configMap`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = model_LocalObjectReference()
  }

  this.`configMap`.block()
}


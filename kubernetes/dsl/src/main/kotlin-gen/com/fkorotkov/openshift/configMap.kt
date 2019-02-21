// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.openshift.api.model.ConfigMapBuildSource


fun  ConfigMapBuildSource.`configMap`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = LocalObjectReference()
  }

  this.`configMap`.block()
}


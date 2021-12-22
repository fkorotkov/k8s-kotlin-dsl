// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource as model_ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.BuildVolumeSource as model_BuildVolumeSource
import io.fabric8.openshift.api.model.ConfigMapBuildSource as model_ConfigMapBuildSource


fun  model_BuildVolumeSource.`configMap`(block: model_ConfigMapVolumeSource.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = model_ConfigMapVolumeSource()
  }

  this.`configMap`.block()
}


fun  model_ConfigMapBuildSource.`configMap`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = model_LocalObjectReference()
  }

  this.`configMap`.block()
}


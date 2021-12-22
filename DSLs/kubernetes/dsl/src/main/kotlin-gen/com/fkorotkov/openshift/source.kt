// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec as model_BuildConfigSpec
import io.fabric8.openshift.api.model.BuildSource as model_BuildSource
import io.fabric8.openshift.api.model.BuildSpec as model_BuildSpec
import io.fabric8.openshift.api.model.BuildVolume as model_BuildVolume
import io.fabric8.openshift.api.model.BuildVolumeSource as model_BuildVolumeSource


fun  model_BuildConfigSpec.`source`(block: model_BuildSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = model_BuildSource()
  }

  this.`source`.block()
}


fun  model_BuildSpec.`source`(block: model_BuildSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = model_BuildSource()
  }

  this.`source`.block()
}


fun  model_BuildVolume.`source`(block: model_BuildVolumeSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = model_BuildVolumeSource()
  }

  this.`source`.block()
}


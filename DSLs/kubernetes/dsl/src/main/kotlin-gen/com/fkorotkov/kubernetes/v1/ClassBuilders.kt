// GENERATE
package com.fkorotkov.kubernetes.v1

import io.fabric8.kubernetes.api.model.v1.Scale as v1_Scale
import io.fabric8.kubernetes.api.model.v1.ScaleSpec as v1_ScaleSpec
import io.fabric8.kubernetes.api.model.v1.ScaleStatus as v1_ScaleStatus


fun newScale(block : v1_Scale.() -> Unit = {}): v1_Scale {
  val instance = v1_Scale()
  instance.block()
  return instance
}


fun newScaleSpec(block : v1_ScaleSpec.() -> Unit = {}): v1_ScaleSpec {
  val instance = v1_ScaleSpec()
  instance.block()
  return instance
}


fun newScaleStatus(block : v1_ScaleStatus.() -> Unit = {}): v1_ScaleStatus {
  val instance = v1_ScaleStatus()
  instance.block()
  return instance
}


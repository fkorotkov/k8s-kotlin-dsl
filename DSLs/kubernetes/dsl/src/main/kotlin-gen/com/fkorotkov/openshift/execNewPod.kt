// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ExecNewPodHook as model_ExecNewPodHook
import io.fabric8.openshift.api.model.LifecycleHook as model_LifecycleHook


fun  model_LifecycleHook.`execNewPod`(block: model_ExecNewPodHook.() -> Unit = {}) {
  if(this.`execNewPod` == null) {
    this.`execNewPod` = model_ExecNewPodHook()
  }

  this.`execNewPod`.block()
}


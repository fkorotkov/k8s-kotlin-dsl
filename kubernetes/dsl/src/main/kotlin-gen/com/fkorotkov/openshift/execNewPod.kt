// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ExecNewPodHook
import io.fabric8.openshift.api.model.LifecycleHook


fun  LifecycleHook.`execNewPod`(block: ExecNewPodHook.() -> Unit = {}) {
  if(this.`execNewPod` == null) {
    this.`execNewPod` = ExecNewPodHook()
  }

  this.`execNewPod`.block()
}


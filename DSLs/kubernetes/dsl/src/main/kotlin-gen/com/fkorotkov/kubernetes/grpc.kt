// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GRPCAction as model_GRPCAction
import io.fabric8.kubernetes.api.model.Probe as model_Probe


fun  model_Probe.`grpc`(block: model_GRPCAction.() -> Unit = {}) {
  if(this.`grpc` == null) {
    this.`grpc` = model_GRPCAction()
  }

  this.`grpc`.block()
}


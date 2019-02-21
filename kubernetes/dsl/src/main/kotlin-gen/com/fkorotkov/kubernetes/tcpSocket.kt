// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Handler as model_Handler
import io.fabric8.kubernetes.api.model.Probe as model_Probe
import io.fabric8.kubernetes.api.model.TCPSocketAction as model_TCPSocketAction


fun  model_Handler.`tcpSocket`(block: model_TCPSocketAction.() -> Unit = {}) {
  if(this.`tcpSocket` == null) {
    this.`tcpSocket` = model_TCPSocketAction()
  }

  this.`tcpSocket`.block()
}


fun  model_Probe.`tcpSocket`(block: model_TCPSocketAction.() -> Unit = {}) {
  if(this.`tcpSocket` == null) {
    this.`tcpSocket` = model_TCPSocketAction()
  }

  this.`tcpSocket`.block()
}


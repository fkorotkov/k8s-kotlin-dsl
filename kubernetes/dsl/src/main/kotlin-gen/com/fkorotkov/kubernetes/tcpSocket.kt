// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Probe
import io.fabric8.kubernetes.api.model.TCPSocketAction


fun  Handler.`tcpSocket`(block: TCPSocketAction.() -> Unit = {}) {
  if(this.`tcpSocket` == null) {
    this.`tcpSocket` = TCPSocketAction()
  }

  this.`tcpSocket`.block()
}


fun  Probe.`tcpSocket`(block: TCPSocketAction.() -> Unit = {}) {
  if(this.`tcpSocket` == null) {
    this.`tcpSocket` = TCPSocketAction()
  }

  this.`tcpSocket`.block()
}


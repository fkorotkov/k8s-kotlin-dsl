// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSet as extensions_DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec as extensions_DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.Deployment as extensions_Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicy as extensions_NetworkPolicy
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec as extensions_NetworkPolicySpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet as extensions_ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec as extensions_ReplicaSetSpec


fun  extensions_DaemonSet.`spec`(block: extensions_DaemonSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_DaemonSetSpec()
  }

  this.`spec`.block()
}


fun  extensions_Deployment.`spec`(block: extensions_DeploymentSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_DeploymentSpec()
  }

  this.`spec`.block()
}


fun  extensions_Ingress.`spec`(block: extensions_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_IngressSpec()
  }

  this.`spec`.block()
}


fun  extensions_NetworkPolicy.`spec`(block: extensions_NetworkPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_NetworkPolicySpec()
  }

  this.`spec`.block()
}


fun  extensions_ReplicaSet.`spec`(block: extensions_ReplicaSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = extensions_ReplicaSetSpec()
  }

  this.`spec`.block()
}


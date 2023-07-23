// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.kubernetes.api.model.runtime.RawExtension as runtime_RawExtension
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorStatus as v1_ClusterOperatorStatus


fun  v1_ClusterOperatorStatus.`extension`(block: runtime_RawExtension.() -> Unit = {}) {
  if(this.`extension` == null) {
    this.`extension` = runtime_RawExtension()
  }

  this.`extension`.block()
}


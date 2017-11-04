// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec
import io.fabric8.kubernetes.api.model.extensions.StatefulSetUpdateStrategy


fun  DaemonSetSpec.`updateStrategy`(block: DaemonSetUpdateStrategy.() -> Unit = {}) {
  if(this.`updateStrategy` == null) {
    this.`updateStrategy` = DaemonSetUpdateStrategy()
  }

  this.`updateStrategy`.block()
}


fun  StatefulSetSpec.`updateStrategy`(block: StatefulSetUpdateStrategy.() -> Unit = {}) {
  if(this.`updateStrategy` == null) {
    this.`updateStrategy` = StatefulSetUpdateStrategy()
  }

  this.`updateStrategy`.block()
}


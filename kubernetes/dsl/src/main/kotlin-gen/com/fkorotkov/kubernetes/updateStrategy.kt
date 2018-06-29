// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy


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


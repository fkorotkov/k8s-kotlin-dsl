// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec as apps_DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy as apps_DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy as apps_StatefulSetUpdateStrategy


fun  apps_DaemonSetSpec.`updateStrategy`(block: apps_DaemonSetUpdateStrategy.() -> Unit = {}) {
  if(this.`updateStrategy` == null) {
    this.`updateStrategy` = apps_DaemonSetUpdateStrategy()
  }

  this.`updateStrategy`.block()
}


fun  apps_StatefulSetSpec.`updateStrategy`(block: apps_StatefulSetUpdateStrategy.() -> Unit = {}) {
  if(this.`updateStrategy` == null) {
    this.`updateStrategy` = apps_StatefulSetUpdateStrategy()
  }

  this.`updateStrategy`.block()
}


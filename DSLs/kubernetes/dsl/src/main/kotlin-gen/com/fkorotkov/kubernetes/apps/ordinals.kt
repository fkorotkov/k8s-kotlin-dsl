// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.StatefulSetOrdinals as apps_StatefulSetOrdinals
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec


fun  apps_StatefulSetSpec.`ordinals`(block: apps_StatefulSetOrdinals.() -> Unit = {}) {
  if(this.`ordinals` == null) {
    this.`ordinals` = apps_StatefulSetOrdinals()
  }

  this.`ordinals`.block()
}


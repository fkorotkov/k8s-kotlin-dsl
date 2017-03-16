// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.KubernetesResource
import io.fabric8.kubernetes.api.model.WatchEvent


fun  WatchEvent.`object`(block: KubernetesResource<*>.() -> Unit = {}) {
  this.`object`.block()
}


// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.APIGroup as model_APIGroup
import io.fabric8.kubernetes.api.model.GroupVersionForDiscovery as model_GroupVersionForDiscovery


fun  model_APIGroup.`preferredVersion`(block: model_GroupVersionForDiscovery.() -> Unit = {}) {
  if(this.`preferredVersion` == null) {
    this.`preferredVersion` = model_GroupVersionForDiscovery()
  }

  this.`preferredVersion`.block()
}


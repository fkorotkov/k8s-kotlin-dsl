// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.StatefulSetPersistentVolumeClaimRetentionPolicy as apps_StatefulSetPersistentVolumeClaimRetentionPolicy
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec


fun  apps_StatefulSetSpec.`persistentVolumeClaimRetentionPolicy`(block: apps_StatefulSetPersistentVolumeClaimRetentionPolicy.() -> Unit = {}) {
  if(this.`persistentVolumeClaimRetentionPolicy` == null) {
    this.`persistentVolumeClaimRetentionPolicy` = apps_StatefulSetPersistentVolumeClaimRetentionPolicy()
  }

  this.`persistentVolumeClaimRetentionPolicy`.block()
}


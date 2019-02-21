// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference


fun  CSIPersistentVolumeSource.`nodeStageSecretRef`(block: SecretReference.() -> Unit = {}) {
  if(this.`nodeStageSecretRef` == null) {
    this.`nodeStageSecretRef` = SecretReference()
  }

  this.`nodeStageSecretRef`.block()
}


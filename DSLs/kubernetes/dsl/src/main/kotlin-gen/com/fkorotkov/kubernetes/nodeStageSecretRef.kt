// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference


fun  model_CSIPersistentVolumeSource.`nodeStageSecretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`nodeStageSecretRef` == null) {
    this.`nodeStageSecretRef` = model_SecretReference()
  }

  this.`nodeStageSecretRef`.block()
}


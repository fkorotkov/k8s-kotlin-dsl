// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference


fun  model_CSIPersistentVolumeSource.`nodeExpandSecretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`nodeExpandSecretRef` == null) {
    this.`nodeExpandSecretRef` = model_SecretReference()
  }

  this.`nodeExpandSecretRef`.block()
}


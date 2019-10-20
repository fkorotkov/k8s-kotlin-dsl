// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference


fun  model_CSIPersistentVolumeSource.`controllerExpandSecretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`controllerExpandSecretRef` == null) {
    this.`controllerExpandSecretRef` = model_SecretReference()
  }

  this.`controllerExpandSecretRef`.block()
}


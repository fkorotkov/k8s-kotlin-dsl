// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference


fun  model_CSIPersistentVolumeSource.`controllerPublishSecretRef`(block: model_SecretReference.() -> Unit = {}) {
  if(this.`controllerPublishSecretRef` == null) {
    this.`controllerPublishSecretRef` = model_SecretReference()
  }

  this.`controllerPublishSecretRef`.block()
}


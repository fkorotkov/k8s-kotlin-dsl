// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference


fun  CSIPersistentVolumeSource.`controllerPublishSecretRef`(block: SecretReference.() -> Unit = {}) {
  if(this.`controllerPublishSecretRef` == null) {
    this.`controllerPublishSecretRef` = SecretReference()
  }

  this.`controllerPublishSecretRef`.block()
}

